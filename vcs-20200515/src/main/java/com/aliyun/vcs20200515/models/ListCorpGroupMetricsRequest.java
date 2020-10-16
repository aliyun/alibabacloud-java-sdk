// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpGroupMetricsRequest extends TeaModel {
    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("TagCode")
    @Validation(required = true)
    public String tagCode;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("UserGroup")
    public String userGroup;

    @NameInMap("DeviceGroup")
    public String deviceGroup;

    public static ListCorpGroupMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCorpGroupMetricsRequest self = new ListCorpGroupMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListCorpGroupMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListCorpGroupMetricsRequest setTagCode(String tagCode) {
        this.tagCode = tagCode;
        return this;
    }
    public String getTagCode() {
        return this.tagCode;
    }

    public ListCorpGroupMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCorpGroupMetricsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListCorpGroupMetricsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListCorpGroupMetricsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListCorpGroupMetricsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListCorpGroupMetricsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListCorpGroupMetricsRequest setUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public String getUserGroup() {
        return this.userGroup;
    }

    public ListCorpGroupMetricsRequest setDeviceGroup(String deviceGroup) {
        this.deviceGroup = deviceGroup;
        return this;
    }
    public String getDeviceGroup() {
        return this.deviceGroup;
    }

}
