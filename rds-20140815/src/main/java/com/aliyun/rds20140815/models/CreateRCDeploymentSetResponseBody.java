// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDeploymentSetResponseBody extends TeaModel {
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateRCDeploymentSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRCDeploymentSetResponseBody self = new CreateRCDeploymentSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRCDeploymentSetResponseBody setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateRCDeploymentSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
