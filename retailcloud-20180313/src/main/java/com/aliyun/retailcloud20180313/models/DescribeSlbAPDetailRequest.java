// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeSlbAPDetailRequest extends TeaModel {
    @NameInMap("SlbAPId")
    public Long slbAPId;

    public static DescribeSlbAPDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlbAPDetailRequest self = new DescribeSlbAPDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlbAPDetailRequest setSlbAPId(Long slbAPId) {
        this.slbAPId = slbAPId;
        return this;
    }
    public Long getSlbAPId() {
        return this.slbAPId;
    }

}
