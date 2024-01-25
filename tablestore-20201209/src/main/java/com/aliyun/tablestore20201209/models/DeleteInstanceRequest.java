// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
