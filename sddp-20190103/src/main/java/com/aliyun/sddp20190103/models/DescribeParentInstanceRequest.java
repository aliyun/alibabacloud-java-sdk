// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceRequest extends TeaModel {
    /**
     * <p>The authorization status of the data asset instance.</p>
     * <ul>
     * <li><p><strong>0</strong>: Unauthorized.</p>
     * </li>
     * <li><p><strong>1</strong>: Authorized.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthStatus")
    public Integer authStatus;

    /**
     * <p>The connection status of the instance or a database in the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>-3</strong>: The database is not created.</p>
     * </li>
     * <li><p><strong>-2</strong>: Released.</p>
     * </li>
     * <li><p><strong>-1</strong>: Not connected.</p>
     * </li>
     * <li><p><strong>2</strong>: Testing connectivity.</p>
     * </li>
     * <li><p><strong>3</strong>: Connected.</p>
     * </li>
     * <li><p><strong>4</strong>: Connection failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CheckStatus")
    public Integer checkStatus;

    /**
     * <p>The instance status.</p>
     * <ul>
     * <li><p><strong>Running</strong>: Running.</p>
     * </li>
     * <li><p><strong>Released</strong>: Released.</p>
     * </li>
     * <li><p><strong>DatabaseNotCreated</strong>: Database not created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ClusterStatus")
    public String clusterStatus;

    /**
     * <p>The number of the page to return for a paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>db_**t</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong>.</p>
     * </li>
     * <li><p><strong>MariaDB</strong>.</p>
     * </li>
     * <li><p><strong>Oracle</strong>.</p>
     * </li>
     * <li><p><strong>PostgreSQL</strong>.</p>
     * </li>
     * <li><p><strong>SQLServer</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The ID of the data asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-*******xx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Simplified Chinese. This is the default value.</p>
     * </li>
     * <li><p><strong>en_us</strong>: U.S. English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>**********8103</p>
     */
    @NameInMap("MemberAccount")
    public Long memberAccount;

    /**
     * <p>The number of entries to return on each page for a paged query. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required. The type of the product. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: ADB-MYSQL</p>
     * </li>
     * <li><p><strong>4</strong>: TableStore</p>
     * </li>
     * <li><p><strong>5</strong>: RDS</p>
     * </li>
     * <li><p><strong>6</strong>: Self-managed database</p>
     * </li>
     * <li><p><strong>7</strong>: PolarDB-X</p>
     * </li>
     * <li><p><strong>8</strong>: PolarDB</p>
     * </li>
     * <li><p><strong>9</strong>: ADB-PG</p>
     * </li>
     * <li><p><strong>10</strong>: OceanBase</p>
     * </li>
     * <li><p><strong>11</strong>: MongoDB</p>
     * </li>
     * <li><p><strong>25</strong>: Redis</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <p>The region where the asset resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-beijing</strong>: China (Beijing).</p>
     * </li>
     * <li><p><strong>cn-zhangjiakou</strong>: China (Zhangjiakou).</p>
     * </li>
     * <li><p><strong>cn-huhehaote</strong>: China (Hohhot).</p>
     * </li>
     * <li><p><strong>cn-hangzhou</strong>: China (Hangzhou).</p>
     * </li>
     * <li><p><strong>cn-shanghai</strong>: China (Shanghai).</p>
     * </li>
     * <li><p><strong>cn-shenzhen</strong>: China (Shenzhen).</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: China (Hong Kong).</p>
     * </li>
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
