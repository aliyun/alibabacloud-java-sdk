// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSFaviconicoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSFaviconicoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSFaviconicoRequest self = new GetDWSFaviconicoRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSFaviconicoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
