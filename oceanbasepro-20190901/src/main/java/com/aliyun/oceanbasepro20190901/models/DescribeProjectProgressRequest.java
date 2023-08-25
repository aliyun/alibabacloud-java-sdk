// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectProgressRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DescribeProjectProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectProgressRequest self = new DescribeProjectProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectProgressRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
