// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainDNSRecordResponseBody extends TeaModel {
    /**
     * <p>The status of the DNS settings. Valid values:</p>
     * <ul>
     * <li><strong>cnameMatched</strong>: The DNS settings are properly configured.</li>
     * <li><strong>vipMatched</strong>: An A record maps the domain name to the WAF virtual IP address (VIP).</li>
     * <li><strong>wafVip</strong>: An A record maps the domain name to another WAF VIP.</li>
     * <li><strong>unRecord</strong>: The domain name does not have a DNS record.</li>
     * <li><strong>unUsed</strong>: The domain name is not pointed to WAF.</li>
     * <li><strong>checkTimeout</strong>: The check times out.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cnameMatched</p>
     */
    @NameInMap("DNSStatus")
    public String DNSStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D827FCFE-90A7-4330-9326-D33C8B4C****</p>
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
