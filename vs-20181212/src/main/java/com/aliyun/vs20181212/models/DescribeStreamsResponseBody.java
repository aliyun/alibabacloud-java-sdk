// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamsResponseBody extends TeaModel {
    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of streams.</p>
     */
    @NameInMap("Streams")
    public java.util.List<DescribeStreamsResponseBodyStreams> streams;

    /**
     * <p>The total number of streams.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeStreamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamsResponseBody self = new DescribeStreamsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeStreamsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeStreamsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeStreamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamsResponseBody setStreams(java.util.List<DescribeStreamsResponseBodyStreams> streams) {
        this.streams = streams;
        return this;
    }
    public java.util.List<DescribeStreamsResponseBodyStreams> getStreams() {
        return this.streams;
    }

    public DescribeStreamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStreamsResponseBodyStreams extends TeaModel {
        /**
         * <p>The application to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The time when the stream was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-10T17:00:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the device to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>Indicates whether the stream is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the space to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****174-cn-qingdao</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The height of the video stream resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The stream ID.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****997-cn-qingdao</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The stream name.</p>
         * 
         * <strong>example:</strong>
         * <p>31000000*****0000002</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The playback domain name to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("PlayDomain")
        public String playDomain;

        /**
         * <p>The stream protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>gb28181</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ingest domain name to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("PushDomain")
        public String pushDomain;

        /**
         * <p>The stream status. Valid values:</p>
         * <ul>
         * <li>on: online</li>
         * <li>off: offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The width of the video stream resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static DescribeStreamsResponseBodyStreams build(java.util.Map<String, ?> map) throws Exception {
            DescribeStreamsResponseBodyStreams self = new DescribeStreamsResponseBodyStreams();
            return TeaModel.build(map, self);
        }

        public DescribeStreamsResponseBodyStreams setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeStreamsResponseBodyStreams setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeStreamsResponseBodyStreams setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeStreamsResponseBodyStreams setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeStreamsResponseBodyStreams setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeStreamsResponseBodyStreams setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeStreamsResponseBodyStreams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeStreamsResponseBodyStreams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStreamsResponseBodyStreams setPlayDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }
        public String getPlayDomain() {
            return this.playDomain;
        }

        public DescribeStreamsResponseBodyStreams setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeStreamsResponseBodyStreams setPushDomain(String pushDomain) {
            this.pushDomain = pushDomain;
            return this;
        }
        public String getPushDomain() {
            return this.pushDomain;
        }

        public DescribeStreamsResponseBodyStreams setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStreamsResponseBodyStreams setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
