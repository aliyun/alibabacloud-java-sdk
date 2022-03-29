// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfkaifantest21_0_0.models;

import com.aliyun.tea.*;

public class KaifanHttpTestRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static KaifanHttpTestRequest build(java.util.Map<String, ?> map) throws Exception {
        KaifanHttpTestRequest self = new KaifanHttpTestRequest();
        return TeaModel.build(map, self);
    }

    public KaifanHttpTestRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
