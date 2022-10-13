// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeExportProgressRequest extends TeaModel {
    @NameInMap("ExportTaskId")
    public String exportTaskId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeExportProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportProgressRequest self = new DescribeExportProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExportProgressRequest setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public DescribeExportProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
