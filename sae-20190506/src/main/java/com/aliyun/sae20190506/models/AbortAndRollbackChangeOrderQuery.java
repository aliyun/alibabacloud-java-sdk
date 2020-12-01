// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderQuery extends TeaModel {
    @NameInMap("ChangeOrderId")
    @Validation(required = true)
    public String changeOrderId;

    public static AbortAndRollbackChangeOrderQuery build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderQuery self = new AbortAndRollbackChangeOrderQuery();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderQuery setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
