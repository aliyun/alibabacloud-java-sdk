// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateTopicRequest extends TeaModel {
    @NameInMap("remark")
    public String remark;

    public static UpdateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicRequest self = new UpdateTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTopicRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
