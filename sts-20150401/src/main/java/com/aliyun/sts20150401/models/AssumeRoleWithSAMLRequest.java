// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithSAMLRequest extends TeaModel {
    /**
     * <p>The validity period of the STS token. Unit: seconds.</p>
     * <br>
     * <p>Minimum value: 900. Maximum value: the value of the `MaxSessionDuration` parameter. Default value: 3600.</p>
     * <br>
     * <p>You can call the CreateRole or UpdateRole operation to configure the `MaxSessionDuration` parameter. For more information, see [CreateRole](~~28710~~) or [UpdateRole](~~28712~~).</p>
     */
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    /**
     * <p>The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.</p>
     * <br>
     * <p>*   If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.</p>
     * <p>*   If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.</p>
     * <br>
     * <p>The value must be 1 to 2,048 characters in length.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ARN of the RAM role.</p>
     * <br>
     * <p>The trust entity of the RAM role is a SAML IdP. For more information, see [Create a RAM role for a trusted IdP](~~116805~~) or [CreateRole](~~28710~~).</p>
     * <br>
     * <p>Format: `acs:ram::<account_id>:role/<role_name>`.</p>
     * <br>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <br>
     * <p>*   For more information about how to view the ARN in the RAM console, see [How do I view the ARN of the RAM role?](~~39744~~).</p>
     * <p>*   For more information about how to view the ARN by calling operations, see [ListRoles](~~28713~~) or [GetRole](~~28711~~).</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The Base64-encoded SAML assertion.</p>
     * <br>
     * <p>The value must be 4 to 100,000 characters in length.</p>
     * <br>
     * <p>> A complete SAML response rather than a single SAMLAssertion field must be retrieved from the external IdP.</p>
     */
    @NameInMap("SAMLAssertion")
    public String SAMLAssertion;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the SAML IdP that is created in the RAM console.</p>
     * <br>
     * <p>Format: `acs:ram::<account_id>:saml-provider/<saml_provider_id>`.</p>
     * <br>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <br>
     * <p>*   For more information about how to view the ARN in the RAM console, see [How do I view the ARN of a RAM role?](~~116795~~)</p>
     * <p>*   For more information about how to view the ARN by calling operations, see [GetSAMLProvider](~~186833~~) or [ListSAMLProviders](~~186851~~).</p>
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
