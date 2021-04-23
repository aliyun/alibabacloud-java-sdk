// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddStorageAudioTaskRequest extends TeaModel {
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

    @NameInMap("AudioFile")
    public String audioFile;

    @NameInMap("Sort")
    public Integer sort;

    public static AddStorageAudioTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStorageAudioTaskRequest self = new AddStorageAudioTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddStorageAudioTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddStorageAudioTaskRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public AddStorageAudioTaskRequest setAudioId(String audioId) {
        this.audioId = audioId;
        return this;
    }
    public String getAudioId() {
        return this.audioId;
    }

    public AddStorageAudioTaskRequest setAudioTags(String audioTags) {
        this.audioTags = audioTags;
        return this;
    }
    public String getAudioTags() {
        return this.audioTags;
    }

    public AddStorageAudioTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddStorageAudioTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddStorageAudioTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddStorageAudioTaskRequest setContentSource(Integer contentSource) {
        this.contentSource = contentSource;
        return this;
    }
    public Integer getContentSource() {
        return this.contentSource;
    }

    public AddStorageAudioTaskRequest setAudioFile(String audioFile) {
        this.audioFile = audioFile;
        return this;
    }
    public String getAudioFile() {
        return this.audioFile;
    }

    public AddStorageAudioTaskRequest setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

}
