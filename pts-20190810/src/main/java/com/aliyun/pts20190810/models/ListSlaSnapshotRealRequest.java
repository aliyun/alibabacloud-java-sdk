// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListSlaSnapshotRealRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static ListSlaSnapshotRealRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlaSnapshotRealRequest self = new ListSlaSnapshotRealRequest();
        return TeaModel.build(map, self);
    }

}
