// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeIntranetAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled for the extra internal bandwidth that you purchased. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Auto-renewal is enabled.</li>
     * <li><strong>false</strong>: Auto-renewal is disabled.</li>
     * </ul>
     * <blockquote>
     * <p>If no extra internal bandwidth is purchased, this parameter is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The expiration time of the purchased bandwidth. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em> T <em>HH:mm:ss</em> Z format.</p>
     * <blockquote>
     * <p>If no extra internal bandwidth is purchased, this parameter is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-03-06T16:00:00Z</p>
     */
    @NameInMap("BandwidthExpireTime")
    public String bandwidthExpireTime;

    /**
     * <p>The billing method of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: pay-as-you-go</li>
     * <li><strong>1</strong>: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BandwidthPrePaid")
    public String bandwidthPrePaid;

    /**
     * <p>The time when the extra internal bandwidth that you purchased for temporary use expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p>If no extra internal bandwidth for temporary use is purchased or the extra internal bandwidth that you purchased for temporary use has expired, <strong>0</strong> is returned for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether the instance has unexpired bandwidth plans. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance has unexpired bandwidth plans.</li>
     * <li><strong>false</strong>: The instance does not have unexpired bandwidth plans.</li>
     * </ul>
     * <blockquote>
     * <p>If no extra internal bandwidth is purchased, this parameter is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasPrePaidBandWidthOrderRunning")
    public Boolean hasPrePaidBandWidthOrderRunning;

    /**
     * <p>The internal bandwidth of the instance. This parameter indicates the combined bandwidth of all shards in the instance. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>102</p>
     */
    @NameInMap("IntranetBandwidth")
    public Integer intranetBandwidth;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25D42CC3-FBA1-4AEC-BCE2-B8DD3137****</p>
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
