// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeGreyTagRouteResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>- **2xx**: The call was successful.</p>
     * <p>- **3xx**: The call was redirected.</p>
     * <p>- **4xx**: The call failed.</p>
     * <p>- **5xx**: A server error occurred.</p>
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
     * <br>
     * <p>- If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>- If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information of the change order was queried. Valid values:</p>
     * <br>
     * <p>- **true**: The information was queried.</p>
     * <p>- **false**: The information failed to be queried.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
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
        @NameInMap("cond")
        public String cond;

        @NameInMap("expr")
        public String expr;

        @NameInMap("index")
        public Integer index;

        @NameInMap("name")
        public String name;

        @NameInMap("operator")
        public String operator;

        @NameInMap("type")
        public String type;

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
        @NameInMap("condition")
        public String condition;

        @NameInMap("ingressId")
        public String ingressId;

        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataAlbRulesItems> items;

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
         * <p>The comparison operator. Valid values: **>**, **<**, **>=**, **<=**, **==**, and **! =**.</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The expression that is used to obtain the value of the parameter. Valid values:</p>
         * <br>
         * <p>- **Empty**: obtains the value of the parameter.</p>
         * <p>- **.name**: obtains the name property of the parameter. This expression works the same way as args0.getName().</p>
         * <p>- **.isEnabled()**: obtains the enabled property of the parameter. This expression works the same way as args0.isEnabled().</p>
         * <p>- **[0]**: indicates that the value of the parameter is an array and obtains the first value of the array. This expression works the same way as args0[0]. This expression does not start with a period (.).</p>
         * <p>- **.get(0)**: indicates that the value of the parameter is a list and obtains the first value of the list. This expression works the same way as args0.get(0).</p>
         * <p>- **.get("key")**: indicates that the value of the parameter is a map and obtains the value of the key in the map. This expression works the same way as args0.get("key").</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>The index of the parameter. The value 0 indicates the first parameter.</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>This parameter is not returned for Dubbo services.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Valid values:</p>
         * <br>
         * <p>- **rawvalue**: direct comparison.</p>
         * <p>- **list**: whitelist.</p>
         * <p>- **mod**: mods 100.</p>
         * <p>- **deterministic_proportional_steaming_division**: percentage.</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>This parameter is not returned for Dubbo services.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the parameter. This value is compared with the value that is obtained based on the **expr** and **index** parameters.</p>
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
         * <br>
         * <p>- **AND**: The conditions are in the logical AND relation. All conditions must be met at the same time.</p>
         * <p>- **OR**: The conditions are in the logical OR relation. At least one of the conditions must be met.</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The group of the Dubbo service that corresponds to the canary release rule.</p>
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
         */
        @NameInMap("methodName")
        public String methodName;

        /**
         * <p>The name of the Dubbo service.</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The version of the Dubbo service.</p>
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
         * <p>The comparison operator. Valid values: **>**, **<**, **>=**, **<=**, **==**, and **! =**.</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>This parameter is not returned for Spring Cloud applications.</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>This parameter is not returned for Spring Cloud applications.</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operator. Valid values:</p>
         * <br>
         * <p>*   **rawvalue**: direct comparison.</p>
         * <p>*   **list**: whitelist.</p>
         * <p>*   **mod**: mods 100.</p>
         * <p>*   **deterministic_proportional_steaming_division**: percentage.</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The type of the comparison. Valid values:</p>
         * <br>
         * <p>*   **param**: parameter</p>
         * <p>*   **cookie**: cookie</p>
         * <p>*   **header**: header</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the parameter. This value is compared with the value that is obtained based on the **type** and **name** parameters.</p>
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
         * <br>
         * <p>*   **AND**: The conditions are in the logical AND relation. All conditions must be met at the same time.</p>
         * <p>*   **OR**: The conditions are in the logical OR relation. At least one of the conditions must be met.</p>
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
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The timestamp when the canary release rule was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the canary release rule.</p>
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
         */
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        /**
         * <p>The name of the canary release rule.</p>
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
