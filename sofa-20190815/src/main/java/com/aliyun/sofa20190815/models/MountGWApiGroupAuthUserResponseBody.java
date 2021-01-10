// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountGWApiGroupAuthUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public MountGWApiGroupAuthUserResponseBodyData data;

    public static MountGWApiGroupAuthUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MountGWApiGroupAuthUserResponseBody self = new MountGWApiGroupAuthUserResponseBody();
        return TeaModel.build(map, self);
    }

    public MountGWApiGroupAuthUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MountGWApiGroupAuthUserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MountGWApiGroupAuthUserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public MountGWApiGroupAuthUserResponseBody setData(MountGWApiGroupAuthUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MountGWApiGroupAuthUserResponseBodyData getData() {
        return this.data;
    }

    public static class MountGWApiGroupAuthUserResponseBodyDataResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Id")
        public String id;

        @NameInMap("Success")
        public Boolean success;

        public static MountGWApiGroupAuthUserResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            MountGWApiGroupAuthUserResponseBodyDataResults self = new MountGWApiGroupAuthUserResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public MountGWApiGroupAuthUserResponseBodyDataResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MountGWApiGroupAuthUserResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public MountGWApiGroupAuthUserResponseBodyDataResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public MountGWApiGroupAuthUserResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class MountGWApiGroupAuthUserResponseBodyData extends TeaModel {
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Results")
        public java.util.List<MountGWApiGroupAuthUserResponseBodyDataResults> results;

        public static MountGWApiGroupAuthUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MountGWApiGroupAuthUserResponseBodyData self = new MountGWApiGroupAuthUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MountGWApiGroupAuthUserResponseBodyData setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public MountGWApiGroupAuthUserResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public MountGWApiGroupAuthUserResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public MountGWApiGroupAuthUserResponseBodyData setResults(java.util.List<MountGWApiGroupAuthUserResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<MountGWApiGroupAuthUserResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
