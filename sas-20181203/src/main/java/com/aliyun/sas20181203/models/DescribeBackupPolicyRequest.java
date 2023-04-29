// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyRequest extends TeaModel {
    /**
     * <p>The status of the anti-ransomware policy. Valid values:</p>
     * <br>
     * <p>*   **enabled**: The anti-ransomware policy is manually enabled.</p>
     * <p>*   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.</p>
     * <p>*   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.</p>
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
