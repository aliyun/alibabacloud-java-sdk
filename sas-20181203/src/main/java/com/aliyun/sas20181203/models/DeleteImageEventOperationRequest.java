// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteImageEventOperationRequest extends TeaModel {
    /**
     * <p>The primary key of the alert handling rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteImageEventOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageEventOperationRequest self = new DeleteImageEventOperationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageEventOperationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
