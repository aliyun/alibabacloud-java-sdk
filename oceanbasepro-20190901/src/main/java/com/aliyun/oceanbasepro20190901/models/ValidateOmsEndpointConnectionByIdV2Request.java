// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByIdV2Request extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static ValidateOmsEndpointConnectionByIdV2Request build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByIdV2Request self = new ValidateOmsEndpointConnectionByIdV2Request();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByIdV2Request setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
