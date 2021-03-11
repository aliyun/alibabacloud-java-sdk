// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Region")
    public String region;

    @NameInMap("InProtocol")
    public String inProtocol;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("PushDomain")
    public String pushDomain;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("LazyPull")
    public Boolean lazyPull;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("CaptureInterval")
    public Integer captureInterval;

    @NameInMap("CaptureImage")
    public Integer captureImage;

    @NameInMap("CaptureVideo")
    public Integer captureVideo;

    @NameInMap("CaptureOssBucket")
    public String captureOssBucket;

    @NameInMap("CaptureOssPath")
    public String captureOssPath;

    public static ModifyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupRequest self = new ModifyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyGroupRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public ModifyGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyGroupRequest setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public ModifyGroupRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public ModifyGroupRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModifyGroupRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public ModifyGroupRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public ModifyGroupRequest setLazyPull(Boolean lazyPull) {
        this.lazyPull = lazyPull;
        return this;
    }
    public Boolean getLazyPull() {
        return this.lazyPull;
    }

    public ModifyGroupRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public ModifyGroupRequest setCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
        return this;
    }
    public Integer getCaptureInterval() {
        return this.captureInterval;
    }

    public ModifyGroupRequest setCaptureImage(Integer captureImage) {
        this.captureImage = captureImage;
        return this;
    }
    public Integer getCaptureImage() {
        return this.captureImage;
    }

    public ModifyGroupRequest setCaptureVideo(Integer captureVideo) {
        this.captureVideo = captureVideo;
        return this;
    }
    public Integer getCaptureVideo() {
        return this.captureVideo;
    }

    public ModifyGroupRequest setCaptureOssBucket(String captureOssBucket) {
        this.captureOssBucket = captureOssBucket;
        return this;
    }
    public String getCaptureOssBucket() {
        return this.captureOssBucket;
    }

    public ModifyGroupRequest setCaptureOssPath(String captureOssPath) {
        this.captureOssPath = captureOssPath;
        return this;
    }
    public String getCaptureOssPath() {
        return this.captureOssPath;
    }

}
