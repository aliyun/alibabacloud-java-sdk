// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>F3F88C96-CA6E-573E-B8F7-5BE83A1A0BCF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeTemplatesResponseBodyTemplates> templates;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public Long fps;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Gop")
        public Long gop;

        /**
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>sd</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("VideoBitrate")
        public Long videoBitrate;

        /**
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("VideoCodec")
        public String videoCodec;

        /**
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Long width;

        /**
         * <strong>example:</strong>
         * <p>399788187729597430-cn-qingdao</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <strong>example:</strong>
         * <p>2018-12-10T10:00:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        @NameInMap("Flv")
        public String flv;

        /**
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        @NameInMap("HlsM3u8")
        public String hlsM3u8;

        /**
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{UnixTimestamp}_{Sequence}</p>
         */
        @NameInMap("HlsTs")
        public String hlsTs;

        /**
         * <strong>example:</strong>
         * <p>323*****998-cn-qingdao</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}_ondemand.jpg</p>
         */
        @NameInMap("JpgOnDemand")
        public String jpgOnDemand;

        /**
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}.jpg</p>
         */
        @NameInMap("JpgOverwrite")
        public String jpgOverwrite;

        /**
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}.jpg</p>
         */
        @NameInMap("JpgSequence")
        public String jpgSequence;

        /**
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        @NameInMap("Mp4")
        public String mp4;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>my_oss_bucket</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-qingdao.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <strong>example:</strong>
         * <p>my_prefix</p>
         */
        @NameInMap("OssFilePrefix")
        public String ossFilePrefix;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Retention")
        public Long retention;

        @NameInMap("TransConfigs")
        public java.util.List<DescribeTemplatesResponseBodyTemplatesTransConfigs> transConfigs;

        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <strong>example:</strong>
         * <p>record</p>
         */
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
