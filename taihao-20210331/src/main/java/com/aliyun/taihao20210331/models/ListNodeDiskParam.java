// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeDiskParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeIdList
    @NameInMap("nodeIdList")
    public java.util.List<String> nodeIdList;

    public static ListNodeDiskParam build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDiskParam self = new ListNodeDiskParam();
        return TeaModel.build(map, self);
    }

    public ListNodeDiskParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodeDiskParam setNodeIdList(java.util.List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

}
