// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class SetFlowControlRequest extends TeaModel {
    @NameInMap("Api")
    public String api;

    @NameInMap("Service")
    public String service;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public Integer type;

    @NameInMap("Uid")
    public String uid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Value")
    public Integer value;

    public static SetFlowControlRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFlowControlRequest self = new SetFlowControlRequest();
        return TeaModel.build(map, self);
    }

    public SetFlowControlRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public SetFlowControlRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public SetFlowControlRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SetFlowControlRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public SetFlowControlRequest setValue(Integer value) {
        this.value = value;
        return this;
    }
    public Integer getValue() {
        return this.value;
    }

}
