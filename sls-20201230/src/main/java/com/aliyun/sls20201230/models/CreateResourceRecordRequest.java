// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateResourceRecordRequest extends TeaModel {
    /**
     * <p>The resource record to create.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ResourceRecord body;

    public static CreateResourceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRecordRequest self = new CreateResourceRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRecordRequest setBody(ResourceRecord body) {
        this.body = body;
        return this;
    }
    public ResourceRecord getBody() {
        return this.body;
    }

}
