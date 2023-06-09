// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class BindESUserAnalyzerRequest extends TeaModel {
    @NameInMap("body")
    public Object body;

    public static BindESUserAnalyzerRequest build(java.util.Map<String, ?> map) throws Exception {
        BindESUserAnalyzerRequest self = new BindESUserAnalyzerRequest();
        return TeaModel.build(map, self);
    }

    public BindESUserAnalyzerRequest setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
