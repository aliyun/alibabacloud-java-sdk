// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryRequest extends TeaModel {
    @NameInMap("body")
    public LibraryCreateCmd body;

    public static CreateLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryRequest self = new CreateLibraryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryRequest setBody(LibraryCreateCmd body) {
        this.body = body;
        return this;
    }
    public LibraryCreateCmd getBody() {
        return this.body;
    }

}
