// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendPromoteResourceAccountEmailRequest extends TeaModel {
    /**
     * <p>The account record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>06950264-3f0d-4ca9-82dd-6ee7a3d33d6b</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    public static ResendPromoteResourceAccountEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendPromoteResourceAccountEmailRequest self = new ResendPromoteResourceAccountEmailRequest();
        return TeaModel.build(map, self);
    }

    public ResendPromoteResourceAccountEmailRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
