// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CancelProjectModifyRecordRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static CancelProjectModifyRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelProjectModifyRecordRequest self = new CancelProjectModifyRecordRequest();
        return TeaModel.build(map, self);
    }

    public CancelProjectModifyRecordRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
