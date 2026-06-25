// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListGreyTagRouteResponseBody extends TeaModel {
    /**
     * <p>The status of the interface or the POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request is redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurs.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the grayscale rule.</p>
     */
    @NameInMap("Data")
    public ListGreyTagRouteResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information. Valid values:</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, a specific error code is returned.</p>
     * </li>
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
     * <p>Indicates whether the query succeeded.</p>
     * <ul>
     * <li><p><strong>true</strong>: The query succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The query failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to query the details of a call.</p>
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
         * <p>Only == is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>This parameter is not applicable to ALB applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>This parameter is not applicable to ALB applications.</p>
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
         * <p>The operator. Valid values: Only rawvalue is supported, which indicates a direct comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The comparison type. Valid values:</p>
         * <ul>
         * <li><p><strong>sourceIp</strong>: SourceIp.</p>
         * </li>
         * <li><p><strong>cookie</strong>: Cookie.</p>
         * </li>
         * <li><p><strong>header</strong>: Header.</p>
         * </li>
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
         * <p>The conditional pattern of the grayscale rule. Only AND is supported, which indicates that all conditions in the list must be met.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The Ingress ID.</p>
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
         * <p>The expression that is used to obtain the parameter value. The syntax follows the Spring Expression Language (SpEL). Valid values:</p>
         * <ul>
         * <li><p><strong>Leave it empty</strong>: Obtains the value of the current parameter.</p>
         * </li>
         * <li><p><strong>.name</strong>: Obtains the name property of the parameter. This is equivalent to args0.getName().</p>
         * </li>
         * <li><p><strong>.isEnabled()</strong>: Obtains the enabled property of the parameter. This is equivalent to args0.isEnabled().</p>
         * </li>
         * <li><p><strong>[0]</strong>: Obtains the first value of the array. This is equivalent to args0[0]. Note that the expression does not start with a period (.).</p>
         * </li>
         * <li><p><strong>.get(0)</strong>: Obtains the first value of the list. This is equivalent to args0.get(0).</p>
         * </li>
         * <li><p><strong>.get(&quot;key&quot;)</strong>: Obtains the value that corresponds to the specified key from the map. This is equivalent to args0.get(&quot;key&quot;).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>.name</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>The parameter number. 0 indicates the first parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>This parameter is not applicable to Dubbo services.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><p><strong>rawvalue</strong>: Direct comparison.</p>
         * </li>
         * <li><p><strong>list</strong>: Whitelist.</p>
         * </li>
         * <li><p><strong>mod</strong>: Modulo 100 operation.</p>
         * </li>
         * <li><p><strong>deterministic_proportional_steaming_division</strong>: Percentage.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>This parameter is not applicable to Dubbo services.</p>
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
         * <p>The conditional pattern of the grayscale rule. Valid values:</p>
         * <ul>
         * <li><p><strong>AND</strong>: All conditions in the list must be met.</p>
         * </li>
         * <li><p><strong>OR</strong>: Any condition in the list can be met.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The group of the Dubbo service that corresponds to the grayscale rule.</p>
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
         * <p>The name of the Dubbo service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.edas.boot.EchoService</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The version of the Dubbo service.</p>
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
         * <p>This parameter is not applicable to Spring Cloud applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>This parameter is not applicable to Spring Cloud applications.</p>
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
         * <li><p><strong>rawvalue</strong>: Direct comparison.</p>
         * </li>
         * <li><p><strong>list</strong>: Whitelist.</p>
         * </li>
         * <li><p><strong>mod</strong>: Modulo 100 operation.</p>
         * </li>
         * <li><p><strong>deterministic_proportional_steaming_division</strong>: Percentage.</p>
         * </li>
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
         * <li><p><strong>param</strong>: Parameter.</p>
         * </li>
         * <li><p><strong>cookie</strong>: Cookie.</p>
         * </li>
         * <li><p><strong>header</strong>: Header.</p>
         * </li>
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
         * <p>The conditional pattern of the grayscale rule. Valid values:</p>
         * <ul>
         * <li><p><strong>AND</strong>: All conditions in the list must be met.</p>
         * </li>
         * <li><p><strong>OR</strong>: Any condition in the list can be met.</p>
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
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRulesItems> items;

        /**
         * <p>The path that corresponds to the grayscale rule for the Spring Cloud application.</p>
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
         * <p>The grayscale rules created for an application for which an Application Load Balancer (ALB) Ingress is configured.</p>
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
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The grayscale rules for Dubbo services.</p>
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
         * <p>The grayscale rules for Spring Cloud.</p>
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
         * <p>The number of entries per page in a paged query. The value can only be <strong>1</strong>.</p>
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
         * <p>The total number of entries. The value can only be <strong>1</strong>.</p>
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
