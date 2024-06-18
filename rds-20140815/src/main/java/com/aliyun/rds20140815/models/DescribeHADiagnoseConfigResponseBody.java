// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHADiagnoseConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06B220E2-EAC5-4DBE-A1FC-1B62DB6A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The availability check method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>LONG</strong>: Alibaba Cloud uses persistent connections to check the availability of the instance.</li>
     * <li><strong>SHORT</strong>: Alibaba Cloud uses short-lived connections to check the availability of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LONG</p>
     */
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
