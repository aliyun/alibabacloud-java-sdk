// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiMcpServerSystemToolsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The NextToken value. Use this value to retrieve more results.</p>
     * <blockquote>
     * <p>If this parameter is not returned, no more results are available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZjtYxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of system tools.</p>
     */
    @NameInMap("systemTools")
    public java.util.List<ListApiMcpServerSystemToolsResponseBodySystemTools> systemTools;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListApiMcpServerSystemToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiMcpServerSystemToolsResponseBody self = new ListApiMcpServerSystemToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiMcpServerSystemToolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiMcpServerSystemToolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiMcpServerSystemToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiMcpServerSystemToolsResponseBody setSystemTools(java.util.List<ListApiMcpServerSystemToolsResponseBodySystemTools> systemTools) {
        this.systemTools = systemTools;
        return this;
    }
    public java.util.List<ListApiMcpServerSystemToolsResponseBodySystemTools> getSystemTools() {
        return this.systemTools;
    }

    public ListApiMcpServerSystemToolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApiMcpServerSystemToolsResponseBodySystemTools extends TeaModel {
        /**
         * <p>The description of the system tool.</p>
         * 
         * <strong>example:</strong>
         * <p>system tool description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the system tool.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-system</p>
         */
        @NameInMap("name")
        public String name;

        public static ListApiMcpServerSystemToolsResponseBodySystemTools build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServerSystemToolsResponseBodySystemTools self = new ListApiMcpServerSystemToolsResponseBodySystemTools();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServerSystemToolsResponseBodySystemTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiMcpServerSystemToolsResponseBodySystemTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
