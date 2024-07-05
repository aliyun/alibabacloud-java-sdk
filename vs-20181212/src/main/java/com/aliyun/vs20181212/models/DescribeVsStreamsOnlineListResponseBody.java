// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsOnlineListResponseBody extends TeaModel {
    @NameInMap("OnlineInfo")
    public DescribeVsStreamsOnlineListResponseBodyOnlineInfo onlineInfo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>B31FC4AD-3592-573E-8063-878F722B322A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeVsStreamsOnlineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsOnlineListResponseBody self = new DescribeVsStreamsOnlineListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsOnlineListResponseBody setOnlineInfo(DescribeVsStreamsOnlineListResponseBodyOnlineInfo onlineInfo) {
        this.onlineInfo = onlineInfo;
        return this;
    }
    public DescribeVsStreamsOnlineListResponseBodyOnlineInfo getOnlineInfo() {
        return this.onlineInfo;
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

    public DescribeVsStreamsOnlineListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxApp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>push.example.com</p>
         */
        @NameInMap("PublishDomain")
        public String publishDomain;

        /**
         * <strong>example:</strong>
         * <p>2015-12-02T06:58:04Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <strong>example:</strong>
         * <p>edge</p>
         */
        @NameInMap("PublishType")
        public String publishType;

        /**
         * <strong>example:</strong>
         * <p>rtmp://example.com/xchen</p>
         */
        @NameInMap("PublishUrl")
        public String publishUrl;

        /**
         * <strong>example:</strong>
         * <p>testxchen_small</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TranscodeId")
        public String transcodeId;

        /**
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("Transcoded")
        public String transcoded;

        public static DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo self = new DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
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

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

        public DescribeVsStreamsOnlineListResponseBodyOnlineInfoLiveStreamOnlineInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
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
