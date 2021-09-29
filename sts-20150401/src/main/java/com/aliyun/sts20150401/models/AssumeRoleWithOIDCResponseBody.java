// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OIDCTokenInfo")
    public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo OIDCTokenInfo;

    @NameInMap("AssumedRoleUser")
    public AssumeRoleWithOIDCResponseBodyAssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    public AssumeRoleWithOIDCResponseBodyCredentials credentials;

    public static AssumeRoleWithOIDCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithOIDCResponseBody self = new AssumeRoleWithOIDCResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithOIDCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeRoleWithOIDCResponseBody setOIDCTokenInfo(AssumeRoleWithOIDCResponseBodyOIDCTokenInfo OIDCTokenInfo) {
        this.OIDCTokenInfo = OIDCTokenInfo;
        return this;
    }
    public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo getOIDCTokenInfo() {
        return this.OIDCTokenInfo;
    }

    public AssumeRoleWithOIDCResponseBody setAssumedRoleUser(AssumeRoleWithOIDCResponseBodyAssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }
    public AssumeRoleWithOIDCResponseBodyAssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public AssumeRoleWithOIDCResponseBody setCredentials(AssumeRoleWithOIDCResponseBodyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    public AssumeRoleWithOIDCResponseBodyCredentials getCredentials() {
        return this.credentials;
    }

    public static class AssumeRoleWithOIDCResponseBodyOIDCTokenInfo extends TeaModel {
        @NameInMap("Subject")
        public String subject;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("ClientIds")
        public String clientIds;

        public static AssumeRoleWithOIDCResponseBodyOIDCTokenInfo build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithOIDCResponseBodyOIDCTokenInfo self = new AssumeRoleWithOIDCResponseBodyOIDCTokenInfo();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

    }

    public static class AssumeRoleWithOIDCResponseBodyAssumedRoleUser extends TeaModel {
        @NameInMap("AssumedRoleId")
        public String assumedRoleId;

        @NameInMap("Arn")
        public String arn;

        public static AssumeRoleWithOIDCResponseBodyAssumedRoleUser build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithOIDCResponseBodyAssumedRoleUser self = new AssumeRoleWithOIDCResponseBodyAssumedRoleUser();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithOIDCResponseBodyAssumedRoleUser setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
            return this;
        }
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        public AssumeRoleWithOIDCResponseBodyAssumedRoleUser setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class AssumeRoleWithOIDCResponseBodyCredentials extends TeaModel {
        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        public static AssumeRoleWithOIDCResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithOIDCResponseBodyCredentials self = new AssumeRoleWithOIDCResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

    }

}
