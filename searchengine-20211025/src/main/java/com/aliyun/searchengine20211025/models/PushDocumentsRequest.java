// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PushDocumentsRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<?> body;

    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("pkField")
    public String pkField;

    public static PushDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDocumentsRequest self = new PushDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public PushDocumentsRequest setBody(java.util.List<?> body) {
        this.body = body;
        return this;
    }
    public java.util.List<?> getBody() {
        return this.body;
    }

    public PushDocumentsRequest setPkField(String pkField) {
        this.pkField = pkField;
        return this;
    }
    public String getPkField() {
        return this.pkField;
    }

}
