// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodePodsResponseBody extends TeaModel {
    /**
     * <p>The node pod information.</p>
     */
    @NameInMap("NodePodInfos")
    public java.util.List<NodePodInfo> nodePodInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodePodsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodePodsResponseBody self = new ListNodePodsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodePodsResponseBody setNodePodInfos(java.util.List<NodePodInfo> nodePodInfos) {
        this.nodePodInfos = nodePodInfos;
        return this;
    }
    public java.util.List<NodePodInfo> getNodePodInfos() {
        return this.nodePodInfos;
    }

    public ListNodePodsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
