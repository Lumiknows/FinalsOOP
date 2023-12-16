package displays;

public class AccSpecs {
    public static String[] getSpecs(String selectedAccessory, int index) {
        if ("Helmet".equals(selectedAccessory)) {
            // Helmet specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: HighGuard Helmet",
                            "Type: Full-face",
                            "Size: Medium",
                            "Material: Carbon Fiber",
                            "Weight: 1.1 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: AeroLite Helmet",
                            "Type: Half-face",
                            "Size: Large",
                            "Material: Fiberglass",
                            "Weight: 0.9 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Locks".equals(selectedAccessory)) {
            // Lock specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: UltraGuard U-Lock",
                            "Type: U-lock",
                            "Size: 8 inches",
                            "Material: Hardened steel",
                            "Weight: 1.4 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: FlexCable Lock",
                            "Type: Cable lock",
                            "Size: 5 feet",
                            "Material: Braided steel",
                            "Weight: 0.6 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Side Mirrors".equals(selectedAccessory)) {
            // Side Mirrors specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: VistaView Mirrors",
                            "Type: Adjustable",
                            "Material: Shatterproof plastic",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: AeroGaze Mirrors",
                            "Type: Aerodynamic",
                            "Material: Aluminum alloy",
                            "Weight: 0.3 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Bicycle Light".equals(selectedAccessory)) {
            // Bicycle Light specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: BlazeBeam Front Light",
                            "Type: LED",
                            "Brightness: 1000 lumens",
                            "Power Source: Rechargeable battery",
                            "Weight: 0.15 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: NightGlow Rear Light",
                            "Type: Rear LED",
                            "Brightness: 600 lumens",
                            "Power Source: AAA batteries",
                            "Weight: 0.12 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Fenders".equals(selectedAccessory)) {
            // Fenders specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: MudGuard Pro",
                            "Type: Full coverage",
                            "Material: Polypropylene",
                            "Weight: 0.4 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: SplashGuard Lite",
                            "Type: Quick-release",
                            "Material: PVC",
                            "Weight: 0.3 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Kickstands".equals(selectedAccessory)) {
            // Kickstands specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: StableStand",
                            "Type: Adjustable",
                            "Material: Aluminum alloy",
                            "Weight: 0.5 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: EasyLean Kickstand",
                            "Type: Single-leg",
                            "Material: Steel",
                            "Weight: 0.4 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Phone mounts".equals(selectedAccessory)) {
            // Phone mounts specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: GripTech Phone Mount",
                            "Compatibility: Universal",
                            "Rotation: 360 degrees",
                            "Material: ABS plastic",
                            "Weight: 0.1 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: SecureHold Bike Mount",
                            "Compatibility: iPhone/Android",
                            "Rotation: 180 degrees",
                            "Material: Silicone",
                            "Weight: 0.08 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Speedometers".equals(selectedAccessory)) {
            // Speedometers specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: SpeedMaster Pro",
                            "Display Type: Digital",
                            "Functions: Speed, Distance, Time",
                            "Material: Plastic",
                            "Weight: 0.1 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: AeroDash Wireless",
                            "Display Type: Wireless",
                            "Functions: Speed, Cadence, Heart Rate",
                            "Material: Aluminum",
                            "Weight: 0.12 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } else if ("Repair kits".equals(selectedAccessory)) {
            // Repair kits specifications
            switch (index) {
                case 0:
                    return new String[]{
                            "Name: QuickFix Patch Kit",
                            "Contents: Patches, Glue, Tire Levers",
                            "Material: Rubber, Plastic",
                            "Weight: 0.2 kg"
                    };
                case 1:
                    return new String[]{
                            "Name: MultiTool Master",
                            "Functions: 16-in-1",
                            "Material: Stainless steel",
                            "Weight: 0.15 kg"
                    };
                default:
                    return new String[]{"No specifications available"};
            }
        } // Add more accessories as needed

        return new String[]{"UNABLE TO FIND SPECIFICATION"};
    }
}