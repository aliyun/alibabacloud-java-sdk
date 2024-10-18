// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDeploymentSetResponseBody extends TeaModel {
    /**
     * <p>The deployment set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-uf6c8qerk019bj1l****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
     */
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
