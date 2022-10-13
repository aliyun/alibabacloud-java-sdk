// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeRecordingRequest extends TeaModel {
    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NeedVoiceSliceRecording")
    public Boolean needVoiceSliceRecording;

    public static DescribeRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingRequest self = new DescribeRecordingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DescribeRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRecordingRequest setNeedVoiceSliceRecording(Boolean needVoiceSliceRecording) {
        this.needVoiceSliceRecording = needVoiceSliceRecording;
        return this;
    }
    public Boolean getNeedVoiceSliceRecording() {
        return this.needVoiceSliceRecording;
    }

}
