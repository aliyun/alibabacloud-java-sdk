// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateGWAppAuthApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public UpdateGWAppAuthApiResponseBodyData data;

    public static UpdateGWAppAuthApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGWAppAuthApiResponseBody self = new UpdateGWAppAuthApiResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGWAppAuthApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGWAppAuthApiResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateGWAppAuthApiResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateGWAppAuthApiResponseBody setData(UpdateGWAppAuthApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGWAppAuthApiResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateGWAppAuthApiResponseBodyDataResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Id")
        public String id;

        @NameInMap("Success")
        public Boolean success;

        public static UpdateGWAppAuthApiResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateGWAppAuthApiResponseBodyDataResults self = new UpdateGWAppAuthApiResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public UpdateGWAppAuthApiResponseBodyDataResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateGWAppAuthApiResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateGWAppAuthApiResponseBodyDataResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateGWAppAuthApiResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateGWAppAuthApiResponseBodyData extends TeaModel {
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Results")
        public java.util.List<UpdateGWAppAuthApiResponseBodyDataResults> results;

        public static UpdateGWAppAuthApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGWAppAuthApiResponseBodyData self = new UpdateGWAppAuthApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGWAppAuthApiResponseBodyData setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public UpdateGWAppAuthApiResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public UpdateGWAppAuthApiResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public UpdateGWAppAuthApiResponseBodyData setResults(java.util.List<UpdateGWAppAuthApiResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<UpdateGWAppAuthApiResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
