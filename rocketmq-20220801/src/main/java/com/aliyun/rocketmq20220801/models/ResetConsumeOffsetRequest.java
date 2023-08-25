// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ResetConsumeOffsetRequest extends TeaModel {
    @NameInMap("resetTime")
    public String resetTime;

    @NameInMap("resetType")
    public String resetType;

    public static ResetConsumeOffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetConsumeOffsetRequest self = new ResetConsumeOffsetRequest();
        return TeaModel.build(map, self);
    }

    public ResetConsumeOffsetRequest setResetTime(String resetTime) {
        this.resetTime = resetTime;
        return this;
    }
    public String getResetTime() {
        return this.resetTime;
    }

    public ResetConsumeOffsetRequest setResetType(String resetType) {
        this.resetType = resetType;
        return this;
    }
    public String getResetType() {
        return this.resetType;
    }

}
