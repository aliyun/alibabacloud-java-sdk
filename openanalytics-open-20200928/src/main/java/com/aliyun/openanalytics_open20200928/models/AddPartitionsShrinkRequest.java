// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AddPartitionsShrinkRequest extends TeaModel {
    // 添加的分区
    @NameInMap("Partition")
    public String partitionShrink;

    public static AddPartitionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPartitionsShrinkRequest self = new AddPartitionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddPartitionsShrinkRequest setPartitionShrink(String partitionShrink) {
        this.partitionShrink = partitionShrink;
        return this;
    }
    public String getPartitionShrink() {
        return this.partitionShrink;
    }

}
