// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeBackupPolicyVersionRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware protection policy.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    public static UpgradeBackupPolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeBackupPolicyVersionRequest self = new UpgradeBackupPolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeBackupPolicyVersionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
