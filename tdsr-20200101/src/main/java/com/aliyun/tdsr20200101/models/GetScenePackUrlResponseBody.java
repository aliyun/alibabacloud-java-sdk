// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePackUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetScenePackUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetScenePackUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenePackUrlResponseBody self = new GetScenePackUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenePackUrlResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetScenePackUrlResponseBody setData(GetScenePackUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScenePackUrlResponseBodyData getData() {
        return this.data;
    }

    public GetScenePackUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScenePackUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenePackUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScenePackUrlResponseBodyData extends TeaModel {
        @NameInMap("Expire")
        public String expire;

        @NameInMap("Url")
        public String url;

        @NameInMap("Valid")
        public Boolean valid;

        public static GetScenePackUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScenePackUrlResponseBodyData self = new GetScenePackUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScenePackUrlResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetScenePackUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetScenePackUrlResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
