// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenHostStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeScreenHostStatisticsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScreenHostStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenHostStatisticsResponseBody self = new DescribeScreenHostStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenHostStatisticsResponseBody setData(DescribeScreenHostStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeScreenHostStatisticsResponseBodyData getData() {
        return this.data;
    }

    public DescribeScreenHostStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScreenHostStatisticsResponseBodyData extends TeaModel {
        @NameInMap("SafeCount")
        public java.util.List<String> safeCount;

        @NameInMap("SuspEventMachineNames")
        public java.util.List<String> suspEventMachineNames;

        @NameInMap("SuspEventUuids")
        public java.util.List<String> suspEventUuids;

        @NameInMap("WeaknessMachineNames")
        public java.util.List<String> weaknessMachineNames;

        @NameInMap("WeaknessUuids")
        public java.util.List<String> weaknessUuids;

        public static DescribeScreenHostStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenHostStatisticsResponseBodyData self = new DescribeScreenHostStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeScreenHostStatisticsResponseBodyData setSafeCount(java.util.List<String> safeCount) {
            this.safeCount = safeCount;
            return this;
        }
        public java.util.List<String> getSafeCount() {
            return this.safeCount;
        }

        public DescribeScreenHostStatisticsResponseBodyData setSuspEventMachineNames(java.util.List<String> suspEventMachineNames) {
            this.suspEventMachineNames = suspEventMachineNames;
            return this;
        }
        public java.util.List<String> getSuspEventMachineNames() {
            return this.suspEventMachineNames;
        }

        public DescribeScreenHostStatisticsResponseBodyData setSuspEventUuids(java.util.List<String> suspEventUuids) {
            this.suspEventUuids = suspEventUuids;
            return this;
        }
        public java.util.List<String> getSuspEventUuids() {
            return this.suspEventUuids;
        }

        public DescribeScreenHostStatisticsResponseBodyData setWeaknessMachineNames(java.util.List<String> weaknessMachineNames) {
            this.weaknessMachineNames = weaknessMachineNames;
            return this;
        }
        public java.util.List<String> getWeaknessMachineNames() {
            return this.weaknessMachineNames;
        }

        public DescribeScreenHostStatisticsResponseBodyData setWeaknessUuids(java.util.List<String> weaknessUuids) {
            this.weaknessUuids = weaknessUuids;
            return this;
        }
        public java.util.List<String> getWeaknessUuids() {
            return this.weaknessUuids;
        }

    }

}
