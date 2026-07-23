// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTaskDeployResultRequest extends TeaModel {
    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li>Daily: daily environment.</li>
     * <li>Pre: staging environment.</li>
     * <li>Prod: production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec_123****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTrafficControlTaskDeployResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTaskDeployResultRequest self = new QueryTrafficControlTaskDeployResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTaskDeployResultRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public QueryTrafficControlTaskDeployResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
