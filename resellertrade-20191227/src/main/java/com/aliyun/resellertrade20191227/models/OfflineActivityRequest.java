// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class OfflineActivityRequest extends TeaModel {
    @NameInMap("ActivityList")
    public java.util.List<Long> activityList;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Token")
    public String token;

    public static OfflineActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineActivityRequest self = new OfflineActivityRequest();
        return TeaModel.build(map, self);
    }

    public OfflineActivityRequest setActivityList(java.util.List<Long> activityList) {
        this.activityList = activityList;
        return this;
    }
    public java.util.List<Long> getActivityList() {
        return this.activityList;
    }

    public OfflineActivityRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OfflineActivityRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
