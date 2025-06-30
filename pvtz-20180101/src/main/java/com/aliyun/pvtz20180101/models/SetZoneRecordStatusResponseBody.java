// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetZoneRecordStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>207541****</p>
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

    /**
     * <p>The state of the DNS record. Valid values:</p>
     * <ul>
     * <li>ENABLE: The DNS record is enabled.</li>
     * <li>DISABLE: The DNS record is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DISABLE</p>
     */
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
