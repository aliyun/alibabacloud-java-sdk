// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeClientUserDNSResponseBody extends TeaModel {
    /**
     * <p>The active and standby DNS servers that the SAG app instance uses when it connects to private networks.</p>
     */
    @NameInMap("AppDNS")
    public java.util.List<String> appDNS;

    /**
     * <p>The active and standby DNS servers that the SAG app instance uses when it disconnects from private networks.</p>
     */
    @NameInMap("RecoveredDNS")
    public java.util.List<String> recoveredDNS;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>894AA8BD-0627-45B1-AA18-9CE1D50DA9D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientUserDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientUserDNSResponseBody self = new DescribeClientUserDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientUserDNSResponseBody setAppDNS(java.util.List<String> appDNS) {
        this.appDNS = appDNS;
        return this;
    }
    public java.util.List<String> getAppDNS() {
        return this.appDNS;
    }

    public DescribeClientUserDNSResponseBody setRecoveredDNS(java.util.List<String> recoveredDNS) {
        this.recoveredDNS = recoveredDNS;
        return this;
    }
    public java.util.List<String> getRecoveredDNS() {
        return this.recoveredDNS;
    }

    public DescribeClientUserDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
