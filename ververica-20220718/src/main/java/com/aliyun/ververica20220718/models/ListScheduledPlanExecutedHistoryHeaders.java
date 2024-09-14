// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListScheduledPlanExecutedHistoryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a14bda1c4a****</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListScheduledPlanExecutedHistoryHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPlanExecutedHistoryHeaders self = new ListScheduledPlanExecutedHistoryHeaders();
        return TeaModel.build(map, self);
    }

    public ListScheduledPlanExecutedHistoryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListScheduledPlanExecutedHistoryHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
