// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXBizTypesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListDTXBizTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDTXBizTypesRequest self = new ListDTXBizTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListDTXBizTypesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
