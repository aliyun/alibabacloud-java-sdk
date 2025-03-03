// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendCreateCloudAccountEmailRequest extends TeaModel {
    /**
     * <p>The account record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>06950264-3f0d-4ca9-82dd-6ee7a3d33d6b</p>
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
