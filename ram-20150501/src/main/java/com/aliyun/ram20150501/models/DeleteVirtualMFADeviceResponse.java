// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualMFADeviceResponse self = new DeleteVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

}
