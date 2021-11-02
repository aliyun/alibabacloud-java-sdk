// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Clips")
    public String clips;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("MediaMetadata")
    public String mediaMetadata;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProduceConfig")
    public String produceConfig;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitLiveEditingRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingRequest self = new SubmitLiveEditingRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SubmitLiveEditingRequest setClips(String clips) {
        this.clips = clips;
        return this;
    }
    public String getClips() {
        return this.clips;
    }

    public SubmitLiveEditingRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public SubmitLiveEditingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitLiveEditingRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SubmitLiveEditingRequest setMediaMetadata(String mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
        return this;
    }
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    public SubmitLiveEditingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitLiveEditingRequest setProduceConfig(String produceConfig) {
        this.produceConfig = produceConfig;
        return this;
    }
    public String getProduceConfig() {
        return this.produceConfig;
    }

    public SubmitLiveEditingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitLiveEditingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitLiveEditingRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public SubmitLiveEditingRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitLiveEditingRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
