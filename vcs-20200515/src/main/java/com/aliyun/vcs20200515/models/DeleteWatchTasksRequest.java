// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteWatchTasksRequest extends TeaModel {
    @NameInMap("WatchTaskIds")
    public String watchTaskIds;

    public static DeleteWatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatchTasksRequest self = new DeleteWatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWatchTasksRequest setWatchTaskIds(String watchTaskIds) {
        this.watchTaskIds = watchTaskIds;
        return this;
    }
    public String getWatchTaskIds() {
        return this.watchTaskIds;
    }

}
