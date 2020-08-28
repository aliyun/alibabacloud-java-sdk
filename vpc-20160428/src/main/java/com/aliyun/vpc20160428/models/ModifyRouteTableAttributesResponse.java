// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteTableAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static ModifyRouteTableAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteTableAttributesResponse self = new ModifyRouteTableAttributesResponse();
        return TeaModel.build(map, self);
    }

}
