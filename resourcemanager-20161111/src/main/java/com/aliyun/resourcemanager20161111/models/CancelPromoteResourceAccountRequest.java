// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class CancelPromoteResourceAccountRequest extends TeaModel {
    @NameInMap("RecordId")
    public String recordId;

    public static CancelPromoteResourceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPromoteResourceAccountRequest self = new CancelPromoteResourceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CancelPromoteResourceAccountRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
