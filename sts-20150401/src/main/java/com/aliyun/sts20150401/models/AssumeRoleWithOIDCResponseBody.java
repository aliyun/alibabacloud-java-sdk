// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCResponseBody extends TeaModel {
    /**
     * <p>The temporary identity that you use to assume the RAM role.</p>
     */
    @NameInMap("AssumedRoleUser")
    public AssumeRoleWithOIDCResponseBodyAssumedRoleUser assumedRoleUser;

    /**
     * <p>The access credentials.</p>
     */
    @NameInMap("Credentials")
    public AssumeRoleWithOIDCResponseBodyCredentials credentials;

    /**
     * <p>The information about the OIDC token.</p>
     */
    @NameInMap("OIDCTokenInfo")
    public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo OIDCTokenInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D57EAD2-8723-1F26-B69C-F8707D8B565D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceIdentity")
    public String sourceIdentity;

    public static AssumeRoleWithOIDCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithOIDCResponseBody self = new AssumeRoleWithOIDCResponseBody();
        return TeaModel.build(map, self);
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

    public AssumeRoleWithOIDCResponseBody setOIDCTokenInfo(AssumeRoleWithOIDCResponseBodyOIDCTokenInfo OIDCTokenInfo) {
        this.OIDCTokenInfo = OIDCTokenInfo;
        return this;
    }
    public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo getOIDCTokenInfo() {
        return this.OIDCTokenInfo;
    }

    public AssumeRoleWithOIDCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeRoleWithOIDCResponseBody setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }
    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    public static class AssumeRoleWithOIDCResponseBodyAssumedRoleUser extends TeaModel {
        /**
         * <p>The ARN of the temporary identity that you use to assume the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::113511544585****:role/testoidc/TestOidcAssumedRoleSession</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the temporary identity that you use to assume the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>33157794895460****</p>
         */
        @NameInMap("AssumedRoleId")
        public String assumedRoleId;

        public static AssumeRoleWithOIDCResponseBodyAssumedRoleUser build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithOIDCResponseBodyAssumedRoleUser self = new AssumeRoleWithOIDCResponseBodyAssumedRoleUser();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithOIDCResponseBodyAssumedRoleUser setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public AssumeRoleWithOIDCResponseBodyAssumedRoleUser setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
            return this;
        }
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

    }

    public static class AssumeRoleWithOIDCResponseBodyCredentials extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NUgYrLnoC37mZZCNnAbez****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>CVwjCkNzTMupZ8NbTCxCBRq3K16jtcWFTJAyBEv2****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The time when the STS token expires. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-20T04:27:09Z</p>
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
         * <p>CAIShwJ1q6Ft5B2yfSjIr5bSEsj4g7BihPWGWHz****</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        public static AssumeRoleWithOIDCResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithOIDCResponseBodyCredentials self = new AssumeRoleWithOIDCResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public AssumeRoleWithOIDCResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class AssumeRoleWithOIDCResponseBodyOIDCTokenInfo extends TeaModel {
        /**
         * <p>The audience. If multiple audiences are returned, the audiences are separated by commas (,).</p>
         * <p>The audience is represented by the <code>aud</code> field in the OIDC Token.</p>
         * 
         * <strong>example:</strong>
         * <p>496271242565057****</p>
         */
        @NameInMap("ClientIds")
        public String clientIds;

        /**
         * <p>The time when the OIDC token expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-20T04:27:09Z</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The time when the OIDC token was issued.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-20T03:27:09Z</p>
         */
        @NameInMap("IssuanceTime")
        public String issuanceTime;

        /**
         * <p>The URL of the issuer,</p>
         * <p>which is represented by the <code>iss</code> field in the OIDC Token.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dev-xxxxxx.okta.com">https://dev-xxxxxx.okta.com</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The subject,</p>
         * <p>which is represented by the <code>sub</code> field in the OIDC Token.</p>
         * 
         * <strong>example:</strong>
         * <p>KryrkIdjylZb7agUgCEf****</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The verification information about the OIDC token. For more information, see <a href="https://help.aliyun.com/document_detail/327123.html">Manage an OIDC IdP</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("VerificationInfo")
        public String verificationInfo;

        public static AssumeRoleWithOIDCResponseBodyOIDCTokenInfo build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleWithOIDCResponseBodyOIDCTokenInfo self = new AssumeRoleWithOIDCResponseBodyOIDCTokenInfo();
            return TeaModel.build(map, self);
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setIssuanceTime(String issuanceTime) {
            this.issuanceTime = issuanceTime;
            return this;
        }
        public String getIssuanceTime() {
            return this.issuanceTime;
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public AssumeRoleWithOIDCResponseBodyOIDCTokenInfo setVerificationInfo(String verificationInfo) {
            this.verificationInfo = verificationInfo;
            return this;
        }
        public String getVerificationInfo() {
            return this.verificationInfo;
        }

    }

}
