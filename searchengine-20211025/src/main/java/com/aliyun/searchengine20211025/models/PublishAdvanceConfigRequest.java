// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishAdvanceConfigRequest extends TeaModel {
    /**
     * <p>The structure of the request</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static PublishAdvanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAdvanceConfigRequest self = new PublishAdvanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public PublishAdvanceConfigRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
