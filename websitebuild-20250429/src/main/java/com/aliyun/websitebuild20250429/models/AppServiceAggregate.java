// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppServiceAggregate extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Deleted")
    public Integer deleted;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EspBizId")
    public String espBizId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("InstanceBizId")
    public String instanceBizId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperationAddress")
    public AppOperationAddress operationAddress;

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

    public static AppServiceAggregate build(java.util.Map<String, ?> map) throws Exception {
        AppServiceAggregate self = new AppServiceAggregate();
        return TeaModel.build(map, self);
    }

    public AppServiceAggregate setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppServiceAggregate setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public AppServiceAggregate setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AppServiceAggregate setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public AppServiceAggregate setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppServiceAggregate setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppServiceAggregate setInstanceBizId(String instanceBizId) {
        this.instanceBizId = instanceBizId;
        return this;
    }
    public String getInstanceBizId() {
        return this.instanceBizId;
    }

    public AppServiceAggregate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppServiceAggregate setOperationAddress(AppOperationAddress operationAddress) {
        this.operationAddress = operationAddress;
        return this;
    }
    public AppOperationAddress getOperationAddress() {
        return this.operationAddress;
    }

    public AppServiceAggregate setProfile(AppServiceProfile profile) {
        this.profile = profile;
        return this;
    }
    public AppServiceProfile getProfile() {
        return this.profile;
    }

    public AppServiceAggregate setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public AppServiceAggregate setServiceTypeText(String serviceTypeText) {
        this.serviceTypeText = serviceTypeText;
        return this;
    }
    public String getServiceTypeText() {
        return this.serviceTypeText;
    }

    public AppServiceAggregate setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public AppServiceAggregate setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppServiceAggregate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppServiceAggregate setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
