// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertScoreForApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InsertScoreForApiResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>96138D8D-8D26-4E41-BFF4-77AED1088BBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InsertScoreForApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertScoreForApiResponseBody self = new InsertScoreForApiResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertScoreForApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertScoreForApiResponseBody setData(InsertScoreForApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertScoreForApiResponseBodyData getData() {
        return this.data;
    }

    public InsertScoreForApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertScoreForApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertScoreForApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InsertScoreForApiResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5728</p>
         */
        @NameInMap("ScoreId")
        public Long scoreId;

        @NameInMap("ScoreName")
        public String scoreName;

        public static InsertScoreForApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertScoreForApiResponseBodyData self = new InsertScoreForApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertScoreForApiResponseBodyData setScoreId(Long scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Long getScoreId() {
            return this.scoreId;
        }

        public InsertScoreForApiResponseBodyData setScoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }
        public String getScoreName() {
            return this.scoreName;
        }

    }

}
