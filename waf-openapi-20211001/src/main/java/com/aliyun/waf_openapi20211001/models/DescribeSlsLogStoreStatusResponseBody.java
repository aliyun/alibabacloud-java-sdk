// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSlsLogStoreStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a Logstore is created for WAF. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ExistStatus")
    public Boolean existStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlsLogStoreStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogStoreStatusResponseBody self = new DescribeSlsLogStoreStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogStoreStatusResponseBody setExistStatus(Boolean existStatus) {
        this.existStatus = existStatus;
        return this;
    }
    public Boolean getExistStatus() {
        return this.existStatus;
    }

    public DescribeSlsLogStoreStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
