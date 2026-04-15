// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAlertDestinationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Integer id;

    public static DeleteAlertDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertDestinationRequest self = new DeleteAlertDestinationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertDestinationRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

}
