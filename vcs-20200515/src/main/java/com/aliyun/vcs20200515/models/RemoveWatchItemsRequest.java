// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveWatchItemsRequest extends TeaModel {
    @NameInMap("WatchItemIds")
    public String watchItemIds;

    @NameInMap("WatchPolicyId")
    public String watchPolicyId;

    public static RemoveWatchItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWatchItemsRequest self = new RemoveWatchItemsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWatchItemsRequest setWatchItemIds(String watchItemIds) {
        this.watchItemIds = watchItemIds;
        return this;
    }
    public String getWatchItemIds() {
        return this.watchItemIds;
    }

    public RemoveWatchItemsRequest setWatchPolicyId(String watchPolicyId) {
        this.watchPolicyId = watchPolicyId;
        return this;
    }
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

}
