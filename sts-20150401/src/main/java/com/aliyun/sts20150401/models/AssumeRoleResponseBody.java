// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleResponseBody extends TeaModel {
    /**
     * <p>The temporary identity that you use to assume the RAM role.</p>
     */
    @NameInMap("AssumedRoleUser")
    public AssumeRoleResponseBodyAssumedRoleUser assumedRoleUser;

    /**
     * <p>The STS credentials.</p>
     */
    @NameInMap("Credentials")
    public AssumeRoleResponseBodyCredentials credentials;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6894B13B-6D71-4EF5-88FA-F32781734A7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceIdentity")
    public String sourceIdentity;

    public static AssumeRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleResponseBody self = new AssumeRoleResponseBody();
        return TeaModel.build(map, self);
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

    public AssumeRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssumeRoleResponseBody setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }
    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    public static class AssumeRoleResponseBodyAssumedRoleUser extends TeaModel {
        /**
         * <p>The ARN of the temporary identity that you use to assume the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole/alice</p>
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

        public static AssumeRoleResponseBodyAssumedRoleUser build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleResponseBodyAssumedRoleUser self = new AssumeRoleResponseBodyAssumedRoleUser();
            return TeaModel.build(map, self);
        }

        public AssumeRoleResponseBodyAssumedRoleUser setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public AssumeRoleResponseBodyAssumedRoleUser setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
            return this;
        }
        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

    }

    public static class AssumeRoleResponseBodyCredentials extends TeaModel {
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

        public static AssumeRoleResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            AssumeRoleResponseBodyCredentials self = new AssumeRoleResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public AssumeRoleResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public AssumeRoleResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AssumeRoleResponseBodyCredentials setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public AssumeRoleResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
