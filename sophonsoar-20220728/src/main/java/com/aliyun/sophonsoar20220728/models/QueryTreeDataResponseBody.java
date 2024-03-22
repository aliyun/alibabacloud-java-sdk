// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class QueryTreeDataResponseBody extends TeaModel {
    /**
     * <p>The returned information about the playbook. The value is a JSON string.</p>
     */
    @NameInMap("Playbooks")
    public String playbooks;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryTreeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTreeDataResponseBody self = new QueryTreeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTreeDataResponseBody setPlaybooks(String playbooks) {
        this.playbooks = playbooks;
        return this;
    }
    public String getPlaybooks() {
        return this.playbooks;
    }

    public QueryTreeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
