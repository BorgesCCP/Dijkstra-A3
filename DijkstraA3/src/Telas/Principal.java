package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Chumbador.FakeBD;
import Grafo.Dijkstra;
import Grafo.Edge;
import Grafo.Node;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_distancia;
	private JTextField textField_tempo;
	private JTextField textField_pedagio;
	private JTextField textField_combustivel;
	private JTextField textField_alimentacao;
	private JTextField textField_total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		FakeBD.instanciarObjetos();
		
		JLabel lblNewLabel = new JLabel("Grafos Centro-Sul Paranaense");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel.setBounds(210, 0, 354, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha o Veículo:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 99, 178, 20);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(210, 99, 252, 22);
		contentPane.add(comboBox);
		for (int i = 0; i <= 4; i++) {
			comboBox.addItem(FakeBD.retornarVeiculo(i).getTipo());
		}
		
		JLabel lblNewLabel_1_1 = new JLabel("Escolha o Ponto de Partida:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(0, 146, 200, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(210, 144, 252, 22);
		contentPane.add(comboBox_1);
		ArrayList<String> lista = FakeBD.retornaNome();
		for (int i = 0; i < lista.size(); i++) {
			comboBox_1.addItem(lista.get(i));
		}
		
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Escolha o Destino:");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(0, 193, 200, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(210, 191, 252, 22);
		contentPane.add(comboBox_2);
		for (int i = 0; i < lista.size(); i++) {
			comboBox_2.addItem(lista.get(i));
		}
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Distância em km:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 322, 200, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_distancia = new JTextField();
		textField_distancia.setToolTipText("insira");
		textField_distancia.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_distancia.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_distancia.setColumns(10);
		textField_distancia.setBounds(210, 323, 184, 20);
		contentPane.add(textField_distancia);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tempo de Deslocamento:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 368, 200, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_tempo = new JTextField();
		textField_tempo.setToolTipText("insira");
		textField_tempo.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_tempo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_tempo.setColumns(10);
		textField_tempo.setBounds(210, 369, 184, 20);
		contentPane.add(textField_tempo);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Trajeto Percorrido:");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 409, 200, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Custo com Pedágio:");
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_2.setBounds(388, 322, 200, 20);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("Custo com Combustível:");
		lblNewLabel_1_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_3.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_3.setBounds(388, 368, 200, 20);
		contentPane.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Custo com Alimentação:");
		lblNewLabel_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_2.setBounds(388, 409, 200, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("Custo Total:");
		lblNewLabel_1_1_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_3.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_3.setBounds(388, 452, 200, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1_3);
		
		textField_pedagio = new JTextField();
		textField_pedagio.setToolTipText("insira");
		textField_pedagio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_pedagio.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_pedagio.setColumns(10);
		textField_pedagio.setBounds(600, 322, 184, 20);
		contentPane.add(textField_pedagio);
		
		textField_combustivel = new JTextField();
		textField_combustivel.setToolTipText("insira");
		textField_combustivel.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_combustivel.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_combustivel.setColumns(10);
		textField_combustivel.setBounds(600, 368, 184, 20);
		contentPane.add(textField_combustivel);
		
		textField_alimentacao = new JTextField();
		textField_alimentacao.setToolTipText("insira");
		textField_alimentacao.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_alimentacao.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_alimentacao.setColumns(10);
		textField_alimentacao.setBounds(600, 409, 184, 20);
		contentPane.add(textField_alimentacao);
		
		textField_total = new JTextField();
		textField_total.setToolTipText("insira");
		textField_total.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_total.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_total.setColumns(10);
		textField_total.setBounds(600, 453, 184, 20);
		contentPane.add(textField_total);
		
		JComboBox<String> comboBox_2_1 = new JComboBox<String>();
		comboBox_2_1.setBounds(143, 410, 252, 22);
		contentPane.add(comboBox_2_1);
		
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
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node destino = Dijkstra.getViagemDijkstra(FakeBD.retornaNo(comboBox_1.getSelectedItem().toString()), FakeBD.retornaNo(comboBox_2.getSelectedItem().toString()));
				
				double distancia = destino.menorDistancia;
				
				textField_distancia.setText(String.valueOf(distancia));
				
				double tempo = distancia / FakeBD.retornarVeiculo(comboBox.getSelectedIndex()).getVelocidadeMedia();

				textField_tempo.setText("Minutos: " + tempo * 60);
				System.out.println(String.valueOf(tempo));
				
				textField_pedagio.setText("R$ " + String.valueOf(0));
				
				double combus = distancia / FakeBD.retornarVeiculo(comboBox.getSelectedIndex()).getKmPorL() * FakeBD.retornarVeiculo(comboBox.getSelectedIndex()).getValorCombustivel();
				textField_combustivel.setText("R$ "+ combus);
				
				textField_alimentacao.setText("R$ " + String.valueOf(100.00));
				
				double total = 100.00 + combus + 0;
				textField_total.setText(String.valueOf("R$ " + total));
				
				for (int i = 0; i <= destino.visitadas.size(); i++) {
					comboBox_2_1.addItem(destino.visitadas.get(i).getNome());
				}
			}
		});
				
				
				
		btnNewButton.setBounds(210, 248, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
		
	
