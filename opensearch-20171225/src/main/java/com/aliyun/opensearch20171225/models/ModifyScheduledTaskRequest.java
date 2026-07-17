// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;cron&quot;: &quot;0 0 * * 1,2,3,4,5,6,7&quot;,
     *   &quot;enabled&quot;: true,
     *   &quot;filter&quot;: {
     *     &quot;field&quot;: &quot;cat_id&quot;,
     *     &quot;days&quot;: 30,
     *     &quot;unit&quot;: &quot;s&quot;
     *   }
     * }</p>
     */
    @NameInMap("body")
    public Object body;

    public static ModifyScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskRequest self = new ModifyScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskRequest setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
