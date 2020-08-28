// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class RemoveInstanceFromGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("InstanceIdAndPorts")
    @Validation(required = true)
    public java.util.Map<String, ?> instanceIdAndPorts;

    @NameInMap("Ver")
    @Validation(required = true)
    public Long ver;

    public static RemoveInstanceFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceFromGroupRequest self = new RemoveInstanceFromGroupRequest();
        return TeaModel.build(map, self);
    }

}
