// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class InstallPackageRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Packages")
    public java.util.List<InstallPackageRequestPackages> packages;

    public static InstallPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallPackageRequest self = new InstallPackageRequest();
        return TeaModel.build(map, self);
    }

    public InstallPackageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public InstallPackageRequest setPackages(java.util.List<InstallPackageRequestPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<InstallPackageRequestPackages> getPackages() {
        return this.packages;
    }

    public static class InstallPackageRequestPackages extends TeaModel {
        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("PackageVersion")
        public String packageVersion;

        public static InstallPackageRequestPackages build(java.util.Map<String, ?> map) throws Exception {
            InstallPackageRequestPackages self = new InstallPackageRequestPackages();
            return TeaModel.build(map, self);
        }

        public InstallPackageRequestPackages setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public InstallPackageRequestPackages setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

}
