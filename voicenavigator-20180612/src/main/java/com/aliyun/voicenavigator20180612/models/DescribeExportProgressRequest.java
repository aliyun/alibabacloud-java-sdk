// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeExportProgressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ExportTaskId")
    public String exportTaskId;

    public static DescribeExportProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportProgressRequest self = new DescribeExportProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExportProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeExportProgressRequest setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

}
