// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    @NameInMap("Callback")
    public String callback;

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

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Region")
    public String region;

    @NameInMap("Retention")
    public Long retention;

    @NameInMap("TransConfigsJSON")
    public String transConfigsJSON;

    @NameInMap("Trigger")
    public String trigger;

    @NameInMap("Type")
    public String type;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public CreateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public CreateTemplateRequest setFlv(String flv) {
        this.flv = flv;
        return this;
    }
    public String getFlv() {
        return this.flv;
    }

    public CreateTemplateRequest setHlsM3u8(String hlsM3u8) {
        this.hlsM3u8 = hlsM3u8;
        return this;
    }
    public String getHlsM3u8() {
        return this.hlsM3u8;
    }

    public CreateTemplateRequest setHlsTs(String hlsTs) {
        this.hlsTs = hlsTs;
        return this;
    }
    public String getHlsTs() {
        return this.hlsTs;
    }

    public CreateTemplateRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateTemplateRequest setJpgOnDemand(String jpgOnDemand) {
        this.jpgOnDemand = jpgOnDemand;
        return this;
    }
    public String getJpgOnDemand() {
        return this.jpgOnDemand;
    }

    public CreateTemplateRequest setJpgOverwrite(String jpgOverwrite) {
        this.jpgOverwrite = jpgOverwrite;
        return this;
    }
    public String getJpgOverwrite() {
        return this.jpgOverwrite;
    }

    public CreateTemplateRequest setJpgSequence(String jpgSequence) {
        this.jpgSequence = jpgSequence;
        return this;
    }
    public String getJpgSequence() {
        return this.jpgSequence;
    }

    public CreateTemplateRequest setMp4(String mp4) {
        this.mp4 = mp4;
        return this;
    }
    public String getMp4() {
        return this.mp4;
    }

    public CreateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTemplateRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateTemplateRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreateTemplateRequest setOssFilePrefix(String ossFilePrefix) {
        this.ossFilePrefix = ossFilePrefix;
        return this;
    }
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    public CreateTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTemplateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateTemplateRequest setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public CreateTemplateRequest setTransConfigsJSON(String transConfigsJSON) {
        this.transConfigsJSON = transConfigsJSON;
        return this;
    }
    public String getTransConfigsJSON() {
        return this.transConfigsJSON;
    }

    public CreateTemplateRequest setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public String getTrigger() {
        return this.trigger;
    }

    public CreateTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
