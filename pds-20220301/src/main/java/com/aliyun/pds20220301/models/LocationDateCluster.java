// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class LocationDateCluster extends TeaModel {
    @NameInMap("address")
    public Address address;

    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("custom_labels")
    public java.util.Map<String, String> customLabels;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("end_time")
    public String endTime;

    @NameInMap("level")
    public String level;

    @NameInMap("start_time")
    public String startTime;

    @NameInMap("title")
    public String title;

    @NameInMap("updated_at")
    public String updatedAt;

    public static LocationDateCluster build(java.util.Map<String, ?> map) throws Exception {
        LocationDateCluster self = new LocationDateCluster();
        return TeaModel.build(map, self);
    }

    public LocationDateCluster setAddress(Address address) {
        this.address = address;
        return this;
    }
    public Address getAddress() {
        return this.address;
    }

    public LocationDateCluster setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public LocationDateCluster setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public LocationDateCluster setCustomLabels(java.util.Map<String, String> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, String> getCustomLabels() {
        return this.customLabels;
    }

    public LocationDateCluster setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public LocationDateCluster setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LocationDateCluster setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public LocationDateCluster setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public LocationDateCluster setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public LocationDateCluster setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
