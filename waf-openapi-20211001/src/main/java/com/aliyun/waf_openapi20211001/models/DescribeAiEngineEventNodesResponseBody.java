// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventNodesResponseBody extends TeaModel {
    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAiEngineEventNodesResponseBodyItems> items;

    /**
     * <p>The number of entries to return on each page in a paging query. Valid values: 1 to 20. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used to query the next page. If a next page exists, this field returns a value.</p>
     * <blockquote>
     * <p>If this parameter returns a value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to obtain the data on the next page until no value is returned, which indicates that all data is obtained.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request-demo</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of nodes for the event.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAiEngineEventNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventNodesResponseBody self = new DescribeAiEngineEventNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventNodesResponseBody setItems(java.util.List<DescribeAiEngineEventNodesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAiEngineEventNodesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAiEngineEventNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAiEngineEventNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAiEngineEventNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiEngineEventNodesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAiEngineEventNodesResponseBodyItems extends TeaModel {
        /**
         * <p>The details of the node in the specified language. The details are in Markdown format.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li><strong>Characteristic</strong>: single quote closure</li>
         * <li><strong>Risk</strong>: high</li>
         * </ul>
         */
        @NameInMap("NodeDetail")
        public String nodeDetail;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>node-109-04</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the node in the specified language.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Injection</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The summary of the node in the specified language.</p>
         * 
         * <strong>example:</strong>
         * <p>The request matches SQL injection characteristics.</p>
         */
        @NameInMap("NodeSummary")
        public String nodeSummary;

        /**
         * <p>The node tag. Valid values:</p>
         * <ul>
         * <li><p><strong>bypass</strong>: Suspected bypass.</p>
         * </li>
         * <li><p><strong>protect</strong>: Mitigated.</p>
         * </li>
         * <li><p><strong>attempt</strong>: Reconnaissance and probing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bypass</p>
         */
        @NameInMap("NodeTag")
        public String nodeTag;

        /**
         * <p>The time when the node occurred. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792973400000</p>
         */
        @NameInMap("OccurredAt")
        public Long occurredAt;

        public static DescribeAiEngineEventNodesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventNodesResponseBodyItems self = new DescribeAiEngineEventNodesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventNodesResponseBodyItems setNodeDetail(String nodeDetail) {
            this.nodeDetail = nodeDetail;
            return this;
        }
        public String getNodeDetail() {
            return this.nodeDetail;
        }

        public DescribeAiEngineEventNodesResponseBodyItems setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeAiEngineEventNodesResponseBodyItems setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeAiEngineEventNodesResponseBodyItems setNodeSummary(String nodeSummary) {
            this.nodeSummary = nodeSummary;
            return this;
        }
        public String getNodeSummary() {
            return this.nodeSummary;
        }

        public DescribeAiEngineEventNodesResponseBodyItems setNodeTag(String nodeTag) {
            this.nodeTag = nodeTag;
            return this;
        }
        public String getNodeTag() {
            return this.nodeTag;
        }

        public DescribeAiEngineEventNodesResponseBodyItems setOccurredAt(Long occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }
        public Long getOccurredAt() {
            return this.occurredAt;
        }

    }

}
