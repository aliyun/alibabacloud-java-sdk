// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListMainVersionsParam extends TeaModel {
    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // iaasType
    @NameInMap("iaasType")
    public String iaasType;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static ListMainVersionsParam build(java.util.Map<String, ?> map) throws Exception {
        ListMainVersionsParam self = new ListMainVersionsParam();
        return TeaModel.build(map, self);
    }

    public ListMainVersionsParam setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListMainVersionsParam setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public ListMainVersionsParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
