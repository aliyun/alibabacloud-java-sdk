// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class PublicActivityRequest extends TeaModel {
    @NameInMap("ActivityList")
    public java.util.List<Long> activityList;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SnapType")
    public String snapType;

    @NameInMap("Token")
    public String token;

    public static PublicActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        PublicActivityRequest self = new PublicActivityRequest();
        return TeaModel.build(map, self);
    }

    public PublicActivityRequest setActivityList(java.util.List<Long> activityList) {
        this.activityList = activityList;
        return this;
    }
    public java.util.List<Long> getActivityList() {
        return this.activityList;
    }

    public PublicActivityRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PublicActivityRequest setSnapType(String snapType) {
        this.snapType = snapType;
        return this;
    }
    public String getSnapType() {
        return this.snapType;
    }

    public PublicActivityRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
