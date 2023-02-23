// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class NodeIO extends TeaModel {
    @NameInMap("Artifacts")
    public java.util.List<java.util.Map<String, ?>> artifacts;

    @NameInMap("Parameters")
    public java.util.List<java.util.Map<String, ?>> parameters;

    public static NodeIO build(java.util.Map<String, ?> map) throws Exception {
        NodeIO self = new NodeIO();
        return TeaModel.build(map, self);
    }

    public NodeIO setArtifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getArtifacts() {
        return this.artifacts;
    }

    public NodeIO setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

}
