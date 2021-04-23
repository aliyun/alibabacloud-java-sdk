// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddStorageAudioTaskAdvanceRequest extends TeaModel {
    @NameInMap("AudioFileObject")
    @Validation(required = true)
    public java.io.InputStream audioFileObject;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("AudioUrl")
    public String audioUrl;

    @NameInMap("AudioId")
    @Validation(required = true)
    public String audioId;

    @NameInMap("AudioTags")
    public String audioTags;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ContentSource")
    public Integer contentSource;

    @NameInMap("Sort")
    public Integer sort;

    public static AddStorageAudioTaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStorageAudioTaskAdvanceRequest self = new AddStorageAudioTaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddStorageAudioTaskAdvanceRequest setAudioFileObject(java.io.InputStream audioFileObject) {
        this.audioFileObject = audioFileObject;
        return this;
    }
    public java.io.InputStream getAudioFileObject() {
        return this.audioFileObject;
    }

    public AddStorageAudioTaskAdvanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddStorageAudioTaskAdvanceRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public AddStorageAudioTaskAdvanceRequest setAudioId(String audioId) {
        this.audioId = audioId;
        return this;
    }
    public String getAudioId() {
        return this.audioId;
    }

    public AddStorageAudioTaskAdvanceRequest setAudioTags(String audioTags) {
        this.audioTags = audioTags;
        return this;
    }
    public String getAudioTags() {
        return this.audioTags;
    }

    public AddStorageAudioTaskAdvanceRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddStorageAudioTaskAdvanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddStorageAudioTaskAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddStorageAudioTaskAdvanceRequest setContentSource(Integer contentSource) {
        this.contentSource = contentSource;
        return this;
    }
    public Integer getContentSource() {
        return this.contentSource;
    }

    public AddStorageAudioTaskAdvanceRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

}
