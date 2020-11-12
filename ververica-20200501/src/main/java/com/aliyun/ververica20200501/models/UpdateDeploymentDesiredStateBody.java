// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class UpdateDeploymentDesiredStateBody extends TeaModel {
    @NameInMap("paramsJson")
    @Validation(required = true)
    public String paramsJson;

    public static UpdateDeploymentDesiredStateBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentDesiredStateBody self = new UpdateDeploymentDesiredStateBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentDesiredStateBody setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
