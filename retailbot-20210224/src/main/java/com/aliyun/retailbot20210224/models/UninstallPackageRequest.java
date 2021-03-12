// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UninstallPackageRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Packages")
    public java.util.List<UninstallPackageRequestPackages> packages;

    public static UninstallPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPackageRequest self = new UninstallPackageRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPackageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UninstallPackageRequest setPackages(java.util.List<UninstallPackageRequestPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<UninstallPackageRequestPackages> getPackages() {
        return this.packages;
    }

    public static class UninstallPackageRequestPackages extends TeaModel {
        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("PackageVersion")
        public String packageVersion;

        public static UninstallPackageRequestPackages build(java.util.Map<String, ?> map) throws Exception {
            UninstallPackageRequestPackages self = new UninstallPackageRequestPackages();
            return TeaModel.build(map, self);
        }

        public UninstallPackageRequestPackages setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public UninstallPackageRequestPackages setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

}
