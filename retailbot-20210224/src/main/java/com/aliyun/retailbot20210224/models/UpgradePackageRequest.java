// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradePackageRequest extends TeaModel {
    // 操作人信息
    @NameInMap("Operator")
    public UpgradePackageRequestOperator operator;

    // 需要升级的行业包
    @NameInMap("PackageDTO")
    public UpgradePackageRequestPackageDTO packageDTO;

    // 机器人code
    @NameInMap("RobotCodes")
    public java.util.List<String> robotCodes;

    public static UpgradePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePackageRequest self = new UpgradePackageRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePackageRequest setOperator(UpgradePackageRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public UpgradePackageRequestOperator getOperator() {
        return this.operator;
    }

    public UpgradePackageRequest setPackageDTO(UpgradePackageRequestPackageDTO packageDTO) {
        this.packageDTO = packageDTO;
        return this;
    }
    public UpgradePackageRequestPackageDTO getPackageDTO() {
        return this.packageDTO;
    }

    public UpgradePackageRequest setRobotCodes(java.util.List<String> robotCodes) {
        this.robotCodes = robotCodes;
        return this;
    }
    public java.util.List<String> getRobotCodes() {
        return this.robotCodes;
    }

    public static class UpgradePackageRequestOperator extends TeaModel {
        // 操作人id
        @NameInMap("OperatorId")
        public String operatorId;

        // 操作人显示名称
        @NameInMap("OperatorName")
        public String operatorName;

        public static UpgradePackageRequestOperator build(java.util.Map<String, ?> map) throws Exception {
            UpgradePackageRequestOperator self = new UpgradePackageRequestOperator();
            return TeaModel.build(map, self);
        }

        public UpgradePackageRequestOperator setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public UpgradePackageRequestOperator setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class UpgradePackageRequestPackageDTO extends TeaModel {
        // 行业包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 行业包版本
        @NameInMap("PackageVersion")
        public String packageVersion;

        public static UpgradePackageRequestPackageDTO build(java.util.Map<String, ?> map) throws Exception {
            UpgradePackageRequestPackageDTO self = new UpgradePackageRequestPackageDTO();
            return TeaModel.build(map, self);
        }

        public UpgradePackageRequestPackageDTO setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public UpgradePackageRequestPackageDTO setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

}
