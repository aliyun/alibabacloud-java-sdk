// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleRequest extends TeaModel {
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
     * <p>The external ID of the RAM role.</p>
     * <p>This parameter is provided by an external party and is used to prevent the confused deputy problem. For more information, see <a href="https://help.aliyun.com/document_detail/2361741.html">Use ExternalId to prevent the confused deputy problem</a>.</p>
     * <p>The value must be 2 to 1,224 characters in length and can contain letters, digits, and the following special characters: <code>= , . @ : / - _</code>. The regular expression for this parameter is <code>[\\w+=,.@:\\/-]*</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd1234</p>
     */
    @NameInMap("ExternalId")
    public String externalId;

    /**
     * <p>The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.</p>
     * <ul>
     * <li>If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.</li>
     * <li>If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.</li>
     * </ul>
     * <p>The value must be 1 to 2,048 characters in length.</p>
     * <p>For more information about policy elements and sample policies, see <a href="https://help.aliyun.com/document_detail/93738.html">Policy elements</a> and <a href="https://help.aliyun.com/document_detail/210969.html">Overview of sample policies</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: [&quot;<em>&quot;],&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: [&quot;</em>&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
     * <p>The trusted entity of the RAM role is an Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/93691.html">Create a RAM role for a trusted Alibaba Cloud account</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</p>
     * <p>Format: <code>acs:ram::&lt;account_id&gt;:role/&lt;role_name&gt;</code>.</p>
     * <p>You can view the ARN in the RAM console or by calling operations. The following items describe the validity periods of storage addresses:</p>
     * <ul>
     * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/39744.html">How do I find the ARN of the RAM role?</a></li>
     * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> or <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The custom name of the role session.</p>
     * <p>Set this parameter based on your business requirements. In most cases, you can set this parameter to the identity of the API caller. For example, you can specify a username. You can specify <code>RoleSessionName</code> to identify API callers that assume the same RAM role in ActionTrail logs. This allows you to track the users that perform the operations.</p>
     * <p>The value must be 2 to 64 characters in length and can contain letters, digits, and the following special characters: <code>. @ - _</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("RoleSessionName")
    public String roleSessionName;

    @NameInMap("SourceIdentity")
    public String sourceIdentity;

    public static AssumeRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleRequest self = new AssumeRoleRequest();
        return TeaModel.build(map, self);
    }

    public AssumeRoleRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeRoleRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public AssumeRoleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AssumeRoleRequest setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public AssumeRoleRequest setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }
    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

}
