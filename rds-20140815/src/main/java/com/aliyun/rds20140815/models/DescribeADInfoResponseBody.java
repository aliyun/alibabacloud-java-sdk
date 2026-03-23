// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeADInfoResponseBody extends TeaModel {
    @NameInMap("ADDNS")
    public String ADDNS;

    @NameInMap("ADServerIpAddress")
    public String ADServerIpAddress;

    @NameInMap("ADStatus")
    public String ADStatus;

    @NameInMap("AbnormalReason")
    public String abnormalReason;

    @NameInMap("RequestId")
    public String requestId;

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
