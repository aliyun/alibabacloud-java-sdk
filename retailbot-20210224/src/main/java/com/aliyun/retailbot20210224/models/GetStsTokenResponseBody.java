// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetStsTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetStsTokenResponseBodyData data;

    // Id of the request
    @NameInMap("Success")
    public String success;

    public static GetStsTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStsTokenResponseBody self = new GetStsTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStsTokenResponseBody setData(GetStsTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStsTokenResponseBodyData getData() {
        return this.data;
    }

    public GetStsTokenResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetStsTokenResponseBodyData extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetStsTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStsTokenResponseBodyData self = new GetStsTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStsTokenResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetStsTokenResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetStsTokenResponseBodyData setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetStsTokenResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
