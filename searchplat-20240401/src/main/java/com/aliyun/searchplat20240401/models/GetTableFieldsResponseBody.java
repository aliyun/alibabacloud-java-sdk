// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetTableFieldsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58113A95-1858-5674-87E5-192AEE6FD9DD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;classic&quot;: &quot;VARCHAR&quot;,
     *         &quot;address&quot;: &quot;CHAR&quot;,
     *         &quot;string&quot;: &quot;STRING&quot;,
     *         &quot;price&quot;: &quot;DECIMAL&quot;,
     *         &quot;name&quot;: &quot;STRING&quot;,
     *         &quot;id&quot;: &quot;INT&quot;,
     *         &quot;tint&quot;: &quot;TINYINT&quot;,
     *         &quot;home&quot;: &quot;DECIMAL&quot;
     *     }</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static GetTableFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableFieldsResponseBody self = new GetTableFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableFieldsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
