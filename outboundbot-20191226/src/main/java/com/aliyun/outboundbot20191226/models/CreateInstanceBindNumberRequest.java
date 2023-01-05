// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateInstanceBindNumberRequest extends TeaModel {
    @NameInMap("InstanceList")
    public String instanceList;

    @NameInMap("Number")
    public String number;

    public static CreateInstanceBindNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceBindNumberRequest self = new CreateInstanceBindNumberRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceBindNumberRequest setInstanceList(String instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public String getInstanceList() {
        return this.instanceList;
    }

    public CreateInstanceBindNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
