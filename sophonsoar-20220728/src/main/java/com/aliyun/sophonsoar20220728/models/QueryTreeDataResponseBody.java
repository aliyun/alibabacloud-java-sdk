// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class QueryTreeDataResponseBody extends TeaModel {
    /**
     * <p>A list of playbooks in JSON string format. The string contains the following fields:</p>
     * <ul>
     * <li><p><strong>active</strong>: Indicates whether the playbook is active. A value of <strong>true</strong> means the playbook is active. A value of <strong>false</strong> means the playbook is inactive.</p>
     * </li>
     * <li><p><strong>displayName</strong>: The name of the playbook.</p>
     * </li>
     * <li><p><strong>playbookUuid</strong>: The UUID of the playbook.</p>
     * </li>
     * </ul>
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
     * <p>The ID of the request. Alibaba Cloud generates this unique ID for each request. Use this ID to troubleshoot issues.</p>
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
