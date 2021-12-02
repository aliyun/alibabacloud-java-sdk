// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("Name")
    public String name;

    public static CreateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupRequest self = new CreateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateAppGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
