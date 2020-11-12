// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class CreateSavepointBody extends TeaModel {
    @NameInMap("paramsJson")
    @Validation(required = true)
    public String paramsJson;

    public static CreateSavepointBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSavepointBody self = new CreateSavepointBody();
        return TeaModel.build(map, self);
    }

    public CreateSavepointBody setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
