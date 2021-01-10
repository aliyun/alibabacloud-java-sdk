// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteGWApiGroupAuthUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteGWApiGroupAuthUserResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteGWApiGroupAuthUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWApiGroupAuthUserResponseBody self = new DeleteGWApiGroupAuthUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGWApiGroupAuthUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGWApiGroupAuthUserResponseBody setData(DeleteGWApiGroupAuthUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteGWApiGroupAuthUserResponseBodyData getData() {
        return this.data;
    }

    public DeleteGWApiGroupAuthUserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteGWApiGroupAuthUserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteGWApiGroupAuthUserResponseBodyDataResults extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public String id;

        public static DeleteGWApiGroupAuthUserResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteGWApiGroupAuthUserResponseBodyDataResults self = new DeleteGWApiGroupAuthUserResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public DeleteGWApiGroupAuthUserResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteGWApiGroupAuthUserResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteGWApiGroupAuthUserResponseBodyDataResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteGWApiGroupAuthUserResponseBodyDataResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DeleteGWApiGroupAuthUserResponseBodyData extends TeaModel {
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Results")
        public java.util.List<DeleteGWApiGroupAuthUserResponseBodyDataResults> results;

        public static DeleteGWApiGroupAuthUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteGWApiGroupAuthUserResponseBodyData self = new DeleteGWApiGroupAuthUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteGWApiGroupAuthUserResponseBodyData setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public DeleteGWApiGroupAuthUserResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public DeleteGWApiGroupAuthUserResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DeleteGWApiGroupAuthUserResponseBodyData setResults(java.util.List<DeleteGWApiGroupAuthUserResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DeleteGWApiGroupAuthUserResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
