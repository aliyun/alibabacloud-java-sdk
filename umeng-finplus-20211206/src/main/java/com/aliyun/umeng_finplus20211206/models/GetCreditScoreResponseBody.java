// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211206.models;

import com.aliyun.tea.*;

public class GetCreditScoreResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("response")
    public GetCreditScoreResponseBodyResponse response;

    @NameInMap("success")
    public Boolean success;

    public static GetCreditScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreditScoreResponseBody self = new GetCreditScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreditScoreResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCreditScoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCreditScoreResponseBody setResponse(GetCreditScoreResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public GetCreditScoreResponseBodyResponse getResponse() {
        return this.response;
    }

    public GetCreditScoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCreditScoreResponseBodyResponse extends TeaModel {
        @NameInMap("bizId")
        public String bizId;

        @NameInMap("reqId")
        public String reqId;

        @NameInMap("tags")
        public java.util.Map<String, ?> tags;

        public static GetCreditScoreResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            GetCreditScoreResponseBodyResponse self = new GetCreditScoreResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public GetCreditScoreResponseBodyResponse setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetCreditScoreResponseBodyResponse setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public GetCreditScoreResponseBodyResponse setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

}
