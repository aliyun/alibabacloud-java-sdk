// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgUndisplayComponentsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgUndisplayComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgUndisplayComponentsRequest self = new ListMsSgUndisplayComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgUndisplayComponentsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
