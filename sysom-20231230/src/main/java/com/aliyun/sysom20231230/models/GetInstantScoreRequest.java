// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetInstantScoreRequest extends TeaModel {
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

    public static GetInstantScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstantScoreRequest self = new GetInstantScoreRequest();
        return TeaModel.build(map, self);
    }

    public GetInstantScoreRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetInstantScoreRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

}
