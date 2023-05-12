// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetZoneRecordStatusResponseBody extends TeaModel {
    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static SetZoneRecordStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetZoneRecordStatusResponseBody self = new SetZoneRecordStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetZoneRecordStatusResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public SetZoneRecordStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetZoneRecordStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
