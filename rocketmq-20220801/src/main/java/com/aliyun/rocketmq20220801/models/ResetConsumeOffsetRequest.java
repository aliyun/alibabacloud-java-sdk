// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ResetConsumeOffsetRequest extends TeaModel {
    /**
     * <p>The time when the consumer offset is reset.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-22 12:17:08</p>
     */
    @NameInMap("resetTime")
    public String resetTime;

    /**
     * <p>The method that is used to reset the consumer offset. Valid values: LATEST_OFFSET and SPECIFIED_TIME.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST_OFFSET</p>
     */
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
