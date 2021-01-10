// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeLinktRiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CountLinkeLinktRiskResponseBodyData data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CountLinkeLinktRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeLinktRiskResponseBody self = new CountLinkeLinktRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public CountLinkeLinktRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountLinkeLinktRiskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CountLinkeLinktRiskResponseBody setData(CountLinkeLinktRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CountLinkeLinktRiskResponseBodyData getData() {
        return this.data;
    }

    public CountLinkeLinktRiskResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CountLinkeLinktRiskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CountLinkeLinktRiskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CountLinkeLinktRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CountLinkeLinktRiskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CountLinkeLinktRiskResponseBodyData extends TeaModel {
        @NameInMap("UnFinished")
        public Long unFinished;

        @NameInMap("Total")
        public Long total;

        public static CountLinkeLinktRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CountLinkeLinktRiskResponseBodyData self = new CountLinkeLinktRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CountLinkeLinktRiskResponseBodyData setUnFinished(Long unFinished) {
            this.unFinished = unFinished;
            return this;
        }
        public Long getUnFinished() {
            return this.unFinished;
        }

        public CountLinkeLinktRiskResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
