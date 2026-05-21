// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodeTypesResponseBody extends TeaModel {
    @NameInMap("NodeTypes")
    public java.util.List<NodeType> nodeTypes;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.List<NodeTypeStatistic> statistics;

    public static ListNodeTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeTypesResponseBody self = new ListNodeTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeTypesResponseBody setNodeTypes(java.util.List<NodeType> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }
    public java.util.List<NodeType> getNodeTypes() {
        return this.nodeTypes;
    }

    public ListNodeTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeTypesResponseBody setStatistics(java.util.List<NodeTypeStatistic> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<NodeTypeStatistic> getStatistics() {
        return this.statistics;
    }

}
