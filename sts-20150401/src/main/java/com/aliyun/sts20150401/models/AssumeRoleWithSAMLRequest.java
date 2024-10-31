// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithSAMLRequest extends TeaModel {
    /**
     * <p>The validity period of the STS token. Unit: seconds.</p>
     * <p>Minimum value: 900. Maximum value: the value of the <code>MaxSessionDuration</code> parameter. Default value: 3600.</p>
     * <p>You can call the CreateRole or UpdateRole operation to configure the <code>MaxSessionDuration</code> parameter. For more information, see <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a> or <a href="https://help.aliyun.com/document_detail/28712.html">UpdateRole</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    /**
     * <p>The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.</p>
     * <ul>
     * <li>If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.</li>
     * <li>If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.</li>
     * </ul>
     * <p>The value must be 1 to 2,048 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>url_encoded_policy</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ARN of the RAM role.</p>
     * <p>The trust entity of the RAM role is a SAML IdP. For more information, see <a href="https://help.aliyun.com/document_detail/116805.html">Create a RAM role for a trusted IdP</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</p>
     * <p>Format: <code>acs:ram::&lt;account_id&gt;:role/&lt;role_name&gt;</code>.</p>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <ul>
     * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/39744.html">How do I view the ARN of the RAM role?</a>.</li>
     * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> or <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The Base64-encoded SAML assertion.</p>
     * <p>The value must be 4 to 100,000 characters in length.</p>
     * <blockquote>
     * <p>A complete SAML response rather than a single SAMLAssertion field must be retrieved from the external IdP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>base64_encoded_saml_assertion</p>
     */
    @NameInMap("SAMLAssertion")
    public String SAMLAssertion;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the SAML IdP that is created in the RAM console.</p>
     * <p>Format: <code>acs:ram::&lt;account_id&gt;:saml-provider/&lt;saml_provider_id&gt;</code>.</p>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <ul>
     * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/116795.html">How do I view the ARN of a RAM role?</a></li>
     * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/186833.html">GetSAMLProvider</a> or <a href="https://help.aliyun.com/document_detail/186851.html">ListSAMLProviders</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:saml-provider/company1</p>
     */
    @NameInMap("SAMLProviderArn")
    public String SAMLProviderArn;

    public static AssumeRoleWithSAMLRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithSAMLRequest self = new AssumeRoleWithSAMLRequest();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithSAMLRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeRoleWithSAMLRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleWithSAMLRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AssumeRoleWithSAMLRequest setSAMLAssertion(String SAMLAssertion) {
        this.SAMLAssertion = SAMLAssertion;
        return this;
    }
    public String getSAMLAssertion() {
        return this.SAMLAssertion;
    }

    public AssumeRoleWithSAMLRequest setSAMLProviderArn(String SAMLProviderArn) {
        this.SAMLProviderArn = SAMLProviderArn;
        return this;
    }
    public String getSAMLProviderArn() {
        return this.SAMLProviderArn;
    }

}
