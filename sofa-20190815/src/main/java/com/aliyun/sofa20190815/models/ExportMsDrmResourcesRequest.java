// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportMsDrmResourcesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ExportMsDrmResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportMsDrmResourcesRequest self = new ExportMsDrmResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ExportMsDrmResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
