// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class QueryTreeDataResponseBody extends TeaModel {
    @NameInMap("Playbooks")
    public String playbooks;

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
