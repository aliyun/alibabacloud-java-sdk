// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyTemplateRequest extends TeaModel {
    /**
     * <p>The callback URL that is used after the template is executed.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <p>The description of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>录制模板</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file format for storage. Separate multiple values with commas. Valid values:</p>
     * <ul>
     * <li><p>mp4</p>
     * </li>
     * <li><p>flv</p>
     * </li>
     * <li><p>hls</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Recording in FLV and MP4 formats is not supported in the China (Qingdao) region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hls</p>
     */
    @NameInMap("FileFormat")
    public String fileFormat;

    /**
     * <p>The storage path for FLV files. For information about the format, see the description of the Mp4 parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
     */
    @NameInMap("Flv")
    public String flv;

    /**
     * <p>The storage path for HLS M3U8 files. For information about the format, see the description of the Mp4 parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
     */
    @NameInMap("HlsM3u8")
    public String hlsM3u8;

    /**
     * <p>The storage path for HLS TS files.</p>
     * <ul>
     * <li><p>The path supports variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</p>
     * </li>
     * <li><p>You must include the {UnixTimestamp} and {Sequence} variables.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>osspath/record/{StreamName}/{UnixTimestamp}_{Sequence}</p>
     */
    @NameInMap("HlsTs")
    public String hlsTs;

    /**
     * <p>The ID of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****998-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The operation interval, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The storage path for JPG files. This path is used for on-demand snapshots.</p>
     * <ul>
     * <li><p>Only JPG images are supported.</p>
     * </li>
     * <li><p>The path supports variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</p>
     * </li>
     * <li><p>You must include either {UnixTimestamp} or {Sequence}.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}_ondemand.jpg</p>
     */
    @NameInMap("JpgOnDemand")
    public String jpgOnDemand;

    /**
     * <p>The storage path for JPG files. This path is used to overwrite snapshots.</p>
     * <ul>
     * <li><p>Only JPG images are supported.</p>
     * </li>
     * <li><p>The path supports variables such as {AppName} and {StreamName}.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>osspath/snapshot/{AppName}/{StreamName}.jpg</p>
     */
    @NameInMap("JpgOverwrite")
    public String jpgOverwrite;

    /**
     * <p>The storage path for JPG files. This path is used for sequence snapshots.</p>
     * <ul>
     * <li><p>Only JPG images are supported.</p>
     * </li>
     * <li><p>The path supports variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}.</p>
     * </li>
     * <li><p>You must include either {UnixTimestamp} or {Sequence}.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}.jpg</p>
     */
    @NameInMap("JpgSequence")
    public String jpgSequence;

    /**
     * <p>The storage path for MP4 files.</p>
     * <ul>
     * <li><p>The path supports variables such as {AppName}, {StreamName}, {Sequence}, {EscapedStartTime}, and {EscapedEndTime}.</p>
     * </li>
     * <li><p>You must include {EscapedStartTime} and {EscapedEndTime}.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
     */
    @NameInMap("Mp4")
    public String mp4;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>录制模板</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketname</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The domain name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-qingdao.aliyuncs.com</p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>The prefix of the OSS file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-prefix</p>
     */
    @NameInMap("OssFilePrefix")
    public String ossFilePrefix;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the Object Storage Service (OSS) bucket is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The retention period for time shifting, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>An array of transcoding configurations of the TransConfig type, in a JSON-formatted string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Fps&quot;:25,&quot;Gop&quot;:50,&quot;Height&quot;:720,&quot;VideoCodec&quot;:&quot;h264&quot;,&quot;Width&quot;:1280,&quot;Name&quot;:&quot;sd&quot;,&quot;VideoBitrate&quot;:800}]</p>
     */
    @NameInMap("TransConfigsJSON")
    public String transConfigsJSON;

    /**
     * <p>The trigger type of the template. The default value is auto. Valid values:</p>
     * <ul>
     * <li><p>auto (automatic)</p>
     * </li>
     * <li><p>ondemand (on-demand)</p>
     * </li>
     * </ul>
     * 
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
