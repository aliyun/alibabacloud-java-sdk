// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UnbindESUserAnalyzerRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;name&quot;: &quot;kevintest-analyzer&quot;
     * }</p>
     */
    @NameInMap("body")
    public Object body;

    public static UnbindESUserAnalyzerRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindESUserAnalyzerRequest self = new UnbindESUserAnalyzerRequest();
        return TeaModel.build(map, self);
    }

    public UnbindESUserAnalyzerRequest setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
