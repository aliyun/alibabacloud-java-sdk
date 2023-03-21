// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceAntiBruteForceRulesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static DescribeInstanceAntiBruteForceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAntiBruteForceRulesRequest self = new DescribeInstanceAntiBruteForceRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAntiBruteForceRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceAntiBruteForceRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceAntiBruteForceRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInstanceAntiBruteForceRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInstanceAntiBruteForceRulesRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
