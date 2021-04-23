// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddSearchAudioTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AudioUrl")
    public String audioUrl;

    @NameInMap("ReturnAudioNumber")
    public Integer returnAudioNumber;

    @NameInMap("QueryTags")
    public String queryTags;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ContentSource")
    public Integer contentSource;

    @NameInMap("AudioFile")
    public String audioFile;

    @NameInMap("Sort")
    public Integer sort;

    @NameInMap("NeedFeatureFile")
    public Integer needFeatureFile;

    @NameInMap("ResourceType")
    public Integer resourceType;

    public static AddSearchAudioTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSearchAudioTaskRequest self = new AddSearchAudioTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddSearchAudioTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddSearchAudioTaskRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public AddSearchAudioTaskRequest setReturnAudioNumber(Integer returnAudioNumber) {
        this.returnAudioNumber = returnAudioNumber;
        return this;
    }
    public Integer getReturnAudioNumber() {
        return this.returnAudioNumber;
    }

    public AddSearchAudioTaskRequest setQueryTags(String queryTags) {
        this.queryTags = queryTags;
        return this;
    }
    public String getQueryTags() {
        return this.queryTags;
    }

    public AddSearchAudioTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddSearchAudioTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSearchAudioTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddSearchAudioTaskRequest setContentSource(Integer contentSource) {
        this.contentSource = contentSource;
        return this;
    }
    public Integer getContentSource() {
        return this.contentSource;
    }

    public AddSearchAudioTaskRequest setAudioFile(String audioFile) {
        this.audioFile = audioFile;
        return this;
    }
    public String getAudioFile() {
        return this.audioFile;
    }

    public AddSearchAudioTaskRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

    public AddSearchAudioTaskRequest setNeedFeatureFile(Integer needFeatureFile) {
        this.needFeatureFile = needFeatureFile;
        return this;
    }
    public Integer getNeedFeatureFile() {
        return this.needFeatureFile;
    }

    public AddSearchAudioTaskRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
