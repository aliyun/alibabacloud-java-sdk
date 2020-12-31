// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeResourceTypesRequest extends TeaModel {
    @NameInMap("SupportStatus")
    public String supportStatus;

    public static DescribeResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypesRequest self = new DescribeResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypesRequest setSupportStatus(String supportStatus) {
        this.supportStatus = supportStatus;
        return this;
    }
    public String getSupportStatus() {
        return this.supportStatus;
    }

}
