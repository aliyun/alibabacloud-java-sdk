// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddFileProtectBindMachineResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddFileProtectBindMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFileProtectBindMachineResponseBody self = new AddFileProtectBindMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFileProtectBindMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
