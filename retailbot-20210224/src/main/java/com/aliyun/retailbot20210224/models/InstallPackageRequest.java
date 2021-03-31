// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class InstallPackageRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 订阅的行业包
    @NameInMap("Packages")
    public java.util.List<InstallPackageRequestPackages> packages;

    // 操作人信息
    @NameInMap("Operator")
    public InstallPackageRequestOperator operator;

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

    public InstallPackageRequest setOperator(InstallPackageRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public InstallPackageRequestOperator getOperator() {
        return this.operator;
    }

    public static class InstallPackageRequestPackages extends TeaModel {
        // 行业包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 行业包版本
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

    public static class InstallPackageRequestOperator extends TeaModel {
        // 操作人id
        @NameInMap("OperatorId")
        public String operatorId;

        // 操作人显示名称
        @NameInMap("OperatorName")
        public String operatorName;

        public static InstallPackageRequestOperator build(java.util.Map<String, ?> map) throws Exception {
            InstallPackageRequestOperator self = new InstallPackageRequestOperator();
            return TeaModel.build(map, self);
        }

        public InstallPackageRequestOperator setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public InstallPackageRequestOperator setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

}
