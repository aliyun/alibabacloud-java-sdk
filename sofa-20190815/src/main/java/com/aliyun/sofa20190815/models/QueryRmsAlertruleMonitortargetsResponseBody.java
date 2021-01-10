// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertruleMonitortargetsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAlertruleMonitortargetsResponseBodyResponse response;

    public static QueryRmsAlertruleMonitortargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertruleMonitortargetsResponseBody self = new QueryRmsAlertruleMonitortargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertruleMonitortargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlertruleMonitortargetsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlertruleMonitortargetsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlertruleMonitortargetsResponseBody setResponse(QueryRmsAlertruleMonitortargetsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAlertruleMonitortargetsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAlertruleMonitortargetsResponseBodyResponseData extends TeaModel {
        @NameInMap("MonitorTargetId")
        public String monitorTargetId;

        @NameInMap("MonitorTargetName")
        public String monitorTargetName;

        @NameInMap("MonitorTargetType")
        public String monitorTargetType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryRmsAlertruleMonitortargetsResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertruleMonitortargetsResponseBodyResponseData self = new QueryRmsAlertruleMonitortargetsResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponseData setMonitorTargetId(String monitorTargetId) {
            this.monitorTargetId = monitorTargetId;
            return this;
        }
        public String getMonitorTargetId() {
            return this.monitorTargetId;
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponseData setMonitorTargetName(String monitorTargetName) {
            this.monitorTargetName = monitorTargetName;
            return this;
        }
        public String getMonitorTargetName() {
            return this.monitorTargetName;
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponseData setMonitorTargetType(String monitorTargetType) {
            this.monitorTargetType = monitorTargetType;
            return this;
        }
        public String getMonitorTargetType() {
            return this.monitorTargetType;
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponseData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryRmsAlertruleMonitortargetsResponseBodyResponse extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("Data")
        public java.util.List<QueryRmsAlertruleMonitortargetsResponseBodyResponseData> data;

        public static QueryRmsAlertruleMonitortargetsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlertruleMonitortargetsResponseBodyResponse self = new QueryRmsAlertruleMonitortargetsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponse setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponse setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponse setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public QueryRmsAlertruleMonitortargetsResponseBodyResponse setData(java.util.List<QueryRmsAlertruleMonitortargetsResponseBodyResponseData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsAlertruleMonitortargetsResponseBodyResponseData> getData() {
            return this.data;
        }

    }

}
