// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddSearchVideoTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("VideoTags")
    public String videoTags;

    @NameInMap("ReturnVideoNumber")
    public Integer returnVideoNumber;

    @NameInMap("QueryTags")
    public String queryTags;

    @NameInMap("StorageType")
    public Integer storageType;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ReplaceStorageThreshold")
    public Float replaceStorageThreshold;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("SearchType")
    public Integer searchType;

    public static AddSearchVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSearchVideoTaskRequest self = new AddSearchVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddSearchVideoTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddSearchVideoTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public AddSearchVideoTaskRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public AddSearchVideoTaskRequest setVideoTags(String videoTags) {
        this.videoTags = videoTags;
        return this;
    }
    public String getVideoTags() {
        return this.videoTags;
    }

    public AddSearchVideoTaskRequest setReturnVideoNumber(Integer returnVideoNumber) {
        this.returnVideoNumber = returnVideoNumber;
        return this;
    }
    public Integer getReturnVideoNumber() {
        return this.returnVideoNumber;
    }

    public AddSearchVideoTaskRequest setQueryTags(String queryTags) {
        this.queryTags = queryTags;
        return this;
    }
    public String getQueryTags() {
        return this.queryTags;
    }

    public AddSearchVideoTaskRequest setStorageType(Integer storageType) {
        this.storageType = storageType;
        return this;
    }
    public Integer getStorageType() {
        return this.storageType;
    }

    public AddSearchVideoTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddSearchVideoTaskRequest setReplaceStorageThreshold(Float replaceStorageThreshold) {
        this.replaceStorageThreshold = replaceStorageThreshold;
        return this;
    }
    public Float getReplaceStorageThreshold() {
        return this.replaceStorageThreshold;
    }

    public AddSearchVideoTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSearchVideoTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddSearchVideoTaskRequest setSearchType(Integer searchType) {
        this.searchType = searchType;
        return this;
    }
    public Integer getSearchType() {
        return this.searchType;
    }

}
