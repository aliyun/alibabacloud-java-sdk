// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsOnlineListResponseBody extends TeaModel {
    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("OnlineInfo")
    public DescribeVsStreamsOnlineListResponseBodyOnlineInfo onlineInfo;

    public static DescribeVsStreamsOnlineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsOnlineListResponseBody self = new DescribeVsStreamsOnlineListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsOnlineListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeVsStreamsOnlineListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeVsStreamsOnlineListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVsStreamsOnlineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsStreamsOnlineListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeVsStreamsOnlineListResponseBody setOnlineInfo(DescribeVsStreamsOnlineListResponseBodyOnlineInfo onlineInfo) {
        this.onlineInfo = onlineInfo;
        return this;
    }
    public DescribeVsStreamsOnlineListResponseBodyOnlineInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    public static class DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo extends TeaModel {
        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("PublishUrl")
        public String publishUrl;

        @NameInMap("Transcoded")
        public String transcoded;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("TranscodeId")
        public String transcodeId;

        @NameInMap("PublishDomain")
        public String publishDomain;

        public static DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo self = new DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

    }

    public static class DescribeVsStreamsOnlineListResponseBodyOnlineInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineInfo")
        public java.util.List<DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo> liveStreamOnlineInfo;

        public static DescribeVsStreamsOnlineListResponseBodyOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsOnlineListResponseBodyOnlineInfo self = new DescribeVsStreamsOnlineListResponseBodyOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfo setLiveStreamOnlineInfo(java.util.List<DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo> liveStreamOnlineInfo) {
            this.liveStreamOnlineInfo = liveStreamOnlineInfo;
            return this;
        }
        public java.util.List<DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo> getLiveStreamOnlineInfo() {
            return this.liveStreamOnlineInfo;
        }

    }

}
