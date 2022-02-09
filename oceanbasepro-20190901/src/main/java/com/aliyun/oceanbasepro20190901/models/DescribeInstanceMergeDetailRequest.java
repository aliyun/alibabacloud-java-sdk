// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMergeDetailRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LastCount")
    public Integer lastCount;

    public static DescribeInstanceMergeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMergeDetailRequest self = new DescribeInstanceMergeDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMergeDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceMergeDetailRequest setLastCount(Integer lastCount) {
        this.lastCount = lastCount;
        return this;
    }
    public Integer getLastCount() {
        return this.lastCount;
    }

}
