// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateResourceRecordResponseBody extends TeaModel {
    /**
     * <p>The ID of the created record.</p>
     * 
     * <strong>example:</strong>
     * <p>record-001</p>
     */
    @NameInMap("id")
    public String id;

    public static CreateResourceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRecordResponseBody self = new CreateResourceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceRecordResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
