// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy that you want to delete.</p>
     * <br>
     * <p>>  You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the IDs of anti-ransomware policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The version of the anti-ransomware policy that you want to delete. You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the versions of anti-ransomware policies. Valid values:</p>
     * <br>
     * <p>*   **1.0.0**</p>
     * <p>*   **2.0.0**</p>
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
