// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteDeployConfigRequest extends TeaModel {
    @NameInMap("SchemaId")
    public Long schemaId;

    public static DeleteDeployConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeployConfigRequest self = new DeleteDeployConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeployConfigRequest setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

}
