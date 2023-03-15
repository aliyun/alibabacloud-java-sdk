// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibraryRequest extends TeaModel {
    @NameInMap("body")
    public LibraryUpdateCmd body;

    public static UpdateLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryRequest self = new UpdateLibraryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryRequest setBody(LibraryUpdateCmd body) {
        this.body = body;
        return this;
    }
    public LibraryUpdateCmd getBody() {
        return this.body;
    }

}
