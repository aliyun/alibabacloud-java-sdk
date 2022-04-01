// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListOnKubeDedicatedNodesRequest extends TeaModel {
    // listOnKubeDedicatedNodesParam
    @NameInMap("listOnKubeDedicatedNodesParam")
    public ListOnKubeDedicatedNodesParam listOnKubeDedicatedNodesParam;

    public static ListOnKubeDedicatedNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnKubeDedicatedNodesRequest self = new ListOnKubeDedicatedNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListOnKubeDedicatedNodesRequest setListOnKubeDedicatedNodesParam(ListOnKubeDedicatedNodesParam listOnKubeDedicatedNodesParam) {
        this.listOnKubeDedicatedNodesParam = listOnKubeDedicatedNodesParam;
        return this;
    }
    public ListOnKubeDedicatedNodesParam getListOnKubeDedicatedNodesParam() {
        return this.listOnKubeDedicatedNodesParam;
    }

}
