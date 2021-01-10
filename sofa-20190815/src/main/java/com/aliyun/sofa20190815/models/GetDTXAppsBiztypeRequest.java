// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXAppsBiztypeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StatemachineId")
    public String statemachineId;

    public static GetDTXAppsBiztypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDTXAppsBiztypeRequest self = new GetDTXAppsBiztypeRequest();
        return TeaModel.build(map, self);
    }

    public GetDTXAppsBiztypeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetDTXAppsBiztypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetDTXAppsBiztypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDTXAppsBiztypeRequest setStatemachineId(String statemachineId) {
        this.statemachineId = statemachineId;
        return this;
    }
    public String getStatemachineId() {
        return this.statemachineId;
    }

}
