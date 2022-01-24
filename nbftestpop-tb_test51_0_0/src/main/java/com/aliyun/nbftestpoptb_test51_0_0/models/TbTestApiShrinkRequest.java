// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test51_0_0.models;

import com.aliyun.tea.*;

public class TbTestApiShrinkRequest extends TeaModel {
    @NameInMap("query")
    public String queryShrink;

    public static TbTestApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TbTestApiShrinkRequest self = new TbTestApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TbTestApiShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

}
