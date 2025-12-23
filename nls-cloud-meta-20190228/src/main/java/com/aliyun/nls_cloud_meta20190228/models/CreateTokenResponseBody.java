// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nls_cloud_meta20190228.models;

import com.aliyun.tea.*;

public class CreateTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50000000</p>
     */
    @NameInMap("ErrCode")
    public Integer errCode;

    /**
     * <strong>example:</strong>
     * <p>Specified access key is not found.</p>
     */
    @NameInMap("ErrMsg")
    public String errMsg;

    /**
     * <strong>example:</strong>
     * <p>dd05a301b40441c99a2671905325****</p>
     */
    @NameInMap("NlsRequestId")
    public String nlsRequestId;

    /**
     * <strong>example:</strong>
     * <p>A51587CB-5193-4DB8-9AED-CD4365C2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public CreateTokenResponseBodyToken token;

    public static CreateTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResponseBody self = new CreateTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTokenResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public CreateTokenResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateTokenResponseBody setNlsRequestId(String nlsRequestId) {
        this.nlsRequestId = nlsRequestId;
        return this;
    }
    public String getNlsRequestId() {
        return this.nlsRequestId;
    }

    public CreateTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTokenResponseBody setToken(CreateTokenResponseBodyToken token) {
        this.token = token;
        return this;
    }
    public CreateTokenResponseBodyToken getToken() {
        return this.token;
    }

    public static class CreateTokenResponseBodyToken extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1553825814</p>
         */
        @NameInMap("ExpireTime")
        public Integer expireTime;

        /**
         * <strong>example:</strong>
         * <p>fb1c4648a61b426589dab0fe90d1****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>107992689699****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateTokenResponseBodyToken build(java.util.Map<String, ?> map) throws Exception {
            CreateTokenResponseBodyToken self = new CreateTokenResponseBodyToken();
            return TeaModel.build(map, self);
        }

        public CreateTokenResponseBodyToken setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Integer getExpireTime() {
            return this.expireTime;
        }

        public CreateTokenResponseBodyToken setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTokenResponseBodyToken setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
