// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class CreateDeploymentBody extends TeaModel {
    @NameInMap("paramsJson")
    @Validation(required = true)
    public String paramsJson;

    public static CreateDeploymentBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentBody self = new CreateDeploymentBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentBody setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
