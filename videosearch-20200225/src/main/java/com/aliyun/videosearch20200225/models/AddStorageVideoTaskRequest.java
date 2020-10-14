// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddStorageVideoTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("VideoTags")
    public String videoTags;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("Description")
    public String description;

    @NameInMap("StorageInfo")
    public Integer storageInfo;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddStorageVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStorageVideoTaskRequest self = new AddStorageVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddStorageVideoTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddStorageVideoTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public AddStorageVideoTaskRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public AddStorageVideoTaskRequest setVideoTags(String videoTags) {
        this.videoTags = videoTags;
        return this;
    }
    public String getVideoTags() {
        return this.videoTags;
    }

    public AddStorageVideoTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddStorageVideoTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddStorageVideoTaskRequest setStorageInfo(Integer storageInfo) {
        this.storageInfo = storageInfo;
        return this;
    }
    public Integer getStorageInfo() {
        return this.storageInfo;
    }

    public AddStorageVideoTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
