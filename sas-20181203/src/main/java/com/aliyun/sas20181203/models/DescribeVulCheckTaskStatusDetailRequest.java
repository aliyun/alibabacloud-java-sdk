// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulCheckTaskStatusDetailRequest extends TeaModel {
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    @NameInMap("Types")
    public java.util.List<String> types;

    @NameInMap("Uuid")
    public String uuid;

    public static DescribeVulCheckTaskStatusDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulCheckTaskStatusDetailRequest self = new DescribeVulCheckTaskStatusDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulCheckTaskStatusDetailRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public DescribeVulCheckTaskStatusDetailRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public DescribeVulCheckTaskStatusDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
