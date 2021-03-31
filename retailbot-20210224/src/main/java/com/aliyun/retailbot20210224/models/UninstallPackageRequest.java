// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UninstallPackageRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 取消订阅的行业包
    @NameInMap("Packages")
    public java.util.List<UninstallPackageRequestPackages> packages;

    // 操作人信息
    @NameInMap("Operator")
    public UninstallPackageRequestOperator operator;

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

    public UninstallPackageRequest setOperator(UninstallPackageRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public UninstallPackageRequestOperator getOperator() {
        return this.operator;
    }

    public static class UninstallPackageRequestPackages extends TeaModel {
        // 行业包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 行业包版本
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

    public static class UninstallPackageRequestOperator extends TeaModel {
        // 操作人id
        @NameInMap("OperatorId")
        public String operatorId;

        // 操作人显示名称
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

}
