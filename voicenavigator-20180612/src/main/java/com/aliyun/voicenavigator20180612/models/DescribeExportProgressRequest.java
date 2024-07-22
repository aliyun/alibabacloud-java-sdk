// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeExportProgressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0de8e5ccc2b645039ae6fbda443da73f</p>
     */
    @NameInMap("ExportTaskId")
    public String exportTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>868eef14-7515-4856-8a50-5c9a22abdbcc</p>
     */
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
