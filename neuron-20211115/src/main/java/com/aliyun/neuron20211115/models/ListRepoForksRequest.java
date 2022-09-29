// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRepoForksRequest extends TeaModel {
    @NameInMap("pbc_name")
    public String pbcName;

    public static ListRepoForksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoForksRequest self = new ListRepoForksRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoForksRequest setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

}
