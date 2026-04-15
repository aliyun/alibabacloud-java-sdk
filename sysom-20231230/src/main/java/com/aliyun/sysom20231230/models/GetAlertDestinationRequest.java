// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAlertDestinationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Integer id;

    public static GetAlertDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertDestinationRequest self = new GetAlertDestinationRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertDestinationRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

}
