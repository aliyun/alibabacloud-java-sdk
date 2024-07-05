// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceChannelsResponseBody extends TeaModel {
    @NameInMap("Channels")
    public java.util.List<DescribeDeviceChannelsResponseBodyChannels> channels;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>4641C72D-462E-4AEA-8485-FC267AF90B0A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDeviceChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceChannelsResponseBody self = new DescribeDeviceChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceChannelsResponseBody setChannels(java.util.List<DescribeDeviceChannelsResponseBodyChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<DescribeDeviceChannelsResponseBodyChannels> getChannels() {
        return this.channels;
    }

    public DescribeDeviceChannelsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeDeviceChannelsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeDeviceChannelsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceChannelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeviceChannelsResponseBodyChannels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelId")
        public Long channelId;

        /**
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <strong>example:</strong>
         * <p>3100000****000000002</p>
         */
        @NameInMap("GbId")
        public String gbId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <strong>example:</strong>
         * <p>323*****997-cn-qingdao</p>
         */
        @NameInMap("StreamId")
        public String streamId;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("StreamStatus")
        public String streamStatus;

        public static DescribeDeviceChannelsResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceChannelsResponseBodyChannels self = new DescribeDeviceChannelsResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceChannelsResponseBodyChannels setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public DescribeDeviceChannelsResponseBodyChannels setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDeviceChannelsResponseBodyChannels setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public DescribeDeviceChannelsResponseBodyChannels setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public DescribeDeviceChannelsResponseBodyChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeviceChannelsResponseBodyChannels setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeDeviceChannelsResponseBodyChannels setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

        public DescribeDeviceChannelsResponseBodyChannels setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

    }

}
