// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetConfigRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    public static DescribeVulTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetConfigRequest self = new DescribeVulTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVulTargetConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
