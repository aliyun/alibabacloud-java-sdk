// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryBuildBreakpointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryBuildBreakpointResponseBodyData data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBuildBreakpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildBreakpointResponseBody self = new QueryBuildBreakpointResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBuildBreakpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBuildBreakpointResponseBody setData(QueryBuildBreakpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBuildBreakpointResponseBodyData getData() {
        return this.data;
    }

    public QueryBuildBreakpointResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public QueryBuildBreakpointResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryBuildBreakpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBuildBreakpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBuildBreakpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBuildBreakpointResponseBodyDataBreakpoints extends TeaModel {
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("JobId")
        public String jobId;

        public static QueryBuildBreakpointResponseBodyDataBreakpoints build(java.util.Map<String, ?> map) throws Exception {
            QueryBuildBreakpointResponseBodyDataBreakpoints self = new QueryBuildBreakpointResponseBodyDataBreakpoints();
            return TeaModel.build(map, self);
        }

        public QueryBuildBreakpointResponseBodyDataBreakpoints setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public QueryBuildBreakpointResponseBodyDataBreakpoints setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class QueryBuildBreakpointResponseBodyData extends TeaModel {
        @NameInMap("Breakpoints")
        public java.util.List<QueryBuildBreakpointResponseBodyDataBreakpoints> breakpoints;

        @NameInMap("ProjectId")
        public String projectId;

        public static QueryBuildBreakpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBuildBreakpointResponseBodyData self = new QueryBuildBreakpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBuildBreakpointResponseBodyData setBreakpoints(java.util.List<QueryBuildBreakpointResponseBodyDataBreakpoints> breakpoints) {
            this.breakpoints = breakpoints;
            return this;
        }
        public java.util.List<QueryBuildBreakpointResponseBodyDataBreakpoints> getBreakpoints() {
            return this.breakpoints;
        }

        public QueryBuildBreakpointResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
