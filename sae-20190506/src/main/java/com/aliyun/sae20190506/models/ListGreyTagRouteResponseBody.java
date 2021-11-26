// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListGreyTagRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListGreyTagRouteResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public static class ListGreyTagRouteResponseBodyDataResultDubboRulesItems extends TeaModel {
        @NameInMap("cond")
        public String cond;

        @NameInMap("expr")
        public String expr;

        @NameInMap("index")
        public Integer index;

        // abandon
        @NameInMap("name")
        public String name;

        @NameInMap("operator")
        public String operator;

        // abandon
        @NameInMap("type")
        public String type;

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
        @NameInMap("condition")
        public String condition;

        @NameInMap("group")
        public String group;

        @NameInMap("items")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRulesItems> items;

        @NameInMap("methodName")
        public String methodName;

        @NameInMap("serviceName")
        public String serviceName;

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
        @NameInMap("cond")
        public String cond;

        @NameInMap("expr")
        public String expr;

        // abandon
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
        @NameInMap("condition")
        public String condition;

        @NameInMap("items")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRulesItems> items;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DubboRules")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultDubboRules> dubboRules;

        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScRules")
        public java.util.List<ListGreyTagRouteResponseBodyDataResultScRules> scRules;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListGreyTagRouteResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGreyTagRouteResponseBodyDataResult self = new ListGreyTagRouteResponseBodyDataResult();
            return TeaModel.build(map, self);
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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListGreyTagRouteResponseBodyDataResult> result;

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
