
public class Main {

	public static void main(String[] args) {
		
		Computador acer = new Computador();
		acer.processador = "Ryzen";
		acer.memoria = 1000;
		acer.fonte = "Corsair";
		System.out.println(acer.processador);
		System.out.println(acer.memoria);
		System.out.println(acer.fonte);
		acer.ligarComputador();
		acer.acessarInternet();
		acer.programar();
		
		Telescopio rogerio = new Telescopio();
		rogerio.lente = "Barlow";
		rogerio.tamanho = 114;
		rogerio.alcance = "Infinito";
		System.out.println(rogerio.lente);
		System.out.println(rogerio.tamanho);
		System.out.println(rogerio.alcance);
		rogerio.regularAlcance();
		rogerio.enxergarDistancia();
		rogerio.ampliarImagem();

		Professor Larissa = new Professor();
		Larissa.formacao = "Desenvolvimento de Software";
		Larissa.instituicao = "FATEC";
		Larissa.disciplinas = "Desenvolvimento WEB I";
		System.out.println(Larissa.formacao);
		System.out.println(Larissa.instituicao);
		System.out.println(Larissa.disciplinas);
		Larissa.ensinar();
		Larissa.prepararAula();
		Larissa.aplicarProva();

		Recessao CriseEconomica = new Recessao();
		CriseEconomica.dataInicio = "22/11/2005";
		CriseEconomica.causa = "Desastres Naturais \n";
		System.out.println(CriseEconomica.dataInicio);
		System.out.println(CriseEconomica.causa);
	
		Roteador Asus = new Roteador();
		Asus.tipo = "Roteador Wi-Fi 6 (802.11ax)";
		Asus.alcanceRede = 500;
		Asus.velocidadeRede =  5;
		System.out.println(Asus.tipo);
		System.out.println(Asus.alcanceRede);
		System.out.println(Asus.velocidadeRede);
		Asus.identificarIp();
		Asus.promoverRede();
		Asus.enviarDados();
	
		Smartwatch Samsung = new Smartwatch();
		Samsung.marca = "Samsung Galaxy Watch 6";
		Samsung.cor = "Rosa";
		Samsung.formato =  "Redondo";
		System.out.println(Samsung.marca);
		System.out.println(Samsung.cor);
		System.out.println(Samsung.formato);
		Samsung.contarBatimentos();
		Samsung.exibirHora();

		TaxaJuros Sabrina = new TaxaJuros();
		Sabrina.valor = 10;
		Sabrina.quantidade = 2;
		System.out.println(Sabrina.valor);
		System.out.println(Sabrina.quantidade);
		Sabrina.somarParcela();	
		
		Tigre princesaTigre = new Tigre();
		princesaTigre.cor = "Amarelo \n";
		princesaTigre.peso = 120;
		princesaTigre.tamanho = 2.8;
		System.out.println(princesaTigre.cor);
		System.out.println(princesaTigre.peso);
		System.out.println(princesaTigre.tamanho);
		princesaTigre.cacar();	
		princesaTigre.comer();	
		princesaTigre.procriar();	

		Trem trem1 = new Trem();
		trem1.material = "Ferro";
		trem1.tipo = "Diesel Mêcanico";
		trem1.velocidade = 200;
		System.out.println(trem1.material);
		System.out.println(trem1.tipo);
		System.out.println(trem1.velocidade);
		trem1.transporte();	
		trem1.ligar();	
		trem1.andar();	

		Asteroide destruidor = new Asteroide();
		destruidor.tamanho = 100;
		destruidor.espessura = 100;
		destruidor.material = "Carbonáceos";
		System.out.println(destruidor.tamanho);
		System.out.println(destruidor.espessura);
		System.out.println(destruidor.material);
		destruidor.semover();	
		destruidor.destruir();	
		destruidor.trazerMateriais();	

		Genetica paulo = new Genetica();
		paulo.caracteristica = "cabelo preto";
		paulo.heranca = "Herdado de ambos os pais";
		paulo.estrutura = "Estrutura Genômica \n";
		System.out.println(paulo.caracteristica);
		System.out.println(paulo.heranca);
		System.out.println(paulo.estrutura);

		Celula celula1 = new Celula();
		celula1.tipo = "Hemácia - Célula Sanguínea";
		celula1.cor = "Vermelho";
		celula1.tamanho = 8;
		System.out.println(celula1.tipo);
		System.out.println(celula1.cor);
		System.out.println(celula1.tamanho);
		celula1.cicatrizar();
		celula1.proliferar();
		celula1.proteger();

		Osmose osmose1 = new Osmose();
		osmose1.transportarAgua();

		Arte arte1 = new Arte();
		arte1.material = "Tinta";
		arte1.superficie = "Madeira";
		arte1.estilo = "Romântico";
		arte1.cor ="Multicolorido";
		arte1.digital= false;
		System.out.println(arte1.material);
		System.out.println(arte1.superficie);
		System.out.println(arte1.estilo);
		System.out.println(arte1.cor);
		arte1.decorarAmbiente();
		arte1.descreverSituacoes();

		IdadeMedia im = new IdadeMedia();
		im.ano = "476 d.C.e 1453 d.C";
		im.cultura = "Feudalismo, Religião, Arte medieval";
		im.localizacao = "Europa Ocidental \n";
		System.out.println(im.ano);
		System.out.println(im.cultura);
		System.out.println(im.localizacao);

		Cinema cinema1 = new Cinema();
		cinema1.tamanho = 30;
		cinema1.quantidadeSala = 10;
		cinema1.quantidadeLugar = 50;
		System.out.println(cinema1.tamanho);
		System.out.println(cinema1.quantidadeSala);
		System.out.println(cinema1.quantidadeLugar);
		cinema1.reproduzirFilmes();
		cinema1.entretendo();
		cinema1.Venda();


	}

}
