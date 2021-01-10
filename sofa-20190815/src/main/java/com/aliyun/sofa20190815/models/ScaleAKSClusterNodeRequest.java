// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ScaleAKSClusterNodeRequest extends TeaModel {
    @NameInMap("NodeSpecs")
    public java.util.List<ScaleAKSClusterNodeRequestNodeSpecs> nodeSpecs;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("Workspace")
    public String workspace;

    public static ScaleAKSClusterNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleAKSClusterNodeRequest self = new ScaleAKSClusterNodeRequest();
        return TeaModel.build(map, self);
    }

    public ScaleAKSClusterNodeRequest setNodeSpecs(java.util.List<ScaleAKSClusterNodeRequestNodeSpecs> nodeSpecs) {
        this.nodeSpecs = nodeSpecs;
        return this;
    }
    public java.util.List<ScaleAKSClusterNodeRequestNodeSpecs> getNodeSpecs() {
        return this.nodeSpecs;
    }

    public ScaleAKSClusterNodeRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ScaleAKSClusterNodeRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class ScaleAKSClusterNodeRequestNodeSpecs extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        @NameInMap("Cell")
        public String cell;

        @NameInMap("ComputerSpecId")
        public String computerSpecId;

        @NameInMap("DataDiskSize")
        public Long dataDiskSize;

        @NameInMap("DataDiskSpecId")
        public String dataDiskSpecId;

        @NameInMap("NamePrefix")
        public String namePrefix;

        @NameInMap("Password")
        public String password;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        @NameInMap("SystemDiskSpecId")
        public String systemDiskSpecId;

        @NameInMap("VswicthId")
        public String vswicthId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ScaleAKSClusterNodeRequestNodeSpecs build(java.util.Map<String, ?> map) throws Exception {
            ScaleAKSClusterNodeRequestNodeSpecs self = new ScaleAKSClusterNodeRequestNodeSpecs();
            return TeaModel.build(map, self);
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setComputerSpecId(String computerSpecId) {
            this.computerSpecId = computerSpecId;
            return this;
        }
        public String getComputerSpecId() {
            return this.computerSpecId;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setDataDiskSpecId(String dataDiskSpecId) {
            this.dataDiskSpecId = dataDiskSpecId;
            return this;
        }
        public String getDataDiskSpecId() {
            return this.dataDiskSpecId;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setNamePrefix(String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public String getNamePrefix() {
            return this.namePrefix;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setSystemDiskSpecId(String systemDiskSpecId) {
            this.systemDiskSpecId = systemDiskSpecId;
            return this;
        }
        public String getSystemDiskSpecId() {
            return this.systemDiskSpecId;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setVswicthId(String vswicthId) {
            this.vswicthId = vswicthId;
            return this;
        }
        public String getVswicthId() {
            return this.vswicthId;
        }

        public ScaleAKSClusterNodeRequestNodeSpecs setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
