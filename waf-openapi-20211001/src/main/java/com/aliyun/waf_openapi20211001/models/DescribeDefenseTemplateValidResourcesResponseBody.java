// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateValidResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C54DD36B-6380-57E5-89BA-2642757C4DB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<String> resources;

    /**
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseTemplateValidResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateValidResourcesResponseBody self = new DescribeDefenseTemplateValidResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateValidResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseTemplateValidResourcesResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public DescribeDefenseTemplateValidResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
