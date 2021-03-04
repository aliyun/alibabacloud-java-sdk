// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithSAMLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SAMLAssertionInfo")
    public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo SAMLAssertionInfo;

    @NameInMap("AssumedRoleUser")
    public AssumeRoleWithSAMLResponseBodyAssumedRoleUser assumedRoleUser;

    @NameInMap("Credentials")
    public AssumeRoleWithSAMLResponseBodyCredentials credentials;

    public static AssumeRoleWithSAMLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithSAMLResponseBody self = new AssumeRoleWithSAMLResponseBody();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithSAMLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeRoleWithSAMLResponseBody setSAMLAssertionInfo(AssumeRoleWithSAMLResponseBodySAMLAssertionInfo SAMLAssertionInfo) {
        this.SAMLAssertionInfo = SAMLAssertionInfo;
        return this;
    }
    public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo getSAMLAssertionInfo() {
        return this.SAMLAssertionInfo;
    }

    public AssumeRoleWithSAMLResponseBody setAssumedRoleUser(AssumeRoleWithSAMLResponseBodyAssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }
    public AssumeRoleWithSAMLResponseBodyAssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public AssumeRoleWithSAMLResponseBody setCredentials(AssumeRoleWithSAMLResponseBodyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    public AssumeRoleWithSAMLResponseBodyCredentials getCredentials() {
        return this.credentials;
    }

    public static class AssumeRoleWithSAMLResponseBodySAMLAssertionInfo extends TeaModel {
        @NameInMap("SubjectType")
        public String subjectType;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("Recipient")
        public String recipient;

        public static AssumeRoleWithSAMLResponseBodySAMLAssertionInfo build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithSAMLResponseBodySAMLAssertionInfo self = new AssumeRoleWithSAMLResponseBodySAMLAssertionInfo();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo setSubjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public String getSubjectType() {
            return this.subjectType;
        }

        public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }
        public String getRecipient() {
            return this.recipient;
        }

    }

    public static class AssumeRoleWithSAMLResponseBodyAssumedRoleUser extends TeaModel {
        @NameInMap("AssumedRoleId")
        public String assumedRoleId;

        @NameInMap("Arn")
        public String arn;

        public static AssumeRoleWithSAMLResponseBodyAssumedRoleUser build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithSAMLResponseBodyAssumedRoleUser self = new AssumeRoleWithSAMLResponseBodyAssumedRoleUser();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithSAMLResponseBodyAssumedRoleUser setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
            return this;
        }
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        public AssumeRoleWithSAMLResponseBodyAssumedRoleUser setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class AssumeRoleWithSAMLResponseBodyCredentials extends TeaModel {
        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        public static AssumeRoleWithSAMLResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithSAMLResponseBodyCredentials self = new AssumeRoleWithSAMLResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

    }

}
