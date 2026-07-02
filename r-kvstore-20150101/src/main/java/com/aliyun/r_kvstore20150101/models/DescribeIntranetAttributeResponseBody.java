// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeIntranetAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled for the bandwidth package. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Auto-renewal is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Auto-renewal is disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not returned if no additional bandwidth is purchased.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The expiration time of the bandwidth package. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format.</p>
     * <blockquote>
     * <p>This parameter is not returned if no additional bandwidth is purchased.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-03-06T16:00:00Z</p>
     */
    @NameInMap("BandwidthExpireTime")
    public String bandwidthExpireTime;

    /**
     * <p>The billing method of the bandwidth package. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: pay-as-you-go.</p>
     * </li>
     * <li><p><strong>1</strong>: subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BandwidthPrePaid")
    public String bandwidthPrePaid;

    /**
     * <p>The expiration time of the temporary bandwidth. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format.</p>
     * <blockquote>
     * <p>This parameter returns <strong>0</strong> if the instance has no temporary bandwidth or if the temporary bandwidth has expired.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the instance has an unexpired bandwidth package. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: An unexpired bandwidth package exists.</p>
     * </li>
     * <li><p><strong>false</strong>: No unexpired bandwidth package exists.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not returned if no additional bandwidth is purchased.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasPrePaidBandWidthOrderRunning")
    public Boolean hasPrePaidBandWidthOrderRunning;

    @NameInMap("IntranetBandWidthBurst")
    public Integer intranetBandWidthBurst;

    /**
     * <p>The total intranet bandwidth across all shards in the instance, in MB/s.</p>
     * 
     * <strong>example:</strong>
     * <p>102</p>
     */
    @NameInMap("IntranetBandwidth")
    public Integer intranetBandwidth;

    /**
     * <p>The request ID.</p>
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

    public DescribeIntranetAttributeResponseBody setIntranetBandWidthBurst(Integer intranetBandWidthBurst) {
        this.intranetBandWidthBurst = intranetBandWidthBurst;
        return this;
    }
    public Integer getIntranetBandWidthBurst() {
        return this.intranetBandWidthBurst;
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
