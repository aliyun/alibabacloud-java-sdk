// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterType extends TeaModel {
    @NameInMap("ClusterTypeSpec")
    public ClusterTypeSpec clusterTypeSpec;

    // taihaoMainVersionApplicationParam
    @NameInMap("applicationDTOList")
    public java.util.List<MainVersionApplicationParam> applicationDTOList;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // display
    @NameInMap("display")
    public Boolean display;

    // excludeUserList
    @NameInMap("excludeUserList")
    public String excludeUserList;

    // whiteUserIds
    @NameInMap("whiteUserIds")
    public String whiteUserIds;

    public static ClusterType build(java.util.Map<String, ?> map) throws Exception {
        ClusterType self = new ClusterType();
        return TeaModel.build(map, self);
    }

    public ClusterType setClusterTypeSpec(ClusterTypeSpec clusterTypeSpec) {
        this.clusterTypeSpec = clusterTypeSpec;
        return this;
    }
    public ClusterTypeSpec getClusterTypeSpec() {
        return this.clusterTypeSpec;
    }

    public ClusterType setApplicationDTOList(java.util.List<MainVersionApplicationParam> applicationDTOList) {
        this.applicationDTOList = applicationDTOList;
        return this;
    }
    public java.util.List<MainVersionApplicationParam> getApplicationDTOList() {
        return this.applicationDTOList;
    }

    public ClusterType setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ClusterType setDisplay(Boolean display) {
        this.display = display;
        return this;
    }
    public Boolean getDisplay() {
        return this.display;
    }

    public ClusterType setExcludeUserList(String excludeUserList) {
        this.excludeUserList = excludeUserList;
        return this;
    }
    public String getExcludeUserList() {
        return this.excludeUserList;
    }

    public ClusterType setWhiteUserIds(String whiteUserIds) {
        this.whiteUserIds = whiteUserIds;
        return this;
    }
    public String getWhiteUserIds() {
        return this.whiteUserIds;
    }

}
