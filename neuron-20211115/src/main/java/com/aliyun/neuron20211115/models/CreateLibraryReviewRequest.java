// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryReviewRequest extends TeaModel {
    @NameInMap("body")
    public LibraryReviewCreateCmd body;

    public static CreateLibraryReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryReviewRequest self = new CreateLibraryReviewRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryReviewRequest setBody(LibraryReviewCreateCmd body) {
        this.body = body;
        return this;
    }
    public LibraryReviewCreateCmd getBody() {
        return this.body;
    }

}
