// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeSupplementRequest extends TeaModel {
    @NameInMap("SupplementId")
    public Long supplementId;

    public static DescribeSupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupplementRequest self = new DescribeSupplementRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSupplementRequest setSupplementId(Long supplementId) {
        this.supplementId = supplementId;
        return this;
    }
    public Long getSupplementId() {
        return this.supplementId;
    }

}
