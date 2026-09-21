// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPolicyDetailRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware backup policy for databases.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>If DescribeUniBackupPolicies returns an empty list, activate the anti-ransomware feature of Security Center first, make sure that the Security Center agent is installed on the ECS instance and the database has been discovered, and then call CreateUniBackupPolicy to create a backup policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static DescribeUniBackupPolicyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupPolicyDetailRequest self = new DescribeUniBackupPolicyDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupPolicyDetailRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
