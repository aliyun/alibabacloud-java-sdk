// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListCrowdsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListCrowdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrowdsRequest self = new ListCrowdsRequest();
        return TeaModel.build(map, self);
    }

    public ListCrowdsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
