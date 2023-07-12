// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeIntranetAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled for the extra internal bandwidth that you purchased. Valid values:</p>
     * <br>
     * <p>*   **true**: Auto-renewal is enabled.</p>
     * <p>*   **false**: Auto-renewal is disabled.</p>
     * <br>
     * <p>> If no extra internal bandwidth is purchased, this parameter is not returned.</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The time when the extra internal bandwidth that you purchased expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     * <br>
     * <p>> If no extra internal bandwidth is purchased, this parameter is not returned.</p>
     */
    @NameInMap("BandwidthExpireTime")
    public String bandwidthExpireTime;

    @NameInMap("BandwidthPrePaid")
    public String bandwidthPrePaid;

    /**
     * <p>The time when the extra internal bandwidth that you purchased for temporary use expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     * <br>
     * <p>> If no extra internal bandwidth for temporary use is purchased or the extra internal bandwidth that you purchased for temporary use has expired, **0** is returned for this parameter.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Does the instance have unexpired prepaid bandwidth package, value:</p>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("HasPrePaidBandWidthOrderRunning")
    public Boolean hasPrePaidBandWidthOrderRunning;

    /**
     * <p>The current internal bandwidth of the instance. Unit: Mbit/s.</p>
     */
    @NameInMap("IntranetBandwidth")
    public Integer intranetBandwidth;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIntranetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntranetAttributeResponseBody self = new DescribeIntranetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntranetAttributeResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public DescribeIntranetAttributeResponseBody setBandwidthExpireTime(String bandwidthExpireTime) {
        this.bandwidthExpireTime = bandwidthExpireTime;
        return this;
    }
    public String getBandwidthExpireTime() {
        return this.bandwidthExpireTime;
    }

    public DescribeIntranetAttributeResponseBody setBandwidthPrePaid(String bandwidthPrePaid) {
        this.bandwidthPrePaid = bandwidthPrePaid;
        return this;
    }
    public String getBandwidthPrePaid() {
        return this.bandwidthPrePaid;
    }

    public DescribeIntranetAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeIntranetAttributeResponseBody setHasPrePaidBandWidthOrderRunning(Boolean hasPrePaidBandWidthOrderRunning) {
        this.hasPrePaidBandWidthOrderRunning = hasPrePaidBandWidthOrderRunning;
        return this;
    }
    public Boolean getHasPrePaidBandWidthOrderRunning() {
        return this.hasPrePaidBandWidthOrderRunning;
    }

    public DescribeIntranetAttributeResponseBody setIntranetBandwidth(Integer intranetBandwidth) {
        this.intranetBandwidth = intranetBandwidth;
        return this;
    }
    public Integer getIntranetBandwidth() {
        return this.intranetBandwidth;
    }

    public DescribeIntranetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
