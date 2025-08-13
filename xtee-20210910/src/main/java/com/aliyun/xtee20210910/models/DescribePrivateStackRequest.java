// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePrivateStackRequest extends TeaModel {
    /**
     * <p>Region Code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribePrivateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateStackRequest self = new DescribePrivateStackRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrivateStackRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
