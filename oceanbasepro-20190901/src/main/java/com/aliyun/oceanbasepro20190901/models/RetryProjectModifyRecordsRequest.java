// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class RetryProjectModifyRecordsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static RetryProjectModifyRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryProjectModifyRecordsRequest self = new RetryProjectModifyRecordsRequest();
        return TeaModel.build(map, self);
    }

    public RetryProjectModifyRecordsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
