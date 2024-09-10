// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy that you want to delete.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the IDs of anti-ransomware policies.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The version of the anti-ransomware policy that you want to delete. You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the versions of anti-ransomware policies. Valid values:</p>
     * <ul>
     * <li><strong>1.0.0</strong></li>
     * <li><strong>2.0.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    public static DeleteBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyRequest self = new DeleteBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteBackupPolicyRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

}
