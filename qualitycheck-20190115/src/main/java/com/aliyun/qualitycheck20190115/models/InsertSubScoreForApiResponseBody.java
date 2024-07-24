// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertSubScoreForApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InsertSubScoreForApiResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D34079C5-AA2F-490E-ADD8-5BFF08AAE207</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InsertSubScoreForApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertSubScoreForApiResponseBody self = new InsertSubScoreForApiResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertSubScoreForApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertSubScoreForApiResponseBody setData(InsertSubScoreForApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertSubScoreForApiResponseBodyData getData() {
        return this.data;
    }

    public InsertSubScoreForApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertSubScoreForApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertSubScoreForApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InsertSubScoreForApiResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5730</p>
         */
        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        @NameInMap("ScoreSubName")
        public String scoreSubName;

        public static InsertSubScoreForApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertSubScoreForApiResponseBodyData self = new InsertSubScoreForApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertSubScoreForApiResponseBodyData setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        public InsertSubScoreForApiResponseBodyData setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

    }

}
