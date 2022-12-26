// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetConfigRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static DescribeCommonTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetConfigRequest self = new DescribeCommonTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
