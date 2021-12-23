// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210916_151921459.models;

import com.aliyun.tea.*;

public class CaiheAutoApi1Request extends TeaModel {
    // param0
    @NameInMap("f0")
    public Integer f0;

    // param1
    @NameInMap("f1")
    public Integer f1;

    public static CaiheAutoApi1Request build(java.util.Map<String, ?> map) throws Exception {
        CaiheAutoApi1Request self = new CaiheAutoApi1Request();
        return TeaModel.build(map, self);
    }

    public CaiheAutoApi1Request setF0(Integer f0) {
        this.f0 = f0;
        return this;
    }
    public Integer getF0() {
        return this.f0;
    }

    public CaiheAutoApi1Request setF1(Integer f1) {
        this.f1 = f1;
        return this;
    }
    public Integer getF1() {
        return this.f1;
    }

}
