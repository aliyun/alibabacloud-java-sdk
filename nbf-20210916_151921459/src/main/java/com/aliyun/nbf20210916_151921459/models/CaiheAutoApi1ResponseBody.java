// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210916_151921459.models;

import com.aliyun.tea.*;

public class CaiheAutoApi1ResponseBody extends TeaModel {
    // sum
    @NameInMap("Sum")
    public Integer sum;

    public static CaiheAutoApi1ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CaiheAutoApi1ResponseBody self = new CaiheAutoApi1ResponseBody();
        return TeaModel.build(map, self);
    }

    public CaiheAutoApi1ResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
