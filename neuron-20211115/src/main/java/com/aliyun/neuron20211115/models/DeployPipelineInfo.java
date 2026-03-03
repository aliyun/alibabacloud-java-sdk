// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeployPipelineInfo extends TeaModel {
    @NameInMap("deployInstanceInfos")
    public java.util.List<DeployInstanceInfo> deployInstanceInfos;

    /**
     * <strong>example:</strong>
     * <p>528f9a66-cbe3-4cd8-91c0-bc4260a13d87</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>Batch 1 Change</p>
     */
    @NameInMap("name")
    public String name;

    public static DeployPipelineInfo build(java.util.Map<String, ?> map) throws Exception {
        DeployPipelineInfo self = new DeployPipelineInfo();
        return TeaModel.build(map, self);
    }

    public DeployPipelineInfo setDeployInstanceInfos(java.util.List<DeployInstanceInfo> deployInstanceInfos) {
        this.deployInstanceInfos = deployInstanceInfos;
        return this;
    }
    public java.util.List<DeployInstanceInfo> getDeployInstanceInfos() {
        return this.deployInstanceInfos;
    }

    public DeployPipelineInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeployPipelineInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
