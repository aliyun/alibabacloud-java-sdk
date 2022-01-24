// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test51_0_0.models;

import com.aliyun.tea.*;

public class TbTestApiBRequest extends TeaModel {
    @NameInMap("id")
    public Integer id;

    public static TbTestApiBRequest build(java.util.Map<String, ?> map) throws Exception {
        TbTestApiBRequest self = new TbTestApiBRequest();
        return TeaModel.build(map, self);
    }

    public TbTestApiBRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

}
