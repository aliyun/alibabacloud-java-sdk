// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeploymentTarget extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>deployment target</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("quota")
    public ResourceQuota quota;

    public static DeploymentTarget build(java.util.Map<String, ?> map) throws Exception {
        DeploymentTarget self = new DeploymentTarget();
        return TeaModel.build(map, self);
    }

    public DeploymentTarget setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeploymentTarget setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeploymentTarget setQuota(ResourceQuota quota) {
        this.quota = quota;
        return this;
    }
    public ResourceQuota getQuota() {
        return this.quota;
    }

}
