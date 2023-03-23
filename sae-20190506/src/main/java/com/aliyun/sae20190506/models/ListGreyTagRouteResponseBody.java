// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListGreyTagRouteResponseBody extends TeaModel {
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
    public ListGreyTagRouteResponseBodyData data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <br>
     * <p>- If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>- If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information. Valid values:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
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
        @NameInMap("condition")
        public String condition;

        @NameInMap("ingressId")
        public String ingressId;

        @NameInMap("items")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRulesItems> items;

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
         * <p>The comparison operator. Valid values: **>**, **<**, **>=**, **<=**, **==**, and **! =**.</p>
         */
        @NameInMap("cond")
        public String cond;

        /**
         * <p>The expression that is used to obtain the value of the parameter. The syntax of the expression must follow the standard of the SpEL. Valid values:</p>
         * <br>
         * <p>- **Empty**: obtains the value of the parameter.</p>
         * <p>- **.name**: obtains the name property of the parameter. This expression works the same way as args0.getName().</p>
         * <p>- **.isEnabled()**: obtains the enabled property of the parameter. This expression works the same way as args0.isEnabled().</p>
         * <p>- **[0]**: indicates that the value of the parameter is an array and obtains the first value of the array. This expression works the same way as args0[0]. This expression does not start with a period (.).</p>
         * <p>- **.get(0)**: indicates that the value of the parameter is a list and obtains the first value of the list. This expression works the same way as args0.get(0).</p>
         * <p>- **.get("key")**: indicates that the value of the parameter is a map and obtains the value of the key in the map. This expression works the same way as args0.get("key").  >  For more information about the expressions that are used to obtain parameter values, see  [Spring Expression Language (SpEL)](https://docs.spring.io/spring-integration/docs/current/reference/html/spel.html).</p>
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
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRulesItems> items;

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
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRulesItems> items;

        /**
         * <p>The path of the canary release rule of the Spring Cloud application.</p>
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
        @NameInMap("AlbRules")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultAlbRules> albRules;

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
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRules> dubboRules;

        /**
         * <p>The ID of the canary release rule.</p>
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
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRules> scRules;

        /**
         * <p>The timestamp when the canary release rule was updated. Unit: milliseconds.</p>
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
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned on each page. Valid value: **1**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGreyTagRouteResponseBodyDataResult> result;

        /**
         * <p>The total number of canary release rules. Valid value: **1**.</p>
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
