// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class BatchAddFeishuUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Result")
    public BatchAddFeishuUsersResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchAddFeishuUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFeishuUsersResponseBody self = new BatchAddFeishuUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAddFeishuUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchAddFeishuUsersResponseBody setResult(BatchAddFeishuUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public BatchAddFeishuUsersResponseBodyResult getResult() {
        return this.result;
    }

    public BatchAddFeishuUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ACCOUNT_EXIST</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("CodeDesc")
        public String codeDesc;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Input")
        public String input;

        public static BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos self = new BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos();
            return TeaModel.build(map, self);
        }

        public BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos setCodeDesc(String codeDesc) {
            this.codeDesc = codeDesc;
            return this;
        }
        public String getCodeDesc() {
            return this.codeDesc;
        }

        public BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

    }

    public static class BatchAddFeishuUsersResponseBodyResultFailResults extends TeaModel {
        @NameInMap("FailInfos")
        public java.util.List<BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos> failInfos;

        public static BatchAddFeishuUsersResponseBodyResultFailResults build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFeishuUsersResponseBodyResultFailResults self = new BatchAddFeishuUsersResponseBodyResultFailResults();
            return TeaModel.build(map, self);
        }

        public BatchAddFeishuUsersResponseBodyResultFailResults setFailInfos(java.util.List<BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos> failInfos) {
            this.failInfos = failInfos;
            return this;
        }
        public java.util.List<BatchAddFeishuUsersResponseBodyResultFailResultsFailInfos> getFailInfos() {
            return this.failInfos;
        }

    }

    public static class BatchAddFeishuUsersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("FailResults")
        public java.util.List<BatchAddFeishuUsersResponseBodyResultFailResults> failResults;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OkCount")
        public Integer okCount;

        public static BatchAddFeishuUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BatchAddFeishuUsersResponseBodyResult self = new BatchAddFeishuUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BatchAddFeishuUsersResponseBodyResult setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public BatchAddFeishuUsersResponseBodyResult setFailResults(java.util.List<BatchAddFeishuUsersResponseBodyResultFailResults> failResults) {
            this.failResults = failResults;
            return this;
        }
        public java.util.List<BatchAddFeishuUsersResponseBodyResultFailResults> getFailResults() {
            return this.failResults;
        }

        public BatchAddFeishuUsersResponseBodyResult setOkCount(Integer okCount) {
            this.okCount = okCount;
            return this;
        }
        public Integer getOkCount() {
            return this.okCount;
        }

    }

}
