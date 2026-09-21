// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpgradeBackupPolicyVersionRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware mitigation policies.</p>
     * <blockquote>
     * <p>You can invoke <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> to obtain this parameter.</p>
     * </blockquote>
     * <p>Only policy IDs with PolicyVersion set to 1.0.0 and UpgradeStatus set to NotUpgraded are supported. Otherwise, the API returns an InvalidParam fault.</p>
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
