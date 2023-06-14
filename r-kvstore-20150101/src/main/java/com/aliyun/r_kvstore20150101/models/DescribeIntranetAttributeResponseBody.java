// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeIntranetAttributeResponseBody extends TeaModel {
    /**
     * <p>The internal bandwidth of the instance. Unit: MB/s.</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>Indicates whether auto-renewal is enabled for the extra internal bandwidth that you purchased. Valid values:</p>
     * <br>
     * <p>*   **true**: Auto-renewal is enabled.</p>
     * <p>*   **false**: Auto-renewal is disabled.</p>
     * <br>
     * <p>>  If no extra internal bandwidth is purchased, this parameter is not returned.</p>
     */
    @NameInMap("BandwidthExpireTime")
    public String bandwidthExpireTime;

    @NameInMap("BandwidthPrePaid")
    public String bandwidthPrePaid;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeIntranetAttribute**.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("HasPrePaidBandWidthOrderRunning")
    public Boolean hasPrePaidBandWidthOrderRunning;

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
