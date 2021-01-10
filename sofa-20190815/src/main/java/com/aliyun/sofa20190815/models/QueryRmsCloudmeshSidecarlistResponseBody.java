// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshSidecarlistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshSidecarlistResponseBodyResponse response;

    public static QueryRmsCloudmeshSidecarlistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshSidecarlistResponseBody self = new QueryRmsCloudmeshSidecarlistResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshSidecarlistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshSidecarlistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshSidecarlistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshSidecarlistResponseBody setResponse(QueryRmsCloudmeshSidecarlistResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshSidecarlistResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData extends TeaModel {
        @NameInMap("Agreement")
        public String agreement;

        @NameInMap("AppService")
        public String appService;

        @NameInMap("AppServiceId")
        public String appServiceId;

        @NameInMap("CopiesNum")
        public String copiesNum;

        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("ErrorRate")
        public String errorRate;

        @NameInMap("FlowIn")
        public String flowIn;

        @NameInMap("FlowOut")
        public String flowOut;

        @NameInMap("Men")
        public String men;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("ResponseTime")
        public String responseTime;

        @NameInMap("Rqs")
        public String rqs;

        @NameInMap("SidecarVersion")
        public String sidecarVersion;

        public static QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData self = new QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setAgreement(String agreement) {
            this.agreement = agreement;
            return this;
        }
        public String getAgreement() {
            return this.agreement;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setAppService(String appService) {
            this.appService = appService;
            return this;
        }
        public String getAppService() {
            return this.appService;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setAppServiceId(String appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public String getAppServiceId() {
            return this.appServiceId;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setCopiesNum(String copiesNum) {
            this.copiesNum = copiesNum;
            return this;
        }
        public String getCopiesNum() {
            return this.copiesNum;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setErrorRate(String errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public String getErrorRate() {
            return this.errorRate;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setFlowIn(String flowIn) {
            this.flowIn = flowIn;
            return this;
        }
        public String getFlowIn() {
            return this.flowIn;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setFlowOut(String flowOut) {
            this.flowOut = flowOut;
            return this;
        }
        public String getFlowOut() {
            return this.flowOut;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setMen(String men) {
            this.men = men;
            return this;
        }
        public String getMen() {
            return this.men;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setResponseTime(String responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public String getResponseTime() {
            return this.responseTime;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setRqs(String rqs) {
            this.rqs = rqs;
            return this;
        }
        public String getRqs() {
            return this.rqs;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData setSidecarVersion(String sidecarVersion) {
            this.sidecarVersion = sidecarVersion;
            return this;
        }
        public String getSidecarVersion() {
            return this.sidecarVersion;
        }

    }

    public static class QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("Data")
        public java.util.List<QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData> data;

        public static QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity self = new QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity setData(java.util.List<QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshSidecarlistResponseBodyResponseEntityData> getData() {
            return this.data;
        }

    }

    public static class QueryRmsCloudmeshSidecarlistResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Entity")
        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity entity;

        public static QueryRmsCloudmeshSidecarlistResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSidecarlistResponseBodyResponse self = new QueryRmsCloudmeshSidecarlistResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshSidecarlistResponseBodyResponse setEntity(QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsCloudmeshSidecarlistResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
