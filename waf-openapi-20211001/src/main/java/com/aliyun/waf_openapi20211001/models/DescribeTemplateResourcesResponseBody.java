// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourcesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 500. Default value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token (Token) for the next page. If a next page exists, this field contains a value.</p>
     * <blockquote>
     * <p>If this parameter has a return value, a next page exists. Use the returned <strong>NextToken</strong> as a request parameter to retrieve the next page of data. Repeat until no value is returned, which indicates that all data has been retrieved.</p>
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
     * <p>The list of bound protected object names, protected object group names, or protected asset IDs.</p>
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
     * <p>The total number of entries returned.</p>
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
