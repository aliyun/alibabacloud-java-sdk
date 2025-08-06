// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRealtimeLogAuthorizedRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeVodRealtimeLogAuthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRealtimeLogAuthorizedRequest self = new DescribeVodRealtimeLogAuthorizedRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodRealtimeLogAuthorizedRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
