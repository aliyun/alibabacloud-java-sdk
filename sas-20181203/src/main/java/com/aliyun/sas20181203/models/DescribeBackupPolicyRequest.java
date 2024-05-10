// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <br>
     * <p>>  You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the IDs of anti-ransomware policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DescribeBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyRequest self = new DescribeBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
