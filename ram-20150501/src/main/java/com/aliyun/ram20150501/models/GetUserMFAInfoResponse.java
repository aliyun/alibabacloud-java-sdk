// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MFADevice")
    @Validation(required = true)
    public GetUserMFAInfoResponseMFADevice MFADevice;

    public static GetUserMFAInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoResponse self = new GetUserMFAInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetUserMFAInfoResponseMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        public static GetUserMFAInfoResponseMFADevice build(java.util.Map<String, ?> map) throws Exception {
            GetUserMFAInfoResponseMFADevice self = new GetUserMFAInfoResponseMFADevice();
            return TeaModel.build(map, self);
        }

    }

}
