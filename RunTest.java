package HomeworkWeek4;

public class RunTest {

    public static void main(String[] args) {
        Car c=new Car();
        c.VehicleUsingSurface();
        c.VehicleSpeed();
        c.SitingCapacityOfPerson();
        c.SizeofVehicle();
        c.SurfaceCar();
        c.CarSittingCapacity();
        c.carsize();
        c.CarSpeed();

        System.out.println("Train");
        Train t=new Train();
        t.VehicleUsingSurface();
        t.VehicleSpeed();
        t.SitingCapacityOfPerson();
        t.SizeofVehicle();
        t.SurfaceTrain();
        t.TrainSittingCapacity();
        t.TrainSize();
        t.TrainSpeed();

        System.out.println("Ship");
        Ship s=new Ship();
        s.VehicleUsingSurface();
        s.VehicleSpeed();
        s.SitingCapacityOfPerson();
        s.SizeofVehicle();
        s.ShipSittingCapacity();
        s.ShipSize();
        s.ShipSpeed();
        s.SurfaceShip();

        System.out.println("Plane");
        Plane p=new Plane();
        p.VehicleUsingSurface();
        p.VehicleSpeed();
        p.SitingCapacityOfPerson();
        p.SizeofVehicle();
        p.PlaneSittingCapacity();
        p.PlaneSize();
        p.PlaneSpeed();
        p.SurfacePlane();

    }
}
