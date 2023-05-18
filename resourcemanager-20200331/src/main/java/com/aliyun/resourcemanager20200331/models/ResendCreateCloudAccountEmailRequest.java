// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendCreateCloudAccountEmailRequest extends TeaModel {
    /**
     * <p>The account record ID.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    public static ResendCreateCloudAccountEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendCreateCloudAccountEmailRequest self = new ResendCreateCloudAccountEmailRequest();
        return TeaModel.build(map, self);
    }

    public ResendCreateCloudAccountEmailRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
