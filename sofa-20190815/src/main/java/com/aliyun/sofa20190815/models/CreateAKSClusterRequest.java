// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSClusterRequest extends TeaModel {
    @NameInMap("AlsProjectHowCreate")
    public String alsProjectHowCreate;

    @NameInMap("AlsProjectName")
    public String alsProjectName;

    @NameInMap("ClusterPackageSuitVersionName")
    public String clusterPackageSuitVersionName;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    @NameInMap("EnableMonitoring")
    public Boolean enableMonitoring;

    @NameInMap("EnableSofaMesh")
    public Boolean enableSofaMesh;

    @NameInMap("ExistingSecuredGroupIds")
    public String existingSecuredGroupIds;

    @NameInMap("ExistingVpcId")
    public String existingVpcId;

    @NameInMap("MaxPodAmountPerNode")
    public Long maxPodAmountPerNode;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("PodIpRange")
    public String podIpRange;

    @NameInMap("ServiceIpRange")
    public String serviceIpRange;

    @NameInMap("UserLoginName")
    public String userLoginName;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("NodeSpecs")
    public java.util.List<CreateAKSClusterRequestNodeSpecs> nodeSpecs;

    @NameInMap("ZoneToVswitchIds")
    public java.util.List<CreateAKSClusterRequestZoneToVswitchIds> zoneToVswitchIds;

    public static CreateAKSClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSClusterRequest self = new CreateAKSClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSClusterRequest setAlsProjectHowCreate(String alsProjectHowCreate) {
        this.alsProjectHowCreate = alsProjectHowCreate;
        return this;
    }
    public String getAlsProjectHowCreate() {
        return this.alsProjectHowCreate;
    }

    public CreateAKSClusterRequest setAlsProjectName(String alsProjectName) {
        this.alsProjectName = alsProjectName;
        return this;
    }
    public String getAlsProjectName() {
        return this.alsProjectName;
    }

    public CreateAKSClusterRequest setClusterPackageSuitVersionName(String clusterPackageSuitVersionName) {
        this.clusterPackageSuitVersionName = clusterPackageSuitVersionName;
        return this;
    }
    public String getClusterPackageSuitVersionName() {
        return this.clusterPackageSuitVersionName;
    }

    public CreateAKSClusterRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAKSClusterRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public CreateAKSClusterRequest setEnableMonitoring(Boolean enableMonitoring) {
        this.enableMonitoring = enableMonitoring;
        return this;
    }
    public Boolean getEnableMonitoring() {
        return this.enableMonitoring;
    }

    public CreateAKSClusterRequest setEnableSofaMesh(Boolean enableSofaMesh) {
        this.enableSofaMesh = enableSofaMesh;
        return this;
    }
    public Boolean getEnableSofaMesh() {
        return this.enableSofaMesh;
    }

    public CreateAKSClusterRequest setExistingSecuredGroupIds(String existingSecuredGroupIds) {
        this.existingSecuredGroupIds = existingSecuredGroupIds;
        return this;
    }
    public String getExistingSecuredGroupIds() {
        return this.existingSecuredGroupIds;
    }

    public CreateAKSClusterRequest setExistingVpcId(String existingVpcId) {
        this.existingVpcId = existingVpcId;
        return this;
    }
    public String getExistingVpcId() {
        return this.existingVpcId;
    }

    public CreateAKSClusterRequest setMaxPodAmountPerNode(Long maxPodAmountPerNode) {
        this.maxPodAmountPerNode = maxPodAmountPerNode;
        return this;
    }
    public Long getMaxPodAmountPerNode() {
        return this.maxPodAmountPerNode;
    }

    public CreateAKSClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAKSClusterRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public CreateAKSClusterRequest setPodIpRange(String podIpRange) {
        this.podIpRange = podIpRange;
        return this;
    }
    public String getPodIpRange() {
        return this.podIpRange;
    }

    public CreateAKSClusterRequest setServiceIpRange(String serviceIpRange) {
        this.serviceIpRange = serviceIpRange;
        return this;
    }
    public String getServiceIpRange() {
        return this.serviceIpRange;
    }

    public CreateAKSClusterRequest setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
        return this;
    }
    public String getUserLoginName() {
        return this.userLoginName;
    }

    public CreateAKSClusterRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateAKSClusterRequest setNodeSpecs(java.util.List<CreateAKSClusterRequestNodeSpecs> nodeSpecs) {
        this.nodeSpecs = nodeSpecs;
        return this;
    }
    public java.util.List<CreateAKSClusterRequestNodeSpecs> getNodeSpecs() {
        return this.nodeSpecs;
    }

    public CreateAKSClusterRequest setZoneToVswitchIds(java.util.List<CreateAKSClusterRequestZoneToVswitchIds> zoneToVswitchIds) {
        this.zoneToVswitchIds = zoneToVswitchIds;
        return this;
    }
    public java.util.List<CreateAKSClusterRequestZoneToVswitchIds> getZoneToVswitchIds() {
        return this.zoneToVswitchIds;
    }

    public static class CreateAKSClusterRequestNodeSpecs extends TeaModel {
        @NameInMap("ComputerSpecId")
        public String computerSpecId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VswicthId")
        public String vswicthId;

        @NameInMap("NamePrefix")
        public String namePrefix;

        @NameInMap("SystemDiskSpecId")
        public String systemDiskSpecId;

        @NameInMap("DataDiskSpecId")
        public String dataDiskSpecId;

        @NameInMap("DataDiskSize")
        public Long dataDiskSize;

        @NameInMap("Cell")
        public String cell;

        @NameInMap("Amount")
        public Long amount;

        @NameInMap("Password")
        public String password;

        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateAKSClusterRequestNodeSpecs build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSClusterRequestNodeSpecs self = new CreateAKSClusterRequestNodeSpecs();
            return TeaModel.build(map, self);
        }

        public CreateAKSClusterRequestNodeSpecs setComputerSpecId(String computerSpecId) {
            this.computerSpecId = computerSpecId;
            return this;
        }
        public String getComputerSpecId() {
            return this.computerSpecId;
        }

        public CreateAKSClusterRequestNodeSpecs setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateAKSClusterRequestNodeSpecs setVswicthId(String vswicthId) {
            this.vswicthId = vswicthId;
            return this;
        }
        public String getVswicthId() {
            return this.vswicthId;
        }

        public CreateAKSClusterRequestNodeSpecs setNamePrefix(String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public String getNamePrefix() {
            return this.namePrefix;
        }

        public CreateAKSClusterRequestNodeSpecs setSystemDiskSpecId(String systemDiskSpecId) {
            this.systemDiskSpecId = systemDiskSpecId;
            return this;
        }
        public String getSystemDiskSpecId() {
            return this.systemDiskSpecId;
        }

        public CreateAKSClusterRequestNodeSpecs setDataDiskSpecId(String dataDiskSpecId) {
            this.dataDiskSpecId = dataDiskSpecId;
            return this;
        }
        public String getDataDiskSpecId() {
            return this.dataDiskSpecId;
        }

        public CreateAKSClusterRequestNodeSpecs setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        public CreateAKSClusterRequestNodeSpecs setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public CreateAKSClusterRequestNodeSpecs setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public CreateAKSClusterRequestNodeSpecs setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateAKSClusterRequestNodeSpecs setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateAKSClusterRequestNodeSpecs setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateAKSClusterRequestZoneToVswitchIds extends TeaModel {
        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateAKSClusterRequestZoneToVswitchIds build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSClusterRequestZoneToVswitchIds self = new CreateAKSClusterRequestZoneToVswitchIds();
            return TeaModel.build(map, self);
        }

        public CreateAKSClusterRequestZoneToVswitchIds setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public CreateAKSClusterRequestZoneToVswitchIds setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
