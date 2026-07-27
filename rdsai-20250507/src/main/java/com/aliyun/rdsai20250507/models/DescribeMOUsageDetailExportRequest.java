// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOUsageDetailExportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_copilot**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeMOUsageDetailExportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOUsageDetailExportRequest self = new DescribeMOUsageDetailExportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMOUsageDetailExportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
