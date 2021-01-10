// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitMsSgServiceParamsRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ReinitMsSgServiceParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitMsSgServiceParamsRequest self = new ReinitMsSgServiceParamsRequest();
        return TeaModel.build(map, self);
    }

    public ReinitMsSgServiceParamsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ReinitMsSgServiceParamsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ReinitMsSgServiceParamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
