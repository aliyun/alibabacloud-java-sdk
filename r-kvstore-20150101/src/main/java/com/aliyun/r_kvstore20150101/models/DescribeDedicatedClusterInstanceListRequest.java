// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListRequest extends TeaModel {
    /**
     * <p>The ID of the dedicated cluster. You can view the dedicated cluster ID on the Dedicated Clusters page in the ApsaraDB for MyBase console.</p>
     * <blockquote>
     * <p>Separate multiple IDs with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dhg-5f2v98840ioq****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the host in the dedicated cluster. You can call the <a href="https://help.aliyun.com/document_detail/200944.html">DescribeDedicatedHosts</a> operation to query the host ID.</p>
     * <blockquote>
     * <p>Separate multiple IDs with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ch-t4n664a9mal4c****</p>
     */
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    /**
     * <p>The database engine of the instance. Set the value to <strong>Redis</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Set the value to <strong>5.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>The instance must be created by using a dedicated cluster. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB for MyBase?</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Internet</li>
     * <li><strong>1</strong>: classic network</li>
     * <li><strong>2</strong>: Virtual Private Cloud (VPC)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InstanceNetType")
    public String instanceNetType;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The instance is being created.</li>
     * <li><strong>1</strong>: The instance is running.</li>
     * <li><strong>3</strong>: The instance is being deleted.</li>
     * <li><strong>5</strong>: The configurations of the instance are being changed.</li>
     * <li><strong>6</strong>: The instance is being migrated.</li>
     * <li><strong>7</strong>: The instance is being restored from a backup.</li>
     * <li><strong>8</strong>: A master-replica switchover is in progress.</li>
     * <li><strong>9</strong>: Expired data of the instance is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstanceStatus")
    public Integer instanceStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/94527.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedClusterInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterInstanceListRequest self = new DescribeDedicatedClusterInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterInstanceListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDedicatedClusterInstanceListRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public DescribeDedicatedClusterInstanceListRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDedicatedClusterInstanceListRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceNetType(String instanceNetType) {
        this.instanceNetType = instanceNetType;
        return this;
    }
    public String getInstanceNetType() {
        return this.instanceNetType;
    }

    public DescribeDedicatedClusterInstanceListRequest setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public Integer getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeDedicatedClusterInstanceListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDedicatedClusterInstanceListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedClusterInstanceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedClusterInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedClusterInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedClusterInstanceListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedClusterInstanceListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedClusterInstanceListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDedicatedClusterInstanceListRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
