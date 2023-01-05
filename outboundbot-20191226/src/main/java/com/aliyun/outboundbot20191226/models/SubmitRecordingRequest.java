// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitRecordingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MergedRecording")
    public String mergedRecording;

    @NameInMap("ResourceRecording")
    public String resourceRecording;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRecordingRequest self = new SubmitRecordingRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitRecordingRequest setMergedRecording(String mergedRecording) {
        this.mergedRecording = mergedRecording;
        return this;
    }
    public String getMergedRecording() {
        return this.mergedRecording;
    }

    public SubmitRecordingRequest setResourceRecording(String resourceRecording) {
        this.resourceRecording = resourceRecording;
        return this;
    }
    public String getResourceRecording() {
        return this.resourceRecording;
    }

    public SubmitRecordingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
