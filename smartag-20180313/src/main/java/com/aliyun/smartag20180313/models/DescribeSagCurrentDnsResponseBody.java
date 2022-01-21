// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagCurrentDnsResponseBody extends TeaModel {
    @NameInMap("MasterDns")
    public String masterDns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlaveDns")
    public String slaveDns;

    public static DescribeSagCurrentDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagCurrentDnsResponseBody self = new DescribeSagCurrentDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagCurrentDnsResponseBody setMasterDns(String masterDns) {
        this.masterDns = masterDns;
        return this;
    }
    public String getMasterDns() {
        return this.masterDns;
    }

    public DescribeSagCurrentDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagCurrentDnsResponseBody setSlaveDns(String slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public String getSlaveDns() {
        return this.slaveDns;
    }

}
