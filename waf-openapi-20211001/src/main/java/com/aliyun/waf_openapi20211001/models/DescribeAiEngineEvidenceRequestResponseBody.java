// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEvidenceRequestResponseBody extends TeaModel {
    /**
     * <p>The AI interpretation result in the specified language, in Markdown format.</p>
     * 
     * <strong>example:</strong>
     * <p>This request has SQL injection risk.</p>
     */
    @NameInMap("AiInterpretation")
    public String aiInterpretation;

    /**
     * <p>The list of attack source groups for the request.</p>
     */
    @NameInMap("AttackSources")
    public java.util.List<DescribeAiEngineEvidenceRequestResponseBodyAttackSources> attackSources;

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
     * <p>The impact tag of the evidence. Valid values:</p>
     * <ul>
     * <li><p><strong>block</strong>: The request is blocked.</p>
     * </li>
     * <li><p><strong>challenge</strong>: The request triggers a challenge.</p>
     * </li>
     * <li><p><strong>monitor</strong>: The request is monitored.</p>
     * </li>
     * <li><p><strong>bypass</strong>: The request is suspected to be a bypass.</p>
     * </li>
     * <li><p><strong>attempt</strong>: The request is a reconnaissance probe.</p>
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
     * <p>The ID of the associated node, which corresponds to the NodeId in the node list.</p>
     * 
     * <strong>example:</strong>
     * <p>node-109-04</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The request content.</p>
     * 
     * <strong>example:</strong>
     * <p>GET /api/orders/query?id=1%27 HTTP/1.1</p>
     */
    @NameInMap("Request")
    public String request;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A<em><strong>2-1219-019A-8B44-255</strong></em>**2C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The masked request path.</p>
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
     * <p>The ID of the protected object to which the request belongs.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com-waf">www.example.com-waf</a></p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The response content.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP/1.1 500 Internal Server Error</p>
     */
    @NameInMap("Response")
    public String response;

    /**
     * <p>Specifies whether the request is suspected to be a bypass. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The request is suspected to be a bypass.</li>
     * <li><strong>0</strong>: The request is not a bypass.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuspectedBypass")
    public Integer suspectedBypass;

    /**
     * <p>The trace ID of the original request, which can be up to 128 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>trace-20241025-109-04</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeAiEngineEvidenceRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEvidenceRequestResponseBody self = new DescribeAiEngineEvidenceRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEvidenceRequestResponseBody setAiInterpretation(String aiInterpretation) {
        this.aiInterpretation = aiInterpretation;
        return this;
    }
    public String getAiInterpretation() {
        return this.aiInterpretation;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setAttackSources(java.util.List<DescribeAiEngineEvidenceRequestResponseBodyAttackSources> attackSources) {
        this.attackSources = attackSources;
        return this;
    }
    public java.util.List<DescribeAiEngineEvidenceRequestResponseBodyAttackSources> getAttackSources() {
        return this.attackSources;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }
    public String getEvidenceId() {
        return this.evidenceId;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }
    public Integer getHttpStatus() {
        return this.httpStatus;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setImpactType(String impactType) {
        this.impactType = impactType;
        return this;
    }
    public String getImpactType() {
        return this.impactType;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setRequestPath(String requestPath) {
        this.requestPath = requestPath;
        return this;
    }
    public String getRequestPath() {
        return this.requestPath;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public Long getRequestTime() {
        return this.requestTime;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setSuspectedBypass(Integer suspectedBypass) {
        this.suspectedBypass = suspectedBypass;
        return this;
    }
    public Integer getSuspectedBypass() {
        return this.suspectedBypass;
    }

    public DescribeAiEngineEvidenceRequestResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources extends TeaModel {
        /**
         * <p>The display attribute of the source, such as the region code.</p>
         * 
         * <strong>example:</strong>
         * <p>US-CA</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The value of the source, such as an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources self = new DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAiEngineEvidenceRequestResponseBodyAttackSources extends TeaModel {
        /**
         * <p>The list of sources of this type.</p>
         */
        @NameInMap("Sources")
        public java.util.List<DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources> sources;

        /**
         * <p>The type of the attack source.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAiEngineEvidenceRequestResponseBodyAttackSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEvidenceRequestResponseBodyAttackSources self = new DescribeAiEngineEvidenceRequestResponseBodyAttackSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEvidenceRequestResponseBodyAttackSources setSources(java.util.List<DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<DescribeAiEngineEvidenceRequestResponseBodyAttackSourcesSources> getSources() {
            return this.sources;
        }

        public DescribeAiEngineEvidenceRequestResponseBodyAttackSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
