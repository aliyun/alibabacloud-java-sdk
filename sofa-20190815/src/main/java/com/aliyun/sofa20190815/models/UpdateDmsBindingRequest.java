// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDmsBindingRequest extends TeaModel {
    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("ExchangeType")
    public String exchangeType;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Persistence")
    public Boolean persistence;

    public static UpdateDmsBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDmsBindingRequest self = new UpdateDmsBindingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDmsBindingRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public UpdateDmsBindingRequest setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public UpdateDmsBindingRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateDmsBindingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDmsBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDmsBindingRequest setPersistence(Boolean persistence) {
        this.persistence = persistence;
        return this;
    }
    public Boolean getPersistence() {
        return this.persistence;
    }

}
