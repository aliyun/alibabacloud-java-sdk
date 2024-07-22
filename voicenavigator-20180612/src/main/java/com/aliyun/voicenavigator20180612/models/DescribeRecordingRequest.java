// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
     */
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
