// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourcesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C7BC9373-3960-53B0-8968-2B13454AE18F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of protected objects or protected object groups that are associated to the protection rule template.</p>
     */
    @NameInMap("Resources")
    public java.util.List<String> resources;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTemplateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResourcesResponseBody self = new DescribeTemplateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTemplateResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTemplateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateResourcesResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public DescribeTemplateResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
