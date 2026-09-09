// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyTaskWaitingQueueRequest extends TeaModel {
    /**
     * <p>The waiting queue information of a specified Hive.</p>
     * 
     * <strong>example:</strong>
     * <p>hive-26cd567b35c04a0a90f0xxxxx</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    public static DescribeComfyTaskWaitingQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyTaskWaitingQueueRequest self = new DescribeComfyTaskWaitingQueueRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyTaskWaitingQueueRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

}
