// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateIndexRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public Index body;

    public static UpdateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexRequest self = new UpdateIndexRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIndexRequest setBody(Index body) {
        this.body = body;
        return this;
    }
    public Index getBody() {
        return this.body;
    }

}
