// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListRequest extends TeaModel {
    /**
     * <p>The type of the asset. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: an Elastic Compute Service (ECS) instance.</li>
     * <li><strong>3</strong>: an ApsaraDB RDS instance.</li>
     * <li><strong>4</strong>: an ApsaraDB for MongoDB instance.</li>
     * <li><strong>5</strong>: an ApsaraDB for Redis instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>Specifies whether the asset has Cloud Security Posture Management (CSPM) risks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CspmStatus")
    public Boolean cspmStatus;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The server component that is exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>openssl</p>
     */
    @NameInMap("ExposureComponent")
    public String exposureComponent;

    /**
     * <p>The public IP address of the server or the public endpoint of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>116.12.XX.XX</p>
     */
    @NameInMap("ExposureIp")
    public String exposureIp;

    /**
     * <p>The port that is exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ExposurePort")
    public String exposurePort;

    /**
     * <p>The ID of the server group.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9535356</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>Specifies whether the asset has weak password risks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unhealthy</p>
     */
    @NameInMap("HealthStatus")
    public Boolean healthStatus;

    /**
     * <p>The instance ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6wxdwps7s9dz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>abc_centos7.2_005</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether the asset has vulnerabilities. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VulStatus")
    public Boolean vulStatus;

    public static DescribeExposedInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceListRequest self = new DescribeExposedInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceListRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public DescribeExposedInstanceListRequest setCspmStatus(Boolean cspmStatus) {
        this.cspmStatus = cspmStatus;
        return this;
    }
    public Boolean getCspmStatus() {
        return this.cspmStatus;
    }

    public DescribeExposedInstanceListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExposedInstanceListRequest setExposureComponent(String exposureComponent) {
        this.exposureComponent = exposureComponent;
        return this;
    }
    public String getExposureComponent() {
        return this.exposureComponent;
    }

    public DescribeExposedInstanceListRequest setExposureIp(String exposureIp) {
        this.exposureIp = exposureIp;
        return this;
    }
    public String getExposureIp() {
        return this.exposureIp;
    }

    public DescribeExposedInstanceListRequest setExposurePort(String exposurePort) {
        this.exposurePort = exposurePort;
        return this;
    }
    public String getExposurePort() {
        return this.exposurePort;
    }

    public DescribeExposedInstanceListRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeExposedInstanceListRequest setHealthStatus(Boolean healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public Boolean getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeExposedInstanceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeExposedInstanceListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeExposedInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExposedInstanceListRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeExposedInstanceListRequest setVulStatus(Boolean vulStatus) {
        this.vulStatus = vulStatus;
        return this;
    }
    public Boolean getVulStatus() {
        return this.vulStatus;
    }

}
