/*public class ProviderMarketShare {

  public static void main(String[] args) {
    String[] emails = {
        "jpp@gmail.com",
        "tom@sfr.com",
        "fred@hotmail.com",
        "paul@sfr.com",
        "victor@aol.com",
        "jhon@outlook.com",
        "lise@yahoo.com",
        "mike@gmail.com",
        "steve@outlook.com",
        "jane@gmail.com"
    };
    int i;
    String[] provider = new String[emails.length];
    for (i = 0; i < emails.length; i++) {
      String str1 = emails[i].substring(emails[i].indexOf("@") + 1);
      provider[i] = str1;

    }

    // remove duplicate
    int n = provider.length;
    for (i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (provider[i].equals(provider[j])) {
          provider[j] = provider[n - 1];
          n--;
          j--;

        }
      }
    }
    for (i = 0; i < n; i++) {
      System.out.println(provider[i]);
    }
    double [] marketShares = new double [n];
    for ( i=0; i<n ; i++){
      int count = 0 ;
      
    }
   

  }
}

/*
 * public static void main(String[] args) {
 * /* tableau des email des frs
 * String[] emails = {
 * "jpp@gmail.com",
 * "tom@sfr.com",
 * "fred@hotmail.com",
 * "paul@sfr.com",
 * "victor@aol.com",
 * "jhon@outlook.com",
 * "lise@yahoo.com",
 * "mike@gmail.com",
 * "steve@outlook.com",
 * "jane@gmail.com"
 * };
 * 
 * /* Tableau pour stocker les noms des fournisseurs
 * String[] providers = new String[emails.length];
 * /* Extraire les noms des fournisseurs à partir d’adresses e-mail
 * for (int i = 0; i < emails.length; i++) {
 * int atIndex = emails[i].lastIndexOf("@");
 * /* Vérifier si « @ » existe dans l’adresse e-mail
 * if (atIndex != -1) {
 * providers[i] = emails[i].substring(atIndex + 1);
 * 
 * /* Supprimer les doublons du tableau des fournisseurs
 * providers = removeDuplicates(providers);
 * 
 * /* Calculate market share for each provider
 * double[] marketShare = new double[providers.length];
 * 
 * for (int i = 0; i < providers.length; i++) {
 * int count = 0;
 * for (int j = 0; j < emails.length; j++) {
 * if (emails[j].endsWith(providers[i])) {
 * count++;
 * }
 * }
 * marketShare[i] = (double) count / emails.length * 100;
 * }
 * }}}}
 */
