// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateRingStatusRequest extends TeaModel {
    @NameInMap("CallOutStatus")
    public String callOutStatus;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UniqueBizId")
    public String uniqueBizId;

    public static UpdateRingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRingStatusRequest self = new UpdateRingStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRingStatusRequest setCallOutStatus(String callOutStatus) {
        this.callOutStatus = callOutStatus;
        return this;
    }
    public String getCallOutStatus() {
        return this.callOutStatus;
    }

    public UpdateRingStatusRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public UpdateRingStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRingStatusRequest setUniqueBizId(String uniqueBizId) {
        this.uniqueBizId = uniqueBizId;
        return this;
    }
    public String getUniqueBizId() {
        return this.uniqueBizId;
    }

}
