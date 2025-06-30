// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceRequest extends TeaModel {
    /**
     * <p>Authorization status of the data asset instance.</p>
     * <ul>
     * <li><strong>0</strong>: Unauthorized</li>
     * <li><strong>1</strong>: Authorized</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthStatus")
    public Integer authStatus;

    /**
     * <p>Connection status of the instance or the database under the instance. Values:</p>
     * <ul>
     * <li><strong>-3</strong>: Database not created</li>
     * <li><strong>-2</strong>: Released</li>
     * <li><strong>-1</strong>: Not connected</li>
     * <li><strong>2</strong>: Connectivity test in progress</li>
     * <li><strong>3</strong>: Connected</li>
     * <li><strong>4</strong>: Connection failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CheckStatus")
    public Integer checkStatus;

    /**
     * <p>Instance status.</p>
     * <ul>
     * <li><strong>Running</strong>: Running</li>
     * <li><strong>Released</strong>: Released</li>
     * <li><strong>DatabaseNotCreated</strong>: Database not created</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ClusterStatus")
    public String clusterStatus;

    /**
     * <p>When performing a paginated query, set the current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Database name.</p>
     * 
     * <strong>example:</strong>
     * <p>db_**t</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Engine type. Values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>MariaDB</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The instance ID to which the data in the data asset table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-*******xx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Language type for request and response messages. Values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Default, Simplified Chinese</li>
     * <li><strong>en_us</strong>: English (US)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Member account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>**********8103</p>
     */
    @NameInMap("MemberAccount")
    public Long memberAccount;

    /**
     * <p>When performing a paginated query, set the number of rows per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute</li>
     * <li><strong>2</strong>: OSS</li>
     * <li><strong>3</strong>: ADB-MYSQL</li>
     * <li><strong>4</strong>: TableStore</li>
     * <li><strong>5</strong>: RDS</li>
     * <li><strong>6</strong>: SelfDB</li>
     * <li><strong>7</strong>: PolarDB-X</li>
     * <li><strong>8</strong>: PolarDB</li>
     * <li><strong>9</strong>: ADB-PG</li>
     * <li><strong>10</strong>: OceanBase</li>
     * <li><strong>11</strong>: MongoDB</li>
     * <li><strong>25</strong>: Redis</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <p>The region where the asset is located. Values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
     * <li><strong>cn-huhehaote</strong>: China (Hohhot)</li>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-hongkong</strong>:  China (Hong Kong)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    public static DescribeParentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentInstanceRequest self = new DescribeParentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParentInstanceRequest setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    public DescribeParentInstanceRequest setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public DescribeParentInstanceRequest setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public DescribeParentInstanceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeParentInstanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeParentInstanceRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeParentInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeParentInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeParentInstanceRequest setMemberAccount(Long memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    public DescribeParentInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeParentInstanceRequest setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public DescribeParentInstanceRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

}
