// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewaysRequest extends TeaModel {
    @NameInMap("AclIds")
    public String aclIds;

    @NameInMap("AssociatedCcnId")
    public String associatedCcnId;

    @NameInMap("BusinessState")
    public String businessState;

    @NameInMap("CanAssociateQos")
    public Boolean canAssociateQos;

    @NameInMap("HardwareType")
    public String hardwareType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SmartAGIds")
    public java.util.List<String> smartAGIds;

    @NameInMap("SoftwareVersion")
    public String softwareVersion;

    @NameInMap("Status")
    public String status;

    @NameInMap("UnboundAclIds")
    public String unboundAclIds;

    @NameInMap("VersionComparator")
    public String versionComparator;

    public static DescribeSmartAccessGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewaysRequest self = new DescribeSmartAccessGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewaysRequest setAclIds(String aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public String getAclIds() {
        return this.aclIds;
    }

    public DescribeSmartAccessGatewaysRequest setAssociatedCcnId(String associatedCcnId) {
        this.associatedCcnId = associatedCcnId;
        return this;
    }
    public String getAssociatedCcnId() {
        return this.associatedCcnId;
    }

    public DescribeSmartAccessGatewaysRequest setBusinessState(String businessState) {
        this.businessState = businessState;
        return this;
    }
    public String getBusinessState() {
        return this.businessState;
    }

    public DescribeSmartAccessGatewaysRequest setCanAssociateQos(Boolean canAssociateQos) {
        this.canAssociateQos = canAssociateQos;
        return this;
    }
    public Boolean getCanAssociateQos() {
        return this.canAssociateQos;
    }

    public DescribeSmartAccessGatewaysRequest setHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
        return this;
    }
    public String getHardwareType() {
        return this.hardwareType;
    }

    public DescribeSmartAccessGatewaysRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeSmartAccessGatewaysRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSmartAccessGatewaysRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSmartAccessGatewaysRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSmartAccessGatewaysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSmartAccessGatewaysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSmartAccessGatewaysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSmartAccessGatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSmartAccessGatewaysRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSmartAccessGatewaysRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSmartAccessGatewaysRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeSmartAccessGatewaysRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeSmartAccessGatewaysRequest setSmartAGIds(java.util.List<String> smartAGIds) {
        this.smartAGIds = smartAGIds;
        return this;
    }
    public java.util.List<String> getSmartAGIds() {
        return this.smartAGIds;
    }

    public DescribeSmartAccessGatewaysRequest setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public DescribeSmartAccessGatewaysRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSmartAccessGatewaysRequest setUnboundAclIds(String unboundAclIds) {
        this.unboundAclIds = unboundAclIds;
        return this;
    }
    public String getUnboundAclIds() {
        return this.unboundAclIds;
    }

    public DescribeSmartAccessGatewaysRequest setVersionComparator(String versionComparator) {
        this.versionComparator = versionComparator;
        return this;
    }
    public String getVersionComparator() {
        return this.versionComparator;
    }

}
