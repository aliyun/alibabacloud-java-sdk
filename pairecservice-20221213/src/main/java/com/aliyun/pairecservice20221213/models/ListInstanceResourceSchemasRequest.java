// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourceSchemasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    public static ListInstanceResourceSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourceSchemasRequest self = new ListInstanceResourceSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourceSchemasRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
