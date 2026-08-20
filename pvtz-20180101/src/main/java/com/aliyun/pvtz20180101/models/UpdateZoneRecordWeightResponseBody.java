// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordWeightResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>5808</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39CB16E5-4180-49F2-A060-23C0ECEB80D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateZoneRecordWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordWeightResponseBody self = new UpdateZoneRecordWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordWeightResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateZoneRecordWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
