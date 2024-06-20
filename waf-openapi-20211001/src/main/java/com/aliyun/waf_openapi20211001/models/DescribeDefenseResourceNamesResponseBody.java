// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceNamesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C1823E96-EF4B-5BD2-9E02-1D18****3ED8</p>
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
     * 
     * <strong>example:</strong>
     * <p>75</p>
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
