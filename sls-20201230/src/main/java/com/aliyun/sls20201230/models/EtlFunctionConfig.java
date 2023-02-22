// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EtlFunctionConfig extends TeaModel {
    @NameInMap("functionProvider")
    public String functionProvider;

    public static EtlFunctionConfig build(java.util.Map<String, ?> map) throws Exception {
        EtlFunctionConfig self = new EtlFunctionConfig();
        return TeaModel.build(map, self);
    }

    public EtlFunctionConfig setFunctionProvider(String functionProvider) {
        this.functionProvider = functionProvider;
        return this;
    }
    public String getFunctionProvider() {
        return this.functionProvider;
    }

}
