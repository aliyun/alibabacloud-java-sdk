// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210820_112525398.models;

import com.aliyun.tea.*;

public class PublishTestResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static PublishTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishTestResponseBody self = new PublishTestResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishTestResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
