// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class QueryTreeDataResponseBody extends TeaModel {
    /**
     * <p>The returned information about the playbook. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;playbook&quot;: {
     *             &quot;active&quot;: false,
     *             &quot;displayName&quot;: &quot;test_playbook&quot;,
     *             &quot;playbookUuid&quot;: &quot;09a20455-3d3a-424c-a1df-xxxxxx&quot;
     *         }
     *     }
     * ]</p>
     */
    @NameInMap("Playbooks")
    public String playbooks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF2ECA2D-D8E6-5021-BF5C-19DD6D52C5B2</p>
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
