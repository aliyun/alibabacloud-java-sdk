// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetOrCreateInvitationCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PARAMETER_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOrCreateInvitationCodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>parameter error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C5DCE54A-B266-522E-A6ED-468AF45F5AAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOrCreateInvitationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrCreateInvitationCodeResponseBody self = new GetOrCreateInvitationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrCreateInvitationCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrCreateInvitationCodeResponseBody setData(GetOrCreateInvitationCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrCreateInvitationCodeResponseBodyData getData() {
        return this.data;
    }

    public GetOrCreateInvitationCodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOrCreateInvitationCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrCreateInvitationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrCreateInvitationCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrCreateInvitationCodeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>000000</p>
         */
        @NameInMap("AuthCode")
        public String authCode;

        /**
         * <strong>example:</strong>
         * <p>1772162247</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        public static GetOrCreateInvitationCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrCreateInvitationCodeResponseBodyData self = new GetOrCreateInvitationCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrCreateInvitationCodeResponseBodyData setAuthCode(String authCode) {
            this.authCode = authCode;
            return this;
        }
        public String getAuthCode() {
            return this.authCode;
        }

        public GetOrCreateInvitationCodeResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetOrCreateInvitationCodeResponseBodyData setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

    }

}
