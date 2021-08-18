// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelAreaDistributionStatDataResponseBody extends TeaModel {
    // 地域统计列表。
    @NameInMap("AreaStatList")
    public java.util.List<DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList> areaStatList;

    // 请求ID。
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
        // 地域名称，例如：中国_浙江省_杭州市。
        @NameInMap("AreaName")
        public String areaName;

        // 通信人数。
        @NameInMap("CallUserCount")
        public Integer callUserCount;

        // 发布端人数。
        @NameInMap("PubUserCount")
        public Integer pubUserCount;

        // 订阅端人数。
        @NameInMap("SubUserCount")
        public Integer subUserCount;

        // 优质传输率，用小数表示，例如0.9999表示优质传输率为99.99%。
        @NameInMap("HighQualityTransmissionRate")
        public String highQualityTransmissionRate;

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

        public DescribeChannelAreaDistributionStatDataResponseBodyAreaStatList setHighQualityTransmissionRate(String highQualityTransmissionRate) {
            this.highQualityTransmissionRate = highQualityTransmissionRate;
            return this;
        }
        public String getHighQualityTransmissionRate() {
            return this.highQualityTransmissionRate;
        }

    }

}
