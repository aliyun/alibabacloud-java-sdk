// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddGWApiGroupAuthUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddGWApiGroupAuthUserResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddGWApiGroupAuthUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGWApiGroupAuthUserResponseBody self = new AddGWApiGroupAuthUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGWApiGroupAuthUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGWApiGroupAuthUserResponseBody setData(AddGWApiGroupAuthUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddGWApiGroupAuthUserResponseBodyData getData() {
        return this.data;
    }

    public AddGWApiGroupAuthUserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddGWApiGroupAuthUserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddGWApiGroupAuthUserResponseBodyDataResults extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public String id;

        public static AddGWApiGroupAuthUserResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            AddGWApiGroupAuthUserResponseBodyDataResults self = new AddGWApiGroupAuthUserResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public AddGWApiGroupAuthUserResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddGWApiGroupAuthUserResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddGWApiGroupAuthUserResponseBodyDataResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddGWApiGroupAuthUserResponseBodyDataResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class AddGWApiGroupAuthUserResponseBodyData extends TeaModel {
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Results")
        public java.util.List<AddGWApiGroupAuthUserResponseBodyDataResults> results;

        public static AddGWApiGroupAuthUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddGWApiGroupAuthUserResponseBodyData self = new AddGWApiGroupAuthUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddGWApiGroupAuthUserResponseBodyData setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public AddGWApiGroupAuthUserResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public AddGWApiGroupAuthUserResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public AddGWApiGroupAuthUserResponseBodyData setResults(java.util.List<AddGWApiGroupAuthUserResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<AddGWApiGroupAuthUserResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
