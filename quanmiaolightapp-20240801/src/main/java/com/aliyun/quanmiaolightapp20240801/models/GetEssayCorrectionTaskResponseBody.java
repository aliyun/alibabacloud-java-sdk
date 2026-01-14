// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetEssayCorrectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEssayCorrectionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetEssayCorrectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEssayCorrectionTaskResponseBody self = new GetEssayCorrectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEssayCorrectionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEssayCorrectionTaskResponseBody setData(GetEssayCorrectionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEssayCorrectionTaskResponseBodyData getData() {
        return this.data;
    }

    public GetEssayCorrectionTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEssayCorrectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEssayCorrectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEssayCorrectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEssayCorrectionTaskResponseBodyDataResults extends TeaModel {
        /**
         * <p>xxx</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("customId")
        public String customId;

        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("score")
        public Integer score;

        @NameInMap("usage")
        public ModelUsage usage;

        public static GetEssayCorrectionTaskResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            GetEssayCorrectionTaskResponseBodyDataResults self = new GetEssayCorrectionTaskResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setCustomId(String customId) {
            this.customId = customId;
            return this;
        }
        public String getCustomId() {
            return this.customId;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setUsage(ModelUsage usage) {
            this.usage = usage;
            return this;
        }
        public ModelUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetEssayCorrectionTaskResponseBodyData extends TeaModel {
        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("results")
        public java.util.List<GetEssayCorrectionTaskResponseBodyDataResults> results;

        /**
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("totalUsage")
        public ModelUsage totalUsage;

        public static GetEssayCorrectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEssayCorrectionTaskResponseBodyData self = new GetEssayCorrectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEssayCorrectionTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetEssayCorrectionTaskResponseBodyData setResults(java.util.List<GetEssayCorrectionTaskResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetEssayCorrectionTaskResponseBodyDataResults> getResults() {
            return this.results;
        }

        public GetEssayCorrectionTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEssayCorrectionTaskResponseBodyData setTotalUsage(ModelUsage totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public ModelUsage getTotalUsage() {
            return this.totalUsage;
        }

    }

}
