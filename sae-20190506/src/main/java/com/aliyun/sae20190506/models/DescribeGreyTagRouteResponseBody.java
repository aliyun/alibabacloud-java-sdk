// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeGreyTagRouteResponseBody extends TeaModel {
    /**
     * <p>The status code of the API call or a POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request is redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client-side error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server-side error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the canary rule.</p>
     */
    @NameInMap("Data")
    public DescribeGreyTagRouteResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message that indicates the result of the call.</p>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID for querying the details of a call.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeGreyTagRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGreyTagRouteResponseBody self = new DescribeGreyTagRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGreyTagRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGreyTagRouteResponseBody setData(DescribeGreyTagRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeGreyTagRouteResponseBodyData getData() {
        return this.data;
    }

    public DescribeGreyTagRouteResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeGreyTagRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGreyTagRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGreyTagRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGreyTagRouteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeGreyTagRouteResponseBodyDataAlbRulesItems extends TeaModel {
        /**
         * <p>Currently supports ==.</p>
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
         * <p>The name of the element to match, such as a header or cookie name. This parameter is not used if type is set to sourceIp.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The matching operator. Only <strong>rawvalue</strong> is supported, which indicates a direct comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The type of request element to match against. Valid values:</p>
         * <ul>
         * <li><p><strong>sourceIp</strong>: The source IP address.</p>
         * </li>
         * <li><p><strong>cookie</strong>: A cookie.</p>
         * </li>
         * <li><p><strong>header</strong>: A request header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookie</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value to match. This value is compared with the actual value of the element specified by <strong>type</strong> and <strong>name</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeGreyTagRouteResponseBodyDataAlbRulesItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyDataAlbRulesItems self = new DescribeGreyTagRouteResponseBodyDataAlbRulesItems();
            return TeaModel.build(map, self);
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRulesItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRulesItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRulesItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRulesItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRulesItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRulesItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRulesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGreyTagRouteResponseBodyDataAlbRules extends TeaModel {
        /**
         * <p>The relationship between the conditions in the canary rule. Only <strong>AND</strong> is supported, which indicates that all conditions must be met.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The ID of the Ingress.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ingressId")
        public String ingressId;

        /**
         * <p>The list of conditions.</p>
         */
        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRulesItems> items;

        /**
         * <p>The routing service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        public static DescribeGreyTagRouteResponseBodyDataAlbRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyDataAlbRules self = new DescribeGreyTagRouteResponseBodyDataAlbRules();
            return TeaModel.build(map, self);
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRules setIngressId(String ingressId) {
            this.ingressId = ingressId;
            return this;
        }
        public String getIngressId() {
            return this.ingressId;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRules setItems(java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRulesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRulesItems> getItems() {
            return this.items;
        }

        public DescribeGreyTagRouteResponseBodyDataAlbRules setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

    public static class DescribeGreyTagRouteResponseBodyDataDubboRulesItems extends TeaModel {
        /**
         * <p>The comparison operator. Valid values are <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>!=</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The expression that is used to obtain the parameter value. Valid values:</p>
         * <ul>
         * <li><p><strong>Leave empty</strong>: If left empty, the value of the parameter itself is used.</p>
         * </li>
         * <li><p><strong>.name</strong>: Obtains the value of the <code>name</code> attribute of the parameter. This is equivalent to <code>args0.getName()</code>.</p>
         * </li>
         * <li><p><strong>.isEnabled()</strong>: Obtains the value of the <code>enabled</code> attribute of the parameter. This is equivalent to <code>args0.isEnabled()</code>.</p>
         * </li>
         * <li><p><strong>[0]</strong>: The parameter must be an array. This expression obtains the first value of the array, which is equivalent to <code>args0[0]</code>. Note that the expression does not start with a period (.).</p>
         * </li>
         * <li><p><strong>.get(0)</strong>: The parameter must be a list. This expression obtains the first value of the list, which is equivalent to <code>args0.get(0)</code>.</p>
         * </li>
         * <li><p><strong>.get(&quot;key&quot;)</strong>: The parameter must be a map. This expression obtains the value that corresponds to a key. This is equivalent to <code>args0.get(&quot;key&quot;)</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>.name</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>The parameter index. <code>0</code> indicates the first parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>Not used in Dubbo services.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The matching operator. Valid values:</p>
         * <ul>
         * <li><p><strong>rawvalue</strong>: Performs a direct comparison.</p>
         * </li>
         * <li><p><strong>list</strong>: Matches against an allowlist of values.</p>
         * </li>
         * <li><p><strong>mod</strong>: Calculates the remainder of a division by 100.</p>
         * </li>
         * <li><p><strong>deterministic_proportional_steaming_division</strong>: Performs a percentage-based match.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>Not used in Dubbo services.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value to match. This value is compared with the actual value retrieved by using the specified <strong>expr</strong> and <strong>index</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeGreyTagRouteResponseBodyDataDubboRulesItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyDataDubboRulesItems self = new DescribeGreyTagRouteResponseBodyDataDubboRulesItems();
            return TeaModel.build(map, self);
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRulesItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRulesItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRulesItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRulesItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRulesItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRulesItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRulesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGreyTagRouteResponseBodyDataDubboRules extends TeaModel {
        /**
         * <p>The relationship between the conditions in the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>AND</strong>: All conditions must be met.</p>
         * </li>
         * <li><p><strong>OR</strong>: At least one condition must be met.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The service group to which the canary rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The list of conditions.</p>
         */
        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRulesItems> items;

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

        public static DescribeGreyTagRouteResponseBodyDataDubboRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyDataDubboRules self = new DescribeGreyTagRouteResponseBodyDataDubboRules();
            return TeaModel.build(map, self);
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRules setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRules setItems(java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRulesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRulesItems> getItems() {
            return this.items;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRules setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRules setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeGreyTagRouteResponseBodyDataDubboRules setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeGreyTagRouteResponseBodyDataScRulesItems extends TeaModel {
        /**
         * <p>The comparison operator. Valid values are <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>!=</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>Not used in Spring Cloud applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>Not used in Spring Cloud applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The name of the element to match, as specified by the type parameter. For example, a header name or cookie name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The matching operator. Valid values:</p>
         * <ul>
         * <li><p><strong>rawvalue</strong>: Performs a direct comparison.</p>
         * </li>
         * <li><p><strong>list</strong>: Matches against an allowlist of values.</p>
         * </li>
         * <li><p><strong>mod</strong>: Calculates the remainder of a division by 100.</p>
         * </li>
         * <li><p><strong>deterministic_proportional_steaming_division</strong>: Performs a percentage-based match.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The type of request element to match against. Valid values:</p>
         * <ul>
         * <li><p><strong>param</strong>: A request parameter.</p>
         * </li>
         * <li><p><strong>cookie</strong>: A cookie.</p>
         * </li>
         * <li><p><strong>header</strong>: A request header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookie</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value to match. This value is compared with the actual value of the element specified by <strong>type</strong> and <strong>name</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeGreyTagRouteResponseBodyDataScRulesItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyDataScRulesItems self = new DescribeGreyTagRouteResponseBodyDataScRulesItems();
            return TeaModel.build(map, self);
        }

        public DescribeGreyTagRouteResponseBodyDataScRulesItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public DescribeGreyTagRouteResponseBodyDataScRulesItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public DescribeGreyTagRouteResponseBodyDataScRulesItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeGreyTagRouteResponseBodyDataScRulesItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGreyTagRouteResponseBodyDataScRulesItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeGreyTagRouteResponseBodyDataScRulesItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGreyTagRouteResponseBodyDataScRulesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGreyTagRouteResponseBodyDataScRules extends TeaModel {
        /**
         * <p>The relationship between the conditions in the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>AND</strong>: All conditions must be met.</p>
         * </li>
         * <li><p><strong>OR</strong>: At least one condition must be met.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The list of conditions.</p>
         */
        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRulesItems> items;

        /**
         * <p>The path to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>/path</p>
         */
        @NameInMap("path")
        public String path;

        public static DescribeGreyTagRouteResponseBodyDataScRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyDataScRules self = new DescribeGreyTagRouteResponseBodyDataScRules();
            return TeaModel.build(map, self);
        }

        public DescribeGreyTagRouteResponseBodyDataScRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeGreyTagRouteResponseBodyDataScRules setItems(java.util.List<DescribeGreyTagRouteResponseBodyDataScRulesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRulesItems> getItems() {
            return this.items;
        }

        public DescribeGreyTagRouteResponseBodyDataScRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeGreyTagRouteResponseBodyData extends TeaModel {
        /**
         * <p>The canary rules for the Application Load Balancer (ALB) instance.</p>
         */
        @NameInMap("AlbRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRules> albRules;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3faaf993-7aed-4bcd-b189-625e6a5a****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The creation timestamp of the rule, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1619007592013</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the canary rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The canary rules for the Dubbo service.</p>
         */
        @NameInMap("DubboRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRules> dubboRules;

        /**
         * <p>The globally unique ID of the canary rule.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        /**
         * <p>The name of the canary rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The canary rules for the Spring Cloud application.</p>
         */
        @NameInMap("ScRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRules> scRules;

        /**
         * <p>The timestamp of the rule\&quot;s last update, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1609434061000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeGreyTagRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyData self = new DescribeGreyTagRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeGreyTagRouteResponseBodyData setAlbRules(java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRules> albRules) {
            this.albRules = albRules;
            return this;
        }
        public java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRules> getAlbRules() {
            return this.albRules;
        }

        public DescribeGreyTagRouteResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeGreyTagRouteResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGreyTagRouteResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGreyTagRouteResponseBodyData setDubboRules(java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRules> dubboRules) {
            this.dubboRules = dubboRules;
            return this;
        }
        public java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRules> getDubboRules() {
            return this.dubboRules;
        }

        public DescribeGreyTagRouteResponseBodyData setGreyTagRouteId(Long greyTagRouteId) {
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }
        public Long getGreyTagRouteId() {
            return this.greyTagRouteId;
        }

        public DescribeGreyTagRouteResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGreyTagRouteResponseBodyData setScRules(java.util.List<DescribeGreyTagRouteResponseBodyDataScRules> scRules) {
            this.scRules = scRules;
            return this;
        }
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRules> getScRules() {
            return this.scRules;
        }

        public DescribeGreyTagRouteResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
