// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplateResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HlsTs")
    public String hlsTs;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("Retention")
    public Long retention;

    @NameInMap("FileFormat")
    public String fileFormat;

    @NameInMap("Name")
    public String name;

    @NameInMap("Mp4")
    public String mp4;

    @NameInMap("JpgOnDemand")
    public String jpgOnDemand;

    @NameInMap("Flv")
    public String flv;

    @NameInMap("OssFilePrefix")
    public String ossFilePrefix;

    @NameInMap("Trigger")
    public String trigger;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransConfigs")
    public java.util.List<DescribeTemplateResponseBodyTransConfigs> transConfigs;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("JpgSequence")
    public String jpgSequence;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("JpgOverwrite")
    public String jpgOverwrite;

    @NameInMap("Region")
    public String region;

    @NameInMap("Id")
    public String id;

    @NameInMap("HlsM3u8")
    public String hlsM3u8;

    @NameInMap("Interval")
    public Long interval;

    public static DescribeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResponseBody self = new DescribeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeTemplateResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeTemplateResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTemplateResponseBody setHlsTs(String hlsTs) {
        this.hlsTs = hlsTs;
        return this;
    }
    public String getHlsTs() {
        return this.hlsTs;
    }

    public DescribeTemplateResponseBody setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public DescribeTemplateResponseBody setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public DescribeTemplateResponseBody setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public DescribeTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeTemplateResponseBody setMp4(String mp4) {
        this.mp4 = mp4;
        return this;
    }
    public String getMp4() {
        return this.mp4;
    }

    public DescribeTemplateResponseBody setJpgOnDemand(String jpgOnDemand) {
        this.jpgOnDemand = jpgOnDemand;
        return this;
    }
    public String getJpgOnDemand() {
        return this.jpgOnDemand;
    }

    public DescribeTemplateResponseBody setFlv(String flv) {
        this.flv = flv;
        return this;
    }
    public String getFlv() {
        return this.flv;
    }

    public DescribeTemplateResponseBody setOssFilePrefix(String ossFilePrefix) {
        this.ossFilePrefix = ossFilePrefix;
        return this;
    }
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    public DescribeTemplateResponseBody setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public String getTrigger() {
        return this.trigger;
    }

    public DescribeTemplateResponseBody setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public DescribeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateResponseBody setTransConfigs(java.util.List<DescribeTemplateResponseBodyTransConfigs> transConfigs) {
        this.transConfigs = transConfigs;
        return this;
    }
    public java.util.List<DescribeTemplateResponseBodyTransConfigs> getTransConfigs() {
        return this.transConfigs;
    }

    public DescribeTemplateResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTemplateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeTemplateResponseBody setJpgSequence(String jpgSequence) {
        this.jpgSequence = jpgSequence;
        return this;
    }
    public String getJpgSequence() {
        return this.jpgSequence;
    }

    public DescribeTemplateResponseBody setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public DescribeTemplateResponseBody setJpgOverwrite(String jpgOverwrite) {
        this.jpgOverwrite = jpgOverwrite;
        return this;
    }
    public String getJpgOverwrite() {
        return this.jpgOverwrite;
    }

    public DescribeTemplateResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeTemplateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeTemplateResponseBody setHlsM3u8(String hlsM3u8) {
        this.hlsM3u8 = hlsM3u8;
        return this;
    }
    public String getHlsM3u8() {
        return this.hlsM3u8;
    }

    public DescribeTemplateResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public static class DescribeTemplateResponseBodyTransConfigs extends TeaModel {
        @NameInMap("Gop")
        public Long gop;

        @NameInMap("Width")
        public Long width;

        @NameInMap("VideoBitrate")
        public Long videoBitrate;

        @NameInMap("Height")
        public Long height;

        @NameInMap("VideoCodec")
        public String videoCodec;

        @NameInMap("Fps")
        public Long fps;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeTemplateResponseBodyTransConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateResponseBodyTransConfigs self = new DescribeTemplateResponseBodyTransConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateResponseBodyTransConfigs setGop(Long gop) {
            this.gop = gop;
            return this;
        }
        public Long getGop() {
            return this.gop;
        }

        public DescribeTemplateResponseBodyTransConfigs setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public DescribeTemplateResponseBodyTransConfigs setVideoBitrate(Long videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Long getVideoBitrate() {
            return this.videoBitrate;
        }

        public DescribeTemplateResponseBodyTransConfigs setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeTemplateResponseBodyTransConfigs setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public DescribeTemplateResponseBodyTransConfigs setFps(Long fps) {
            this.fps = fps;
            return this;
        }
        public Long getFps() {
            return this.fps;
        }

        public DescribeTemplateResponseBodyTransConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplateResponseBodyTransConfigs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
