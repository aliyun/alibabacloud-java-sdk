// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateTopicRequest extends TeaModel {
    /**
     * <p>Maximum send message tps</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("maxSendTps")
    public Long maxSendTps;

    /**
     * <p>Updated remarks for the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the remark for test.</p>
     */
    @NameInMap("remark")
    public String remark;

    public static UpdateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicRequest self = new UpdateTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTopicRequest setMaxSendTps(Long maxSendTps) {
        this.maxSendTps = maxSendTps;
        return this;
    }
    public Long getMaxSendTps() {
        return this.maxSendTps;
    }

    public UpdateTopicRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
