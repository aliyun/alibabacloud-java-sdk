// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgServiceParamsRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableMsSgServiceParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgServiceParamsRequest self = new EnableMsSgServiceParamsRequest();
        return TeaModel.build(map, self);
    }

    public EnableMsSgServiceParamsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EnableMsSgServiceParamsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public EnableMsSgServiceParamsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
