// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCloudVendorAccountAKResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4539D402-F7A4-5915-9580-EC227BF*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCloudVendorAccountAKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudVendorAccountAKResponseBody self = new DeleteCloudVendorAccountAKResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudVendorAccountAKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
