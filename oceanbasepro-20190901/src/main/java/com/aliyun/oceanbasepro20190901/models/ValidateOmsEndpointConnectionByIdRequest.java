// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByIdRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static ValidateOmsEndpointConnectionByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByIdRequest self = new ValidateOmsEndpointConnectionByIdRequest();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
