// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordResponseBody extends TeaModel {
    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateZoneRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordResponseBody self = new UpdateZoneRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateZoneRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
