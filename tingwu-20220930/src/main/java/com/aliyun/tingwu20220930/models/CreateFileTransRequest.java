// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class CreateFileTransRequest extends TeaModel {
    @NameInMap("AbilityParams")
    public java.util.Map<String, ?> abilityParams;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AsrParams")
    public java.util.Map<String, ?> asrParams;

    @NameInMap("AudioLanguage")
    public String audioLanguage;

    @NameInMap("AudioOssBucket")
    public String audioOssBucket;

    @NameInMap("AudioOssPath")
    public String audioOssPath;

    @NameInMap("AudioOutputEnabled")
    public Boolean audioOutputEnabled;

    @NameInMap("AudioOutputOssBucket")
    public String audioOutputOssBucket;

    @NameInMap("AudioOutputOssPath")
    public String audioOutputOssPath;

    @NameInMap("AudioRoleNum")
    public String audioRoleNum;

    @NameInMap("AudioSegmentsEnabled")
    public Boolean audioSegmentsEnabled;

    @NameInMap("LabParams")
    public java.util.Map<String, ?> labParams;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("TransKey")
    public String transKey;

    @NameInMap("TransResultOssBucket")
    public String transResultOssBucket;

    @NameInMap("TransResultOssPath")
    public String transResultOssPath;

    public static CreateFileTransRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileTransRequest self = new CreateFileTransRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileTransRequest setAbilityParams(java.util.Map<String, ?> abilityParams) {
        this.abilityParams = abilityParams;
        return this;
    }
    public java.util.Map<String, ?> getAbilityParams() {
        return this.abilityParams;
    }

    public CreateFileTransRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateFileTransRequest setAsrParams(java.util.Map<String, ?> asrParams) {
        this.asrParams = asrParams;
        return this;
    }
    public java.util.Map<String, ?> getAsrParams() {
        return this.asrParams;
    }

    public CreateFileTransRequest setAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
        return this;
    }
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    public CreateFileTransRequest setAudioOssBucket(String audioOssBucket) {
        this.audioOssBucket = audioOssBucket;
        return this;
    }
    public String getAudioOssBucket() {
        return this.audioOssBucket;
    }

    public CreateFileTransRequest setAudioOssPath(String audioOssPath) {
        this.audioOssPath = audioOssPath;
        return this;
    }
    public String getAudioOssPath() {
        return this.audioOssPath;
    }

    public CreateFileTransRequest setAudioOutputEnabled(Boolean audioOutputEnabled) {
        this.audioOutputEnabled = audioOutputEnabled;
        return this;
    }
    public Boolean getAudioOutputEnabled() {
        return this.audioOutputEnabled;
    }

    public CreateFileTransRequest setAudioOutputOssBucket(String audioOutputOssBucket) {
        this.audioOutputOssBucket = audioOutputOssBucket;
        return this;
    }
    public String getAudioOutputOssBucket() {
        return this.audioOutputOssBucket;
    }

    public CreateFileTransRequest setAudioOutputOssPath(String audioOutputOssPath) {
        this.audioOutputOssPath = audioOutputOssPath;
        return this;
    }
    public String getAudioOutputOssPath() {
        return this.audioOutputOssPath;
    }

    public CreateFileTransRequest setAudioRoleNum(String audioRoleNum) {
        this.audioRoleNum = audioRoleNum;
        return this;
    }
    public String getAudioRoleNum() {
        return this.audioRoleNum;
    }

    public CreateFileTransRequest setAudioSegmentsEnabled(Boolean audioSegmentsEnabled) {
        this.audioSegmentsEnabled = audioSegmentsEnabled;
        return this;
    }
    public Boolean getAudioSegmentsEnabled() {
        return this.audioSegmentsEnabled;
    }

    public CreateFileTransRequest setLabParams(java.util.Map<String, ?> labParams) {
        this.labParams = labParams;
        return this;
    }
    public java.util.Map<String, ?> getLabParams() {
        return this.labParams;
    }

    public CreateFileTransRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateFileTransRequest setTransKey(String transKey) {
        this.transKey = transKey;
        return this;
    }
    public String getTransKey() {
        return this.transKey;
    }

    public CreateFileTransRequest setTransResultOssBucket(String transResultOssBucket) {
        this.transResultOssBucket = transResultOssBucket;
        return this;
    }
    public String getTransResultOssBucket() {
        return this.transResultOssBucket;
    }

    public CreateFileTransRequest setTransResultOssPath(String transResultOssPath) {
        this.transResultOssPath = transResultOssPath;
        return this;
    }
    public String getTransResultOssPath() {
        return this.transResultOssPath;
    }

}
