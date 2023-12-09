package Chumbador;

import java.util.ArrayList;
import java.util.List;

import Grafo.Edge;
import Grafo.Node;
import Grafo.Veiculo;

public class FakeBD {

	private static List<Node> cidades = new ArrayList<>();
	private static List<Veiculo> veiculos = new ArrayList<Veiculo>();

	public static void instanciarObjetos() {
		Veiculo Motocicleta = new Veiculo(0);
		Motocicleta.setTipo("Motocicleta");
		Motocicleta.setCombustivel("Gasolina");
		Motocicleta.setKmPorL(41);
		Motocicleta.setValorCombustivel(5.63);
		Motocicleta.setVelocidadeMedia(100);
		veiculos.add(Motocicleta);
		
		Veiculo Carro = new Veiculo(1);
		Carro.setTipo("Carro");
		Carro.setCombustivel("Gasolina");
		Carro.setKmPorL(14.7);
		Carro.setValorCombustivel(5.63);
		Carro.setVelocidadeMedia(90);
		veiculos.add(Carro);
		
		Veiculo MicroOnibus = new Veiculo(2);
		MicroOnibus.setTipo("Micro-Ônibus");
		MicroOnibus.setCombustivel("Diesel S10");
		MicroOnibus.setKmPorL(8.2);
		MicroOnibus.setValorCombustivel(5.21);
		MicroOnibus.setVelocidadeMedia(80);
		veiculos.add(MicroOnibus);
		
		Veiculo Onibus = new Veiculo(3);
		Onibus.setTipo("Ônibus");
		Onibus.setCombustivel("Diesel S10");
		Onibus.setKmPorL(5.5);
		Onibus.setValorCombustivel(5.21);
		Onibus.setVelocidadeMedia(70);
		veiculos.add(Onibus);
		
		Veiculo Caminhao = new Veiculo(4);
		Caminhao.setTipo("Caminhão");
		Caminhao.setCombustivel("Diesel");
		Caminhao.setKmPorL(2.5);
		Caminhao.setValorCombustivel(4.55);
		Caminhao.setVelocidadeMedia(60);
		veiculos.add(Caminhao);
		
		Node boaventura = new Node("Boa Ventura de São Roque");
		Node laranjal = new Node("Laranjal");
		Node matorico = new Node("Mato Rico");
		Node palmital = new Node("Palmital");
		Node pitanga = new Node("Pitanga");
		Node santamaria = new Node("Santa Maria do Oeste");
		Node campinadosimao = new Node("Campina do Simão");
		Node candoi = new Node("Candói");
		Node cantagalo = new Node("Cantagalo");
		Node espigaoalto = new Node("Espigão Alto do iguaçu");
		Node fozdojordao = new Node("Foz do Jordão");
		Node goioxim = new Node("Goioxim");
		Node guarapuava = new Node("Guarapuava");
		Node inaciomartins = new Node("Inácio Martins");
		Node laranjeirasdosul = new Node("Laranjeiras do Sul");
		Node marquinho = new Node("Marquinho");
		Node novalaranjeiras = new Node("Nova Laranjeiras");
		Node pinhao = new Node("Pinhão");
		Node portobarreiro = new Node("Porto Barreiro");
		Node quedasdoiguacu = new Node("Quedas do Iguaçu");
		Node reservadoiguacu = new Node("Reserva do Iguaçu");
		Node riobonito = new Node("Rio Bonito do Iguaçu");
		Node turvo = new Node("Turvo");
		Node virmond = new Node("Virmond");
		Node clevelandia = new Node("Clevelândia");
		Node coroneldomingos = new Node("Coronel Domingos Soares");
		Node honorioserpa = new Node("Honório Serpa");
		Node mangueirinha = new Node("Mangueirinha");
		Node palmas = new Node("Palmas");

		cidades.add(boaventura);
		cidades.add(laranjal);
		cidades.add(matorico);
		cidades.add(palmital);
		cidades.add(pitanga);
		cidades.add(santamaria);
		cidades.add(campinadosimao);
		cidades.add(candoi);
		cidades.add(cantagalo);
		cidades.add(espigaoalto);
		cidades.add(fozdojordao);
		cidades.add(goioxim);
		cidades.add(guarapuava);
		cidades.add(inaciomartins);
		cidades.add(laranjeirasdosul);
		cidades.add(marquinho);
		cidades.add(novalaranjeiras);
		cidades.add(pinhao);
		cidades.add(portobarreiro);
		cidades.add(quedasdoiguacu);
		cidades.add(reservadoiguacu);
		cidades.add(riobonito);
		cidades.add(turvo);
		cidades.add(virmond);
		cidades.add(clevelandia);
		cidades.add(coroneldomingos);
		cidades.add(honorioserpa);
		cidades.add(mangueirinha);
		cidades.add(palmas);
		
		Edge saoroque_pitanga = new Edge(pitanga, 44.9);
		Edge saoroque_santamaria = new Edge(santamaria, 53.7);
		Edge saoroque_turvo = new Edge(turvo, 21.9);
		boaventura.vizinhos.add(saoroque_turvo);
		boaventura.vizinhos.add(saoroque_santamaria);
		boaventura.vizinhos.add(saoroque_pitanga);
		
		Edge laranjal_palmital = new Edge(palmital, 31.9);
		Edge laranjal_novalaran = new Edge(novalaranjeiras, 116);
		laranjal.vizinhos.add(laranjal_novalaran);
		laranjal.vizinhos.add(laranjal_palmital);

		Edge matorico_palmital = new Edge(palmital, 58.9);
		Edge matorico_pitanga = new Edge(pitanga, 48);
		matorico.vizinhos.add(matorico_pitanga);
		matorico.vizinhos.add(matorico_palmital);
		
		Edge palmital_larajal = new Edge(laranjal, 31.9);
		Edge palmital_matorico = new Edge(matorico, 58.9);
		Edge palmital_pitanga = new Edge(pitanga, 71.8);
		Edge palmital_santamaria = new Edge(santamaria, 40.3);
		Edge palmital_goioxim = new Edge(goioxim, 80.5);
		Edge palmital_marquinho = new Edge(marquinho, 37.9);
		Edge palmital_novalaranjeiras = new Edge(novalaranjeiras, 95.2);
		palmital.vizinhos.add(palmital_novalaranjeiras);
		palmital.vizinhos.add(palmital_marquinho);
		palmital.vizinhos.add(palmital_goioxim);
		palmital.vizinhos.add(palmital_santamaria);
		palmital.vizinhos.add(palmital_pitanga);
		palmital.vizinhos.add(palmital_matorico);
		palmital.vizinhos.add(palmital_larajal);
		
		Edge pitanga_boaventura = new Edge(boaventura, 44.9);
		Edge pitanga_matorico = new Edge(matorico, 48);
		Edge pitanga_palmital = new Edge(palmital, 71.8);
		Edge pitanga_santamaria = new Edge(santamaria, 41.6);
		pitanga.vizinhos.add(pitanga_boaventura);
		pitanga.vizinhos.add(pitanga_matorico);
		pitanga.vizinhos.add(pitanga_palmital);
		pitanga.vizinhos.add(pitanga_santamaria);
		
		Edge santamaria_boaventura = new Edge(boaventura, 53.7);
		Edge santamaria_palmital = new Edge(palmital, 40.3);
		Edge santamaria_pitanga = new Edge(pitanga, 41.6);
		Edge santamaria_goioxim = new Edge(goioxim, 56.9);
		Edge santamaria_campinadosimao = new Edge(campinadosimao, 24.9);
		Edge santamaria_turvo = new Edge(turvo, 55.6);
		santamaria.vizinhos.add(santamaria_boaventura);
		santamaria.vizinhos.add(santamaria_palmital);
		santamaria.vizinhos.add(santamaria_pitanga);
		santamaria.vizinhos.add(santamaria_goioxim);
		santamaria.vizinhos.add(santamaria_campinadosimao);
		santamaria.vizinhos.add(santamaria_turvo);
		
		Edge campinadosimao_guarapuava = new Edge(guarapuava, 70.3);
		Edge campinadosimao_turvo = new Edge(turvo, 64.6);
		Edge campinadosimao_santamaria = new Edge(santamaria, 24.9);
		Edge campinadosimao_goioxim = new Edge(goioxim, 41.6);
		campinadosimao.vizinhos.add(campinadosimao_guarapuava);
		campinadosimao.vizinhos.add(campinadosimao_turvo);
		campinadosimao.vizinhos.add(campinadosimao_santamaria);
		campinadosimao.vizinhos.add(campinadosimao_goioxim);
		
		Edge candoi_guarapuava = new Edge(guarapuava, 75.1);
		Edge candoi_cantagalo = new Edge(cantagalo, 41.7);
		Edge candoi_virmond = new Edge(virmond, 50.3);
		Edge candoi_portobarreiro = new Edge(portobarreiro, 94.1);
		Edge candoi_fozdojordao = new Edge(fozdojordao, 24);
		Edge candoi_pinhao = new Edge(pinhao, 55.1);
		candoi.vizinhos.add(candoi_guarapuava);
		candoi.vizinhos.add(candoi_cantagalo);
		candoi.vizinhos.add(candoi_virmond);
		candoi.vizinhos.add(candoi_portobarreiro);
		candoi.vizinhos.add(candoi_fozdojordao);
		candoi.vizinhos.add(candoi_pinhao);
		
		Edge cantagalo_candoi = new Edge(candoi, 41.7);
		Edge cantagalo_guarapuava = new Edge(guarapuava, 80.9);
		Edge cantagalo_goioxim = new Edge(goioxim, 31.8);
		Edge cantagalo_marquinho = new Edge(marquinho, 67.6);
		Edge cantagalo_laranjeirasdosul = new Edge(laranjeirasdosul, 33.5);
		Edge cantagalo_virmond = new Edge(virmond, 9.4);
		cantagalo.vizinhos.add(cantagalo_candoi);
		cantagalo.vizinhos.add(cantagalo_virmond);
		cantagalo.vizinhos.add(cantagalo_laranjeirasdosul);
		cantagalo.vizinhos.add(cantagalo_marquinho);
		cantagalo.vizinhos.add(cantagalo_goioxim);
		cantagalo.vizinhos.add(cantagalo_guarapuava);
		
		Edge espigaoalto_novalaranjeiras = new Edge(novalaranjeiras, 40.6);
		Edge espigaoalto_riobonito = new Edge(riobonito, 42.5);
		Edge espigaoalto_quedasdoiguacu = new Edge(quedasdoiguacu, 8.4);
		espigaoalto.vizinhos.add(espigaoalto_quedasdoiguacu);
		espigaoalto.vizinhos.add(espigaoalto_riobonito);
		espigaoalto.vizinhos.add(espigaoalto_novalaranjeiras);
		
		Edge fozdojordao_candoi = new Edge(candoi, 24);
		Edge fozdojordao_pinhao = new Edge(pinhao, 63.7);
		Edge fozdojordao_reservadoiguacu = new Edge(reservadoiguacu, 18.7);
		Edge fozdojordao_mangueirinha = new Edge(mangueirinha, 132);
		fozdojordao.vizinhos.add(fozdojordao_mangueirinha);
		fozdojordao.vizinhos.add(fozdojordao_reservadoiguacu);
		fozdojordao.vizinhos.add(fozdojordao_pinhao);
		fozdojordao.vizinhos.add(fozdojordao_candoi);
		
		Edge goioxim_guarapuava = new Edge(guarapuava, 76.3);
		Edge goioxim_campinadosimao = new Edge(campinadosimao, 41.6);
		Edge goioxim_santamaria = new Edge(santamaria, 56.9);
		Edge goioxim_palmital = new Edge(palmital, 80.5);
		Edge goioxim_marquinho = new Edge(marquinho, 43.4);
		Edge goioxim_cantagalo = new Edge(cantagalo, 31.8);
		goioxim.vizinhos.add(goioxim_cantagalo);
		goioxim.vizinhos.add(goioxim_marquinho);
		goioxim.vizinhos.add(goioxim_palmital);
		goioxim.vizinhos.add(goioxim_santamaria);
		goioxim.vizinhos.add(goioxim_campinadosimao);
		goioxim.vizinhos.add(goioxim_guarapuava);
		
		Edge inaciomartins_guarapuava = new Edge(guarapuava, 61.4);
		Edge inaciomartins_pinhao = new Edge(pinhao, 52);
		inaciomartins.vizinhos.add(inaciomartins_guarapuava);
		inaciomartins.vizinhos.add(inaciomartins_pinhao);
		
		Edge laranjeirasdosul_portobarreiro = new Edge(portobarreiro, 19.3);
		Edge laranjeirasdosul_virmond = new Edge(virmond, 25.1);
		Edge laranjeirasdosul_cantagalo = new Edge(cantagalo, 33.5);
		Edge laranjeirasdosul_marquinho = new Edge(marquinho, 43.4);
		Edge laranjeirasdosul_novalaranjeiras = new Edge(novalaranjeiras, 19.5);
		Edge laranjeirasdosul_riobonito = new Edge(riobonito, 17.4);
		laranjeirasdosul.vizinhos.add(laranjeirasdosul_riobonito);
		laranjeirasdosul.vizinhos.add(laranjeirasdosul_novalaranjeiras);
		laranjeirasdosul.vizinhos.add(laranjeirasdosul_marquinho);
		laranjeirasdosul.vizinhos.add(laranjeirasdosul_cantagalo);
		laranjeirasdosul.vizinhos.add(laranjeirasdosul_virmond);
		laranjeirasdosul.vizinhos.add(laranjeirasdosul_portobarreiro);
		
		Edge marquinho_cantagalo = new Edge(cantagalo, 67.6);
		Edge marquinho_goioxim = new Edge(goioxim, 43.4);
		Edge marquinho_palmital = new Edge(palmital, 37.9);
		Edge marquinho_novalaranjeiras = new Edge(novalaranjeiras, 58.6);
		Edge marquinho_laranjeirasdosul = new Edge(laranjeirasdosul, 43.4);
		marquinho.vizinhos.add(marquinho_laranjeirasdosul);
		marquinho.vizinhos.add(marquinho_novalaranjeiras);
		marquinho.vizinhos.add(marquinho_palmital);
		marquinho.vizinhos.add(marquinho_goioxim);
		marquinho.vizinhos.add(marquinho_cantagalo);
		
		Edge novalaranjeiras_riobonito = new Edge(riobonito, 35.2);
		Edge novalaranjeiras_laranjeirasdosul = new Edge(laranjeirasdosul, 40.4);
		Edge novalaranjeiras_marquinho = new Edge(marquinho, 58.6);
		Edge novalaranjeiras_palmital = new Edge(palmital, 95.2);
		Edge novalaranjeiras_laranjal = new Edge(laranjal, 116);
		Edge novalaranjeiras_espigaoalto = new Edge(espigaoalto, 40.6);
		novalaranjeiras.vizinhos.add(novalaranjeiras_espigaoalto);
		novalaranjeiras.vizinhos.add(novalaranjeiras_laranjal);
		novalaranjeiras.vizinhos.add(novalaranjeiras_palmital);
		novalaranjeiras.vizinhos.add(novalaranjeiras_marquinho);
		novalaranjeiras.vizinhos.add(novalaranjeiras_laranjeirasdosul);
		novalaranjeiras.vizinhos.add(novalaranjeiras_riobonito);
		
		Edge guarapuava_turvo = new Edge(turvo, 42.6);
		Edge guarapuava_campinadosimao = new Edge(campinadosimao, 70.3);
		Edge guarapuava_goioxim = new Edge(goioxim, 76.3);
		Edge guarapuava_cantagalo = new Edge(cantagalo, 80.9);
		Edge guarapuava_candoi = new Edge(candoi, 75.1);
		Edge guarapuava_pinhao = new Edge(pinhao, 52.4);
		Edge guarapuava_inaciomartins = new Edge(inaciomartins, 61.4);
		guarapuava.vizinhos.add(guarapuava_inaciomartins);
		guarapuava.vizinhos.add(guarapuava_turvo);
		guarapuava.vizinhos.add(guarapuava_campinadosimao);
		guarapuava.vizinhos.add(guarapuava_goioxim);
		guarapuava.vizinhos.add(guarapuava_cantagalo);
		guarapuava.vizinhos.add(guarapuava_candoi);
		guarapuava.vizinhos.add(guarapuava_pinhao);
		
		Edge pinhao_inaciomartins = new Edge(inaciomartins, 52);
		Edge pinhao_guarapuava = new Edge(guarapuava, 52.4);
		Edge pinhao_candoi = new Edge(candoi, 55.1);
		Edge pinhao_fozdojordao = new Edge(fozdojordao, 63.7);
		Edge pinhao_reservadoiguacu = new Edge(reservadoiguacu, 45.7);
		Edge pinhao_coroneldomingos = new Edge(coroneldomingos, 147);
		pinhao.vizinhos.add(pinhao_coroneldomingos);
		pinhao.vizinhos.add(pinhao_reservadoiguacu);
		pinhao.vizinhos.add(pinhao_fozdojordao);
		pinhao.vizinhos.add(pinhao_candoi);
		pinhao.vizinhos.add(pinhao_guarapuava);
		pinhao.vizinhos.add(pinhao_inaciomartins);
		
		Edge riobonito_quedasdoiguacu = new Edge(quedasdoiguacu, 56.5);
		Edge riobonito_espigaoalto = new Edge(espigaoalto, 42.5);
		Edge riobonito_novalaranjeiras = new Edge(novalaranjeiras, 35.2);
		Edge riobonito_laranjeirasdosul = new Edge(laranjeirasdosul, 17.4);
		Edge riobonito_portobarreiro = new Edge(portobarreiro, 17.7);
		riobonito.vizinhos.add(riobonito_portobarreiro);
		riobonito.vizinhos.add(riobonito_laranjeirasdosul);
		riobonito.vizinhos.add(riobonito_novalaranjeiras);
		riobonito.vizinhos.add(riobonito_espigaoalto);
		riobonito.vizinhos.add(riobonito_quedasdoiguacu);
		
		Edge virmond_candoi = new Edge(candoi, 50.3);
		Edge virmond_cantagalo = new Edge(cantagalo, 9.4);
		Edge virmond_laranjeirasdosul = new Edge(laranjeirasdosul, 25.1);
		Edge virmond_portobarreiro = new Edge(portobarreiro, 44.8);
		virmond.vizinhos.add(virmond_portobarreiro);
		virmond.vizinhos.add(virmond_laranjeirasdosul);
		virmond.vizinhos.add(virmond_cantagalo);
		virmond.vizinhos.add(virmond_candoi);
		
		Edge clevelandia_palmas = new Edge(palmas, 42.6);
		Edge clevelandia_coroneldomigos = new Edge(coroneldomingos, 52.5);
		Edge clevelandia_mangueirinha = new Edge(mangueirinha, 70.5);
		Edge clevelandia_honorioserpa = new Edge(honorioserpa, 43.2);
		clevelandia.vizinhos.add(clevelandia_honorioserpa);
		clevelandia.vizinhos.add(clevelandia_mangueirinha);
		clevelandia.vizinhos.add(clevelandia_coroneldomigos);
		clevelandia.vizinhos.add(clevelandia_palmas);
		
		Edge honorioserpa_clevelandia = new Edge(clevelandia, 43.2);
		Edge honorioserpa_mangueirinha = new Edge(mangueirinha, 43.6);
		honorioserpa.vizinhos.add(honorioserpa_mangueirinha);
		honorioserpa.vizinhos.add(honorioserpa_clevelandia);
		
		Edge mangueirinha_honorioserpa = new Edge(honorioserpa, 43.6);
		Edge mangueirinha_clevelandia = new Edge(clevelandia, 70.5);
		Edge mangueirinha_coroneldomingos = new Edge(coroneldomingos, 58.2);
		Edge mangueirinha_reservasdoiguacu = new Edge(reservadoiguacu, 47.5);
		Edge mangueirinha_fozdojordao = new Edge(fozdojordao, 39.7);
		mangueirinha.vizinhos.add(mangueirinha_fozdojordao);
		mangueirinha.vizinhos.add(mangueirinha_reservasdoiguacu);
		mangueirinha.vizinhos.add(mangueirinha_coroneldomingos);
		mangueirinha.vizinhos.add(mangueirinha_clevelandia);
		mangueirinha.vizinhos.add(mangueirinha_honorioserpa);
		
		Edge portobarreiro_riobonito = new Edge(riobonito, 17.7);
		Edge portobarreiro_laranjeirasdosul = new Edge(laranjeirasdosul, 19.3);
		Edge portobarreiro_virmond = new Edge(virmond, 44.8);
		Edge portobarreiro_candoi = new Edge(candoi, 94.1);
		portobarreiro.vizinhos.add(portobarreiro_candoi);
		portobarreiro.vizinhos.add(portobarreiro_virmond);
		portobarreiro.vizinhos.add(portobarreiro_laranjeirasdosul);
		portobarreiro.vizinhos.add(portobarreiro_riobonito);
		
		Edge quedasdoiguacu_espigaoalto = new Edge(espigaoalto, 8.4);
		Edge quedasdoiguacu_riobonito = new Edge(riobonito, 56.5);
		quedasdoiguacu.vizinhos.add(quedasdoiguacu_riobonito);
		quedasdoiguacu.vizinhos.add(quedasdoiguacu_espigaoalto);
		
		Edge turvo_boaventura = new Edge(boaventura, 21.9);
		Edge turvo_santamaria = new Edge(santamaria, 55.6);
		Edge turvo_campinadosimao = new Edge(campinadosimao, 64.6);
		Edge turvo_guarapuava = new Edge(guarapuava, 42.6);
		turvo.vizinhos.add(turvo_guarapuava);
		turvo.vizinhos.add(turvo_campinadosimao);
		turvo.vizinhos.add(turvo_santamaria);
		turvo.vizinhos.add(turvo_boaventura);
		
		Edge coroneldomingos_pinhao = new Edge(pinhao, 147);
		Edge coroneldomingos_reservadoiguacu = new Edge(reservadoiguacu, 102);
		Edge coroneldomingos_mangueirinha = new Edge(mangueirinha, 58.2);
		Edge coroneldomingos_clevelandia = new Edge(clevelandia, 52.5);
		Edge coroneldomingos_palmas = new Edge(palmas, 34.2);
		coroneldomingos.vizinhos.add(coroneldomingos_palmas);
		coroneldomingos.vizinhos.add(coroneldomingos_clevelandia);
		coroneldomingos.vizinhos.add(coroneldomingos_mangueirinha);
		coroneldomingos.vizinhos.add(coroneldomingos_reservadoiguacu);
		coroneldomingos.vizinhos.add(coroneldomingos_pinhao);
		
		Edge reservadoiguacu_pinhao = new Edge(pinhao, 45.7);
		Edge reservadoiguacu_coroneldomingos = new Edge(coroneldomingos, 102);
		Edge reservadoiguacu_mangueirinha = new Edge(mangueirinha, 47.5);
		Edge reservadoiguacu_fozdojordao = new Edge(fozdojordao, 17.1);
		reservadoiguacu.vizinhos.add(reservadoiguacu_fozdojordao);
		reservadoiguacu.vizinhos.add(reservadoiguacu_mangueirinha);
		reservadoiguacu.vizinhos.add(reservadoiguacu_coroneldomingos);
		reservadoiguacu.vizinhos.add(reservadoiguacu_pinhao);
		
		Edge palmas_coroneldomingos = new Edge(coroneldomingos, 34.2);
		Edge palmas_clevelandia = new Edge(clevelandia, 42.6);
		palmas.vizinhos.add(palmas_clevelandia);
		palmas.vizinhos.add(palmas_coroneldomingos);
	}
	
	public static Veiculo retornarVeiculo(int id) {
		Veiculo Motocicleta = new Veiculo(0);
		Motocicleta.setTipo("Motocicleta");
		Motocicleta.setCombustivel("Gasolina");
		Motocicleta.setKmPorL(41);
		Motocicleta.setValorCombustivel(5.63);
		Motocicleta.setVelocidadeMedia(100);
		
		Veiculo Carro = new Veiculo(1);
		Carro.setTipo("Carro");
		Carro.setCombustivel("Gasolina");
		Carro.setKmPorL(14.7);
		Carro.setValorCombustivel(5.63);
		Carro.setVelocidadeMedia(90);
		
		Veiculo MicroOnibus = new Veiculo(2);
		MicroOnibus.setTipo("Micro-Ônibus");
		MicroOnibus.setCombustivel("Diesel S10");
		MicroOnibus.setKmPorL(8.2);
		MicroOnibus.setValorCombustivel(5.21);
		MicroOnibus.setVelocidadeMedia(80);
		
		Veiculo Onibus = new Veiculo(3);
		Onibus.setTipo("Ônibus");
		Onibus.setCombustivel("Diesel S10");
		Onibus.setKmPorL(5.5);
		Onibus.setValorCombustivel(5.21);
		Onibus.setVelocidadeMedia(70);
		
		Veiculo Caminhao = new Veiculo(4);
		Caminhao.setTipo("Caminhão");
		Caminhao.setCombustivel("Diesel");
		Caminhao.setKmPorL(2.5);
		Caminhao.setValorCombustivel(4.55);
		Caminhao.setVelocidadeMedia(60);
		
		if(id == 0) {
			return Motocicleta;
		}
		if(id == 1) {
			return Carro;
		}
		if(id == 2) {
			return MicroOnibus;
		}
		if(id == 3) {
			return Onibus;
		}
		if(id == 4) {
			return Caminhao;
		}
		return null;
	}
	
	
	public static Node retornaNo(String nome) {
		return cidades.stream().filter(cidade -> cidade.getNome().equals(nome)).findFirst().orElse(null);
	}
	
	public static ArrayList<Node> retornaLista(){
		Node boaventura = new Node("Boa Ventura de São Roque");
		Node laranjal = new Node("Laranjal");
		Node matorico = new Node("Mato Rico");
		Node palmital = new Node("Palmital");
		Node pitanga = new Node("Pitanga");
		Node santamaria = new Node("Santa Maria do Oeste");
		Node campinadosimao = new Node("Campina do Simão");
		Node candoi = new Node("Candói");
		Node cantagalo = new Node("Cantagalo");
		Node espigaoalto = new Node("Espigão Alto do iguaçu");
		Node fozdojordao = new Node("Foz do Jordão");
		Node goioxim = new Node("Goioxim");
		Node guarapuava = new Node("Guarapuava");
		Node inaciomartins = new Node("Inácio Martins");
		Node laranjeirasdosul = new Node("Laranjeiras do Sul");
		Node marquinho = new Node("Marquinho");
		Node novalaranjeiras = new Node("Nova Laranjeiras");
		Node pinhao = new Node("Pinhão");
		Node portobarreiro = new Node("Porto Barreiro");
		Node quedasdoiguacu = new Node("Quedas do Iguaçu");
		Node reservadoiguacu = new Node("Reserva do Iguaçu");
		Node riobonito = new Node("Rio Bonito do Iguaçu");
		Node turvo = new Node("Turvo");
		Node virmond = new Node("Virmond");
		Node clevelandia = new Node("Clevelândia");
		Node coroneldomingos = new Node("Coronel Domingos Soares");
		Node honorioserpa = new Node("Honório Serpa");
		Node mangueirinha = new Node("Mangueirinha");
		Node palmas = new Node("Palmas");
		
		ArrayList<Node> lista = new ArrayList<Node>();
		lista.add(boaventura);
		lista.add(laranjal);
		lista.add(matorico);
		lista.add(palmital);
		lista.add(pitanga);
		lista.add(santamaria);
		lista.add(campinadosimao);
		lista.add(candoi);
		lista.add(cantagalo);
		lista.add(espigaoalto);
		lista.add(fozdojordao);
		lista.add(goioxim);
		lista.add(guarapuava);
		lista.add(inaciomartins);
		lista.add(laranjeirasdosul);
		lista.add(marquinho);
		lista.add(novalaranjeiras);
		lista.add(pinhao);
		lista.add(portobarreiro);
		lista.add(quedasdoiguacu);
		lista.add(reservadoiguacu);
		lista.add(riobonito);
		lista.add(turvo);
		lista.add(virmond);
		lista.add(clevelandia);
		lista.add(coroneldomingos);
		lista.add(honorioserpa);
		lista.add(mangueirinha);
		lista.add(palmas);
		
		return lista;
	}
	
	public static ArrayList<String> retornaNome(){
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Boa Ventura de São Roque");
		lista.add("Laranjal");
		lista.add("Mato Rico");
		lista.add("Palmital");
		lista.add("Pitanga");
		lista.add("Santa Maria do Oeste");
		lista.add("Campina do Simão");
		lista.add("Candói");
		lista.add("Cantagalo");
		lista.add("Espigão Alto do iguaçu");
		lista.add("Foz do Jordão");
		lista.add("Goioxim");
		lista.add("Guarapuava");
		lista.add("Inácio Martins");
		lista.add("Laranjeiras do Sul");
		lista.add("Marquinho");
		lista.add("Nova Laranjeiras");
		lista.add("Pinhão");
		lista.add("Porto Barreiro");
		lista.add("Quedas do Iguaçu");
		lista.add("Reserva do Iguaçu");
		lista.add("Rio Bonito do Iguaçu");
		lista.add("Turvo");
		lista.add("Virmond");
		lista.add("Clevelândia");
		lista.add("Coronel Domingos Soares");
		lista.add("Honório Serpa");
		lista.add("Mangueirinha");
		lista.add("Palmas");
		
		return lista;
	}
}
