// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibrarySchemaRequest extends TeaModel {
    @NameInMap("body")
    public LibrarySchemaUpdateCmd body;

    public static UpdateLibrarySchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibrarySchemaRequest self = new UpdateLibrarySchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLibrarySchemaRequest setBody(LibrarySchemaUpdateCmd body) {
        this.body = body;
        return this;
    }
    public LibrarySchemaUpdateCmd getBody() {
        return this.body;
    }

}
