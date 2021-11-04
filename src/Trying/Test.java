package Trying;

import java.util.ArrayList;
import java.util.Scanner;



public class Test extends ADD_SELL {

	public static void main(String[] args) {


		Product mu1 = new Product("Make-up", "Face", "Foundation",0);


		Product f1 = new Product("Face", "Foundation", "1-n1 (light tone)", 40);
		Product f2 = new Product("Face", "Foundation", "2-n2 (medium tone)", 40);
		Product f3 = new Product("Face", "Foundation", "3-n3 (dark tone)", 40);

		Product Powder = new Product("", "", "Powder",0);

		Product p1 = new Product("Face", "Powders", "1-c1 (light)", 40);
		Product p2 = new Product("Face", "Powders", "2-c2 (medium)", 40);
		Product p3 = new Product("Face", "Powders", "3-c3 (dark)", 40);

		Product Blushes = new Product("", "", "Blushes",0);

		Product b1 = new Product("Face", "Blushes", "1-p1 (pink)", 40);
		Product b2 = new Product("Face", "Blushes", "2-p2 (peach)", 40);

		Product Concealer = new Product("", "", "Concealers",0);

		Product c1 = new Product("Face", "Concealers", "1-d1 (light)", 40);
		Product c2 = new Product("Face", "Concealers", "2-d2 (medium)", 40);
		Product c3 = new Product("Face", "Concealers", "3-d3 (dark)", 40);

		Product Highl = new Product("", "", "Highlighters and Bronzers",0);

		Product h1 = new Product("Face", "Highlighters and Bronzers", "1-Highlight/Bronzer Palette", 40);


		Product eyes= new Product("" ,"Eyes" , "",0); 
		Product eshadow = new Product("", "", "EyeShadow Palettes",0);

		Product e1 = new Product("Eyes", "EyeShadow Palettes", "1-Ä°lRa", 40);
		Product e2 = new Product("Eyes", "EyeShadow Palettes", "2-BFay", 40);
		Product e3 = new Product("Eyes", "EyeShadow Palettes", "3-Ä°lBes", 40);

		Product Rimmel = new Product("", "", "Rimmel",0);
		Product r1 = new Product("Eyes", "Rimmel", "1-Black", 40);
		Product r2 = new Product("Eyes", "Rimmel", "2-Brown", 40);

		Product epencil = new Product("", "", "Eye Pencils",0);
		Product ep1 = new Product("Eyes", "Eye Pencils", "1-Black", 40);
		Product ep2 = new Product("Eyes", "Eye Pencils", "2-Brown", 40);
		Product ep3 = new Product("Eyes", "Eye Pencils", "3-White", 40);
		Product ep4 = new Product("Eyes", "Eye Pencils", "4-Blue", 40);
		Product ep5= new Product("Eyes", "Eye Pencils", "5-Green", 40);

		Product lip = new Product("" ,"Lips" , "",0); 
		Product Lstick = new Product("", "", "LipSticks",0);
		Product l1= new Product("Lips", "LipSticks", "1-Red", 40);
		Product l2= new Product("Lips", "LipSticks", "2-Pink ", 40);
		Product l3= new Product("Lips", "LipSticks", "3-Brown", 40);
		Product l4= new Product("Lips", "LipSticks", "4-Purple", 40);
		Product l5= new Product("Lips", "LipSticks", "5-Nude", 40);

		Product LipGlos = new Product("", "", "LipGlosses",0);
		Product g1= new Product("Lips", "LipGlosses", "1-Glitter", 40);
		Product g2= new Product("Lips", "LipGlosses", "2-Clouds", 40);
		Product g3= new Product("Lips", "LipGlosses", "3-Cotton Candy", 40);


		Product LiPencil = new Product("", "", "LipPencils",0);
		Product lp1= new Product("Lips", "LipPencils", "1-Pink", 40);
		Product lp2= new Product("Lips", "LipPencils", "2-Red", 40);

		Product nail = new Product("Nail", "", "", 0);

		Product nailart = new Product("", "", "Nail Art",0);
		Product n1= new Product("Nail", "Nail Art", "1-Nudes", 40);
		Product n2= new Product("Nail", "Nail Art", "2-100", 40);
		Product n3= new Product("Nail", "Nail Art", "3-101", 40);


		Product Vco = new Product("", "", "Vibrant Colors",0);
		Product na1= new Product("Nail", "Vibrant Colors", "1-200", 40);
		Product na2= new Product("Nail", "Vibrant Colors", "2-201", 40);

		Product softcolors = new Product("", "", "Soft Colors",0);
		Product so1= new Product("Nail", "Soft Colors", "1-300", 40);
		Product so2= new Product("Nail", "Soft Colors", "2-301", 40);


		Product mapa= new Product("", "", "Manicure-Pedicure", 0);
		Product mp= new Product("Nail", "Manicure-Pedicure", "1-Cottons", 40);


		Product ProNa= new Product("", "", "Prosthetic Nail", 0);

		Product pn1= new Product("Nail", "Prosthetic Nail", "1-Poli-Jel", 40);
		Product pn2= new Product("Nail", "Prosthetic Nail", "2-Nail Polish 400", 40);


		LinkedList list = new LinkedList();

		

		list.insert(pn2);
		list.insert(pn1);

		list.insert(ProNa);

		list.insert(mp);
		list.insert(mapa);


		list.insert(so2);
		list.insert(so1);

		list.insert(softcolors);

		list.insert(na2);
		list.insert(na1);

		list.insert(Vco);


		list.insert(n3);
		list.insert(n2);
		list.insert(n1);

		list.insert(nailart);

		list.insert(nail);


		list.insert(lp2);
		list.insert(lp1);

		list.insert(LiPencil);


		list.insert(g3);
		list.insert(g2);
		list.insert(g1);

		list.insert(LipGlos);

		list.insert(l5);
		list.insert(l4);
		list.insert(l3);
		list.insert(l2);
		list.insert(l1);

		list.insert(Lstick);

		list.insert(lip);

		list.insert(ep5);
		list.insert(ep4);
		list.insert(ep3);
		list.insert(ep2);
		list.insert(ep1);

		list.insert(epencil);

		list.insert(r2);
		list.insert(r1);
		list.insert(Rimmel);


		list.insert(e3);
		list.insert(e2);
		list.insert(e1);

		list.insert(eshadow);
		list.insert(eyes);


		list.insert(h1);
		list.insert(Highl);

		list.insert(c3);
		list.insert(c2);
		list.insert(c1);

		list.insert(Concealer);


		list.insert(b2);
		list.insert(b1);

		list.insert(Blushes);

		list.insert(p3);
		list.insert(p2);
		list.insert(p1);


		list.insert(Powder);


		list.insert(f3);
		list.insert(f2);
		list.insert(f1);


		list.insert(mu1);

		
		 Product[] arr = {f1, f2, f3, p1, p2, p3,b1,b2,c1,c2,c3,h1,
							e1,e2,e3,r1,r2,ep1,ep2,ep3,ep4,ep5,
							l1,l2,l3,l4,l5,g1,g2,g3,lp1,lp2,n1,n2,n3,na1,na2,so1,so2,mp,pn1,pn2};
		
	
	
		Scanner sc = new Scanner(System.in);

		while(true) {
			

			System.out.println("Please choose category: Make-up / Nail");
			String Customer = sc.nextLine();

			//choice: make up  
			if(Customer.equals(mu1.getCategory())) {

				System.out.println("Choose one of them: Face / Eyes / Lips ");

				//choice: face
				String fel = sc.nextLine();
				if(fel.equals(mu1.getProduct())) {

					System.out.println("Choose one of them : Foundation/Powder/Blushes/Concealers/Highlighters and Bronzers");

					String a = sc.nextLine();

					//choice: foundation

					if(a.equals(mu1.getType())) {

						System.out.println(f1.getType() + "  " +f1.getAmount());
						System.out.println(f2.getType() + "  " +f2.getAmount());
						System.out.println(f3.getType() + "  " +f3.getAmount());

						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								f1.setAmount(amountSell(f1));

								break;
							case 2:
								f2.setAmount(amountSell(f2));
								break;

							case 3:
								f3.setAmount(amountSell(f3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								f1.setAmount(amountAdd(f1));
								break;
							case 2 :
								f2.setAmount(amountAdd(f2));
								break;
							case 3:
								f3.setAmount(amountAdd(f3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}
						}
					}//if of foundation

					//powder
					else if(a.equals(Powder.getType())) {

						System.out.println(p1.getType() + "  " +p1.getAmount());
						System.out.println(p2.getType() + "  " +p2.getAmount());
						System.out.println(p3.getType() + "  " +p3.getAmount());

						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								p1.setAmount(amountSell(p1));

								break;
							case 2:
								p2.setAmount(amountSell(p2));
								break;

							case 3:
								p3.setAmount(amountSell(p3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//sellpow

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								p1.setAmount(amountAdd(p1));
								break;
							case 2 :
								p2.setAmount(amountAdd(p2));
								break;
							case 3:
								p3.setAmount(amountAdd(p3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//switchpowd
						}//addpow

					}//elseif of Powder

					//Blushes
					else if(a.equals(Blushes.getType())) {

						System.out.println(b1.getType() + "  " +b1.getAmount());
						System.out.println(b2.getType() + "  " +b2.getAmount());


						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								b1.setAmount(amountSell(b1));

								break;
							case 2:
								b2.setAmount(amountSell(b2));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//sellblus

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								b1.setAmount(amountAdd(b1));
								break;
							case 2 :
								b2.setAmount(amountAdd(b2));
								break;
							default:
								System.out.println("Invalid value");
								break;

							}//switchblus
						}//addblush


					}//elseif of Blushes


					//concealer
					else if(a.equals(Concealer.getType())) {

						System.out.println(c1.getType() + "  " +c1.getAmount());
						System.out.println(c2.getType() + "  " +c2.getAmount());
						System.out.println(c3.getType() + "  " +c3.getAmount());


						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								c1.setAmount(amountSell(c1));

								break;
							case 2:
								c2.setAmount(amountSell(c2));
								break;

							case 3:
								c3.setAmount(amountSell(c3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//sellConcealer

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								c1.setAmount(amountAdd(c1));
								break;
							case 2 :
								c2.setAmount(amountAdd(c2));
								break;
							case 3:
								c3.setAmount(amountAdd(c3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//switchConcealer

						}//addconcealer


					}//elseif of concealer

					else if(a.equals(Highl.getType())) {

						System.out.println(h1.getType() + "  " +h1.getAmount());

						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								h1.setAmount(amountSell(h1));

								break;

							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//sellhigh

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								h1.setAmount(amountAdd(h1));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//switchigh
						}//addhighlt


					}//elseif of highl



				}//FACE

				//EYES
				else if(fel.equals(eyes.getProduct())) {

					System.out.println("Choose one of them : EyeShadow Palettes/Rimmel/Eye Pencils ");

					String a = sc.nextLine();

					//choice: eyeshadow

					if(a.equals(eshadow.getType())) {

						System.out.println(e1.getType() + "  " +e1.getAmount());
						System.out.println(e2.getType() + "  " +e2.getAmount());
						System.out.println(e3.getType() + "  " +e3.getAmount());

						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								e1.setAmount(amountSell(e1));

								break;
							case 2:
								e2.setAmount(amountSell(e2));
								break;

							case 3:
								e3.setAmount(amountSell(e3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								e1.setAmount(amountAdd(e1));
								break;
							case 2 :
								e2.setAmount(amountAdd(e2));
								break;
							case 3:
								e3.setAmount(amountAdd(e3));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}
						}
					}//if of eyeshadow

					//rimmel
					else if(a.equals(Rimmel.getType())) {

						System.out.println(r1.getType() + "  " +r1.getAmount());
						System.out.println(r2.getType() + "  " +r2.getAmount());

						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								r1.setAmount(amountSell(r1));

								break;
							case 2:
								r2.setAmount(amountSell(r2));
								break;


							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//sellRimmel

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								r1.setAmount(amountAdd(r1));
								break;
							case 2 :
								r2.setAmount(amountAdd(r2));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//switchRim
						}//addRimmel

					}//elseif of Rimmel

					//eyepencil
					else if(a.equals(epencil.getType())) {

						System.out.println(ep1.getType() + "  " +ep1.getAmount());
						System.out.println(ep2.getType() + "  " +ep2.getAmount());
						System.out.println(ep3.getType() + "  " +ep3.getAmount());
						System.out.println(ep4.getType() + "  " +ep4.getAmount());
						System.out.println(ep5.getType() + "  " +ep5.getAmount());


						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								ep1.setAmount(amountSell(ep1));

								break;
							case 2:
								ep2.setAmount(amountSell(ep2));
								break;
							case 3:
								ep3.setAmount(amountSell(ep3));
								break;
							case 4:
								ep4.setAmount(amountSell(ep4));
								break;
							case 5:
								ep5.setAmount(amountSell(ep5));
								break;
							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//selleyepencil

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								ep1.setAmount(amountAdd(ep1));
								break;
							case 2 :
								ep2.setAmount(amountAdd(ep2));
								break;
							case 3 : 
								ep3.setAmount(amountAdd(ep3));
								break;
							case 4 : 
								ep4.setAmount(amountAdd(ep4));
								break;
							case 5 : 
								ep5.setAmount(amountAdd(ep5));
								break;
							default:
								System.out.println("Invalid value");
								break;

							}//switch
						}//addeyepencil


					}//elseif of eyepencil

				}//EYES


				//LIP
				else if(fel.equals(lip.getProduct())) {

					System.out.println("Choose one of them : LipSticks/LipGlosses/LipPencils ");

					String a = sc.nextLine();

					//choice: lip

					if(a.equals(Lstick.getType())) {

						System.out.println(l1.getType() + "  " +l1.getAmount());
						System.out.println(l2.getType() + "  " +l2.getAmount());
						System.out.println(l3.getType() + "  " +l3.getAmount());
						System.out.println(l4.getType() + "  " +l4.getAmount());
						System.out.println(l5.getType() + "  " +l5.getAmount());

						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								l1.setAmount(amountSell(l1));

								break;
							case 2:
								l2.setAmount(amountSell(l2));
								break;

							case 3:
								l3.setAmount(amountSell(l3));
								break;

							case 4:
								l4.setAmount(amountSell(l4));
								break;

							case 5:
								l5.setAmount(amountSell(l5));
								break;


							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//lipstick

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								l1.setAmount(amountAdd(l1));
								break;
							case 2 :
								l2.setAmount(amountAdd(l2));
								break;
							case 3:
								l3.setAmount(amountAdd(l3));
								break;
							case 4:
								l4.setAmount(amountAdd(l4));
								break;

							case 5:
								l5.setAmount(amountSell(l5));
								break;
							default:
								System.out.println("Invalid value");
								break;

							}
						}
					}//if of Lipstick

					//lipglpss
					else if(a.equals(LipGlos.getType())) {

						System.out.println(g1.getType() + "  " +g1.getAmount());
						System.out.println(g2.getType() + "  " +g2.getAmount());
						System.out.println(g3.getType() + "  " +g3.getAmount());

						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								g1.setAmount(amountSell(g1));

								break;
							case 2:
								g2.setAmount(amountSell(g2));
								break;
							case 3:
								g3.setAmount(amountSell(g3));
								break;



							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//sellgloss

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								g1.setAmount(amountAdd(g1));
								break;
							case 2 :
								g2.setAmount(amountAdd(g2));
								break;
							case 3:
								g3.setAmount(amountAdd(g3));
								break;


							default:
								System.out.println("Invalid value");
								break;

							}//switchRim
						}//addRimmel

					}//elseif oflipglos

					//lippencil
					else if(a.equals(LiPencil.getType())) {

						System.out.println(lp1.getType() + "  " +lp1.getAmount());
						System.out.println(lp2.getType() + "  " +lp2.getAmount());


						System.out.println("SELL / ADD ?");
						String sellbuy = sc.nextLine();
						if(sellbuy.equals("SELL")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1:
								lp1.setAmount(amountSell(lp1));

								break;
							case 2:
								lp2.setAmount(amountSell(lp2));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//swıtchcase
						}//sellpencil

						else if (sellbuy.equals("ADD")) {

							System.out.println("Choose type: ");
							int type = sc.nextInt();

							switch(type) {

							case 1 : 
								lp1.setAmount(amountAdd(lp1));
								break;
							case 2 :
								lp2.setAmount(amountAdd(lp2));
								break;

							default:
								System.out.println("Invalid value");
								break;

							}//switch
						}//addpencil


					}//elseif of pencil


				}//LIP

			}//MAKEUP

			else if(Customer.equals(nail.getCategory())) {
				System.out.println("Choose one of them:Nail Art / Vibrant Colors / Soft Colors/Manicure-Pedicure/Prosthetic Nail ");

				String a = sc.nextLine();

				//choice: nailart

				if(a.equals(nailart.getType())) {

					System.out.println(n1.getType() + "  " +n1.getAmount());
					System.out.println(n2.getType() + "  " +n2.getAmount());
					System.out.println(n3.getType() + "  " +n3.getAmount());

					System.out.println("SELL / ADD ?");
					String sellbuy = sc.nextLine();
					if(sellbuy.equals("SELL")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1:
							n1.setAmount(amountSell(n1));

							break;
						case 2:
							n2.setAmount(amountSell(n2));
							break;

						case 3:
							n3.setAmount(amountSell(n3));
							break;

						default:
							System.out.println("Invalid value");
							break;

						}//swıtchcase
					}//sellnailart

					else if (sellbuy.equals("ADD")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1 : 
							n1.setAmount(amountAdd(n1));
							break;
						case 2 :
							n2.setAmount(amountAdd(n2));
							break;
						case 3:
							n3.setAmount(amountAdd(n3));
							break;

						default:
							System.out.println("Invalid value");
							break;

						}//sc
					}//nailartadd

				}
				else if(a.equals(Vco.getType())) {

					System.out.println(na1.getType() + "  " +na1.getAmount());
					System.out.println(na2.getType() + "  " +na2.getAmount());

					System.out.println("SELL / ADD ?");
					String sellbuy = sc.nextLine();
					if(sellbuy.equals("SELL")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1:
							na1.setAmount(amountSell(na1));

							break;
						case 2:
							na2.setAmount(amountSell(na2));
							break;

						default:
							System.out.println("Invalid value");
							break;

						}//swıtchcase
					}//sellvco

					else if (sellbuy.equals("ADD")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1 : 
							na1.setAmount(amountAdd(n1));
							break;
						case 2 :
							na2.setAmount(amountAdd(n2));
							break;
						default:
							System.out.println("Invalid value");
							break;

						}//sc
					}//addvco

				}//if of vco

				//soft colors
				else if(a.equals(softcolors.getType())) {

					System.out.println(so1.getType() + "  " +so1.getAmount());
					System.out.println(so2.getType() + "  " +so2.getAmount());

					System.out.println("SELL / ADD ?");
					String sellbuy = sc.nextLine();
					if(sellbuy.equals("SELL")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1:
							so1.setAmount(amountSell(so1));
							break;
						case 2:
							so2.setAmount(amountSell(so2));
							break;

						default:
							System.out.println("Invalid value");
							break;

						}//swıtchcase
					}//sellso

					else if (sellbuy.equals("ADD")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1 : 
							so1.setAmount(amountAdd(so1));
							break;
						case 2 :
							so2.setAmount(amountAdd(so2));
							break;
						default:
							System.out.println("Invalid value");
							break;

						}//sc
					}//addsoftcolor

				}//if of softcolor

				//mp
				else if(a.equals(mapa.getType())) {

					System.out.println(mp.getType() + "  " +mp.getAmount());

					System.out.println("SELL / ADD ?");
					String sellbuy = sc.nextLine();
					if(sellbuy.equals("SELL")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1:
							mp.setAmount(amountSell(mp));

							break;

						default:
							System.out.println("Invalid value");
							break;

						}//swıtchcase
					}//sellmp

					else if (sellbuy.equals("ADD")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1 : 
							mp.setAmount(amountAdd(mp));
							break;

						default:
							System.out.println("Invalid value");
							break;

						}//sc
					}//addmp

				}//if of mp

				//Prona
				else if(a.equals(ProNa.getType())) {

					System.out.println(pn1.getType() + "  " +pn1.getAmount());
					System.out.println(pn2.getType() + "  " +pn2.getAmount());

					System.out.println("SELL / ADD ?");
					String sellbuy = sc.nextLine();
					if(sellbuy.equals("SELL")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1:
							pn1.setAmount(amountSell(pn1));

							break;
						case 2:
							pn2.setAmount(amountSell(pn2));
							break;

						default:
							System.out.println("Invalid value");
							break;

						}//swıtchcase
					}//sellpn

					else if (sellbuy.equals("ADD")) {

						System.out.println("Choose type: ");
						int type = sc.nextInt();

						switch(type) {

						case 1 : 
							pn1.setAmount(amountAdd(pn1));
							break;
						case 2 :
							pn2.setAmount(amountAdd(pn2));
							break;
						default:
							System.out.println("Invalid value");
							break;

						}//sc
					}//addvco

				}//if of vco


			}//NAIL
				
			
	        list.outputList();

			System.out.println("The Best Product "); 
			
	        MinHeap minHeap = new MinHeap(arr.length + 1); 
	     
	        for (int i = 0; i < arr.length ; i++) {
	        	if(arr[i].getAmount()<=40)
	        	minHeap.insert(arr[i].getAmount());
	        	
		     }
	        
	      
	       
	        System.out.println(minHeap.remove(arr));
	        
			
	        
	       
	    }//WHILE
		
		
		
		
		
		
	
		 }//MAIN

	 
    
	
	
	
}//CLASS


	


