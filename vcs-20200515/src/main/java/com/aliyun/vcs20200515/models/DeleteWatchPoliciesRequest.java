// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteWatchPoliciesRequest extends TeaModel {
    @NameInMap("WatchPolicyIds")
    public String watchPolicyIds;

    public static DeleteWatchPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatchPoliciesRequest self = new DeleteWatchPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWatchPoliciesRequest setWatchPolicyIds(String watchPolicyIds) {
        this.watchPolicyIds = watchPolicyIds;
        return this;
    }
    public String getWatchPolicyIds() {
        return this.watchPolicyIds;
    }

}
