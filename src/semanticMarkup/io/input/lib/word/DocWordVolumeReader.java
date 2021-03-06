package semanticMarkup.io.input.lib.word;

import java.io.InputStream;
import java.util.zip.ZipFile;

import semanticMarkup.io.input.lib.word.refiner.DistributionTreatmentRefiner;
import semanticMarkup.io.input.lib.word.refiner.FloweringTimeTreatmentRefiner;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * DocWordVolumeReader reads a list of treatments from a by the previous charaparser version termed Type 1 input format. This is a
 * description in Microsoft Word format. 
 * The DocWordVolumeReader expects the "WordVolumeReader_Sourcefile" to point to the .DOC(X) file contained in the word file
 * @author rodenhausen
 */
public class DocWordVolumeReader extends AbstractWordVolumeReader {
	
	/**
	 * @param filepath
	 * @param styleStartPattern
	 * @param styleNamePattern
	 * @param styleKeyPattern
	 * @param tribegennamestyle
	 * @param styleMappingFile
	 * @param distributionTreatmentRefiner
	 * @param floweringTimeTreatmentRefiner
	 */
	@Inject
	public DocWordVolumeReader(@Named("WordVolumeReader_Sourcefile") String filepath,
			@Named("WordVolumeReader_StyleStartPattern") String styleStartPattern,
			@Named("WordVolumeReader_StyleNamePattern") String styleNamePattern,
			@Named("WordVolumeReader_StyleKeyPattern") String styleKeyPattern,
			@Named("WordVolumeReader_Tribegennamestyle") String tribegennamestyle, 
			@Named("WordVolumeReader_StyleMappingFile") String styleMappingFile, 
			DistributionTreatmentRefiner distributionTreatmentRefiner, 
			FloweringTimeTreatmentRefiner floweringTimeTreatmentRefiner) {
		super(filepath, styleStartPattern, styleNamePattern, styleKeyPattern,
				tribegennamestyle, styleMappingFile, distributionTreatmentRefiner,
				floweringTimeTreatmentRefiner);
	}

	@Override
	protected InputStream getXMLInputStream() throws Exception {
		ZipFile zipFile = new ZipFile(filePath);
		return zipFile.getInputStream(zipFile.getEntry("word/document.xml"));
	}

}
