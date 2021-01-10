// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsDrmAttributesRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMsDrmAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMsDrmAttributesRequest self = new GetMsDrmAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetMsDrmAttributesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetMsDrmAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
