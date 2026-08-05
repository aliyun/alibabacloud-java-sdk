// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ModifyOfflineTaskLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1-2-3-4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;network&quot;: {
     *     &quot;publicEs&quot;: {
     *       &quot;enabled&quot;: true,
     *       &quot;whiteIpGroup&quot;: [
     *         {
     *           &quot;groupName&quot;: &quot;kevintest&quot;,
     *           &quot;ips&quot;: [
     *             &quot;1.2.3.4&quot;,
     *             &quot;1.2.4.3&quot;
     *           ]
     *         }
     *       ]
     *     }
     *   }
     * }</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyOfflineTaskLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineTaskLogResponseBody self = new ModifyOfflineTaskLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineTaskLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyOfflineTaskLogResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
