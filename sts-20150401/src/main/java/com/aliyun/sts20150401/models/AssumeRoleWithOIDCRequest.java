// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCRequest extends TeaModel {
    /**
     * <p>The validity period of the STS token. Unit: seconds.</p>
     * <p>Default value: 3600. Minimum value: 900. Maximum value: the value of the <code>MaxSessionDuration</code> parameter.</p>
     * <p>For more information about how to specify <code>MaxSessionDuration</code>, see <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a> or <a href="https://help.aliyun.com/document_detail/28712.html">UpdateRole</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.</p>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <ul>
     * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/327123.html">View the information about an OIDC IdP</a>.</li>
     * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/327126.html">GetOIDCProvider</a> or <a href="https://help.aliyun.com/document_detail/327127.html">ListOIDCProviders</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::113511544585****:oidc-provider/TestOidcIdp</p>
     */
    @NameInMap("OIDCProviderArn")
    public String OIDCProviderArn;

    /**
     * <p>The OIDC token that is issued by the external IdP.</p>
     * <p>The OIDC token must be 4 to 20,000 characters in length.</p>
     * <blockquote>
     * <p>You must enter the original OIDC token. You do not need to enter the Base64-encoded OIDC token.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJraWQiOiJKQzl3eHpyaHFKMGd0****</p>
     */
    @NameInMap("OIDCToken")
    public String OIDCToken;

    /**
     * <p>The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.</p>
     * <ul>
     * <li>If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.</li>
     * <li>If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.</li>
     * </ul>
     * <p>The value must be 1 to 2,048 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: [&quot;<em>&quot;],&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: [&quot;</em>&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ARN of the RAM role.</p>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <ul>
     * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/39744.html">How do I view the ARN of the RAM role?</a></li>
     * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> or <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::113511544585****:role/testoidc</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The custom name of the role session.</p>
     * <p>Set this parameter based on your business requirements. In most cases, this parameter is set to the identity of the user who calls the operation, for example, the username. In ActionTrail logs, you can distinguish the users who assume the same RAM role to perform operations based on the value of the RoleSessionName parameter. This way, you can perform user-specific auditing.</p>
     * <p>The value can contain letters, digits, periods (.), at signs (@), hyphens (-), and underscores (_).</p>
     * <p>The value must be 2 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>TestOidcAssumedRoleSession</p>
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
