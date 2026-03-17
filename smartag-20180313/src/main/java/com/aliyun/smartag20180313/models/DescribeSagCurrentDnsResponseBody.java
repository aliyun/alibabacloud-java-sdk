// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagCurrentDnsResponseBody extends TeaModel {
    /**
     * <p>The IP address of the primary DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>223.XX.XX.5</p>
     */
    @NameInMap("MasterDns")
    public String masterDns;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0937DEA0-AB4B-42F4-9314-07B97D30282B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IP address of the secondary DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>114.XX.XX.114</p>
     */
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
