// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("App")
    public String app;

    @NameInMap("Region")
    public String region;

    @NameInMap("InProtocol")
    public String inProtocol;

    @NameInMap("OutProtocol")
    public String outProtocol;

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

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateGroupRequest setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public CreateGroupRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public CreateGroupRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public CreateGroupRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public CreateGroupRequest setLazyPull(Boolean lazyPull) {
        this.lazyPull = lazyPull;
        return this;
    }
    public Boolean getLazyPull() {
        return this.lazyPull;
    }

    public CreateGroupRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public CreateGroupRequest setCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
        return this;
    }
    public Integer getCaptureInterval() {
        return this.captureInterval;
    }

    public CreateGroupRequest setCaptureImage(Integer captureImage) {
        this.captureImage = captureImage;
        return this;
    }
    public Integer getCaptureImage() {
        return this.captureImage;
    }

    public CreateGroupRequest setCaptureVideo(Integer captureVideo) {
        this.captureVideo = captureVideo;
        return this;
    }
    public Integer getCaptureVideo() {
        return this.captureVideo;
    }

    public CreateGroupRequest setCaptureOssBucket(String captureOssBucket) {
        this.captureOssBucket = captureOssBucket;
        return this;
    }
    public String getCaptureOssBucket() {
        return this.captureOssBucket;
    }

    public CreateGroupRequest setCaptureOssPath(String captureOssPath) {
        this.captureOssPath = captureOssPath;
        return this;
    }
    public String getCaptureOssPath() {
        return this.captureOssPath;
    }

}
