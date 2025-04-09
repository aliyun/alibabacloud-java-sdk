// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupExportTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>baf6dfdc-eb79-4c63-ab19-c56388b1fbdd</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Option")
    public java.util.List<String> option;

    public static CreateJobGroupExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobGroupExportTaskRequest self = new CreateJobGroupExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobGroupExportTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateJobGroupExportTaskRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public CreateJobGroupExportTaskRequest setOption(java.util.List<String> option) {
        this.option = option;
        return this;
    }
    public java.util.List<String> getOption() {
        return this.option;
    }

}
