// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;contactId&quot;:&quot;3d35c0487cc041abb7ad0ce61752601f&quot;,&quot;duration&quot;:27,&quot;fileName&quot;:&quot;ce2659e5-a20b-4f8e-91b5-5cd909c6b96e_3d35c0487cc041abb7ad0ce61752601f.wav&quot;,&quot;filePath&quot;:&quot;oss://ForCompatibility/waveforms/&quot;,&quot;startTime&quot;:1579057583670,&quot;type&quot;:&quot;Merged&quot;}</p>
     */
    @NameInMap("MergedRecording")
    public String mergedRecording;

    /**
     * <strong>example:</strong>
     * <p>{&quot;contactId&quot;:&quot;3d35c0487cc041abb7ad0ce61752601f&quot;,&quot;duration&quot;:27,&quot;fileName&quot;:&quot;ce2659e5-a20b-4f8e-91b5-5cd909c6b96e_3d35c0487cc041abb7ad0ce61752601f.wav&quot;,&quot;filePath&quot;:&quot;oss://ForCompatibility/waveforms/&quot;,&quot;startTime&quot;:1579057583670,&quot;type&quot;:&quot;Source&quot;}</p>
     */
    @NameInMap("ResourceRecording")
    public String resourceRecording;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e4e2a770-b97b-465a-80d8-06dca008c503</p>
     */
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
