// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeADInfoResponseBody extends TeaModel {
    /**
     * <p>The DNS information about the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>100.100.XX.XX</p>
     */
    @NameInMap("ADDNS")
    public String ADDNS;

    /**
     * <p>The service IP address of the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("ADServerIpAddress")
    public String ADServerIpAddress;

    /**
     * <p>The status of the AD domain. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: The instance is being added to the AD domain.</li>
     * <li><strong>0</strong>: The instance fails to be added to the AD domain.</li>
     * <li><strong>1</strong>: The instance is added to the AD domain.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ADStatus")
    public String ADStatus;

    /**
     * <p>The cause of the error.</p>
     * 
     * <strong>example:</strong>
     * <p>XXXX</p>
     */
    @NameInMap("AbnormalReason")
    public String abnormalReason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The username of the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>test_01</p>
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
