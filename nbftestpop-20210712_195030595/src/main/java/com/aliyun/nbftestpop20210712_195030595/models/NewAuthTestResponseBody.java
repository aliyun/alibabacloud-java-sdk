// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210712_195030595.models;

import com.aliyun.tea.*;

public class NewAuthTestResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static NewAuthTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NewAuthTestResponseBody self = new NewAuthTestResponseBody();
        return TeaModel.build(map, self);
    }

    public NewAuthTestResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
