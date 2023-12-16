package displays;

public class PartSpecs {
    public static String[] getSpecs(String selectedPart, int index) {
        if ("Rims".equals(selectedPart)) {
            // Rim specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Rim 1",
                            "Diameter: 26 Inches",
                            "Material: Alloy",
                            "Color: Black",
                            "Spoke Count: 32",
                            "Weight: 1.5 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Rim 2",
                            "Diameter: 24 Inches",
                            "Material: Aluminum",
                            "Color: Silver",
                            "Spoke Count: 28",
                            "Weight: 1.2 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Batteries".equals(selectedPart)) {
            // Battery specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Battery 1",
                            "Capacity: 10 Ah",
                            "Voltage: 36V",
                            "Chemistry: Lithium-ion",
                            "Weight: 2.5 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Battery 2",
                            "Capacity: 15 Ah",
                            "Voltage: 48V",
                            "Chemistry: Lithium-polymer",
                            "Weight: 3.0 kg"
                    };
                case 2:
                    return new String[]{
                            "Name: Battery 3",
                            "Capacity: 20 Ah",
                            "Voltage: 52V",
                            "Chemistry: LiFePO4",
                            "Weight: 3.8 kg"
                    };
                case 3:
                    return new String[]{
                            "Name: Battery 4",
                            "Capacity: 12 Ah",
                            "Voltage: 24V",
                            "Chemistry: Nickel-metal hydride",
                            "Weight: 2.2 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Charger".equals(selectedPart)) {
            // Charger specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Charger 1",
                            "Output Voltage: 42V",
                            "Output Current: 2A",
                            "Charging Time: 5 hours",
                            "Weight: 0.5 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Charger 2",
                            "Output Voltage: 54V",
                            "Output Current: 3A",
                            "Charging Time: 4 hours",
                            "Weight: 0.8 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Tires".equals(selectedPart)) {
            // Tires specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Tire 1",
                            "Size: 26 x 2.1 inches",
                            "Type: Mountain bike",
                            "Tread Pattern: Knobby",
                            "Weight: 0.9 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Tire 2",
                            "Size: 700 x 25c",
                            "Type: Road bike",
                            "Tread Pattern: Slick",
                            "Weight: 0.6 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Controllers".equals(selectedPart)) {
            // Controller specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Controller 1",
                            "Voltage: 36V",
                            "Current: 20A",
                            "Compatibility: Brushless DC motors",
                            "Weight: 0.7 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Controller 2",
                            "Voltage: 48V",
                            "Current: 30A",
                            "Compatibility: Brushless DC motors",
                            "Weight: 1.0 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Connectors".equals(selectedPart)) {
            // Connector specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Connector 1",
                            "Type: Anderson Powerpole",
                            "Current Rating: 30A",
                            "Voltage Rating: 600V",
                            "Material: Polycarbonate",
                            "Weight: 0.05 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Connector 2",
                            "Type: XT60",
                            "Current Rating: 60A",
                            "Voltage Rating: 500V",
                            "Material: Nylon",
                            "Weight: 0.02 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Cycle Analysts".equals(selectedPart)) {
            // Cycle Analyst specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Cycle Analyst 1",
                            "Functions: Speedometer, Odometer, Battery monitor",
                            "Display Type: LCD",
                            "Compatibility: Electric bikes",
                            "Weight: 0.3 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Cycle Analyst 2",
                            "Functions: Power meter, Voltage display, Temperature monitor",
                            "Display Type: OLED",
                            "Compatibility: Electric scooters",
                            "Weight: 0.2 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("DC-DC Converters".equals(selectedPart)) {
            // DC-DC Converter specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: DC-DC Converter 1",
                            "Input Voltage: 48V",
                            "Output Voltage: 12V",
                            "Output Current: 10A",
                            "Efficiency: 90%",
                            "Weight: 0.4 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: DC-DC Converter 2",
                            "Input Voltage: 36V",
                            "Output Voltage: 24V",
                            "Output Current: 5A",
                            "Efficiency: 85%",
                            "Weight: 0.3 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Ebrakes".equals(selectedPart)) {
            // Ebrakes specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Ebrake 1",
                            "Type: Disc brake",
                            "Compatibility: Front and rear",
                            "Material: Aluminum alloy",
                            "Weight: 0.3 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Ebrake 2",
                            "Type: V-brake",
                            "Compatibility: Front",
                            "Material: Steel",
                            "Weight: 0.2 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Freewheels and Cassettes".equals(selectedPart)) {
            // Freewheels and Cassettes specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Freewheel 1",
                            "Type: 7-speed",
                            "Compatibility: Shimano and SRAM",
                            "Material: Steel",
                            "Weight: 0.3 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Freewheel 2",
                            "Type: Single-speed",
                            "Compatibility: Fixed gear",
                            "Material: Aluminum",
                            "Weight: 0.2 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Lights".equals(selectedPart)) {
            // Lights specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Light 1",
                            "Type: Front LED light",
                            "Brightness: 800 lumens",
                            "Power Source: Rechargeable battery",
                            "Weight: 0.15 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Light 2",
                            "Type: Rear LED light",
                            "Brightness: 500 lumens",
                            "Power Source: AAA batteries",
                            "Weight: 0.1 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Hub Motors".equals(selectedPart)) {
            // Hub Motors specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Hub Motor 1",
                            "Power: 250W",
                            "Voltage: 36V",
                            "Wheel Size: 26 Inches",
                            "Weight: 3.0 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Hub Motor 2",
                            "Power: 500W",
                            "Voltage: 48V",
                            "Wheel Size: 700c",
                            "Weight: 3.5 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Solar".equals(selectedPart)) {
            // Solar specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Solar Panel 1",
                            "Power: 20W",
                            "Voltage: 12V",
                            "Material: Monocrystalline silicon",
                            "Weight: 1.0 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Solar Panel 2",
                            "Power: 30W",
                            "Voltage: 24V",
                            "Material: Polycrystalline silicon",
                            "Weight: 1.5 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Spokes".equals(selectedPart)) {
            // Spokes specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Spokes Set 1",
                            "Material: Stainless steel",
                            "Length: 290mm",
                            "Quantity: 36 spokes",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Spokes Set 2",
                            "Material: Aluminum",
                            "Length: 275mm",
                            "Quantity: 32 spokes",
                            "Weight: 0.1 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Throttles".equals(selectedPart)) {
            // Throttles specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Throttle 1",
                            "Type: Twist grip",
                            "Compatibility: Electric bikes",
                            "Material: Plastic",
                            "Weight: 0.1 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Throttle 2",
                            "Type: Thumb lever",
                            "Compatibility: Electric scooters",
                            "Material: Rubber",
                            "Weight: 0.05 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Torque Arms".equals(selectedPart)) {
            // Torque Arms specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Torque Arm 1",
                            "Type: Universal",
                            "Material: Steel",
                            "Compatibility: Front and rear wheels",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: Torque Arm 2",
                            "Type: Single-sided",
                            "Material: Aluminum",
                            "Compatibility: Rear wheel",
                            "Weight: 0.15 kg"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else if ("Wiring".equals(selectedPart)) {
            // Wiring specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: Wiring Kit 1",
                            "Type: Complete wiring harness",
                            "Compatibility: Electric bikes",
                            "Material: Copper",
                            "Length: 2 meters"
                    };
                case 1:
                    return new String[]{
                            "Name: Wiring Kit 2",
                            "Type: Extension wires",
                            "Compatibility: Electric scooters",
                            "Material: PVC",
                            "Length: 1.5 meters"
                    };
                default:
                    return new String[]{"UNABLE TO FIND SPECIFICATION"};
            }
        } else {
            return new String[]{"UNABLE TO FIND SPECIFICATION"};
        }
    }  
}
