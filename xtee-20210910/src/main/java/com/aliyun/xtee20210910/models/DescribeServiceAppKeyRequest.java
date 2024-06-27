// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceAppKeyRequest extends TeaModel {
    @NameInMap("regId")
    public String regId;

    public static DescribeServiceAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAppKeyRequest self = new DescribeServiceAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAppKeyRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
