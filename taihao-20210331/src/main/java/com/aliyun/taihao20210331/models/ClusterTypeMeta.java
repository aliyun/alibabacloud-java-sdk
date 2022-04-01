// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterTypeMeta extends TeaModel {
    // applicationNames
    @NameInMap("applicationNames")
    public java.util.List<String> applicationNames;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // excludeUserIds
    @NameInMap("excludeUserIds")
    public String excludeUserIds;

    // iaasType
    @NameInMap("iaasType")
    public String iaasType;

    // visibleType
    @NameInMap("visibleType")
    public String visibleType;

    // whiteUserIds
    @NameInMap("whiteUserIds")
    public String whiteUserIds;

    public static ClusterTypeMeta build(java.util.Map<String, ?> map) throws Exception {
        ClusterTypeMeta self = new ClusterTypeMeta();
        return TeaModel.build(map, self);
    }

    public ClusterTypeMeta setApplicationNames(java.util.List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }
    public java.util.List<String> getApplicationNames() {
        return this.applicationNames;
    }

    public ClusterTypeMeta setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ClusterTypeMeta setExcludeUserIds(String excludeUserIds) {
        this.excludeUserIds = excludeUserIds;
        return this;
    }
    public String getExcludeUserIds() {
        return this.excludeUserIds;
    }

    public ClusterTypeMeta setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public ClusterTypeMeta setVisibleType(String visibleType) {
        this.visibleType = visibleType;
        return this;
    }
    public String getVisibleType() {
        return this.visibleType;
    }

    public ClusterTypeMeta setWhiteUserIds(String whiteUserIds) {
        this.whiteUserIds = whiteUserIds;
        return this;
    }
    public String getWhiteUserIds() {
        return this.whiteUserIds;
    }

}
