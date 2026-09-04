// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateResourceRecordRequest extends TeaModel {
    /**
     * <p>The updated resource record content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ResourceRecord body;

    public static UpdateResourceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRecordRequest self = new UpdateResourceRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRecordRequest setBody(ResourceRecord body) {
        this.body = body;
        return this;
    }
    public ResourceRecord getBody() {
        return this.body;
    }

}
