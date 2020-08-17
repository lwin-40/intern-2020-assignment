class SerieName {//hierarchical inheritance

	String getName = "The World of married";
}

class Actor extends SerieName {

	String getActorname = "Han So-hee ,Kim Hee-ae, Kim Young-min, Park Hae-joon";
}

class Episode extends SerieName {

	String getEpisode = "16 episodes";
}

public class SerieDetail {
	public static void main(String args[]) {
		Actor actor = new Actor();
		Episode episode = new Episode();
		System.out.println("Show  detail information :" + actor.getName + '\n' + "Starring :" + actor.getActorname
				+ '\n' + "Episode :" + episode.getEpisode);
		;
	}
}
