import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class PigLatinTest {

	@Test
	void translateAVowelFirstTest() {
		String expected = "armadilloway";
		String actual = PigLatin.translate("armadillo");
		assertEquals(expected, actual);
	}
	@Test
	void translateEVowelFirstTest() {
		String expected = "elfway";
		String actual = PigLatin.translate("elf");
		assertEquals(expected, actual);
	}
	@Test
	void translateIVowelFirstTest() {
		String expected = "ibexway";
		String actual = PigLatin.translate("ibex");
		assertEquals(expected, actual);
	}
	@Test
	void translateOVowelFirstTest() {
		String expected = "otterway";
		String actual = PigLatin.translate("otter");
		assertEquals(expected, actual);
	}
	@Test
	void translateUVowelFirstTest() {
		String expected = "underdogway";
		String actual = PigLatin.translate("underdog");
		assertEquals(expected, actual);
	}
	@Test
	void translateDoubleVowelFirstTest() {
		String expected = "aardvarkway";
		String actual = PigLatin.translate("aardvark");
		assertEquals(expected, actual);
	}
	// updated to preserve case
	@Test
	void translateAnUpperCaseVowelFirstTest() {
		String expected = "Anteaterway";
		String actual = PigLatin.translate("Anteater");
		assertEquals(expected, actual);
	}
	@Test
	void translateConsonantFirstTest() {
		String expected = "abbitray";
		String actual = PigLatin.translate("rabbit");
		assertEquals(expected, actual);
	}
	@Test
	void translateConsonantFirstAnotherVowelSecondTest() {
		String expected = "ogday";
		String actual = PigLatin.translate("dog");
		assertEquals(expected, actual);
	}
	@Test
	void translateConsonantFirstADifferentVowelSecondTest() {
		String expected = "uppypay";
		String actual = PigLatin.translate("puppy");
		assertEquals(expected, actual);
	} 
	@Test
	void translateDoubleConsonantFirstTest() {
		String expected = "impanzeechay";
		String actual = PigLatin.translate("chimpanzee");
		assertEquals(expected, actual);
	}
	@Test
	void translateTripleConsonantFirstTest() {
		String expected = "ipestray";
		String actual = PigLatin.translate("stripe");
		assertEquals(expected, actual);
	}
	@Test
	void translateYNotTest() {
		String expected = "ellowyay";
		String actual = PigLatin.translate("yellow");
		assertEquals(expected, actual);
	}
	// updated to preserve case
	@Test
	void translateMultipleWordsTest() {
		String expected = "ustJay umblingstay oughthray isthay odecay ikelay Iway understandway itway";
		String actual = PigLatin.phrase("Just stumbling through this code like I understand it");
		assertEquals(expected, actual);
	}
	@Test
	void translateCapitalLettersTest() {
		String expected = "ORDWay";
		String actual = PigLatin.phrase("WORD");
		assertEquals(expected, actual);
	}
	@Test
	void translateContractionTest() {
		String expected = "an'tcay";
		String actual = PigLatin.translate("can't");
		assertEquals(expected, actual);
	}
//	@Test
//	// unused until further notice need to rewrite some code
//	void translateEmailTest() {
//		String expected = "email@email.address";
//		String actual = PigLatin.sortAndPrint("email@email.address");
//		assertEquals(expected, actual);
//	}
}
