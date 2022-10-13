// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SaveRecordingRequest extends TeaModel {
    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("VoiceSliceRecordingList")
    public String voiceSliceRecordingList;

    public static SaveRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveRecordingRequest self = new SaveRecordingRequest();
        return TeaModel.build(map, self);
    }

    public SaveRecordingRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public SaveRecordingRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public SaveRecordingRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SaveRecordingRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public SaveRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveRecordingRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public SaveRecordingRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SaveRecordingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SaveRecordingRequest setVoiceSliceRecordingList(String voiceSliceRecordingList) {
        this.voiceSliceRecordingList = voiceSliceRecordingList;
        return this;
    }
    public String getVoiceSliceRecordingList() {
        return this.voiceSliceRecordingList;
    }

}
