// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetClusterWarningRequest extends TeaModel {
    @NameInMap("clusterID")
    public String clusterID;

    public static GetClusterWarningRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterWarningRequest self = new GetClusterWarningRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterWarningRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }
    public String getClusterID() {
        return this.clusterID;
    }

}
