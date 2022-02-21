// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeTemplatesResponseBodyTemplates> templates;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponseBody self = new DescribeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeTemplatesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplatesResponseBody setTemplates(java.util.List<DescribeTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public DescribeTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTemplatesResponseBodyTemplatesTransConfigs extends TeaModel {
        @NameInMap("Fps")
        public Long fps;

        @NameInMap("Gop")
        public Long gop;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Name")
        public String name;

        @NameInMap("VideoBitrate")
        public Long videoBitrate;

        @NameInMap("VideoCodec")
        public String videoCodec;

        @NameInMap("Width")
        public Long width;

        @NameInMap("id")
        public String id;

        public static DescribeTemplatesResponseBodyTemplatesTransConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyTemplatesTransConfigs self = new DescribeTemplatesResponseBodyTemplatesTransConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setFps(Long fps) {
            this.fps = fps;
            return this;
        }
        public Long getFps() {
            return this.fps;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setGop(Long gop) {
            this.gop = gop;
            return this;
        }
        public Long getGop() {
            return this.gop;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setVideoBitrate(Long videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Long getVideoBitrate() {
            return this.videoBitrate;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeTemplatesResponseBodyTemplates extends TeaModel {
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

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("TransConfigs")
        public java.util.List<DescribeTemplatesResponseBodyTemplatesTransConfigs> transConfigs;

        @NameInMap("Trigger")
        public String trigger;

        @NameInMap("Type")
        public String type;

        public static DescribeTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyTemplates self = new DescribeTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyTemplates setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public DescribeTemplatesResponseBodyTemplates setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplatesResponseBodyTemplates setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public DescribeTemplatesResponseBodyTemplates setFlv(String flv) {
            this.flv = flv;
            return this;
        }
        public String getFlv() {
            return this.flv;
        }

        public DescribeTemplatesResponseBodyTemplates setHlsM3u8(String hlsM3u8) {
            this.hlsM3u8 = hlsM3u8;
            return this;
        }
        public String getHlsM3u8() {
            return this.hlsM3u8;
        }

        public DescribeTemplatesResponseBodyTemplates setHlsTs(String hlsTs) {
            this.hlsTs = hlsTs;
            return this;
        }
        public String getHlsTs() {
            return this.hlsTs;
        }

        public DescribeTemplatesResponseBodyTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTemplatesResponseBodyTemplates setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public DescribeTemplatesResponseBodyTemplates setJpgOnDemand(String jpgOnDemand) {
            this.jpgOnDemand = jpgOnDemand;
            return this;
        }
        public String getJpgOnDemand() {
            return this.jpgOnDemand;
        }

        public DescribeTemplatesResponseBodyTemplates setJpgOverwrite(String jpgOverwrite) {
            this.jpgOverwrite = jpgOverwrite;
            return this;
        }
        public String getJpgOverwrite() {
            return this.jpgOverwrite;
        }

        public DescribeTemplatesResponseBodyTemplates setJpgSequence(String jpgSequence) {
            this.jpgSequence = jpgSequence;
            return this;
        }
        public String getJpgSequence() {
            return this.jpgSequence;
        }

        public DescribeTemplatesResponseBodyTemplates setMp4(String mp4) {
            this.mp4 = mp4;
            return this;
        }
        public String getMp4() {
            return this.mp4;
        }

        public DescribeTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplatesResponseBodyTemplates setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeTemplatesResponseBodyTemplates setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeTemplatesResponseBodyTemplates setOssFilePrefix(String ossFilePrefix) {
            this.ossFilePrefix = ossFilePrefix;
            return this;
        }
        public String getOssFilePrefix() {
            return this.ossFilePrefix;
        }

        public DescribeTemplatesResponseBodyTemplates setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeTemplatesResponseBodyTemplates setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeTemplatesResponseBodyTemplates setTransConfigs(java.util.List<DescribeTemplatesResponseBodyTemplatesTransConfigs> transConfigs) {
            this.transConfigs = transConfigs;
            return this;
        }
        public java.util.List<DescribeTemplatesResponseBodyTemplatesTransConfigs> getTransConfigs() {
            return this.transConfigs;
        }

        public DescribeTemplatesResponseBodyTemplates setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

        public DescribeTemplatesResponseBodyTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
