// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UnbindInstance2VpcRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mkdd-test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xu6666</p>
     */
    @NameInMap("InstanceVpcName")
    public String instanceVpcName;

    public static UnbindInstance2VpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstance2VpcRequest self = new UnbindInstance2VpcRequest();
        return TeaModel.build(map, self);
    }

    public UnbindInstance2VpcRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UnbindInstance2VpcRequest setInstanceVpcName(String instanceVpcName) {
        this.instanceVpcName = instanceVpcName;
        return this;
    }
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

}
