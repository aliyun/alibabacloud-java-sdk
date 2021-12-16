// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryHotlineDashboardResponseBodyData data;

    // http状态编码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryHotlineDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineDashboardResponseBody self = new QueryHotlineDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotlineDashboardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHotlineDashboardResponseBody setData(QueryHotlineDashboardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryHotlineDashboardResponseBodyData getData() {
        return this.data;
    }

    public QueryHotlineDashboardResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryHotlineDashboardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotlineDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotlineDashboardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryHotlineDashboardResponseBodyDataResults extends TeaModel {
        // 日期
        @NameInMap("DateId")
        public String dateId;

        // 部门标识
        @NameInMap("DepartmentId")
        public Long departmentId;

        // 部门名称
        @NameInMap("DepartmentName")
        public String departmentName;

        // 有效呼入量
        @NameInMap("EffectiveInCalls")
        public Integer effectiveInCalls;

        // 有效呼入小计量
        @NameInMap("EffectiveInServiceNotes")
        public Integer effectiveInServiceNotes;

        // 有效外呼量
        @NameInMap("EffectiveOutCalls")
        public Integer effectiveOutCalls;

        // 有效外呼小计量
        @NameInMap("EffectiveOutServiceNotes")
        public Integer effectiveOutServiceNotes;

        // 坐席标识
        @NameInMap("ServicerId")
        public Long servicerId;

        // 坐席真实姓名
        @NameInMap("ServicerRealName")
        public String servicerRealName;

        // 坐席对外展示名称
        @NameInMap("ServicerShowName")
        public String servicerShowName;

        public static QueryHotlineDashboardResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineDashboardResponseBodyDataResults self = new QueryHotlineDashboardResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public QueryHotlineDashboardResponseBodyDataResults setDateId(String dateId) {
            this.dateId = dateId;
            return this;
        }
        public String getDateId() {
            return this.dateId;
        }

        public QueryHotlineDashboardResponseBodyDataResults setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryHotlineDashboardResponseBodyDataResults setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public QueryHotlineDashboardResponseBodyDataResults setEffectiveInCalls(Integer effectiveInCalls) {
            this.effectiveInCalls = effectiveInCalls;
            return this;
        }
        public Integer getEffectiveInCalls() {
            return this.effectiveInCalls;
        }

        public QueryHotlineDashboardResponseBodyDataResults setEffectiveInServiceNotes(Integer effectiveInServiceNotes) {
            this.effectiveInServiceNotes = effectiveInServiceNotes;
            return this;
        }
        public Integer getEffectiveInServiceNotes() {
            return this.effectiveInServiceNotes;
        }

        public QueryHotlineDashboardResponseBodyDataResults setEffectiveOutCalls(Integer effectiveOutCalls) {
            this.effectiveOutCalls = effectiveOutCalls;
            return this;
        }
        public Integer getEffectiveOutCalls() {
            return this.effectiveOutCalls;
        }

        public QueryHotlineDashboardResponseBodyDataResults setEffectiveOutServiceNotes(Integer effectiveOutServiceNotes) {
            this.effectiveOutServiceNotes = effectiveOutServiceNotes;
            return this;
        }
        public Integer getEffectiveOutServiceNotes() {
            return this.effectiveOutServiceNotes;
        }

        public QueryHotlineDashboardResponseBodyDataResults setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public QueryHotlineDashboardResponseBodyDataResults setServicerRealName(String servicerRealName) {
            this.servicerRealName = servicerRealName;
            return this;
        }
        public String getServicerRealName() {
            return this.servicerRealName;
        }

        public QueryHotlineDashboardResponseBodyDataResults setServicerShowName(String servicerShowName) {
            this.servicerShowName = servicerShowName;
            return this;
        }
        public String getServicerShowName() {
            return this.servicerShowName;
        }

    }

    public static class QueryHotlineDashboardResponseBodyData extends TeaModel {
        @NameInMap("Results")
        public java.util.List<QueryHotlineDashboardResponseBodyDataResults> results;

        // 查询结果条数
        @NameInMap("Total")
        public Integer total;

        public static QueryHotlineDashboardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineDashboardResponseBodyData self = new QueryHotlineDashboardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryHotlineDashboardResponseBodyData setResults(java.util.List<QueryHotlineDashboardResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<QueryHotlineDashboardResponseBodyDataResults> getResults() {
            return this.results;
        }

        public QueryHotlineDashboardResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
