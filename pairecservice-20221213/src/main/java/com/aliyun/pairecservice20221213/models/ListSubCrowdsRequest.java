// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListSubCrowdsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListSubCrowdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubCrowdsRequest self = new ListSubCrowdsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubCrowdsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
