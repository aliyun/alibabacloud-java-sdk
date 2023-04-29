// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPolicyDetailRequest extends TeaModel {
    /**
     * <p>$.parameters[2].schema.enumValueTitles</p>
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
