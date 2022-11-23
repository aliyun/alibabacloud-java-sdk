// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScheduleConfigRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static DescribePropertyScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScheduleConfigRequest self = new DescribePropertyScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScheduleConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
