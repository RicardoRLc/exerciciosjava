File arquivo = new File("/home/hallan/nome_do_arquivo.txt");
try {
if (!arquivo.exists()) {
//cria um arquivo (vazio)
arquivo.createNewFile();
}
//caso seja um diretório, é possível listar seus arquivos e diretórios
File[] arquivos = arquivo.listFiles();
//escreve no arquivo
FileWriter fw = new FileWriter(arquivo, true);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Texto a ser escrito no txt");
bw.newLine();
bw.close();
fw.close();
//faz a leitura do arquivo

FileReader fr = new FileReader(arquivo);
BufferedReader br = new BufferedReader(fr);
//enquanto houver mais linhas
while (br.ready()) {
//lê a proxima linha
String linha = br.readLine();
//faz algo com a linha
System.out.println(linha);
}
br.close();
fr.close();
} catch (IOException ex) {
ex.printStackTrace();
}
}