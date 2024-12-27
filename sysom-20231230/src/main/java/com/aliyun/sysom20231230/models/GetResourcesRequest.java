// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1808078950770264</p>
     */
    @NameInMap("cluster")
    public String cluster;

    /**
     * <strong>example:</strong>
     * <p>i-wz9d00ut2ska3mlyhn6j</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <strong>example:</strong>
     * <p>mem</p>
     */
    @NameInMap("type")
    public String type;

    public static GetResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesRequest self = new GetResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcesRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetResourcesRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public GetResourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
