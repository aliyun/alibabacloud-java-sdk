// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelAreaDistributionStatDataResponseBody extends TeaModel {
    /**
     * <p>The regional statistics list.</p>
     */
    @NameInMap("AreaStatList")
    public java.util.List<DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList> areaStatList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelAreaDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelAreaDistributionStatDataResponseBody self = new DescribeChannelAreaDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelAreaDistributionStatDataResponseBody setAreaStatList(java.util.List<DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList> areaStatList) {
        this.areaStatList = areaStatList;
        return this;
    }
    public java.util.List<DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList> getAreaStatList() {
        return this.areaStatList;
    }

    public DescribeChannelAreaDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList extends TeaModel {
        /**
         * <p>The region name, such as China_Zhejiang Province_Hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>China_Zhejiang Province_Hangzhou</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The number of communicating users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallUserCount")
        public Integer callUserCount;

        /**
         * <p>The high-quality transmission rate, represented as a decimal. For example, 0.9999 indicates a high-quality transmission rate of 99.99%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9999</p>
         */
        @NameInMap("HighQualityTransmissionRate")
        public String highQualityTransmissionRate;

        /**
         * <p>The number of publishers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PubUserCount")
        public Integer pubUserCount;

        /**
         * <p>The number of subscribers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubUserCount")
        public Integer subUserCount;

        public static DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList self = new DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList();
            return TeaModel.build(map, self);
        }

        public DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList setCallUserCount(Integer callUserCount) {
            this.callUserCount = callUserCount;
            return this;
        }
        public Integer getCallUserCount() {
            return this.callUserCount;
        }

        public DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList setHighQualityTransmissionRate(String highQualityTransmissionRate) {
            this.highQualityTransmissionRate = highQualityTransmissionRate;
            return this;
        }
        public String getHighQualityTransmissionRate() {
            return this.highQualityTransmissionRate;
        }

        public DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList setPubUserCount(Integer pubUserCount) {
            this.pubUserCount = pubUserCount;
            return this;
        }
        public Integer getPubUserCount() {
            return this.pubUserCount;
        }

        public DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList setSubUserCount(Integer subUserCount) {
            this.subUserCount = subUserCount;
            return this;
        }
        public Integer getSubUserCount() {
            return this.subUserCount;
        }

    }

}
