// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

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
     * <p>This parameter is required.</p>
     * 
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
     * <p>bucketname</p>
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
     * <p>oss-prefix</p>
     */
    @NameInMap("OssFilePrefix")
    public String ossFilePrefix;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Fps&quot;:25,&quot;Gop&quot;:50,&quot;Height&quot;:720,&quot;VideoCodec&quot;:&quot;h264&quot;,&quot;Width&quot;:1280,&quot;Name&quot;:&quot;sd&quot;,&quot;VideoBitrate&quot;:800}]</p>
     */
    @NameInMap("TransConfigsJSON")
    public String transConfigsJSON;

    /**
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("Trigger")
    public String trigger;

    public static ModifyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateRequest self = new ModifyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public ModifyTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTemplateRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public ModifyTemplateRequest setFlv(String flv) {
        this.flv = flv;
        return this;
    }
    public String getFlv() {
        return this.flv;
    }

    public ModifyTemplateRequest setHlsM3u8(String hlsM3u8) {
        this.hlsM3u8 = hlsM3u8;
        return this;
    }
    public String getHlsM3u8() {
        return this.hlsM3u8;
    }

    public ModifyTemplateRequest setHlsTs(String hlsTs) {
        this.hlsTs = hlsTs;
        return this;
    }
    public String getHlsTs() {
        return this.hlsTs;
    }

    public ModifyTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyTemplateRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public ModifyTemplateRequest setJpgOnDemand(String jpgOnDemand) {
        this.jpgOnDemand = jpgOnDemand;
        return this;
    }
    public String getJpgOnDemand() {
        return this.jpgOnDemand;
    }

    public ModifyTemplateRequest setJpgOverwrite(String jpgOverwrite) {
        this.jpgOverwrite = jpgOverwrite;
        return this;
    }
    public String getJpgOverwrite() {
        return this.jpgOverwrite;
    }

    public ModifyTemplateRequest setJpgSequence(String jpgSequence) {
        this.jpgSequence = jpgSequence;
        return this;
    }
    public String getJpgSequence() {
        return this.jpgSequence;
    }

    public ModifyTemplateRequest setMp4(String mp4) {
        this.mp4 = mp4;
        return this;
    }
    public String getMp4() {
        return this.mp4;
    }

    public ModifyTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyTemplateRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public ModifyTemplateRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public ModifyTemplateRequest setOssFilePrefix(String ossFilePrefix) {
        this.ossFilePrefix = ossFilePrefix;
        return this;
    }
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    public ModifyTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTemplateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyTemplateRequest setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public ModifyTemplateRequest setTransConfigsJSON(String transConfigsJSON) {
        this.transConfigsJSON = transConfigsJSON;
        return this;
    }
    public String getTransConfigsJSON() {
        return this.transConfigsJSON;
    }

    public ModifyTemplateRequest setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public String getTrigger() {
        return this.trigger;
    }

}
