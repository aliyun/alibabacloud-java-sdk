// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplateResponseBody extends TeaModel {
    @NameInMap("Callback")
    public String callback;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileFormat")
    public String fileFormat;

    @NameInMap("Flv")
    public String flv;

    @NameInMap("HlsM3u8")
    public String hlsM3u8;

    @NameInMap("HlsTs")
    public String hlsTs;

    @NameInMap("Id")
    public String id;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("JpgOnDemand")
    public String jpgOnDemand;

    @NameInMap("JpgOverwrite")
    public String jpgOverwrite;

    @NameInMap("JpgSequence")
    public String jpgSequence;

    @NameInMap("Mp4")
    public String mp4;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssFilePrefix")
    public String ossFilePrefix;

    @NameInMap("Region")
    public String region;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Retention")
    public Long retention;

    @NameInMap("TransConfigs")
    public java.util.List<DescribeTemplateResponseBodyTransConfigs> transConfigs;

    @NameInMap("Trigger")
    public String trigger;

    @NameInMap("Type")
    public String type;

    public static DescribeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResponseBody self = new DescribeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResponseBody setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public DescribeTemplateResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeTemplateResponseBody setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public DescribeTemplateResponseBody setFlv(String flv) {
        this.flv = flv;
        return this;
    }
    public String getFlv() {
        return this.flv;
    }

    public DescribeTemplateResponseBody setHlsM3u8(String hlsM3u8) {
        this.hlsM3u8 = hlsM3u8;
        return this;
    }
    public String getHlsM3u8() {
        return this.hlsM3u8;
    }

    public DescribeTemplateResponseBody setHlsTs(String hlsTs) {
        this.hlsTs = hlsTs;
        return this;
    }
    public String getHlsTs() {
        return this.hlsTs;
    }

    public DescribeTemplateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeTemplateResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeTemplateResponseBody setJpgOnDemand(String jpgOnDemand) {
        this.jpgOnDemand = jpgOnDemand;
        return this;
    }
    public String getJpgOnDemand() {
        return this.jpgOnDemand;
    }

    public DescribeTemplateResponseBody setJpgOverwrite(String jpgOverwrite) {
        this.jpgOverwrite = jpgOverwrite;
        return this;
    }
    public String getJpgOverwrite() {
        return this.jpgOverwrite;
    }

    public DescribeTemplateResponseBody setJpgSequence(String jpgSequence) {
        this.jpgSequence = jpgSequence;
        return this;
    }
    public String getJpgSequence() {
        return this.jpgSequence;
    }

    public DescribeTemplateResponseBody setMp4(String mp4) {
        this.mp4 = mp4;
        return this;
    }
    public String getMp4() {
        return this.mp4;
    }

    public DescribeTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeTemplateResponseBody setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public DescribeTemplateResponseBody setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public DescribeTemplateResponseBody setOssFilePrefix(String ossFilePrefix) {
        this.ossFilePrefix = ossFilePrefix;
        return this;
    }
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    public DescribeTemplateResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateResponseBody setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public DescribeTemplateResponseBody setTransConfigs(java.util.List<DescribeTemplateResponseBodyTransConfigs> transConfigs) {
        this.transConfigs = transConfigs;
        return this;
    }
    public java.util.List<DescribeTemplateResponseBodyTransConfigs> getTransConfigs() {
        return this.transConfigs;
    }

    public DescribeTemplateResponseBody setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public String getTrigger() {
        return this.trigger;
    }

    public DescribeTemplateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeTemplateResponseBodyTransConfigs extends TeaModel {
        @NameInMap("Fps")
        public Long fps;

        @NameInMap("Gop")
        public Long gop;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("VideoBitrate")
        public Long videoBitrate;

        @NameInMap("VideoCodec")
        public String videoCodec;

        @NameInMap("Width")
        public Long width;

        public static DescribeTemplateResponseBodyTransConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateResponseBodyTransConfigs self = new DescribeTemplateResponseBodyTransConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateResponseBodyTransConfigs setFps(Long fps) {
            this.fps = fps;
            return this;
        }
        public Long getFps() {
            return this.fps;
        }

        public DescribeTemplateResponseBodyTransConfigs setGop(Long gop) {
            this.gop = gop;
            return this;
        }
        public Long getGop() {
            return this.gop;
        }

        public DescribeTemplateResponseBodyTransConfigs setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeTemplateResponseBodyTransConfigs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTemplateResponseBodyTransConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplateResponseBodyTransConfigs setVideoBitrate(Long videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Long getVideoBitrate() {
            return this.videoBitrate;
        }

        public DescribeTemplateResponseBodyTransConfigs setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public DescribeTemplateResponseBodyTransConfigs setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
