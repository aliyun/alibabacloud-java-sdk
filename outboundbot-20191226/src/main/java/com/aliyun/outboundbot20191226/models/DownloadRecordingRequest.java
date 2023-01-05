// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadRecordingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NeedVoiceSliceRecording")
    public Boolean needVoiceSliceRecording;

    @NameInMap("TaskId")
    public String taskId;

    public static DownloadRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingRequest self = new DownloadRecordingRequest();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadRecordingRequest setNeedVoiceSliceRecording(Boolean needVoiceSliceRecording) {
        this.needVoiceSliceRecording = needVoiceSliceRecording;
        return this;
    }
    public Boolean getNeedVoiceSliceRecording() {
        return this.needVoiceSliceRecording;
    }

    public DownloadRecordingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
