// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibrarySchemaRequest extends TeaModel {
    @NameInMap("body")
    public LibrarySchema body;

    public static CreateLibrarySchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibrarySchemaRequest self = new CreateLibrarySchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibrarySchemaRequest setBody(LibrarySchema body) {
        this.body = body;
        return this;
    }
    public LibrarySchema getBody() {
        return this.body;
    }

}
