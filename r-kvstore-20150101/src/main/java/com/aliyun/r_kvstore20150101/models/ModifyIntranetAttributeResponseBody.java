// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyIntranetAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97AC8948-D7E4-457E-BE03-850CF04E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIntranetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetAttributeResponseBody self = new ModifyIntranetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
