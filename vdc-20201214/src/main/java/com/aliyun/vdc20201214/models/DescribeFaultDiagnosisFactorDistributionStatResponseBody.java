// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisFactorDistributionStatResponseBody extends TeaModel {
    // 影响因素分布统计数据
    @NameInMap("StatList")
    public java.util.List<DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList> statList;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFaultDiagnosisFactorDistributionStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisFactorDistributionStatResponseBody self = new DescribeFaultDiagnosisFactorDistributionStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponseBody setStatList(java.util.List<DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList> statList) {
        this.statList = statList;
        return this;
    }
    public java.util.List<DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList> getStatList() {
        return this.statList;
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList extends TeaModel {
        // 影响因素ID： 1：发布端网络差 2：订阅端网络差 3：发布端设备性能差 4：发布端关闭摄像头 5：发布端切到后台运行，UNKNOWN：未知
        @NameInMap("FactorId")
        public String factorId;

        // 影响用户数
        @NameInMap("UserCount")
        public Integer userCount;

        // 影响用户占比
        @NameInMap("UserRatio")
        public Float userRatio;

        public static DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList self = new DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList setFactorId(String factorId) {
            this.factorId = factorId;
            return this;
        }
        public String getFactorId() {
            return this.factorId;
        }

        public DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList setUserRatio(Float userRatio) {
            this.userRatio = userRatio;
            return this;
        }
        public Float getUserRatio() {
            return this.userRatio;
        }

    }

}
