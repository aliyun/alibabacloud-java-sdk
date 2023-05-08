// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DescribeAccessKeyLeakDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessKeyLeakDetailRequest self = new DescribeAccessKeyLeakDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessKeyLeakDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
