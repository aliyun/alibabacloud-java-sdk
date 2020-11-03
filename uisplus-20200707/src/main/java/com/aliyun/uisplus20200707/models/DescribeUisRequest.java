// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeUisRequest extends TeaModel {
    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    public static DescribeUisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisRequest self = new DescribeUisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUisRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

}
