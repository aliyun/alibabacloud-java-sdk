// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainOnlineUserNumResponseBody extends TeaModel {
    @NameInMap("OnlineUserInfo")
    public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo onlineUserInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamCount")
    public Integer streamCount;

    @NameInMap("UserCount")
    public Integer userCount;

    public static DescribeVsDomainOnlineUserNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainOnlineUserNumResponseBody self = new DescribeVsDomainOnlineUserNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainOnlineUserNumResponseBody setOnlineUserInfo(DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo onlineUserInfo) {
        this.onlineUserInfo = onlineUserInfo;
        return this;
    }
    public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo getOnlineUserInfo() {
        return this.onlineUserInfo;
    }

    public DescribeVsDomainOnlineUserNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainOnlineUserNumResponseBody setStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
        return this;
    }
    public Integer getStreamCount() {
        return this.streamCount;
    }

    public DescribeVsDomainOnlineUserNumResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public static class DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo extends TeaModel {
        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

        @NameInMap("UserNumber")
        public Long userNumber;

        public static DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo self = new DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo setUserNumber(Long userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public Long getUserNumber() {
            return this.userNumber;
        }

    }

    public static class DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos extends TeaModel {
        @NameInMap("Info")
        public java.util.List<DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> info;

        public static DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos self = new DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos setInfo(java.util.List<DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> getInfo() {
            return this.info;
        }

    }

    public static class DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo extends TeaModel {
        @NameInMap("Infos")
        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo self = new DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setInfos(DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos) {
            this.infos = infos;
            return this;
        }
        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos getInfos() {
            return this.infos;
        }

        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineUserNumInfo")
        public java.util.List<DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo;

        public static DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo self = new DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfo setLiveStreamOnlineUserNumInfo(java.util.List<DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo) {
            this.liveStreamOnlineUserNumInfo = liveStreamOnlineUserNumInfo;
            return this;
        }
        public java.util.List<DescribeVsDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfo() {
            return this.liveStreamOnlineUserNumInfo;
        }

    }

}
