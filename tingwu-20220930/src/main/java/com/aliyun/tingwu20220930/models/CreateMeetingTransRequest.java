// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class CreateMeetingTransRequest extends TeaModel {
    @NameInMap("AbilityParams")
    public java.util.Map<String, ?> abilityParams;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AsrParams")
    public java.util.Map<String, ?> asrParams;

    @NameInMap("AudioBitRate")
    public Integer audioBitRate;

    @NameInMap("AudioFormat")
    public String audioFormat;

    @NameInMap("AudioLanguage")
    public String audioLanguage;

    @NameInMap("AudioOutputEnabled")
    public Boolean audioOutputEnabled;

    @NameInMap("AudioOutputOssBucket")
    public String audioOutputOssBucket;

    @NameInMap("AudioOutputOssPath")
    public String audioOutputOssPath;

    @NameInMap("AudioPackage")
    public String audioPackage;

    @NameInMap("AudioSampleRate")
    public Integer audioSampleRate;

    @NameInMap("AudioSegmentsEnabled")
    public Boolean audioSegmentsEnabled;

    @NameInMap("DocResultEnabled")
    public Boolean docResultEnabled;

    @NameInMap("LabParams")
    public java.util.Map<String, ?> labParams;

    @NameInMap("MeetingKey")
    public String meetingKey;

    @NameInMap("MeetingResultEnabled")
    public Boolean meetingResultEnabled;

    @NameInMap("MeetingResultOssBucket")
    public String meetingResultOssBucket;

    @NameInMap("MeetingResultOssPath")
    public String meetingResultOssPath;

    @NameInMap("RealtimeActiveResultLevel")
    public Integer realtimeActiveResultLevel;

    @NameInMap("RealtimeResultEnabled")
    public Boolean realtimeResultEnabled;

    @NameInMap("RealtimeResultLevel")
    public Integer realtimeResultLevel;

    @NameInMap("RealtimeResultMeetingInfoEnabled")
    public Boolean realtimeResultMeetingInfoEnabled;

    @NameInMap("RealtimeResultWordsEnabled")
    public Boolean realtimeResultWordsEnabled;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("TranslateActiveResultLevel")
    public Integer translateActiveResultLevel;

    @NameInMap("TranslateLanguages")
    public String translateLanguages;

    @NameInMap("TranslateResultEnabled")
    public Boolean translateResultEnabled;

    @NameInMap("TranslateResultLevel")
    public Integer translateResultLevel;

    public static CreateMeetingTransRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingTransRequest self = new CreateMeetingTransRequest();
        return TeaModel.build(map, self);
    }

    public CreateMeetingTransRequest setAbilityParams(java.util.Map<String, ?> abilityParams) {
        this.abilityParams = abilityParams;
        return this;
    }
    public java.util.Map<String, ?> getAbilityParams() {
        return this.abilityParams;
    }

    public CreateMeetingTransRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateMeetingTransRequest setAsrParams(java.util.Map<String, ?> asrParams) {
        this.asrParams = asrParams;
        return this;
    }
    public java.util.Map<String, ?> getAsrParams() {
        return this.asrParams;
    }

    public CreateMeetingTransRequest setAudioBitRate(Integer audioBitRate) {
        this.audioBitRate = audioBitRate;
        return this;
    }
    public Integer getAudioBitRate() {
        return this.audioBitRate;
    }

    public CreateMeetingTransRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public CreateMeetingTransRequest setAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
        return this;
    }
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    public CreateMeetingTransRequest setAudioOutputEnabled(Boolean audioOutputEnabled) {
        this.audioOutputEnabled = audioOutputEnabled;
        return this;
    }
    public Boolean getAudioOutputEnabled() {
        return this.audioOutputEnabled;
    }

    public CreateMeetingTransRequest setAudioOutputOssBucket(String audioOutputOssBucket) {
        this.audioOutputOssBucket = audioOutputOssBucket;
        return this;
    }
    public String getAudioOutputOssBucket() {
        return this.audioOutputOssBucket;
    }

    public CreateMeetingTransRequest setAudioOutputOssPath(String audioOutputOssPath) {
        this.audioOutputOssPath = audioOutputOssPath;
        return this;
    }
    public String getAudioOutputOssPath() {
        return this.audioOutputOssPath;
    }

    public CreateMeetingTransRequest setAudioPackage(String audioPackage) {
        this.audioPackage = audioPackage;
        return this;
    }
    public String getAudioPackage() {
        return this.audioPackage;
    }

    public CreateMeetingTransRequest setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
        return this;
    }
    public Integer getAudioSampleRate() {
        return this.audioSampleRate;
    }

    public CreateMeetingTransRequest setAudioSegmentsEnabled(Boolean audioSegmentsEnabled) {
        this.audioSegmentsEnabled = audioSegmentsEnabled;
        return this;
    }
    public Boolean getAudioSegmentsEnabled() {
        return this.audioSegmentsEnabled;
    }

    public CreateMeetingTransRequest setDocResultEnabled(Boolean docResultEnabled) {
        this.docResultEnabled = docResultEnabled;
        return this;
    }
    public Boolean getDocResultEnabled() {
        return this.docResultEnabled;
    }

    public CreateMeetingTransRequest setLabParams(java.util.Map<String, ?> labParams) {
        this.labParams = labParams;
        return this;
    }
    public java.util.Map<String, ?> getLabParams() {
        return this.labParams;
    }

    public CreateMeetingTransRequest setMeetingKey(String meetingKey) {
        this.meetingKey = meetingKey;
        return this;
    }
    public String getMeetingKey() {
        return this.meetingKey;
    }

    public CreateMeetingTransRequest setMeetingResultEnabled(Boolean meetingResultEnabled) {
        this.meetingResultEnabled = meetingResultEnabled;
        return this;
    }
    public Boolean getMeetingResultEnabled() {
        return this.meetingResultEnabled;
    }

    public CreateMeetingTransRequest setMeetingResultOssBucket(String meetingResultOssBucket) {
        this.meetingResultOssBucket = meetingResultOssBucket;
        return this;
    }
    public String getMeetingResultOssBucket() {
        return this.meetingResultOssBucket;
    }

    public CreateMeetingTransRequest setMeetingResultOssPath(String meetingResultOssPath) {
        this.meetingResultOssPath = meetingResultOssPath;
        return this;
    }
    public String getMeetingResultOssPath() {
        return this.meetingResultOssPath;
    }

    public CreateMeetingTransRequest setRealtimeActiveResultLevel(Integer realtimeActiveResultLevel) {
        this.realtimeActiveResultLevel = realtimeActiveResultLevel;
        return this;
    }
    public Integer getRealtimeActiveResultLevel() {
        return this.realtimeActiveResultLevel;
    }

    public CreateMeetingTransRequest setRealtimeResultEnabled(Boolean realtimeResultEnabled) {
        this.realtimeResultEnabled = realtimeResultEnabled;
        return this;
    }
    public Boolean getRealtimeResultEnabled() {
        return this.realtimeResultEnabled;
    }

    public CreateMeetingTransRequest setRealtimeResultLevel(Integer realtimeResultLevel) {
        this.realtimeResultLevel = realtimeResultLevel;
        return this;
    }
    public Integer getRealtimeResultLevel() {
        return this.realtimeResultLevel;
    }

    public CreateMeetingTransRequest setRealtimeResultMeetingInfoEnabled(Boolean realtimeResultMeetingInfoEnabled) {
        this.realtimeResultMeetingInfoEnabled = realtimeResultMeetingInfoEnabled;
        return this;
    }
    public Boolean getRealtimeResultMeetingInfoEnabled() {
        return this.realtimeResultMeetingInfoEnabled;
    }

    public CreateMeetingTransRequest setRealtimeResultWordsEnabled(Boolean realtimeResultWordsEnabled) {
        this.realtimeResultWordsEnabled = realtimeResultWordsEnabled;
        return this;
    }
    public Boolean getRealtimeResultWordsEnabled() {
        return this.realtimeResultWordsEnabled;
    }

    public CreateMeetingTransRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateMeetingTransRequest setTranslateActiveResultLevel(Integer translateActiveResultLevel) {
        this.translateActiveResultLevel = translateActiveResultLevel;
        return this;
    }
    public Integer getTranslateActiveResultLevel() {
        return this.translateActiveResultLevel;
    }

    public CreateMeetingTransRequest setTranslateLanguages(String translateLanguages) {
        this.translateLanguages = translateLanguages;
        return this;
    }
    public String getTranslateLanguages() {
        return this.translateLanguages;
    }

    public CreateMeetingTransRequest setTranslateResultEnabled(Boolean translateResultEnabled) {
        this.translateResultEnabled = translateResultEnabled;
        return this;
    }
    public Boolean getTranslateResultEnabled() {
        return this.translateResultEnabled;
    }

    public CreateMeetingTransRequest setTranslateResultLevel(Integer translateResultLevel) {
        this.translateResultLevel = translateResultLevel;
        return this;
    }
    public Integer getTranslateResultLevel() {
        return this.translateResultLevel;
    }

}
