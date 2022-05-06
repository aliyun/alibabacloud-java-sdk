// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHADiagnoseConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TcpConnectionType")
    public String tcpConnectionType;

    public static DescribeHADiagnoseConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHADiagnoseConfigResponseBody self = new DescribeHADiagnoseConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHADiagnoseConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHADiagnoseConfigResponseBody setTcpConnectionType(String tcpConnectionType) {
        this.tcpConnectionType = tcpConnectionType;
        return this;
    }
    public String getTcpConnectionType() {
        return this.tcpConnectionType;
    }

}
