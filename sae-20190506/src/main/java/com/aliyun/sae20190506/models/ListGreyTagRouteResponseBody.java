// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListGreyTagRouteResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Client error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The canary release rule information.</p>
     */
    @NameInMap("Data")
    public ListGreyTagRouteResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information.</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If the request fails, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D29CBD0-45D3-410B-9826-52F86F90****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the change order information was queried successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The query was successful.</li>
     * <li><strong>false</strong>: The query failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to precisely query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListGreyTagRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGreyTagRouteResponseBody self = new ListGreyTagRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGreyTagRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGreyTagRouteResponseBody setData(ListGreyTagRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGreyTagRouteResponseBodyData getData() {
        return this.data;
    }

    public ListGreyTagRouteResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGreyTagRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGreyTagRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGreyTagRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGreyTagRouteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListGreyTagRouteResponseBodyDataResultAlbRulesItems extends TeaModel {
        /**
         * <p>The comparison operator. Currently, only <strong>==</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>Not required for ALB applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>Not required for ALB applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Currently, only <strong>rawvalue</strong> (direct comparison) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The comparison type. Valid values:</p>
         * <ul>
         * <li><strong>sourceIp</strong>: Source IP address.</li>
         * <li><strong>cookie</strong>: Cookie.</li>
         * <li><strong>header</strong>: Header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookie</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The parameter value. The value obtained based on type and name is compared with this value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static ListGreyTagRouteResponseBodyDataResultAlbRulesItems build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResultAlbRulesItems self = new ListGreyTagRouteResponseBodyDataResultAlbRulesItems();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRulesItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRulesItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRulesItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRulesItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRulesItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRulesItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRulesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGreyTagRouteResponseBodyDataResultAlbRules extends TeaModel {
        /**
         * <p>The condition mode of the canary release rule. Currently, only <strong>AND</strong> is supported, which means all conditions in the condition list must be met.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The gateway route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ingressId")
        public String ingressId;

        /**
         * <p>The condition list.</p>
         */
        @NameInMap("items")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRulesItems> items;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>s-6366-e3****-99**</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        public static ListGreyTagRouteResponseBodyDataResultAlbRules build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResultAlbRules self = new ListGreyTagRouteResponseBodyDataResultAlbRules();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRules setIngressId(String ingressId) {
            this.ingressId = ingressId;
            return this;
        }
        public String getIngressId() {
            return this.ingressId;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRules setItems(java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRulesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRulesItems> getItems() {
            return this.items;
        }

        public ListGreyTagRouteResponseBodyDataResultAlbRules setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListGreyTagRouteResponseBodyDataResultDubboRulesItems extends TeaModel {
        /**
         * <p>The comparison operator. Valid values: <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>!=</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The expression used to obtain the parameter value. The syntax follows Spring Expression Language (SpEL). Valid values:</p>
         * <ul>
         * <li><strong>Empty</strong>: Obtains the value of the current parameter directly.</li>
         * <li><strong>.name</strong>: Obtains the name property of the parameter, which is equivalent to args0.getName().</li>
         * <li><strong>.isEnabled()</strong>: Obtains the enabled property of the parameter, which is equivalent to args0.isEnabled().</li>
         * <li><strong>[0]</strong>: Specifies that the current parameter is an array and obtains the first value of the array, which is equivalent to args0[0]. Note that there is no period (.) at the beginning.</li>
         * <li><strong>.get(0)</strong>: Specifies that the current parameter is a list and obtains the first value of the list, which is equivalent to args0.get(0).</li>
         * <li><strong>.get(&quot;key&quot;)</strong>: Specifies that the current parameter is a map and obtains the value corresponding to the key, which is equivalent to args0.get(&quot;key&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>.name</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>The parameter index. A value of 0 indicates the first parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>Not applicable to Dubbo services.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><strong>rawvalue</strong>: Direct comparison.</li>
         * <li><strong>list</strong>: Whitelist.</li>
         * <li><strong>mod</strong>: Modulo 100.</li>
         * <li><strong>deterministic_proportional_steaming_division</strong>: Percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>Not applicable to Dubbo services.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The parameter value. The value obtained based on <strong>expr</strong> and <strong>index</strong> is compared with this value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static ListGreyTagRouteResponseBodyDataResultDubboRulesItems build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResultDubboRulesItems self = new ListGreyTagRouteResponseBodyDataResultDubboRulesItems();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRulesItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRulesItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRulesItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRulesItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRulesItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRulesItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRulesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGreyTagRouteResponseBodyDataResultDubboRules extends TeaModel {
        /**
         * <p>The condition mode of the canary release rule. Valid values:</p>
         * <ul>
         * <li><strong>AND</strong>: The logical AND operation. All conditions in the condition list must be met.</li>
         * <li><strong>OR</strong>: The logical OR operation. Any condition in the condition list must be met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The group of the Dubbo service corresponding to the canary release rule.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The condition list.</p>
         */
        @NameInMap("items")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRulesItems> items;

        /**
         * <p>The method name of the Dubbo service.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        @NameInMap("methodName")
        public String methodName;

        /**
         * <p>The Dubbo service name.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.edas.boot.EchoService</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The Dubbo service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListGreyTagRouteResponseBodyDataResultDubboRules build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResultDubboRules self = new ListGreyTagRouteResponseBodyDataResultDubboRules();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRules setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRules setItems(java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRulesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRulesItems> getItems() {
            return this.items;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRules setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRules setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListGreyTagRouteResponseBodyDataResultDubboRules setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListGreyTagRouteResponseBodyDataResultScRulesItems extends TeaModel {
        /**
         * <p>The comparison operator. Valid values: <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>!=</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>Not applicable to Spring Cloud applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>Not applicable to Spring Cloud applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><strong>rawvalue</strong>: Direct comparison.</li>
         * <li><strong>list</strong>: Whitelist.</li>
         * <li><strong>mod</strong>: Modulo 100.</li>
         * <li><strong>deterministic_proportional_steaming_division</strong>: Percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The comparison type. Valid values:</p>
         * <ul>
         * <li><strong>param</strong>: Parameter.</li>
         * <li><strong>cookie</strong>: Cookie.</li>
         * <li><strong>header</strong>: Header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookie</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The parameter value. The value obtained based on <strong>type</strong> and <strong>name</strong> is compared with this value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static ListGreyTagRouteResponseBodyDataResultScRulesItems build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResultScRulesItems self = new ListGreyTagRouteResponseBodyDataResultScRulesItems();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyDataResultScRulesItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public ListGreyTagRouteResponseBodyDataResultScRulesItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public ListGreyTagRouteResponseBodyDataResultScRulesItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListGreyTagRouteResponseBodyDataResultScRulesItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGreyTagRouteResponseBodyDataResultScRulesItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGreyTagRouteResponseBodyDataResultScRulesItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGreyTagRouteResponseBodyDataResultScRulesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGreyTagRouteResponseBodyDataResultScRules extends TeaModel {
        /**
         * <p>The condition mode of the canary release rule. Valid values:</p>
         * <ul>
         * <li><strong>AND</strong>: The logical AND operation. All conditions in the condition list must be met.</li>
         * <li><strong>OR</strong>: The logical OR operation. Any condition in the condition list must be met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The condition list.</p>
         */
        @NameInMap("items")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRulesItems> items;

        /**
         * <p>The path corresponding to the canary release rule for the Spring Cloud application.</p>
         * 
         * <strong>example:</strong>
         * <p>/path</p>
         */
        @NameInMap("path")
        public String path;

        public static ListGreyTagRouteResponseBodyDataResultScRules build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResultScRules self = new ListGreyTagRouteResponseBodyDataResultScRules();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyDataResultScRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListGreyTagRouteResponseBodyDataResultScRules setItems(java.util.List<ListGreyTagRouteResponseBodyDataResultScRulesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRulesItems> getItems() {
            return this.items;
        }

        public ListGreyTagRouteResponseBodyDataResultScRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListGreyTagRouteResponseBodyDataResult extends TeaModel {
        /**
         * <p>The canary release rules created for applications with configured Application Load Balancer (ALB) gateway routes.</p>
         */
        @NameInMap("AlbRules")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRules> albRules;

        /**
         * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1619007592013</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Dubbo service canary release rules.</p>
         */
        @NameInMap("DubboRules")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRules> dubboRules;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Spring Cloud canary release rules.</p>
         */
        @NameInMap("ScRules")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRules> scRules;

        /**
         * <p>The timestamp when the rule was updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1609434061000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListGreyTagRouteResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResult self = new ListGreyTagRouteResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyDataResult setAlbRules(java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRules> albRules) {
            this.albRules = albRules;
            return this;
        }
        public java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRules> getAlbRules() {
            return this.albRules;
        }

        public ListGreyTagRouteResponseBodyDataResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListGreyTagRouteResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGreyTagRouteResponseBodyDataResult setDubboRules(java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRules> dubboRules) {
            this.dubboRules = dubboRules;
            return this;
        }
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRules> getDubboRules() {
            return this.dubboRules;
        }

        public ListGreyTagRouteResponseBodyDataResult setGreyTagRouteId(Long greyTagRouteId) {
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }
        public Long getGreyTagRouteId() {
            return this.greyTagRouteId;
        }

        public ListGreyTagRouteResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGreyTagRouteResponseBodyDataResult setScRules(java.util.List<ListGreyTagRouteResponseBodyDataResultScRules> scRules) {
            this.scRules = scRules;
            return this;
        }
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRules> getScRules() {
            return this.scRules;
        }

        public ListGreyTagRouteResponseBodyDataResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListGreyTagRouteResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page in a paged query. Currently, only <strong>1</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGreyTagRouteResponseBodyDataResult> result;

        /**
         * <p>The total number of entries. Currently, only <strong>1</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGreyTagRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyData self = new ListGreyTagRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGreyTagRouteResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListGreyTagRouteResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGreyTagRouteResponseBodyData setResult(java.util.List<ListGreyTagRouteResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGreyTagRouteResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGreyTagRouteResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
