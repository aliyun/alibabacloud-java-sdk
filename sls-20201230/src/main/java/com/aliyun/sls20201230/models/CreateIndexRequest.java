// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public Index body;

    public static CreateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexRequest self = new CreateIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexRequest setBody(Index body) {
        this.body = body;
        return this;
    }
    public Index getBody() {
        return this.body;
    }

}
