// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshTopappservicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshTopappservicesResponseBodyResponse response;

    public static QueryRmsCloudmeshTopappservicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshTopappservicesResponseBody self = new QueryRmsCloudmeshTopappservicesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshTopappservicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshTopappservicesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshTopappservicesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshTopappservicesResponseBody setResponse(QueryRmsCloudmeshTopappservicesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshTopappservicesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas extends TeaModel {
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

        public static QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas self = new QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setAppInstanceService(String appInstanceService) {
            this.appInstanceService = appInstanceService;
            return this;
        }
        public String getAppInstanceService() {
            return this.appInstanceService;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setAppInstanceServiceId(String appInstanceServiceId) {
            this.appInstanceServiceId = appInstanceServiceId;
            return this;
        }
        public String getAppInstanceServiceId() {
            return this.appInstanceServiceId;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setCopiesNum(String copiesNum) {
            this.copiesNum = copiesNum;
            return this;
        }
        public String getCopiesNum() {
            return this.copiesNum;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setErrorRate(String errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public String getErrorRate() {
            return this.errorRate;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setFlowIn(String flowIn) {
            this.flowIn = flowIn;
            return this;
        }
        public String getFlowIn() {
            return this.flowIn;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setFlowOut(String flowOut) {
            this.flowOut = flowOut;
            return this;
        }
        public String getFlowOut() {
            return this.flowOut;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setReporter(String reporter) {
            this.reporter = reporter;
            return this;
        }
        public String getReporter() {
            return this.reporter;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setRqs(String rqs) {
            this.rqs = rqs;
            return this;
        }
        public String getRqs() {
            return this.rqs;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas setTimeNoSec(String timeNoSec) {
            this.timeNoSec = timeNoSec;
            return this;
        }
        public String getTimeNoSec() {
            return this.timeNoSec;
        }

    }

    public static class QueryRmsCloudmeshTopappservicesResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Datas")
        public java.util.List<QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas> datas;

        public static QueryRmsCloudmeshTopappservicesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshTopappservicesResponseBodyResponse self = new QueryRmsCloudmeshTopappservicesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshTopappservicesResponseBodyResponse setDatas(java.util.List<QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshTopappservicesResponseBodyResponseDatas> getDatas() {
            return this.datas;
        }

    }

}
