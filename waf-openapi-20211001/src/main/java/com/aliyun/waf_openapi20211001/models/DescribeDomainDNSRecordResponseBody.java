// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainDNSRecordResponseBody extends TeaModel {
    /**
     * <p>The status of the DNS settings. Valid values:</p>
     * <br>
     * <p>*   **cnameMatched**: The DNS settings are properly configured.</p>
     * <p>*   **vipMatched**: An A record maps the domain name to the WAF virtual IP address (VIP).</p>
     * <p>*   **wafVip**: An A record maps the domain name to another WAF VIP.</p>
     * <p>*   **unRecord**: The domain name does not have a DNS record.</p>
     * <p>*   **unUsed**: The domain name is not pointed to WAF.</p>
     * <p>*   **checkTimeout**: The check times out.</p>
     */
    @NameInMap("DNSStatus")
    public String DNSStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainDNSRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDNSRecordResponseBody self = new DescribeDomainDNSRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDNSRecordResponseBody setDNSStatus(String DNSStatus) {
        this.DNSStatus = DNSStatus;
        return this;
    }
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    public DescribeDomainDNSRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
