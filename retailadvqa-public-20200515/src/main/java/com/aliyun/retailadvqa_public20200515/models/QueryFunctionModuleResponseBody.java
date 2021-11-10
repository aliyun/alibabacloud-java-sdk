// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class QueryFunctionModuleResponseBody extends TeaModel {
    // 结果
    @NameInMap("Data")
    public QueryFunctionModuleResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // exStack
    @NameInMap("ExStack")
    public String exStack;

    @NameInMap("RequestId")
    public String requestId;

    // 接口调用状态
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    public static QueryFunctionModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFunctionModuleResponseBody self = new QueryFunctionModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFunctionModuleResponseBody setData(QueryFunctionModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFunctionModuleResponseBodyData getData() {
        return this.data;
    }

    public QueryFunctionModuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryFunctionModuleResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public QueryFunctionModuleResponseBody setExStack(String exStack) {
        this.exStack = exStack;
        return this;
    }
    public String getExStack() {
        return this.exStack;
    }

    public QueryFunctionModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFunctionModuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFunctionModuleResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryFunctionModuleResponseBodyDataFunctionModuleList extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        public static QueryFunctionModuleResponseBodyDataFunctionModuleList build(java.util.Map<String, ?> map) throws Exception {
            QueryFunctionModuleResponseBodyDataFunctionModuleList self = new QueryFunctionModuleResponseBodyDataFunctionModuleList();
            return TeaModel.build(map, self);
        }

        public QueryFunctionModuleResponseBodyDataFunctionModuleList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public QueryFunctionModuleResponseBodyDataFunctionModuleList setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class QueryFunctionModuleResponseBodyData extends TeaModel {
        // 过期时间
        @NameInMap("ExpiredDate")
        public String expiredDate;

        // 功能包列表
        @NameInMap("FunctionModuleList")
        public java.util.List<QueryFunctionModuleResponseBodyDataFunctionModuleList> functionModuleList;

        // 组织ID
        @NameInMap("OrganizationId")
        public String organizationId;

        public static QueryFunctionModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFunctionModuleResponseBodyData self = new QueryFunctionModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFunctionModuleResponseBodyData setExpiredDate(String expiredDate) {
            this.expiredDate = expiredDate;
            return this;
        }
        public String getExpiredDate() {
            return this.expiredDate;
        }

        public QueryFunctionModuleResponseBodyData setFunctionModuleList(java.util.List<QueryFunctionModuleResponseBodyDataFunctionModuleList> functionModuleList) {
            this.functionModuleList = functionModuleList;
            return this;
        }
        public java.util.List<QueryFunctionModuleResponseBodyDataFunctionModuleList> getFunctionModuleList() {
            return this.functionModuleList;
        }

        public QueryFunctionModuleResponseBodyData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
