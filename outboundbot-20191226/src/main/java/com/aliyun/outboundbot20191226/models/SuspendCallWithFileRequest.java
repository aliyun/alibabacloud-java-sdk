// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendCallWithFileRequest extends TeaModel {
    /**
     * <p>File path. Required.</p>
     * <blockquote>
     * <p>Get the value for this parameter by calling the GetJobDataUploadParams operation. Use the Folder value returned in the response as the FilePath value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>Task group ID. Required.</p>
     * 
     * <strong>example:</strong>
     * <p>0197261b-30e6-467b-83d6-7f72af868b03</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Instance ID. Required.</p>
     * 
     * <strong>example:</strong>
     * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SuspendCallWithFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendCallWithFileRequest self = new SuspendCallWithFileRequest();
        return TeaModel.build(map, self);
    }

    public SuspendCallWithFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public SuspendCallWithFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SuspendCallWithFileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
