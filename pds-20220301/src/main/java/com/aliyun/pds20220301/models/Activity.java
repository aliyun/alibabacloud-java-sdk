// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Activity extends TeaModel {
    @NameInMap("activity_id")
    public String activityId;

    @NameInMap("device")
    public String device;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("event_type")
    public Integer eventType;

    @NameInMap("latest_event_time")
    public String latestEventTime;

    @NameInMap("resource_category")
    public Integer resourceCategory;

    @NameInMap("resource_list")
    public java.util.List<java.util.Map<String, ?>> resourceList;

    @NameInMap("total_resource_count")
    public Long totalResourceCount;

    @NameInMap("user_id")
    public String userId;

    public static Activity build(java.util.Map<String, ?> map) throws Exception {
        Activity self = new Activity();
        return TeaModel.build(map, self);
    }

    public Activity setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public Activity setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public Activity setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public Activity setEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }
    public Integer getEventType() {
        return this.eventType;
    }

    public Activity setLatestEventTime(String latestEventTime) {
        this.latestEventTime = latestEventTime;
        return this;
    }
    public String getLatestEventTime() {
        return this.latestEventTime;
    }

    public Activity setResourceCategory(Integer resourceCategory) {
        this.resourceCategory = resourceCategory;
        return this;
    }
    public Integer getResourceCategory() {
        return this.resourceCategory;
    }

    public Activity setResourceList(java.util.List<java.util.Map<String, ?>> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResourceList() {
        return this.resourceList;
    }

    public Activity setTotalResourceCount(Long totalResourceCount) {
        this.totalResourceCount = totalResourceCount;
        return this;
    }
    public Long getTotalResourceCount() {
        return this.totalResourceCount;
    }

    public Activity setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
