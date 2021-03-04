// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AssumedRoleUser")
    public AssumeRoleResponseBodyAssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    public AssumeRoleResponseBodyCredentials credentials;

    public static AssumeRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleResponseBody self = new AssumeRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeRoleResponseBody setAssumedRoleUser(AssumeRoleResponseBodyAssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }
    public AssumeRoleResponseBodyAssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public AssumeRoleResponseBody setCredentials(AssumeRoleResponseBodyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    public AssumeRoleResponseBodyCredentials getCredentials() {
        return this.credentials;
    }

    public static class AssumeRoleResponseBodyAssumedRoleUser extends TeaModel {
        @NameInMap("AssumedRoleId")
        public String assumedRoleId;

        @NameInMap("Arn")
        public String arn;

        public static AssumeRoleResponseBodyAssumedRoleUser build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleResponseBodyAssumedRoleUser self = new AssumeRoleResponseBodyAssumedRoleUser();
            return TeaModel.build(map, self);
        }

        public AssumeRoleResponseBodyAssumedRoleUser setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
            return this;
        }
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        public AssumeRoleResponseBodyAssumedRoleUser setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class AssumeRoleResponseBodyCredentials extends TeaModel {
        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        public static AssumeRoleResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleResponseBodyCredentials self = new AssumeRoleResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public AssumeRoleResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public AssumeRoleResponseBodyCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public AssumeRoleResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AssumeRoleResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

    }

}
