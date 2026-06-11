// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DevicePageResponseBody extends TeaModel {
    @NameInMap("DeviceList")
    public java.util.List<DevicePageResponseBodyDeviceList> deviceList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DevicePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DevicePageResponseBody self = new DevicePageResponseBody();
        return TeaModel.build(map, self);
    }

    public DevicePageResponseBody setDeviceList(java.util.List<DevicePageResponseBodyDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<DevicePageResponseBodyDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public DevicePageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DevicePageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DevicePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DevicePageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DevicePageResponseBodyDeviceList extends TeaModel {
        @NameInMap("ActiveTime")
        public String activeTime;

        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("DailyCount")
        public Integer dailyCount;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("OrderType")
        public Integer orderType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubAliyunUid")
        public String subAliyunUid;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UserActiveTime")
        public String userActiveTime;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static DevicePageResponseBodyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            DevicePageResponseBodyDeviceList self = new DevicePageResponseBodyDeviceList();
            return TeaModel.build(map, self);
        }

        public DevicePageResponseBodyDeviceList setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public DevicePageResponseBodyDeviceList setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public DevicePageResponseBodyDeviceList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DevicePageResponseBodyDeviceList setDailyCount(Integer dailyCount) {
            this.dailyCount = dailyCount;
            return this;
        }
        public Integer getDailyCount() {
            return this.dailyCount;
        }

        public DevicePageResponseBodyDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DevicePageResponseBodyDeviceList setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public DevicePageResponseBodyDeviceList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DevicePageResponseBodyDeviceList setSubAliyunUid(String subAliyunUid) {
            this.subAliyunUid = subAliyunUid;
            return this;
        }
        public String getSubAliyunUid() {
            return this.subAliyunUid;
        }

        public DevicePageResponseBodyDeviceList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DevicePageResponseBodyDeviceList setUserActiveTime(String userActiveTime) {
            this.userActiveTime = userActiveTime;
            return this;
        }
        public String getUserActiveTime() {
            return this.userActiveTime;
        }

        public DevicePageResponseBodyDeviceList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
