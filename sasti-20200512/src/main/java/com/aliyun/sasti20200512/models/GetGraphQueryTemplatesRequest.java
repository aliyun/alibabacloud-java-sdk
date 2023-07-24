// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class GetGraphQueryTemplatesRequest extends TeaModel {
    @NameInMap("Env")
    public String env;

    @NameInMap("ServiceUnit")
    public String serviceUnit;

    public static GetGraphQueryTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGraphQueryTemplatesRequest self = new GetGraphQueryTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public GetGraphQueryTemplatesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetGraphQueryTemplatesRequest setServiceUnit(String serviceUnit) {
        this.serviceUnit = serviceUnit;
        return this;
    }
    public String getServiceUnit() {
        return this.serviceUnit;
    }

}
