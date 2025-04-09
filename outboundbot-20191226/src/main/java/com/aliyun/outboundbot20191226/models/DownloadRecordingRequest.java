// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DownloadRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NeedVoiceSliceRecording")
    public Boolean needVoiceSliceRecording;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>744b27f3-437f-4a8c-a181-f668e492fd24</p>
     */
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
