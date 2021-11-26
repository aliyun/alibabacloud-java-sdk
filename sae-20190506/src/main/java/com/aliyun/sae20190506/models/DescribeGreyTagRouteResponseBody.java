// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeGreyTagRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeGreyTagRouteResponseBodyData data;

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

    public static class DescribeGreyTagRouteResponseBodyDataDubboRulesItems extends TeaModel {
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
        @NameInMap("condition")
        public String condition;

        @NameInMap("group")
        public String group;

        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRulesItems> items;

        @NameInMap("methodName")
        public String methodName;

        @NameInMap("serviceName")
        public String serviceName;

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
        @NameInMap("cond")
        public String cond;

        // abandon
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
        @NameInMap("condition")
        public String condition;

        @NameInMap("items")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRulesItems> items;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DubboRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataDubboRules> dubboRules;

        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScRules")
        public java.util.List<DescribeGreyTagRouteResponseBodyDataScRules> scRules;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeGreyTagRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGreyTagRouteResponseBodyData self = new DescribeGreyTagRouteResponseBodyData();
            return TeaModel.build(map, self);
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
