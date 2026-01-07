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
     * 
     * <strong>example:</strong>
     * <p>6894B13B-6D71-4EF5-88FA-F32781734A7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information in the SAML assertion.</p>
     */
    @NameInMap("SAMLAssertionInfo")
    public AssumeRoleWithSAMLResponseBodySAMLAssertionInfo SAMLAssertionInfo;

    @NameInMap("SourceIdentity")
    public String sourceIdentity;

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

    public AssumeRoleWithSAMLResponseBody setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }
    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    public static class AssumeRoleWithSAMLResponseBodyAssumedRoleUser extends TeaModel {
        /**
         * <p>The ARN of the temporary identity that you use to assume the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:sts::123456789012****:assumed-role/AdminRole/alice</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the temporary identity that you use to assume the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>34458433936495****:alice</p>
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
         * 
         * <strong>example:</strong>
         * <p>STS.L4aBSCSJVMuKg5U1****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>wyLTSmsyPGP1ohvvw8xYgB29dlGI8KMiH2pK****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The time when the STS token expires. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-04-09T11:52:19Z</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>The STS token.</p>
         * <blockquote>
         * <p>Alibaba Cloud STS does not impose limits on the length of STS tokens. We strongly recommend that you do not specify a maximum length for STS tokens.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
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
         * <p>The value in the <code>Issuer</code> element in the SAML assertion.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/adfs/services/trust">http://example.com/adfs/services/trust</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The <code>Recipient</code> attribute of the SubjectConfirmationData sub-element. SubjectConfirmationData is a sub-element of the <code>Subject</code> element in the SAML assertion.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin.aliyun.com/saml-role/SSO">https://signin.aliyun.com/saml-role/SSO</a></p>
         */
        @NameInMap("Recipient")
        public String recipient;

        /**
         * <p>The value in the NameID sub-element of the <code>Subject</code> element in the SAML assertion.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The Format attribute of the <code>NameID</code> element in the SAML assertion. If the Format attribute is prefixed with <code>urn:oasis:names:tc:SAML:2.0:nameid-format:</code>, the prefix is not included in the value of this parameter. For example, if the value of the Format attribute is urn:oasis:names:tc:SAML:2.0:nameid-format:persistent/transient, the value of this parameter is <code>persistent/transient</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>persistent</p>
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
