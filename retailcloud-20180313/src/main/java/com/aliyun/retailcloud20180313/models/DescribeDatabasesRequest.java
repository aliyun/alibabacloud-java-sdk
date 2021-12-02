// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeDatabasesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesRequest self = new DescribeDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
