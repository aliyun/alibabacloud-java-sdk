// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListDeviceChannelsResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("Channels")
    public java.util.List<ListDeviceChannelsResponseBodyChannels> channels;

    public static ListDeviceChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceChannelsResponseBody self = new ListDeviceChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceChannelsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDeviceChannelsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDeviceChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceChannelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDeviceChannelsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListDeviceChannelsResponseBody setChannels(java.util.List<ListDeviceChannelsResponseBodyChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<ListDeviceChannelsResponseBodyChannels> getChannels() {
        return this.channels;
    }

    public static class ListDeviceChannelsResponseBodyChannels extends TeaModel {
        @NameInMap("ChannelId")
        public Long channelId;

        @NameInMap("Params")
        public String params;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("DeviceId")
        public String deviceId;

        public static ListDeviceChannelsResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceChannelsResponseBodyChannels self = new ListDeviceChannelsResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public ListDeviceChannelsResponseBodyChannels setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public ListDeviceChannelsResponseBodyChannels setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListDeviceChannelsResponseBodyChannels setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListDeviceChannelsResponseBodyChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeviceChannelsResponseBodyChannels setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

}
