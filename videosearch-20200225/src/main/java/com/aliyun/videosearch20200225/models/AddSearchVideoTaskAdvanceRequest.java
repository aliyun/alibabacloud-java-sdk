// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddSearchVideoTaskAdvanceRequest extends TeaModel {
    @NameInMap("VideoFileObject")
    @Validation(required = true)
    public java.io.InputStream videoFileObject;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VideoUrl")
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

    @NameInMap("Sort")
    public Integer sort;

    @NameInMap("NeedFeatureFile")
    public Integer needFeatureFile;

    public static AddSearchVideoTaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSearchVideoTaskAdvanceRequest self = new AddSearchVideoTaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddSearchVideoTaskAdvanceRequest setVideoFileObject(java.io.InputStream videoFileObject) {
        this.videoFileObject = videoFileObject;
        return this;
    }
    public java.io.InputStream getVideoFileObject() {
        return this.videoFileObject;
    }

    public AddSearchVideoTaskAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddSearchVideoTaskAdvanceRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public AddSearchVideoTaskAdvanceRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public AddSearchVideoTaskAdvanceRequest setVideoTags(String videoTags) {
        this.videoTags = videoTags;
        return this;
    }
    public String getVideoTags() {
        return this.videoTags;
    }

    public AddSearchVideoTaskAdvanceRequest setReturnVideoNumber(Integer returnVideoNumber) {
        this.returnVideoNumber = returnVideoNumber;
        return this;
    }
    public Integer getReturnVideoNumber() {
        return this.returnVideoNumber;
    }

    public AddSearchVideoTaskAdvanceRequest setQueryTags(String queryTags) {
        this.queryTags = queryTags;
        return this;
    }
    public String getQueryTags() {
        return this.queryTags;
    }

    public AddSearchVideoTaskAdvanceRequest setStorageType(Integer storageType) {
        this.storageType = storageType;
        return this;
    }
    public Integer getStorageType() {
        return this.storageType;
    }

    public AddSearchVideoTaskAdvanceRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddSearchVideoTaskAdvanceRequest setReplaceStorageThreshold(Float replaceStorageThreshold) {
        this.replaceStorageThreshold = replaceStorageThreshold;
        return this;
    }
    public Float getReplaceStorageThreshold() {
        return this.replaceStorageThreshold;
    }

    public AddSearchVideoTaskAdvanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSearchVideoTaskAdvanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddSearchVideoTaskAdvanceRequest setSearchType(Integer searchType) {
        this.searchType = searchType;
        return this;
    }
    public Integer getSearchType() {
        return this.searchType;
    }

    public AddSearchVideoTaskAdvanceRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

    public AddSearchVideoTaskAdvanceRequest setNeedFeatureFile(Integer needFeatureFile) {
        this.needFeatureFile = needFeatureFile;
        return this;
    }
    public Integer getNeedFeatureFile() {
        return this.needFeatureFile;
    }

}
