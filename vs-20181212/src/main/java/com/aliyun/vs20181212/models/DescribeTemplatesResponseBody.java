// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
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

    @NameInMap("Templates")
    public java.util.List<DescribeTemplatesResponseBodyTemplates> templates;

    public static DescribeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponseBody self = new DescribeTemplatesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeTemplatesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeTemplatesResponseBody setTemplates(java.util.List<DescribeTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class DescribeTemplatesResponseBodyTemplatesTransConfigs extends TeaModel {
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

        @NameInMap("id")
        public String id;

        public static DescribeTemplatesResponseBodyTemplatesTransConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyTemplatesTransConfigs self = new DescribeTemplatesResponseBodyTemplatesTransConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setGop(Long gop) {
            this.gop = gop;
            return this;
        }
        public Long getGop() {
            return this.gop;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setVideoBitrate(Long videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Long getVideoBitrate() {
            return this.videoBitrate;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setFps(Long fps) {
            this.fps = fps;
            return this;
        }
        public Long getFps() {
            return this.fps;
        }

        public DescribeTemplatesResponseBodyTemplatesTransConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
        @NameInMap("Type")
        public String type;

        @NameInMap("Trigger")
        public String trigger;

        @NameInMap("OssFilePrefix")
        public String ossFilePrefix;

        @NameInMap("HlsTs")
        public String hlsTs;

        @NameInMap("Mp4")
        public String mp4;

        @NameInMap("JpgOnDemand")
        public String jpgOnDemand;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("JpgSequence")
        public String jpgSequence;

        @NameInMap("JpgOverwrite")
        public String jpgOverwrite;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("Callback")
        public String callback;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("Description")
        public String description;

        @NameInMap("Region")
        public String region;

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("HlsM3u8")
        public String hlsM3u8;

        @NameInMap("Flv")
        public String flv;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("Id")
        public String id;

        @NameInMap("TransConfigs")
        public java.util.List<DescribeTemplatesResponseBodyTemplatesTransConfigs> transConfigs;

        public static DescribeTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyTemplates self = new DescribeTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeTemplatesResponseBodyTemplates setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

        public DescribeTemplatesResponseBodyTemplates setOssFilePrefix(String ossFilePrefix) {
            this.ossFilePrefix = ossFilePrefix;
            return this;
        }
        public String getOssFilePrefix() {
            return this.ossFilePrefix;
        }

        public DescribeTemplatesResponseBodyTemplates setHlsTs(String hlsTs) {
            this.hlsTs = hlsTs;
            return this;
        }
        public String getHlsTs() {
            return this.hlsTs;
        }

        public DescribeTemplatesResponseBodyTemplates setMp4(String mp4) {
            this.mp4 = mp4;
            return this;
        }
        public String getMp4() {
            return this.mp4;
        }

        public DescribeTemplatesResponseBodyTemplates setJpgOnDemand(String jpgOnDemand) {
            this.jpgOnDemand = jpgOnDemand;
            return this;
        }
        public String getJpgOnDemand() {
            return this.jpgOnDemand;
        }

        public DescribeTemplatesResponseBodyTemplates setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeTemplatesResponseBodyTemplates setJpgSequence(String jpgSequence) {
            this.jpgSequence = jpgSequence;
            return this;
        }
        public String getJpgSequence() {
            return this.jpgSequence;
        }

        public DescribeTemplatesResponseBodyTemplates setJpgOverwrite(String jpgOverwrite) {
            this.jpgOverwrite = jpgOverwrite;
            return this;
        }
        public String getJpgOverwrite() {
            return this.jpgOverwrite;
        }

        public DescribeTemplatesResponseBodyTemplates setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public DescribeTemplatesResponseBodyTemplates setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public DescribeTemplatesResponseBodyTemplates setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTemplatesResponseBodyTemplates setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeTemplatesResponseBodyTemplates setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public DescribeTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeTemplatesResponseBodyTemplates setHlsM3u8(String hlsM3u8) {
            this.hlsM3u8 = hlsM3u8;
            return this;
        }
        public String getHlsM3u8() {
            return this.hlsM3u8;
        }

        public DescribeTemplatesResponseBodyTemplates setFlv(String flv) {
            this.flv = flv;
            return this;
        }
        public String getFlv() {
            return this.flv;
        }

        public DescribeTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplatesResponseBodyTemplates setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeTemplatesResponseBodyTemplates setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeTemplatesResponseBodyTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTemplatesResponseBodyTemplates setTransConfigs(java.util.List<DescribeTemplatesResponseBodyTemplatesTransConfigs> transConfigs) {
            this.transConfigs = transConfigs;
            return this;
        }
        public java.util.List<DescribeTemplatesResponseBodyTemplatesTransConfigs> getTransConfigs() {
            return this.transConfigs;
        }

    }

}
