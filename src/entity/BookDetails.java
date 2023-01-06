package entity;

public class BookDetails {
	

		private String name;
		private String topic;
		private String author;
		
		public BookDetails(String name , String topic , String author) {
			this.name = name;
			this.topic = topic;
			this.author = author;
		}

		@Override
		public String toString() {
			return "BookDetails  : name=" + name + ", topic=" + topic + ", author=" + author + " ";
		}

		public String getName() {
			return name;
		}

		

		public String getTopic() {
			return topic;
		}

		

		public String getAuthor() {
			return author;
		}

		
		

	}


