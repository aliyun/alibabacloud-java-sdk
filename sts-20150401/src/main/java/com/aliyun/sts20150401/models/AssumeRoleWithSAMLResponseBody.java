// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithSAMLResponseBody extends TeaModel {
    /**
     * <p>The temporary identity that you use to assume the RAM role.</p>
     */
    @NameInMap("AssumedRoleUser")
    public AssumeRoleWithSAMLResponseBodyAssumedRoleUser assumedRoleUser;

    /**
     * <p>The STS credentials.</p>
     */
    @NameInMap("Credentials")
    public AssumeRoleWithSAMLResponseBodyCredentials credentials;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information in the SAML assertion.</p>
     */
    @NameInMap("SAMLAssertionInfo")
    public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo SAMLAssertionInfo;

    public static AssumeRoleWithSAMLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithSAMLResponseBody self = new AssumeRoleWithSAMLResponseBody();
        return TeaModel.build(map, self);
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

    public static class AssumeRoleWithSAMLResponseBodyAssumedRoleUser extends TeaModel {
        /**
         * <p>The ARN of the temporary identity that you use to assume the RAM role.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the temporary identity that you use to assume the RAM role.</p>
         */
        @NameInMap("AssumedRoleId")
        public String assumedRoleId;

        public static AssumeRoleWithSAMLResponseBodyAssumedRoleUser build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithSAMLResponseBodyAssumedRoleUser self = new AssumeRoleWithSAMLResponseBodyAssumedRoleUser();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithSAMLResponseBodyAssumedRoleUser setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public AssumeRoleWithSAMLResponseBodyAssumedRoleUser setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
            return this;
        }
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

    }

    public static class AssumeRoleWithSAMLResponseBodyCredentials extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret.</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The time when the STS token expires. The time is displayed in UTC.</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>The STS token.</p>
         * <br>
         * <p>> Alibaba Cloud STS does not impose limits on the length of STS tokens. We strongly recommend that you do not specify a maximum length for STS tokens.</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        public static AssumeRoleWithSAMLResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithSAMLResponseBodyCredentials self = new AssumeRoleWithSAMLResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public AssumeRoleWithSAMLResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class AssumeRoleWithSAMLResponseBodySAMLAssertionInfo extends TeaModel {
        /**
         * <p>The value in the `Issuer` element in the SAML assertion.</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The `Recipient` attribute of the SubjectConfirmationData sub-element. SubjectConfirmationData is a sub-element of the `Subject` element in the SAML assertion.</p>
         */
        @NameInMap("Recipient")
        public String recipient;

        /**
         * <p>The value in the NameID sub-element of the `Subject` element in the SAML assertion.</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The Format attribute of the `NameID` element in the SAML assertion. If the Format attribute is prefixed with `urn:oasis:names:tc:SAML:2.0:nameid-format:`, the prefix is not included in the value of this parameter. For example, if the value of the Format attribute is urn:oasis:names:tc:SAML:2.0:nameid-format:persistent/transient, the value of this parameter is `persistent/transient`.</p>
         */
        @NameInMap("SubjectType")
        public String subjectType;

        public static AssumeRoleWithSAMLResponseBodySAMLAssertionInfo build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithSAMLResponseBodySAMLAssertionInfo self = new AssumeRoleWithSAMLResponseBodySAMLAssertionInfo();
            return TeaModel.build(map, self);
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

        public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo setSubjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public String getSubjectType() {
            return this.subjectType;
        }

    }

}
