// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSlsAuthStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3589D3A3-4A04-51CB-AA89-353ED20ACB10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The authorization status. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: indicates that authorization is granted.</p>
     * </li>
     * <li><p><strong>false</strong>: indicates that authorization is not granted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static DescribeSlsAuthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAuthStatusResponseBody self = new DescribeSlsAuthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAuthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsAuthStatusResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
