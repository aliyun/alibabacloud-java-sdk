// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutProjectPolicyRequest extends TeaModel {
    /**
     * <p>The project policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{ 	&quot;Version&quot;: &quot;1&quot;, 	&quot;Statement&quot;: [{ 		&quot;Action&quot;: [&quot;log:PostLogStoreLogs&quot;], 		&quot;Resource&quot;: &quot;acs:log:<em>:</em>:project/exampleproject/<em>&quot;, 		&quot;Effect&quot;: &quot;Deny&quot;, 		&quot;Condition&quot;: { 			&quot;StringNotLike&quot;: { 				&quot;acs:SourceVpc&quot;: [&quot;vpc-</em>&quot;] 			} 		} 	}] }</p>
     */
    @NameInMap("body")
    public String body;

    public static PutProjectPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProjectPolicyRequest self = new PutProjectPolicyRequest();
        return TeaModel.build(map, self);
    }

    public PutProjectPolicyRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
