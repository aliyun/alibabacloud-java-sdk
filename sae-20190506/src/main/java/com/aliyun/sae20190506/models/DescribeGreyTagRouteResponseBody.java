// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeGreyTagRouteResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the canary release rule.</p>
     */
    @NameInMap("Data")
    public DescribeGreyTagRouteResponseBodyData data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9D29CBD0-45D3-410B-9826-52F86F90****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information of the change order was queried. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The information was queried.</li>
     * <li><strong>false</strong>: The information failed to be queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
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
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>cookie</p>
         */
        @NameInMap("type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ingressId")
        public String ingressId;

        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRulesItems> items;

        /**
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
         * <p>The comparison operator. Valid values: <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>! =</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The expression that is used to obtain the value of the parameter. Valid values:</p>
         * <ul>
         * <li><strong>Empty</strong>: obtains the value of the parameter.</li>
         * <li><strong>.name</strong>: obtains the name property of the parameter. This expression works the same way as args0.getName().</li>
         * <li><strong>.isEnabled()</strong>: obtains the enabled property of the parameter. This expression works the same way as args0.isEnabled().</li>
         * <li><strong>[0]</strong>: indicates that the value of the parameter is an array and obtains the first value of the array. This expression works the same way as args0[0]. This expression does not start with a period (.).</li>
         * <li><strong>.get(0)</strong>: indicates that the value of the parameter is a list and obtains the first value of the list. This expression works the same way as args0.get(0).</li>
         * <li><strong>.get(&quot;key&quot;)</strong>: indicates that the value of the parameter is a map and obtains the value of the key in the map. This expression works the same way as args0.get(&quot;key&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>.name</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>The index of the parameter. The value 0 indicates the first parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>This parameter is not returned for Dubbo services.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><strong>rawvalue</strong>: direct comparison.</li>
         * <li><strong>list</strong>: whitelist.</li>
         * <li><strong>mod</strong>: mods 100.</li>
         * <li><strong>deterministic_proportional_steaming_division</strong>: percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>This parameter is not returned for Dubbo services.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the parameter. This value is compared with the value that is obtained based on the <strong>expr</strong> and <strong>index</strong> parameters.</p>
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
         * <p>The relationship between the conditions in the canary release rule. Valid values:</p>
         * <ul>
         * <li><strong>AND</strong>: The conditions are in the logical AND relation. All conditions must be met at the same time.</li>
         * <li><strong>OR</strong>: The conditions are in the logical OR relation. At least one of the conditions must be met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The group of the Dubbo service that corresponds to the canary release rule.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The conditions.</p>
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
         * <p>The comparison operator. Valid values: <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>! =</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>==</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>This parameter is not returned for Spring Cloud applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>This parameter is not returned for Spring Cloud applications.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><strong>rawvalue</strong>: direct comparison.</li>
         * <li><strong>list</strong>: whitelist.</li>
         * <li><strong>mod</strong>: mods 100.</li>
         * <li><strong>deterministic_proportional_steaming_division</strong>: percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rawvalue</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The type of the comparison. Valid values:</p>
         * <ul>
         * <li><strong>param</strong>: parameter</li>
         * <li><strong>cookie</strong>: cookie</li>
         * <li><strong>header</strong>: header</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookie</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the parameter. This value is compared with the value that is obtained based on the <strong>type</strong> and <strong>name</strong> parameters.</p>
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
         * <p>The relationship between the conditions in the canary release rule. Valid values:</p>
         * <ul>
         * <li><strong>AND</strong>: The conditions are in the logical AND relation. All conditions must be met at the same time.</li>
         * <li><strong>OR</strong>: The conditions are in the logical OR relation. At least one of the conditions must be met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The conditions.</p>
         */
        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRulesItems> items;

        /**
         * <p>The path of the canary release rule of the Spring Cloud application.</p>
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
        @NameInMap("AlbRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRules> albRules;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>3faaf993-7aed-4bcd-b189-625e6a5a****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The timestamp when the canary release rule was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1619007592013</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the canary release rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The canary release rule of the Dubbo service.</p>
         */
        @NameInMap("DubboRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRules> dubboRules;

        /**
         * <p>The ID of the canary release rule. The ID is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        /**
         * <p>The name of the canary release rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The canary release rule of the Spring Cloud application.</p>
         */
        @NameInMap("ScRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRules> scRules;

        /**
         * <p>The timestamp when the canary release rule was updated. Unit: milliseconds.</p>
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
