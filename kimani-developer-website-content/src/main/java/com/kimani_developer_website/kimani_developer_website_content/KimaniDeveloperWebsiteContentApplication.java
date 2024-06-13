package com.kimani_developer_website.kimani_developer_website_content;

import com.kimani_developer_website.kimani_developer_website_content.domain.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KimaniDeveloperWebsiteContentApplication implements CommandLineRunner {

	public final DetailsRepository detailsRepo;
	public final SellingPointRepository sellingRepo;
	public final PortfolioRepository portfolioRepo;
	public final HeaderRepository headerRepository;

	public KimaniDeveloperWebsiteContentApplication(DetailsRepository r, SellingPointRepository sr, PortfolioRepository pr, HeaderRepository hr){
		this.detailsRepo = r;
		this.sellingRepo = sr;
		this.portfolioRepo = pr;
		this.headerRepository = hr;
	}

	public static void main(String[] args) {
		SpringApplication.run(KimaniDeveloperWebsiteContentApplication.class, args);
	}

	@Override
	public void run(String[]args)throws Exception{

		ArrayList<String> f = new ArrayList<>();

		f.add("Blender");
		f.add("Python");

		PortfolioItem uno = new PortfolioItem("Hamikim","3D render for new outlet",f,"./githuburl","F0000","./imageforproject");
		portfolioRepo.save(uno);

		ArrayList<PortfolioItem>arrPort = new ArrayList<>();
		arrPort.add(uno);

		//ArrayList<String>headers, String fullName,String role, String description,
		//                   String skillsPageDescription,String portfolioDesc,
		//                   ArrayList<PortfolioItem>portfolio,String cv

		Details details1 = new Details("Kimani Mbatia","Software Developer","Full stack software developer",
				"Skills description typed here","My Portfolio","mycvtext");
		//detailsRepo.save(details1);

		//Creates a header, adds it to ArrayList, saves ArrayList to Details obj
		Header header1 = new Header("Get the Job done",details1);
		List<Header>headersList1=new ArrayList<>();
		headersList1.add(header1);
		details1.setHeaders(headersList1);
		detailsRepo.save(details1);

		//Creates a selling point, saves it to Sellingpoint repo, adds it to Arraylist and saves it to details1 obj
//		SellingPoint one = new SellingPoint("High Fidelity Work", "Delivering good work","./rulerimage","red",details1);
//		sellingRepo.save(one);
//		ArrayList<SellingPoint> sp = new ArrayList<>();
//		sp.add(one);
//
//		details1.setSellingPoint(sp);
//		detailsRepo.save(details1);
	}

}
