// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class QueryActivityRequest extends TeaModel {
    @NameInMap("ActivityIdList")
    public java.util.List<Long> activityIdList;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SnapType")
    public String snapType;

    public static QueryActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityRequest self = new QueryActivityRequest();
        return TeaModel.build(map, self);
    }

    public QueryActivityRequest setActivityIdList(java.util.List<Long> activityIdList) {
        this.activityIdList = activityIdList;
        return this;
    }
    public java.util.List<Long> getActivityIdList() {
        return this.activityIdList;
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
