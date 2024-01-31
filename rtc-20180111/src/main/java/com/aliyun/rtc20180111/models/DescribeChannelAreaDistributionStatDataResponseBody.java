// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelAreaDistributionStatDataResponseBody extends TeaModel {
    @NameInMap("AreaStatList")
    public java.util.List<DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList> areaStatList;

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
        @NameInMap("AreaName")
        public String areaName;

        @NameInMap("CallUserCount")
        public Integer callUserCount;

        @NameInMap("HighQualityTransmissionRate")
        public String highQualityTransmissionRate;

        @NameInMap("PubUserCount")
        public Integer pubUserCount;

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
