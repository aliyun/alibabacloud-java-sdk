// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeClientUserDNSResponseBody extends TeaModel {
    @NameInMap("AppDNS")
    public java.util.List<String> appDNS;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecoveredDNS")
    public java.util.List<String> recoveredDNS;

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

    public DescribeClientUserDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClientUserDNSResponseBody setRecoveredDNS(java.util.List<String> recoveredDNS) {
        this.recoveredDNS = recoveredDNS;
        return this;
    }
    public java.util.List<String> getRecoveredDNS() {
        return this.recoveredDNS;
    }

}
