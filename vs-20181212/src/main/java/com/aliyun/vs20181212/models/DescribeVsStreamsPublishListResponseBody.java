// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsPublishListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PublishInfo")
    public DescribeVsStreamsPublishListResponseBodyPublishInfo publishInfo;

    /**
     * <strong>example:</strong>
     * <p>119F7639-4646-51A4-B6C1-300D391C0104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeVsStreamsPublishListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsPublishListResponseBody self = new DescribeVsStreamsPublishListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsPublishListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeVsStreamsPublishListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVsStreamsPublishListResponseBody setPublishInfo(DescribeVsStreamsPublishListResponseBodyPublishInfo publishInfo) {
        this.publishInfo = publishInfo;
        return this;
    }
    public DescribeVsStreamsPublishListResponseBodyPublishInfo getPublishInfo() {
        return this.publishInfo;
    }

    public DescribeVsStreamsPublishListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsStreamsPublishListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeVsStreamsPublishListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxApp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("EdgeNodeAddr")
        public String edgeNodeAddr;

        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("PublishDomain")
        public String publishDomain;

        /**
         * <strong>example:</strong>
         * <p>2016-06-29T19:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("PublishType")
        public String publishType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/xxxApp/3402000****320000001.m3u8">https://example.aliyundoc.com/xxxApp/3402000****320000001.m3u8</a></p>
         */
        @NameInMap("PublishUrl")
        public String publishUrl;

        /**
         * <strong>example:</strong>
         * <p>2016-06-29T19:00:00Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <strong>example:</strong>
         * <p>xxxStream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/xxxApp/3402000****320000001.m3u8">https://example.aliyundoc.com/xxxApp/3402000****320000001.m3u8</a></p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        /**
         * <strong>example:</strong>
         * <p>3888920****8138204-cn-qingdao</p>
         */
        @NameInMap("TranscodeId")
        public String transcodeId;

        /**
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("Transcoded")
        public String transcoded;

        public static DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo self = new DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setEdgeNodeAddr(String edgeNodeAddr) {
            this.edgeNodeAddr = edgeNodeAddr;
            return this;
        }
        public String getEdgeNodeAddr() {
            return this.edgeNodeAddr;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
        }

    }

    public static class DescribeVsStreamsPublishListResponseBodyPublishInfo extends TeaModel {
        @NameInMap("LiveStreamPublishInfo")
        public java.util.List<DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> liveStreamPublishInfo;

        public static DescribeVsStreamsPublishListResponseBodyPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsPublishListResponseBodyPublishInfo self = new DescribeVsStreamsPublishListResponseBodyPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfo setLiveStreamPublishInfo(java.util.List<DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> liveStreamPublishInfo) {
            this.liveStreamPublishInfo = liveStreamPublishInfo;
            return this;
        }
        public java.util.List<DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> getLiveStreamPublishInfo() {
            return this.liveStreamPublishInfo;
        }

    }

}
