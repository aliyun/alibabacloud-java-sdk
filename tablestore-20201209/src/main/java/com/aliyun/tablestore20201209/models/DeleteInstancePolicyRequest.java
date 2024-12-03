// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteInstancePolicyRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-test-12345</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The version of the instance policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PolicyVersion")
    public Long policyVersion;

    public static DeleteInstancePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancePolicyRequest self = new DeleteInstancePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstancePolicyRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteInstancePolicyRequest setPolicyVersion(Long policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

}
