// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstanceSourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the security audit feature. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Specifies whether DSC is authorized to access the data asset.</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthStatus")
    public Integer authStatus;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The engine type. Valid values:</p>
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
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-demo-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese (default)</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service to which the data asset to query belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the asset belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute</li>
     * <li><strong>2</strong>: Object Storage Service (OSS)</li>
     * <li><strong>3</strong>: AnalyticDB for MySQL</li>
     * <li><strong>4</strong>: Tablestore (OTS)</li>
     * <li><strong>5</strong>: ApsaraDB RDS</li>
     * <li><strong>6</strong>: self-managed databases</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The content based on which a fuzzy search is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The data asset type based on which a fuzzy search is performed.</p>
     * <ul>
     * <li><strong>InstanceId</strong>: the ID of the instance.</li>
     * <li><strong>InstanceName</strong>: the name of the instance.</li>
     * <li><strong>DatabaseName</strong>: the name of the database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    /**
     * <p>The region in which the data asset resides. For more information, see <a href="https://help.aliyun.com/document_detail/214257.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    public static DescribeInstanceSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSourcesRequest self = new DescribeInstanceSourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSourcesRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public DescribeInstanceSourcesRequest setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    public DescribeInstanceSourcesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceSourcesRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeInstanceSourcesRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeInstanceSourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceSourcesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceSourcesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceSourcesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeInstanceSourcesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeInstanceSourcesRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public DescribeInstanceSourcesRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

}
