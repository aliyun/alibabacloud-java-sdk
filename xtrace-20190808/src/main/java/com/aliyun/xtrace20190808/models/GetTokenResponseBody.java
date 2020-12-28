// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public GetTokenResponseBodyToken token;

    public static GetTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenResponseBody self = new GetTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenResponseBody setToken(GetTokenResponseBodyToken token) {
        this.token = token;
        return this;
    }
    public GetTokenResponseBodyToken getToken() {
        return this.token;
    }

    public static class GetTokenResponseBodyToken extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("LicenseKey")
        public String licenseKey;

        @NameInMap("InternalDomain")
        public String internalDomain;

        @NameInMap("Pid")
        public String pid;

        public static GetTokenResponseBodyToken build(java.util.Map<String, ?> map) throws Exception {
            GetTokenResponseBodyToken self = new GetTokenResponseBodyToken();
            return TeaModel.build(map, self);
        }

        public GetTokenResponseBodyToken setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetTokenResponseBodyToken setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public GetTokenResponseBodyToken setInternalDomain(String internalDomain) {
            this.internalDomain = internalDomain;
            return this;
        }
        public String getInternalDomain() {
            return this.internalDomain;
        }

        public GetTokenResponseBodyToken setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

    }

}
