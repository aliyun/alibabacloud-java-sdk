// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PreviewComponentCrdSchemaResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("schema")
    public String schema;

    public static PreviewComponentCrdSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewComponentCrdSchemaResponseBody self = new PreviewComponentCrdSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewComponentCrdSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewComponentCrdSchemaResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
