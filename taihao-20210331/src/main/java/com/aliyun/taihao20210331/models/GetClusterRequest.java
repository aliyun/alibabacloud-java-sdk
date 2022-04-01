// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterRequest extends TeaModel {
    @NameInMap("clusterBaseParam")
    public ClusterBaseParam clusterBaseParam;

    public static GetClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRequest self = new GetClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterRequest setClusterBaseParam(ClusterBaseParam clusterBaseParam) {
        this.clusterBaseParam = clusterBaseParam;
        return this;
    }
    public ClusterBaseParam getClusterBaseParam() {
        return this.clusterBaseParam;
    }

}
