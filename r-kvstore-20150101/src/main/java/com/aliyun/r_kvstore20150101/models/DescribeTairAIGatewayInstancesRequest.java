// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayInstancesRequest extends TeaModel {
    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The expiration status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance has expired.</li>
     * <li><strong>false</strong>: The instance has not expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The IDs of the instances to query.</p>
     * <blockquote>
     * <p>Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs in a single request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tg-2zezxszhcgatnx****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: The instance is running.</li>
     * <li><strong>Creating</strong>: The instance is being created.</li>
     * <li><strong>Changing</strong>: The instance is being modified.</li>
     * <li><strong>Inactive</strong>: The instance is disabled.</li>
     * <li><strong>Flushing</strong>: The instance data is being purged.</li>
     * <li><strong>Released</strong>: The instance is released.</li>
     * <li><strong>Transforming</strong>: The instance is being transformed.</li>
     * <li><strong>Migrating</strong>: The instance is being migrated.</li>
     * <li><strong>BackupRecovering</strong>: The instance is recovering from a backup.</li>
     * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being upgraded.</li>
     * <li><strong>NetworkModifying</strong>: The network of the instance is being modified.</li>
     * <li><strong>SSLModifying</strong>: The SSL configuration of the instance is being modified.</li>
     * <li><strong>MajorVersionUpgrading</strong>: A major engine version upgrade is in progress. The instance remains accessible.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about instance statuses and impacts, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance statuses and impacts</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The search keyword. Fuzzy search is supported for instance names or instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the vSwitch in the VPC. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeTairAIGatewayInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayInstancesRequest self = new DescribeTairAIGatewayInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeTairAIGatewayInstancesRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeTairAIGatewayInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeTairAIGatewayInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeTairAIGatewayInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTairAIGatewayInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTairAIGatewayInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTairAIGatewayInstancesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeTairAIGatewayInstancesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeTairAIGatewayInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeTairAIGatewayInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeTairAIGatewayInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
