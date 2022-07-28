// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UninstallPackageRequest extends TeaModel {
    @NameInMap("Operator")
    public UninstallPackageRequestOperator operator;

    @NameInMap("Packages")
    public java.util.List<UninstallPackageRequestPackages> packages;

    @NameInMap("RobotCode")
    public String robotCode;

    public static UninstallPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPackageRequest self = new UninstallPackageRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPackageRequest setOperator(UninstallPackageRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public UninstallPackageRequestOperator getOperator() {
        return this.operator;
    }

    public UninstallPackageRequest setPackages(java.util.List<UninstallPackageRequestPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<UninstallPackageRequestPackages> getPackages() {
        return this.packages;
    }

    public UninstallPackageRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public static class UninstallPackageRequestOperator extends TeaModel {
        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("OperatorName")
        public String operatorName;

        public static UninstallPackageRequestOperator build(java.util.Map<String, ?> map) throws Exception {
            UninstallPackageRequestOperator self = new UninstallPackageRequestOperator();
            return TeaModel.build(map, self);
        }

        public UninstallPackageRequestOperator setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public UninstallPackageRequestOperator setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

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
