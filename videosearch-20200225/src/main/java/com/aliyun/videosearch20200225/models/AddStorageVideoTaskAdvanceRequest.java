// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddStorageVideoTaskAdvanceRequest extends TeaModel {
    @NameInMap("VideoFileObject")
    @Validation(required = true)
    public java.io.InputStream videoFileObject;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VideoUrl")
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

    @NameInMap("Sort")
    public Integer sort;

    public static AddStorageVideoTaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStorageVideoTaskAdvanceRequest self = new AddStorageVideoTaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddStorageVideoTaskAdvanceRequest setVideoFileObject(java.io.InputStream videoFileObject) {
        this.videoFileObject = videoFileObject;
        return this;
    }
    public java.io.InputStream getVideoFileObject() {
        return this.videoFileObject;
    }

    public AddStorageVideoTaskAdvanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddStorageVideoTaskAdvanceRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public AddStorageVideoTaskAdvanceRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public AddStorageVideoTaskAdvanceRequest setVideoTags(String videoTags) {
        this.videoTags = videoTags;
        return this;
    }
    public String getVideoTags() {
        return this.videoTags;
    }

    public AddStorageVideoTaskAdvanceRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddStorageVideoTaskAdvanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddStorageVideoTaskAdvanceRequest setStorageInfo(Integer storageInfo) {
        this.storageInfo = storageInfo;
        return this;
    }
    public Integer getStorageInfo() {
        return this.storageInfo;
    }

    public AddStorageVideoTaskAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddStorageVideoTaskAdvanceRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

}
