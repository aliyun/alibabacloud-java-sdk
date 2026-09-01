// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseFileShardingStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>019F7F29-BF69-1734-AE5A-02D391385BAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateKnowledgeBaseFileShardingStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseFileShardingStrategyResponseBody self = new UpdateKnowledgeBaseFileShardingStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseFileShardingStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
