// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstanceSourcesRequest extends TeaModel {
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    @NameInMap("AuthStatus")
    public Integer authStatus;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SearchType")
    public String searchType;

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
