// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddSearchAudioTaskAdvanceRequest extends TeaModel {
    @NameInMap("AudioFileObject")
    @Validation(required = true)
    public java.io.InputStream audioFileObject;

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

    @NameInMap("Sort")
    public Integer sort;

    @NameInMap("NeedFeatureFile")
    public Integer needFeatureFile;

    @NameInMap("ResourceType")
    public Integer resourceType;

    public static AddSearchAudioTaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSearchAudioTaskAdvanceRequest self = new AddSearchAudioTaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddSearchAudioTaskAdvanceRequest setAudioFileObject(java.io.InputStream audioFileObject) {
        this.audioFileObject = audioFileObject;
        return this;
    }
    public java.io.InputStream getAudioFileObject() {
        return this.audioFileObject;
    }

    public AddSearchAudioTaskAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddSearchAudioTaskAdvanceRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public AddSearchAudioTaskAdvanceRequest setReturnAudioNumber(Integer returnAudioNumber) {
        this.returnAudioNumber = returnAudioNumber;
        return this;
    }
    public Integer getReturnAudioNumber() {
        return this.returnAudioNumber;
    }

    public AddSearchAudioTaskAdvanceRequest setQueryTags(String queryTags) {
        this.queryTags = queryTags;
        return this;
    }
    public String getQueryTags() {
        return this.queryTags;
    }

    public AddSearchAudioTaskAdvanceRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddSearchAudioTaskAdvanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSearchAudioTaskAdvanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddSearchAudioTaskAdvanceRequest setContentSource(Integer contentSource) {
        this.contentSource = contentSource;
        return this;
    }
    public Integer getContentSource() {
        return this.contentSource;
    }

    public AddSearchAudioTaskAdvanceRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

    public AddSearchAudioTaskAdvanceRequest setNeedFeatureFile(Integer needFeatureFile) {
        this.needFeatureFile = needFeatureFile;
        return this;
    }
    public Integer getNeedFeatureFile() {
        return this.needFeatureFile;
    }

    public AddSearchAudioTaskAdvanceRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
