// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeServiceDetailRequest extends TeaModel {
    @NameInMap("ServiceId")
    public Long serviceId;

    public static DescribeServiceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDetailRequest self = new DescribeServiceDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDetailRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
