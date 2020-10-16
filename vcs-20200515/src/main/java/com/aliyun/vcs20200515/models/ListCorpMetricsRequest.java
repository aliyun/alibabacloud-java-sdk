// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpMetricsRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("TagCode")
    @Validation(required = true)
    public String tagCode;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("UserGroupList")
    public String userGroupList;

    @NameInMap("DeviceGroupList")
    public String deviceGroupList;

    @NameInMap("DeviceIdList")
    public String deviceIdList;

    public static ListCorpMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCorpMetricsRequest self = new ListCorpMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListCorpMetricsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListCorpMetricsRequest setTagCode(String tagCode) {
        this.tagCode = tagCode;
        return this;
    }
    public String getTagCode() {
        return this.tagCode;
    }

    public ListCorpMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListCorpMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCorpMetricsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListCorpMetricsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListCorpMetricsRequest setUserGroupList(String userGroupList) {
        this.userGroupList = userGroupList;
        return this;
    }
    public String getUserGroupList() {
        return this.userGroupList;
    }

    public ListCorpMetricsRequest setDeviceGroupList(String deviceGroupList) {
        this.deviceGroupList = deviceGroupList;
        return this;
    }
    public String getDeviceGroupList() {
        return this.deviceGroupList;
    }

    public ListCorpMetricsRequest setDeviceIdList(String deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

}
