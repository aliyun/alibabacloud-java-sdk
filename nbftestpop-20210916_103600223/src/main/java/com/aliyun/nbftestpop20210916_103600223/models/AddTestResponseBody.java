// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class AddTestResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static AddTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTestResponseBody self = new AddTestResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTestResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
