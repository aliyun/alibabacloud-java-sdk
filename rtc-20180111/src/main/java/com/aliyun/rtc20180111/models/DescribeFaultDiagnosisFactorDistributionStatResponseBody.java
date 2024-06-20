// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisFactorDistributionStatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatList")
    public java.util.List<DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList> statList;

    public static DescribeFaultDiagnosisFactorDistributionStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisFactorDistributionStatResponseBody self = new DescribeFaultDiagnosisFactorDistributionStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponseBody setStatList(java.util.List<DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList> statList) {
        this.statList = statList;
        return this;
    }
    public java.util.List<DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList> getStatList() {
        return this.statList;
    }

    public static class DescribeFaultDiagnosisFactorDistributionStatResponseBodyStatList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FactorId")
        public String factorId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        /**
         * <strong>example:</strong>
         * <p>0.9239</p>
         */
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
