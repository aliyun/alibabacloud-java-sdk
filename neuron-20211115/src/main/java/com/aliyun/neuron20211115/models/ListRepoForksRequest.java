// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRepoForksRequest extends TeaModel {
    @NameInMap("pbcId")
    public Long pbcId;

    public static ListRepoForksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoForksRequest self = new ListRepoForksRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoForksRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

}
