package conception.ui;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import conception.carte.Carte;
import conception.carte.Categorie;
import conception.factory.Factory;
import conception.interfaces.ICarte;

public class MonsterGenerator {

	private static final String DESC = "This strange being comes "
			+ "from the astral plane. "
			+ "It resembles a squirrel and has the face of an eel.";
	
	private static List<ICarte> monsters = null;
	
	static List<ICarte> generateMonsters() {
		try (Stream<String> monsters = Files.lines(
				Paths.get("monsters.txt"), StandardCharsets.UTF_8)){
			Random random = new Random();
			Categorie cat = Factory.CATEGORIES.get(
					random.nextInt(Factory.CATEGORIES.size()));
			
			return monsters.map(m -> new Carte(cat, random.nextInt(10), 
					random.nextInt(10), m, DESC,
					"https://i.imgur.com/" + m.hashCode() + ".png"))
					.collect(Collectors.toList());
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static List<ICarte> getMonsters() {
		if (monsters == null) {
			monsters = generateMonsters();
		}
		return monsters;
	}

}
