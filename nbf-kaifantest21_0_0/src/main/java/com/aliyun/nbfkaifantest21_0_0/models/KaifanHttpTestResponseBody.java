// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfkaifantest21_0_0.models;

import com.aliyun.tea.*;

public class KaifanHttpTestResponseBody extends TeaModel {
    @NameInMap("test")
    public String test;

    public static KaifanHttpTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KaifanHttpTestResponseBody self = new KaifanHttpTestResponseBody();
        return TeaModel.build(map, self);
    }

    public KaifanHttpTestResponseBody setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
