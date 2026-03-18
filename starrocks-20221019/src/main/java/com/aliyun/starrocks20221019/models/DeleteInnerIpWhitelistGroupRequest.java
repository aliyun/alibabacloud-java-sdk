// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DeleteInnerIpWhitelistGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-g1</p>
     */
    @NameInMap("InnerIpWhitelistGroupId")
    public String innerIpWhitelistGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-0104730e9de40215</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteInnerIpWhitelistGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInnerIpWhitelistGroupRequest self = new DeleteInnerIpWhitelistGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInnerIpWhitelistGroupRequest setInnerIpWhitelistGroupId(String innerIpWhitelistGroupId) {
        this.innerIpWhitelistGroupId = innerIpWhitelistGroupId;
        return this;
    }
    public String getInnerIpWhitelistGroupId() {
        return this.innerIpWhitelistGroupId;
    }

    public DeleteInnerIpWhitelistGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
