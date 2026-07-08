// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainDNSRecordResponseBody extends TeaModel {
    /**
     * <p>The DNS status. Valid values:</p>
     * <ul>
     * <li><p><strong>cnameMatched</strong>: Normal.</p>
     * </li>
     * <li><p><strong>vipMatched</strong>: A record.</p>
     * </li>
     * <li><p><strong>wafVip</strong>: The VIP of another WAF is used.</p>
     * </li>
     * <li><p><strong>unRecord</strong>: No DNS resolution is configured.</p>
     * </li>
     * <li><p><strong>unUsed</strong>: Traffic does not pass through WAF.</p>
     * </li>
     * <li><p><strong>checkTimeout</strong>: The detection timed out.</p>
     * </li>
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
