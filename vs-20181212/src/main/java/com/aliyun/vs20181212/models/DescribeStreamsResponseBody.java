// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamsResponseBody extends TeaModel {
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

    @NameInMap("Streams")
    public java.util.List<DescribeStreamsResponseBodyStreams> streams;

    public static DescribeStreamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamsResponseBody self = new DescribeStreamsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeStreamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeStreamsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeStreamsResponseBody setStreams(java.util.List<DescribeStreamsResponseBodyStreams> streams) {
        this.streams = streams;
        return this;
    }
    public java.util.List<DescribeStreamsResponseBodyStreams> getStreams() {
        return this.streams;
    }

    public static class DescribeStreamsResponseBodyStreams extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PlayDomain")
        public String playDomain;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("App")
        public String app;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Name")
        public String name;

        @NameInMap("PushDomain")
        public String pushDomain;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        public static DescribeStreamsResponseBodyStreams build(java.util.Map<String, ?> map) throws Exception {
            DescribeStreamsResponseBodyStreams self = new DescribeStreamsResponseBodyStreams();
            return TeaModel.build(map, self);
        }

        public DescribeStreamsResponseBodyStreams setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public DescribeStreamsResponseBodyStreams setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeStreamsResponseBodyStreams setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeStreamsResponseBodyStreams setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeStreamsResponseBodyStreams setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeStreamsResponseBodyStreams setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeStreamsResponseBodyStreams setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeStreamsResponseBodyStreams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStreamsResponseBodyStreams setPushDomain(String pushDomain) {
            this.pushDomain = pushDomain;
            return this;
        }
        public String getPushDomain() {
            return this.pushDomain;
        }

        public DescribeStreamsResponseBodyStreams setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeStreamsResponseBodyStreams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
