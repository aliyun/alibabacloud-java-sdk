// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnsubscribeSpaceEventRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static UnsubscribeSpaceEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeSpaceEventRequest self = new UnsubscribeSpaceEventRequest();
        return TeaModel.build(map, self);
    }

    public UnsubscribeSpaceEventRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
