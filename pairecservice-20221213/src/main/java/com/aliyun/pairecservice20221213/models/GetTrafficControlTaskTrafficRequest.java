// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskTrafficRequest extends TeaModel {
    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><p><code>Daily</code>: The daily environment.</p>
     * </li>
     * <li><p><code>Pre</code>: The staging environment.</p>
     * </li>
     * <li><p><code>Prod</code>: The production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID. For more information, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTrafficControlTaskTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTaskTrafficRequest self = new GetTrafficControlTaskTrafficRequest();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTaskTrafficRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public GetTrafficControlTaskTrafficRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
