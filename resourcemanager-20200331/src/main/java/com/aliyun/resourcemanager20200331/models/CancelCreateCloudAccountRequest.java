// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CancelCreateCloudAccountRequest extends TeaModel {
    /**
     * <p>The account record ID.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    public static CancelCreateCloudAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCreateCloudAccountRequest self = new CancelCreateCloudAccountRequest();
        return TeaModel.build(map, self);
    }

    public CancelCreateCloudAccountRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
