// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ValidateSqlScriptBody extends TeaModel {
    @NameInMap("paramsJson")
    @Validation(required = true)
    public String paramsJson;

    public static ValidateSqlScriptBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateSqlScriptBody self = new ValidateSqlScriptBody();
        return TeaModel.build(map, self);
    }

    public ValidateSqlScriptBody setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
