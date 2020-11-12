// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class UpdateDeploymentBody extends TeaModel {
    @NameInMap("paramsJson")
    @Validation(required = true)
    public String paramsJson;

    public static UpdateDeploymentBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentBody self = new UpdateDeploymentBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentBody setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
