// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskListCheckResultRequest extends TeaModel {
    // The number of the page to return. Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The instance ID of the cloud service. Separate multiple IDs with commas (,).
    // 
    // >  If you do not specify this parameter, an empty list is returned.
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeRiskListCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskListCheckResultRequest self = new DescribeRiskListCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskListCheckResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRiskListCheckResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeRiskListCheckResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskListCheckResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskListCheckResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRiskListCheckResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
