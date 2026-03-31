// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseGroupValidResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A57BA089-3B28-5C82-8331-7B94****4978</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<String> resources;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseGroupValidResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseGroupValidResourcesResponseBody self = new DescribeDefenseGroupValidResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseGroupValidResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseGroupValidResourcesResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public DescribeDefenseGroupValidResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
