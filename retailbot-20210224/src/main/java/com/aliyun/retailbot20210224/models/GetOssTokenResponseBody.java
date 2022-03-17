// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetOssTokenResponseBody extends TeaModel {
    @NameInMap("WebUpoadPolicy")
    public GetOssTokenResponseBodyWebUpoadPolicy webUpoadPolicy;

    public static GetOssTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssTokenResponseBody self = new GetOssTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssTokenResponseBody setWebUpoadPolicy(GetOssTokenResponseBodyWebUpoadPolicy webUpoadPolicy) {
        this.webUpoadPolicy = webUpoadPolicy;
        return this;
    }
    public GetOssTokenResponseBodyWebUpoadPolicy getWebUpoadPolicy() {
        return this.webUpoadPolicy;
    }

    public static class GetOssTokenResponseBodyWebUpoadPolicy extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("Expire")
        public String expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static GetOssTokenResponseBodyWebUpoadPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetOssTokenResponseBodyWebUpoadPolicy self = new GetOssTokenResponseBodyWebUpoadPolicy();
            return TeaModel.build(map, self);
        }

        public GetOssTokenResponseBodyWebUpoadPolicy setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetOssTokenResponseBodyWebUpoadPolicy setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetOssTokenResponseBodyWebUpoadPolicy setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetOssTokenResponseBodyWebUpoadPolicy setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOssTokenResponseBodyWebUpoadPolicy setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssTokenResponseBodyWebUpoadPolicy setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
