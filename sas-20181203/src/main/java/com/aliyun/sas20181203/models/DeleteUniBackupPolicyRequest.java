// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUniBackupPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to query the IDs of anti-ransomware policies. You must specify at least one of the PolicyId parameter and the <strong>PolicyIds</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The IDs of anti-ransomware policies.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to query the IDs of anti-ransomware policies. You must specify at least one of the <strong>PolicyId</strong> parameter and the PolicyIds parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123,124</p>
     */
    @NameInMap("PolicyIds")
    public String policyIds;

    public static DeleteUniBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUniBackupPolicyRequest self = new DeleteUniBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUniBackupPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public DeleteUniBackupPolicyRequest setPolicyIds(String policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public String getPolicyIds() {
        return this.policyIds;
    }

}
