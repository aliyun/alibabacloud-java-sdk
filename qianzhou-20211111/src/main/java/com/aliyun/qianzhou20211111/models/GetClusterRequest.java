// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetClusterRequest extends TeaModel {
    @NameInMap("clusterID")
    public String clusterID;

    public static GetClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRequest self = new GetClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }
    public String getClusterID() {
        return this.clusterID;
    }

}
