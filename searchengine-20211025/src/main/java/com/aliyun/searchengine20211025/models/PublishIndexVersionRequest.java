// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishIndexVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;dataSource&quot;: &quot;ha-cn-pl32rf0****_test_api&quot;,
     * &quot;desc&quot;: &quot;Remarks&quot;
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static PublishIndexVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishIndexVersionRequest self = new PublishIndexVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishIndexVersionRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
