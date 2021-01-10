// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListRmsCloudmeshAppservicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public ListRmsCloudmeshAppservicesResponseBodyResponse response;

    public static ListRmsCloudmeshAppservicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRmsCloudmeshAppservicesResponseBody self = new ListRmsCloudmeshAppservicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRmsCloudmeshAppservicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRmsCloudmeshAppservicesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRmsCloudmeshAppservicesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListRmsCloudmeshAppservicesResponseBody setResponse(ListRmsCloudmeshAppservicesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public ListRmsCloudmeshAppservicesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class ListRmsCloudmeshAppservicesResponseBodyResponseResultData extends TeaModel {
        @NameInMap("AppInstanceService")
        public String appInstanceService;

        @NameInMap("AppInstanceServiceId")
        public String appInstanceServiceId;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CopiesNum")
        public String copiesNum;

        @NameInMap("CostTime")
        public String costTime;

        @NameInMap("ErrorDetail")
        public String errorDetail;

        @NameInMap("ErrorRate")
        public String errorRate;

        @NameInMap("FlowIn")
        public String flowIn;

        @NameInMap("FlowOut")
        public String flowOut;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Reporter")
        public String reporter;

        @NameInMap("Rqs")
        public String rqs;

        @NameInMap("TimeNoSec")
        public String timeNoSec;

        public static ListRmsCloudmeshAppservicesResponseBodyResponseResultData build(java.util.Map<String, ?> map) throws Exception {
            ListRmsCloudmeshAppservicesResponseBodyResponseResultData self = new ListRmsCloudmeshAppservicesResponseBodyResponseResultData();
            return TeaModel.build(map, self);
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setAppInstanceService(String appInstanceService) {
            this.appInstanceService = appInstanceService;
            return this;
        }
        public String getAppInstanceService() {
            return this.appInstanceService;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setAppInstanceServiceId(String appInstanceServiceId) {
            this.appInstanceServiceId = appInstanceServiceId;
            return this;
        }
        public String getAppInstanceServiceId() {
            return this.appInstanceServiceId;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setCopiesNum(String copiesNum) {
            this.copiesNum = copiesNum;
            return this;
        }
        public String getCopiesNum() {
            return this.copiesNum;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setErrorRate(String errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public String getErrorRate() {
            return this.errorRate;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setFlowIn(String flowIn) {
            this.flowIn = flowIn;
            return this;
        }
        public String getFlowIn() {
            return this.flowIn;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setFlowOut(String flowOut) {
            this.flowOut = flowOut;
            return this;
        }
        public String getFlowOut() {
            return this.flowOut;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setReporter(String reporter) {
            this.reporter = reporter;
            return this;
        }
        public String getReporter() {
            return this.reporter;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setRqs(String rqs) {
            this.rqs = rqs;
            return this;
        }
        public String getRqs() {
            return this.rqs;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResultData setTimeNoSec(String timeNoSec) {
            this.timeNoSec = timeNoSec;
            return this;
        }
        public String getTimeNoSec() {
            return this.timeNoSec;
        }

    }

    public static class ListRmsCloudmeshAppservicesResponseBodyResponseResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("Data")
        public java.util.List<ListRmsCloudmeshAppservicesResponseBodyResponseResultData> data;

        public static ListRmsCloudmeshAppservicesResponseBodyResponseResult build(java.util.Map<String, ?> map) throws Exception {
            ListRmsCloudmeshAppservicesResponseBodyResponseResult self = new ListRmsCloudmeshAppservicesResponseBodyResponseResult();
            return TeaModel.build(map, self);
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResult setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResult setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponseResult setData(java.util.List<ListRmsCloudmeshAppservicesResponseBodyResponseResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRmsCloudmeshAppservicesResponseBodyResponseResultData> getData() {
            return this.data;
        }

    }

    public static class ListRmsCloudmeshAppservicesResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Result")
        public ListRmsCloudmeshAppservicesResponseBodyResponseResult result;

        public static ListRmsCloudmeshAppservicesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            ListRmsCloudmeshAppservicesResponseBodyResponse self = new ListRmsCloudmeshAppservicesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListRmsCloudmeshAppservicesResponseBodyResponse setResult(ListRmsCloudmeshAppservicesResponseBodyResponseResult result) {
            this.result = result;
            return this;
        }
        public ListRmsCloudmeshAppservicesResponseBodyResponseResult getResult() {
            return this.result;
        }

    }

}
