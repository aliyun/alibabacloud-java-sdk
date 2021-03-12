// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradePackageRequest extends TeaModel {
    @NameInMap("RobotCodes")
    public java.util.List<String> robotCodes;

    @NameInMap("PackageDTO")
    public UpgradePackageRequestPackageDTO packageDTO;

    public static UpgradePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePackageRequest self = new UpgradePackageRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePackageRequest setRobotCodes(java.util.List<String> robotCodes) {
        this.robotCodes = robotCodes;
        return this;
    }
    public java.util.List<String> getRobotCodes() {
        return this.robotCodes;
    }

    public UpgradePackageRequest setPackageDTO(UpgradePackageRequestPackageDTO packageDTO) {
        this.packageDTO = packageDTO;
        return this;
    }
    public UpgradePackageRequestPackageDTO getPackageDTO() {
        return this.packageDTO;
    }

    public static class UpgradePackageRequestPackageDTO extends TeaModel {
        @NameInMap("PackageCode")
        public String packageCode;

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
