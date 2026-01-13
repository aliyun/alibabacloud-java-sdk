// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteVCUInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_name</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static DeleteVCUInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVCUInstanceRequest self = new DeleteVCUInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVCUInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
