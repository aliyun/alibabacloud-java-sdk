// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetNodeConfigRequest extends TeaModel {
    /**
     * <p>The name of the cluster</p>
     * 
     * <strong>example:</strong>
     * <p>vpc_sh_domain_2</p>
     */
    @NameInMap("clusterName")
    public String clusterName;

    /**
     * <p>The node name.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-30174dhoz53_qrs</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li>qrs: Query Result Searcher (QRS) worker</li>
     * <li>search: Search worker</li>
     * <li>index: index</li>
     * <li>cluster: cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>index</p>
     */
    @NameInMap("type")
    public String type;

    public static GetNodeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeConfigRequest self = new GetNodeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeConfigRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetNodeConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetNodeConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
