// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportJobsOssRequest extends TeaModel {
    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TopologyJobId")
    public Long topologyJobId;

    public static ExportJobsOssRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportJobsOssRequest self = new ExportJobsOssRequest();
        return TeaModel.build(map, self);
    }

    public ExportJobsOssRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportJobsOssRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportJobsOssRequest setTopologyJobId(Long topologyJobId) {
        this.topologyJobId = topologyJobId;
        return this;
    }
    public Long getTopologyJobId() {
        return this.topologyJobId;
    }

}
