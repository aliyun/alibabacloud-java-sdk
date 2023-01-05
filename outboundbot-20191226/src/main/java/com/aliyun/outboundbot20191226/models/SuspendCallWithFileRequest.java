// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendCallWithFileRequest extends TeaModel {
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("GroupId")
    public String groupId;

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
