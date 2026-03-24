// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourcesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 500. Default value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. This parameter is returned if a next page exists.</p>
     * <blockquote>
     * <p>If a value is returned for this parameter, a next page exists. You can use the returned <strong>NextToken</strong> value as a request parameter to retrieve the data on the next page. When no value is returned, all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAABLQv******37sHZaHk4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7BC9373-3960-53B0-8968-2B13454AE18F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of the names of the attached protected objects or protected object groups, or the IDs of the protected assets.</p>
     */
    @NameInMap("Resources")
    public java.util.List<String> resources;

    /**
     * <p>The ID of the protection template.</p>
     * 
     * <strong>example:</strong>
     * <p>168465</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
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

    public DescribeTemplateResourcesResponseBody setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public DescribeTemplateResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
