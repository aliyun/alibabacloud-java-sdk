// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ExecuteSqlScriptBody extends TeaModel {
    @NameInMap("paramsJson")
    @Validation(required = true)
    public String paramsJson;

    public static ExecuteSqlScriptBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlScriptBody self = new ExecuteSqlScriptBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlScriptBody setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
