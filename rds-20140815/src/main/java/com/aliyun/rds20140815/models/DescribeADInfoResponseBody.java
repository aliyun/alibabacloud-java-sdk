// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeADInfoResponseBody extends TeaModel {
    /**
     * <p>The DNS information about the AD domain.</p>
     */
    @NameInMap("ADDNS")
    public String ADDNS;

    /**
     * <p>The service IP address of the AD domain.</p>
     */
    @NameInMap("ADServerIpAddress")
    public String ADServerIpAddress;

    /**
     * <p>The status of the AD domain. Valid values:</p>
     * <br>
     * <p>*   **-1**: The instance is being added to the AD domain.</p>
     * <p>*   **0**: The instance fails to be added to the AD domain.</p>
     * <p>*   **1**: The instance is added to the AD domain.</p>
     */
    @NameInMap("ADStatus")
    public String ADStatus;

    /**
     * <p>The cause of the error.</p>
     */
    @NameInMap("AbnormalReason")
    public String abnormalReason;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The username of the AD domain.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DescribeADInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeADInfoResponseBody self = new DescribeADInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeADInfoResponseBody setADDNS(String ADDNS) {
        this.ADDNS = ADDNS;
        return this;
    }
    public String getADDNS() {
        return this.ADDNS;
    }

    public DescribeADInfoResponseBody setADServerIpAddress(String ADServerIpAddress) {
        this.ADServerIpAddress = ADServerIpAddress;
        return this;
    }
    public String getADServerIpAddress() {
        return this.ADServerIpAddress;
    }

    public DescribeADInfoResponseBody setADStatus(String ADStatus) {
        this.ADStatus = ADStatus;
        return this;
    }
    public String getADStatus() {
        return this.ADStatus;
    }

    public DescribeADInfoResponseBody setAbnormalReason(String abnormalReason) {
        this.abnormalReason = abnormalReason;
        return this;
    }
    public String getAbnormalReason() {
        return this.abnormalReason;
    }

    public DescribeADInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeADInfoResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
