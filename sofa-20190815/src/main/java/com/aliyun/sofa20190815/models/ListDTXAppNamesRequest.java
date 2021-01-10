// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXAppNamesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListDTXAppNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDTXAppNamesRequest self = new ListDTXAppNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListDTXAppNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
