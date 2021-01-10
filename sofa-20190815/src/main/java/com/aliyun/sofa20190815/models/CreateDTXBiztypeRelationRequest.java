// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXBiztypeRelationRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("State")
    public String state;

    @NameInMap("ActionArrayRepeatList")
    public java.util.List<String> actionArrayRepeatList;

    public static CreateDTXBiztypeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXBiztypeRelationRequest self = new CreateDTXBiztypeRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXBiztypeRelationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXBiztypeRelationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDTXBiztypeRelationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDTXBiztypeRelationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXBiztypeRelationRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateDTXBiztypeRelationRequest setActionArrayRepeatList(java.util.List<String> actionArrayRepeatList) {
        this.actionArrayRepeatList = actionArrayRepeatList;
        return this;
    }
    public java.util.List<String> getActionArrayRepeatList() {
        return this.actionArrayRepeatList;
    }

}
