// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEvidenceRequestsResponseBody extends TeaModel {
    /**
     * <p>The list of evidence requests.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItems> items;

    /**
     * <p>The number of entries to return on each page in a paging query. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. If a next page exists, this field returns a value.</p>
     * <blockquote>
     * <p>If this parameter returns a value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to retrieve the next page. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
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
     * <p>01A1CEE2-<em><strong><strong>9-019A-8B44-2</strong></strong></em>C2C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of evidence requests that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAiEngineEvidenceRequestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEvidenceRequestsResponseBody self = new DescribeAiEngineEvidenceRequestsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEvidenceRequestsResponseBody setItems(java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAiEngineEvidenceRequestsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAiEngineEvidenceRequestsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAiEngineEvidenceRequestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiEngineEvidenceRequestsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources extends TeaModel {
        /**
         * <p>The display attribute of the source, such as the region code.</p>
         * 
         * <strong>example:</strong>
         * <p>US-CA</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The source value, such as an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>2XX.0.113.1X</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources self = new DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources extends TeaModel {
        /**
         * <p>The list of sources of this type.</p>
         */
        @NameInMap("Sources")
        public java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources> sources;

        /**
         * <p>The attack source type.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources self = new DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources setSources(java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSourcesSources> getSources() {
            return this.sources;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAiEngineEvidenceRequestsResponseBodyItems extends TeaModel {
        /**
         * <p>The list of attack source groups for the request.</p>
         */
        @NameInMap("AttackSources")
        public java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources> attackSources;

        /**
         * <p>The evidence ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EVD-20241025-001</p>
         */
        @NameInMap("EvidenceId")
        public String evidenceId;

        /**
         * <p>The host of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The HTTP response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        /**
         * <p>The evidence impact tag. Valid values:</p>
         * <ul>
         * <li><p><strong>block</strong>: Indicates that the request is blocked.</p>
         * </li>
         * <li><p><strong>challenge</strong>: Indicates that the request is challenged.</p>
         * </li>
         * <li><p><strong>monitor</strong>: Indicates that the request is monitored.</p>
         * </li>
         * <li><p><strong>bypass</strong>: Indicates a suspected bypass.</p>
         * </li>
         * <li><p><strong>attempt</strong>: Indicates reconnaissance or probing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bypass</p>
         */
        @NameInMap("ImpactType")
        public String impactType;

        /**
         * <p>The HTTP method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The ID of the associated node. This corresponds to the NodeId in the node list.</p>
         * 
         * <strong>example:</strong>
         * <p>node-109-04</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The masked path of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/orders/query</p>
         */
        @NameInMap("RequestPath")
        public String requestPath;

        /**
         * <p>The time when the original request was made. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792973400000</p>
         */
        @NameInMap("RequestTime")
        public Long requestTime;

        /**
         * <p>The protected object to which the request belongs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>Specifies whether the request is a suspected bypass. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Indicates a suspected bypass.</li>
         * <li><strong>0</strong>: Indicates that the request is not a bypass.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuspectedBypass")
        public Integer suspectedBypass;

        /**
         * <p>The trace ID of the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-20241025-109-04</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static DescribeAiEngineEvidenceRequestsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEvidenceRequestsResponseBodyItems self = new DescribeAiEngineEvidenceRequestsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setAttackSources(java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources> attackSources) {
            this.attackSources = attackSources;
            return this;
        }
        public java.util.List<DescribeAiEngineEvidenceRequestsResponseBodyItemsAttackSources> getAttackSources() {
            return this.attackSources;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setEvidenceId(String evidenceId) {
            this.evidenceId = evidenceId;
            return this;
        }
        public String getEvidenceId() {
            return this.evidenceId;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setHttpStatus(Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setImpactType(String impactType) {
            this.impactType = impactType;
            return this;
        }
        public String getImpactType() {
            return this.impactType;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setRequestPath(String requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public String getRequestPath() {
            return this.requestPath;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setRequestTime(Long requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public Long getRequestTime() {
            return this.requestTime;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setSuspectedBypass(Integer suspectedBypass) {
            this.suspectedBypass = suspectedBypass;
            return this;
        }
        public Integer getSuspectedBypass() {
            return this.suspectedBypass;
        }

        public DescribeAiEngineEvidenceRequestsResponseBodyItems setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
