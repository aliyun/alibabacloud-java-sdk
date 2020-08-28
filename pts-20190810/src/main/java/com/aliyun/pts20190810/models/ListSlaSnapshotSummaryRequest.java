// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListSlaSnapshotSummaryRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    public static ListSlaSnapshotSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlaSnapshotSummaryRequest self = new ListSlaSnapshotSummaryRequest();
        return TeaModel.build(map, self);
    }

}
