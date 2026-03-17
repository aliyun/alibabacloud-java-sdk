// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewaysRequest extends TeaModel {
    /**
     * <p>The ID of the ACL with which the SAG instance is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-xhwhyuo43l0n****</p>
     */
    @NameInMap("AclIds")
    public String aclIds;

    /**
     * <p>The ID of the CCN instance with which the SAG instance is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-bxuau4ezctt****</p>
     */
    @NameInMap("AssociatedCcnId")
    public String associatedCcnId;

    /**
     * <p>The name of the associated CCN instance.</p>
     * <p>The name must be 2 to 100 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn</p>
     */
    @NameInMap("AssociatedCcnName")
    public String associatedCcnName;

    /**
     * <p>The business status of the SAG instance. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: running as expected.</li>
     * <li><strong>Arrearage</strong>: locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BusinessState")
    public String businessState;

    /**
     * <p>Specifies whether the SAG instance can be associated with a quality of service (QoS) policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <p>Specifies whether to query SAG instances that cannot be associated with QoS policies.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CanAssociateQos")
    public Boolean canAssociateQos;

    /**
     * <p>The model of SAG device. Valid values:</p>
     * <ul>
     * <li><strong>sag-1000</strong></li>
     * <li><strong>sag-100wm</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sag-100wm</p>
     */
    @NameInMap("HardwareType")
    public String hardwareType;

    /**
     * <p>The type of the SAG instance. Valid values:</p>
     * <ul>
     * <li><strong>software</strong>: an SAG app instance</li>
     * <li><strong>hardware</strong>: an SAG CPE instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hardware</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the SAG instance.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the SAG instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4fnc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The serial number of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a3****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-6z21oj0vjjrx6s****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The IDs of the SAG instances.</p>
     */
    @NameInMap("SmartAGIds")
    public java.util.List<String> smartAGIds;

    /**
     * <p>The software version of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>2.3.0.0</p>
     */
    @NameInMap("SoftwareVersion")
    public String softwareVersion;

    /**
     * <p>The status of the SAG instance. Valid values:</p>
     * <ul>
     * <li><strong>Ordered</strong>: Your order has been placed.</li>
     * <li><strong>Delivered</strong>: Your order has been shipped.</li>
     * <li><strong>Received</strong>: You have received the SAG device.</li>
     * <li><strong>Returning</strong>: The order is being returned.</li>
     * <li><strong>Active</strong>: The SAG device is active.</li>
     * <li><strong>init</strong>: The SAG device is being initialized.</li>
     * <li><strong>Offline</strong>: The SAG device is disconnected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the ACL rule.</p>
     * <p>Specifies that the SAG instance which is not associated with the ACL is queried. Separate ACL IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>acl-sjfbgngj****</p>
     */
    @NameInMap("UnboundAclIds")
    public String unboundAclIds;

    /**
     * <p>The version filter. Valid values:</p>
     * <ul>
     * <li><strong>greater</strong>: later than the current version</li>
     * <li><strong>less</strong>: earlier than the current version</li>
     * <li><strong>equals</strong>: equal to the current version</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>equals</p>
     */
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

    public DescribeSmartAccessGatewaysRequest setAssociatedCcnName(String associatedCcnName) {
        this.associatedCcnName = associatedCcnName;
        return this;
    }
    public String getAssociatedCcnName() {
        return this.associatedCcnName;
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
