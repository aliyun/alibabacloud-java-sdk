// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetMsSgServiceParamWeightRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Weight")
    public Long weight;

    public static SetMsSgServiceParamWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMsSgServiceParamWeightRequest self = new SetMsSgServiceParamWeightRequest();
        return TeaModel.build(map, self);
    }

    public SetMsSgServiceParamWeightRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SetMsSgServiceParamWeightRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SetMsSgServiceParamWeightRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetMsSgServiceParamWeightRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
