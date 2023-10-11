// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCRequest extends TeaModel {
    /**
     * <p>The validity period of the STS token. Unit: seconds.</p>
     * <br>
     * <p>Default value: 3600. Minimum value: 900. Maximum value: the value of the `MaxSessionDuration` parameter.</p>
     * <br>
     * <p>For more information about how to specify `MaxSessionDuration`, see [CreateRole](~~28710~~) or [UpdateRole](~~28712~~).</p>
     */
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.</p>
     * <br>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <br>
     * <p>*   For more information about how to view the ARN in the RAM console, see [View the information about an OIDC IdP](~~327123~~).</p>
     * <p>*   For more information about how to view the ARN by calling operations, see [GetOIDCProvider](~~327126~~) or [ListOIDCProviders](~~327127~~).</p>
     */
    @NameInMap("OIDCProviderArn")
    public String OIDCProviderArn;

    /**
     * <p>The OIDC token that is issued by the external IdP.</p>
     * <br>
     * <p>The OIDC token must be 4 to 20,000 characters in length.</p>
     * <br>
     * <p>> You must enter the original OIDC token. You do not need to enter the Base64-encoded OIDC token.</p>
     */
    @NameInMap("OIDCToken")
    public String OIDCToken;

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
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <br>
     * <p>*   For more information about how to view the ARN in the RAM console, see [How do I view the ARN of the RAM role?](~~39744~~)</p>
     * <p>*   For more information about how to view the ARN by calling operations, see [ListRoles](~~28713~~) or [GetRole](~~28711~~).</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The custom name of the role session.</p>
     * <br>
     * <p>Set this parameter based on your business requirements. In most cases, this parameter is set to the identity of the user who calls the operation, for example, the username. In ActionTrail logs, you can distinguish the users who assume the same RAM role to perform operations based on the value of the RoleSessionName parameter. This way, you can perform user-specific auditing.</p>
     * <br>
     * <p>The value can contain letters, digits, periods (.), at signs (@), hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>The value must be 2 to 64 characters in length.</p>
     */
    @NameInMap("RoleSessionName")
    public String roleSessionName;

    public static AssumeRoleWithOIDCRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithOIDCRequest self = new AssumeRoleWithOIDCRequest();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithOIDCRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeRoleWithOIDCRequest setOIDCProviderArn(String OIDCProviderArn) {
        this.OIDCProviderArn = OIDCProviderArn;
        return this;
    }
    public String getOIDCProviderArn() {
        return this.OIDCProviderArn;
    }

    public AssumeRoleWithOIDCRequest setOIDCToken(String OIDCToken) {
        this.OIDCToken = OIDCToken;
        return this;
    }
    public String getOIDCToken() {
        return this.OIDCToken;
    }

    public AssumeRoleWithOIDCRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleWithOIDCRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AssumeRoleWithOIDCRequest setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

}
