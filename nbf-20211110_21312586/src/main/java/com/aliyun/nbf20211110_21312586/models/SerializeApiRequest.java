// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class SerializeApiRequest extends TeaModel {
    @NameInMap("apiSchemaDTO")
    public java.io.InputStream apiSchemaDTO;

    @NameInMap("type")
    public java.io.InputStream type;

    public static SerializeApiRequest build(java.util.Map<String, ?> map) throws Exception {
        SerializeApiRequest self = new SerializeApiRequest();
        return TeaModel.build(map, self);
    }

    public SerializeApiRequest setApiSchemaDTO(java.io.InputStream apiSchemaDTO) {
        this.apiSchemaDTO = apiSchemaDTO;
        return this;
    }
    public java.io.InputStream getApiSchemaDTO() {
        return this.apiSchemaDTO;
    }

    public SerializeApiRequest setType(java.io.InputStream type) {
        this.type = type;
        return this;
    }
    public java.io.InputStream getType() {
        return this.type;
    }

}
