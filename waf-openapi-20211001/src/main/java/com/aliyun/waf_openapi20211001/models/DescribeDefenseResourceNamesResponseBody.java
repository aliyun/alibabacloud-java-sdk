// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceNamesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The names of the protected objects.</p>
     */
    @NameInMap("Resources")
    public java.util.List<String> resources;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseResourceNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceNamesResponseBody self = new DescribeDefenseResourceNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseResourceNamesResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public DescribeDefenseResourceNamesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
