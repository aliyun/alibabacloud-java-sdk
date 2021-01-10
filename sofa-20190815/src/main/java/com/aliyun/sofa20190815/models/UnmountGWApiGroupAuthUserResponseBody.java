// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UnmountGWApiGroupAuthUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public UnmountGWApiGroupAuthUserResponseBodyData data;

    public static UnmountGWApiGroupAuthUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnmountGWApiGroupAuthUserResponseBody self = new UnmountGWApiGroupAuthUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UnmountGWApiGroupAuthUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnmountGWApiGroupAuthUserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnmountGWApiGroupAuthUserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UnmountGWApiGroupAuthUserResponseBody setData(UnmountGWApiGroupAuthUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnmountGWApiGroupAuthUserResponseBodyData getData() {
        return this.data;
    }

    public static class UnmountGWApiGroupAuthUserResponseBodyDataResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Id")
        public String id;

        @NameInMap("Success")
        public Boolean success;

        public static UnmountGWApiGroupAuthUserResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            UnmountGWApiGroupAuthUserResponseBodyDataResults self = new UnmountGWApiGroupAuthUserResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public UnmountGWApiGroupAuthUserResponseBodyDataResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UnmountGWApiGroupAuthUserResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UnmountGWApiGroupAuthUserResponseBodyDataResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UnmountGWApiGroupAuthUserResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UnmountGWApiGroupAuthUserResponseBodyData extends TeaModel {
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Results")
        public java.util.List<UnmountGWApiGroupAuthUserResponseBodyDataResults> results;

        public static UnmountGWApiGroupAuthUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnmountGWApiGroupAuthUserResponseBodyData self = new UnmountGWApiGroupAuthUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnmountGWApiGroupAuthUserResponseBodyData setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public UnmountGWApiGroupAuthUserResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public UnmountGWApiGroupAuthUserResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public UnmountGWApiGroupAuthUserResponseBodyData setResults(java.util.List<UnmountGWApiGroupAuthUserResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<UnmountGWApiGroupAuthUserResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
