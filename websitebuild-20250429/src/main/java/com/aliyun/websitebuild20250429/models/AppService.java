// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppService extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Deleted")
    public Integer deleted;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EspBizId")
    public String espBizId;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("InstanceBizId")
    public String instanceBizId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Profile")
    public AppServiceProfile profile;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ServiceTypeText")
    public String serviceTypeText;

    @NameInMap("Slug")
    public String slug;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserId")
    public String userId;

    public static AppService build(java.util.Map<String, ?> map) throws Exception {
        AppService self = new AppService();
        return TeaModel.build(map, self);
    }

    public AppService setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppService setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AppService setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public AppService setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AppService setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public AppService setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppService setInstanceBizId(String instanceBizId) {
        this.instanceBizId = instanceBizId;
        return this;
    }
    public String getInstanceBizId() {
        return this.instanceBizId;
    }

    public AppService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppService setProfile(AppServiceProfile profile) {
        this.profile = profile;
        return this;
    }
    public AppServiceProfile getProfile() {
        return this.profile;
    }

    public AppService setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AppService setServiceTypeText(String serviceTypeText) {
        this.serviceTypeText = serviceTypeText;
        return this;
    }
    public String getServiceTypeText() {
        return this.serviceTypeText;
    }

    public AppService setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public AppService setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppService setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppService setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
