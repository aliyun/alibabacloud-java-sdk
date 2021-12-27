// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211206.models;

import com.aliyun.tea.*;

public class GetMarketScoreResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("response")
    public GetMarketScoreResponseBodyResponse response;

    @NameInMap("success")
    public Boolean success;

    public static GetMarketScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMarketScoreResponseBody self = new GetMarketScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMarketScoreResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetMarketScoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMarketScoreResponseBody setResponse(GetMarketScoreResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public GetMarketScoreResponseBodyResponse getResponse() {
        return this.response;
    }

    public GetMarketScoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMarketScoreResponseBodyResponse extends TeaModel {
        @NameInMap("bizId")
        public String bizId;

        @NameInMap("reqId")
        public String reqId;

        @NameInMap("tags")
        public java.util.Map<String, ?> tags;

        public static GetMarketScoreResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            GetMarketScoreResponseBodyResponse self = new GetMarketScoreResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public GetMarketScoreResponseBodyResponse setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetMarketScoreResponseBodyResponse setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public GetMarketScoreResponseBodyResponse setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

}
