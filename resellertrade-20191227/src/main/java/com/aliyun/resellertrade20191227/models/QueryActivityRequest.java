// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class QueryActivityRequest extends TeaModel {
    @NameInMap("ActivityId")
    public Long activityId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SnapType")
    public String snapType;

    public static QueryActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityRequest self = new QueryActivityRequest();
        return TeaModel.build(map, self);
    }

    public QueryActivityRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public QueryActivityRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryActivityRequest setSnapType(String snapType) {
        this.snapType = snapType;
        return this;
    }
    public String getSnapType() {
        return this.snapType;
    }

}
