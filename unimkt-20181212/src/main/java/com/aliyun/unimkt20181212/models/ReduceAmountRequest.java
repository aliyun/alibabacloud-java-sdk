// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ReduceAmountRequest extends TeaModel {
    @NameInMap("Amount")
    public Long amount;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("V")
    public String v;

    public static ReduceAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ReduceAmountRequest self = new ReduceAmountRequest();
        return TeaModel.build(map, self);
    }

    public ReduceAmountRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ReduceAmountRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ReduceAmountRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ReduceAmountRequest setV(String v) {
        this.v = v;
        return this;
    }
    public String getV() {
        return this.v;
    }

}
