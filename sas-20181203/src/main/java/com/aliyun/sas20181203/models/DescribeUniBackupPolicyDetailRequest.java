// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPolicyDetailRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <br>
     * <p>> You can call the [DescribeUniBackupPolicies](~~DescribeUniBackupPolicies~~) operation to query the IDs of anti-ransomware policies.</p>
     * <br>
     * <p>This parameter is required.</p>
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
