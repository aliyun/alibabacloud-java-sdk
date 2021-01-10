// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertSubScoreForApiResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public InsertSubScoreForApiResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static InsertSubScoreForApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertSubScoreForApiResponseBody self = new InsertSubScoreForApiResponseBody();
        return TeaModel.build(map, self);
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

    public InsertSubScoreForApiResponseBody setData(InsertSubScoreForApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertSubScoreForApiResponseBodyData getData() {
        return this.data;
    }

    public InsertSubScoreForApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertSubScoreForApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InsertSubScoreForApiResponseBodyData extends TeaModel {
        @NameInMap("ScoreSubName")
        public String scoreSubName;

        @NameInMap("ScoreSubId")
        public Long scoreSubId;

        public static InsertSubScoreForApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertSubScoreForApiResponseBodyData self = new InsertSubScoreForApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertSubScoreForApiResponseBodyData setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public InsertSubScoreForApiResponseBodyData setScoreSubId(Long scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

    }

}
