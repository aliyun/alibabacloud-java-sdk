// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleRequest extends TeaModel {
    /**
     * <p>The validity period of the STS token. Unit: seconds.</p>
     * <br>
     * <p>Minimum value: 900. Maximum value: the value of the `MaxSessionDuration` parameter. Default value: 3600.</p>
     * <br>
     * <p>You can call the CreateRole or UpdateRole operation to configure the `MaxSessionDuration` parameter. For more information, see [CreateRole](~~28710~~) or [UpdateRole](~~28712~~).</p>
     */
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    @NameInMap("ExternalId")
    public String externalId;

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
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
     * <br>
     * <p>The trusted entity of the RAM role is an Alibaba Cloud account. For more information, see [Create a RAM role for a trusted Alibaba Cloud account](~~93691~~) or [CreateRole](~~28710~~).</p>
     * <br>
     * <p>Format: `acs:ram::<account_id>:role/<role_name>`.</p>
     * <br>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <br>
     * <p>*   For more information about how to view the ARN in the RAM console, see [How do I find the ARN of the RAM role?](~~39744~~)</p>
     * <p>*   For more information about how to view the ARN by calling operations, see [ListRoles](~~28713~~) or [GetRole](~~28711~~).</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The custom name of the role session.</p>
     * <br>
     * <p>Set this parameter based on your business requirements. In most cases, you can set this parameter to the identity of the API caller. For example, you can specify a username. You can specify `RoleSessionName` to identify API callers that assume the same RAM role in ActionTrail logs. This allows you to track the users that perform the operations.</p>
     * <br>
     * <p>The value must be 2 to 64 characters in length and can contain letters, digits, periods (.), at signs (@), hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("RoleSessionName")
    public String roleSessionName;

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

}
