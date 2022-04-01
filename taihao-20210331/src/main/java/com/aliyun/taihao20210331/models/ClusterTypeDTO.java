// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterTypeDTO extends TeaModel {
    // applicationDTOList
    @NameInMap("applicationDTOList")
    public java.util.List<MainVersionApplicationDTO> applicationDTOList;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    public static ClusterTypeDTO build(java.util.Map<String, ?> map) throws Exception {
        ClusterTypeDTO self = new ClusterTypeDTO();
        return TeaModel.build(map, self);
    }

    public ClusterTypeDTO setApplicationDTOList(java.util.List<MainVersionApplicationDTO> applicationDTOList) {
        this.applicationDTOList = applicationDTOList;
        return this;
    }
    public java.util.List<MainVersionApplicationDTO> getApplicationDTOList() {
        return this.applicationDTOList;
    }

    public ClusterTypeDTO setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

}
