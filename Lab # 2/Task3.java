class Invoice {
	String PartNumber;
	String PartDescription;
	int Quantity;
	float Price;

	public void setDetails(String N,String D,int Q,float P) {
		PartNumber=N;
		PartDescription=D;
		Quantity=Q;
		Price=P;
	}

	String getPartNumber() {
		return PartNumber;
	}

	String getPartDescription() {
		return PartDescription;
	}

    int getQuantity(){
        return Quantity;
    }

    float getPrice(){
        return Price;
    } 

	float getInvoiceAmount(){
		if(Quantity < 0 && Price < 0){
			Quantity=0;
			Price=0;
		}
		return (Quantity*Price);
	}
}

class Task3{
	public static void main(String[] args) {
		Invoice I=new Invoice();

		I.setDetails("SMGDF22", "Samsung Galaxy's S22", 10, 100000);
		System.out.println("Part Number: "+I.getPartNumber());
		System.out.println("Part Description: "+I.getPartDescription());
		System.out.println("Quantity of Items Purchased: "+I.getQuantity());
		System.out.println("Price per Item: "+I.getPrice());
		System.out.println("Invoice Amount = "+I.getInvoiceAmount());

	}
}