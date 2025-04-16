// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class BindingPolicy extends TeaModel {
    @NameInMap("ExcludeNodes")
    public java.util.List<String> excludeNodes;

    @NameInMap("IncludeNodes")
    public java.util.List<String> includeNodes;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NodeSpecCount")
    public Long nodeSpecCount;

    public static BindingPolicy build(java.util.Map<String, ?> map) throws Exception {
        BindingPolicy self = new BindingPolicy();
        return TeaModel.build(map, self);
    }

    public BindingPolicy setExcludeNodes(java.util.List<String> excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }
    public java.util.List<String> getExcludeNodes() {
        return this.excludeNodes;
    }

    public BindingPolicy setIncludeNodes(java.util.List<String> includeNodes) {
        this.includeNodes = includeNodes;
        return this;
    }
    public java.util.List<String> getIncludeNodes() {
        return this.includeNodes;
    }

    public BindingPolicy setNodeSpecCount(Long nodeSpecCount) {
        this.nodeSpecCount = nodeSpecCount;
        return this;
    }
    public Long getNodeSpecCount() {
        return this.nodeSpecCount;
    }

}
