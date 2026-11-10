// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeAICallDetailsResponseBody extends TeaModel {
    /**
     * <p>调用明细列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CallDetails")
    public java.util.List<DescribeAICallDetailsResponseBodyCallDetails> callDetails;

    /**
     * <p>当前页码。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>当前页大小。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>实际查询终点。翻页时应复用此值。</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-06T00:00:00+08:00</p>
     */
    @NameInMap("QueryEndTime")
    public String queryEndTime;

    /**
     * <p>实际查询起点。翻页时应复用此值。</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00+08:00</p>
     */
    @NameInMap("QueryStartTime")
    public String queryStartTime;

    /**
     * <p>POP 请求 ID。</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>满足条件的总记录数。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAICallDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAICallDetailsResponseBody self = new DescribeAICallDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAICallDetailsResponseBody setCallDetails(java.util.List<DescribeAICallDetailsResponseBodyCallDetails> callDetails) {
        this.callDetails = callDetails;
        return this;
    }
    public java.util.List<DescribeAICallDetailsResponseBodyCallDetails> getCallDetails() {
        return this.callDetails;
    }

    public DescribeAICallDetailsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAICallDetailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAICallDetailsResponseBody setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }
    public String getQueryEndTime() {
        return this.queryEndTime;
    }

    public DescribeAICallDetailsResponseBody setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }
    public String getQueryStartTime() {
        return this.queryStartTime;
    }

    public DescribeAICallDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAICallDetailsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown extends TeaModel {
        /**
         * <p>显式缓存创建积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
         * 
         * <strong>example:</strong>
         * <p>0.15</p>
         */
        @NameInMap("ExplicitCacheCreation")
        public String explicitCacheCreation;

        /**
         * <p>显式缓存命中积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
         * 
         * <strong>example:</strong>
         * <p>0.01896</p>
         */
        @NameInMap("ExplicitCacheHit")
        public String explicitCacheHit;

        /**
         * <p>隐式缓存命中积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ImplicitCacheHit")
        public String implicitCacheHit;

        /**
         * <p>普通输入积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("NormalInput")
        public String normalInput;

        /**
         * <p>输出积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Output")
        public String output;

        public static DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown build(java.util.Map<String, ?> map) throws Exception {
            DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown self = new DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown();
            return TeaModel.build(map, self);
        }

        public DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown setExplicitCacheCreation(String explicitCacheCreation) {
            this.explicitCacheCreation = explicitCacheCreation;
            return this;
        }
        public String getExplicitCacheCreation() {
            return this.explicitCacheCreation;
        }

        public DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown setExplicitCacheHit(String explicitCacheHit) {
            this.explicitCacheHit = explicitCacheHit;
            return this;
        }
        public String getExplicitCacheHit() {
            return this.explicitCacheHit;
        }

        public DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown setImplicitCacheHit(String implicitCacheHit) {
            this.implicitCacheHit = implicitCacheHit;
            return this;
        }
        public String getImplicitCacheHit() {
            return this.implicitCacheHit;
        }

        public DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown setNormalInput(String normalInput) {
            this.normalInput = normalInput;
            return this;
        }
        public String getNormalInput() {
            return this.normalInput;
        }

        public DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class DescribeAICallDetailsResponseBodyCallDetails extends TeaModel {
        /**
         * <p>售卖 deduction 记录中的原始 agent_type；未匹配或 ADB 查询失败时不返回。</p>
         * 
         * <strong>example:</strong>
         * <p>AIComputer</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>调用状态：SUCCESS、RATE_LIMITED、TIMEOUT 或 FAILED。</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <p>日志时间，ISO 8601。</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T12:30:00+08:00</p>
         */
        @NameInMap("CallTime")
        public String callTime;

        /**
         * <p>首包时延，单位毫秒；失败或无首包数据时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>620</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("FirstTokenLatencyMs")
        public Long firstTokenLatencyMs;

        /**
         * <p>本条调用日志的实际数据地域，取值为 cn-shanghai、cn-hangzhou、cn-hongkong、ap-southeast-1 或 us-east-1；杭州预发返回 cn-hangzhou。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("GatewayRegion")
        public String gatewayRegion;

        /**
         * <p>AI 网关返回的 HTTP 状态码。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("HttpStatusCode")
        public Integer httpStatusCode;

        /**
         * <p>原始输入 token 数，前端据此转换上下文规模。</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("InputToken")
        public Long inputToken;

        /**
         * <p>产品实例 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>example-instance-001</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>实际调用模型。</p>
         * 
         * <strong>example:</strong>
         * <p>example-model</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>按请求 ID 和输入输出 token 匹配的实际抵扣积分，十进制字符串；积分查询失败或超时时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>0.28896</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Points")
        public String points;

        /**
         * <p>本条调用已匹配抵扣记录的积分构成，与 Points 来自同一条记录。缺少有效明细时不返回此对象；对象存在时完整返回五项积分，五项之和等于 Points，真实零值返回字符串 0。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NormalInput&quot;:&quot;0.02&quot;,&quot;Output&quot;:&quot;0.1&quot;,&quot;ImplicitCacheHit&quot;:&quot;0&quot;,&quot;ExplicitCacheCreation&quot;:&quot;0.15&quot;,&quot;ExplicitCacheHit&quot;:&quot;0.01896&quot;}</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("PointsBreakdown")
        public DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown pointsBreakdown;

        /**
         * <p>AI 网关请求 ID，与外层 POP 请求 ID 不同。</p>
         * 
         * <strong>example:</strong>
         * <p>model-call-example-001</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>用户 WyId，用户名由前端组装。</p>
         * 
         * <strong>example:</strong>
         * <p>wy-example-001</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("WyId")
        public String wyId;

        public static DescribeAICallDetailsResponseBodyCallDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAICallDetailsResponseBodyCallDetails self = new DescribeAICallDetailsResponseBodyCallDetails();
            return TeaModel.build(map, self);
        }

        public DescribeAICallDetailsResponseBodyCallDetails setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setCallTime(String callTime) {
            this.callTime = callTime;
            return this;
        }
        public String getCallTime() {
            return this.callTime;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setFirstTokenLatencyMs(Long firstTokenLatencyMs) {
            this.firstTokenLatencyMs = firstTokenLatencyMs;
            return this;
        }
        public Long getFirstTokenLatencyMs() {
            return this.firstTokenLatencyMs;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setGatewayRegion(String gatewayRegion) {
            this.gatewayRegion = gatewayRegion;
            return this;
        }
        public String getGatewayRegion() {
            return this.gatewayRegion;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setInputToken(Long inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Long getInputToken() {
            return this.inputToken;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setPoints(String points) {
            this.points = points;
            return this;
        }
        public String getPoints() {
            return this.points;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setPointsBreakdown(DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown pointsBreakdown) {
            this.pointsBreakdown = pointsBreakdown;
            return this;
        }
        public DescribeAICallDetailsResponseBodyCallDetailsPointsBreakdown getPointsBreakdown() {
            return this.pointsBreakdown;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeAICallDetailsResponseBodyCallDetails setWyId(String wyId) {
            this.wyId = wyId;
            return this;
        }
        public String getWyId() {
            return this.wyId;
        }

    }

}
