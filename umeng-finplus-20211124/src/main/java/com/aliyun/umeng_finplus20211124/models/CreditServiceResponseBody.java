// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211124.models;

import com.aliyun.tea.*;

public class CreditServiceResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public Integer code;

    // message
    @NameInMap("Message")
    public String message;

    // response
    @NameInMap("Response")
    public CreditServiceResponseBodyResponse response;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static CreditServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreditServiceResponseBody self = new CreditServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreditServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreditServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreditServiceResponseBody setResponse(CreditServiceResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public CreditServiceResponseBodyResponse getResponse() {
        return this.response;
    }

    public CreditServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreditServiceResponseBodyResponse extends TeaModel {
        // biz_id
        @NameInMap("BizId")
        public String bizId;

        // req_id
        @NameInMap("ReqId")
        public String reqId;

        // tags
        @NameInMap("Tags")
        public String tags;

        public static CreditServiceResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            CreditServiceResponseBodyResponse self = new CreditServiceResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public CreditServiceResponseBodyResponse setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public CreditServiceResponseBodyResponse setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public CreditServiceResponseBodyResponse setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
