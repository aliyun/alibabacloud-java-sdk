// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsZoneOverviewResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribePvtzStatisticsZoneOverviewResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePvtzStatisticsZoneOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsZoneOverviewResponseBody self = new DescribePvtzStatisticsZoneOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsZoneOverviewResponseBody setData(DescribePvtzStatisticsZoneOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePvtzStatisticsZoneOverviewResponseBodyData getData() {
        return this.data;
    }

    public DescribePvtzStatisticsZoneOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePvtzStatisticsZoneOverviewResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RefusedDomainCount")
        public Long refusedDomainCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SuddenDropDomainCount")
        public Long suddenDropDomainCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SuddenIncreaseDomainCount")
        public Long suddenIncreaseDomainCount;

        public static DescribePvtzStatisticsZoneOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsZoneOverviewResponseBodyData self = new DescribePvtzStatisticsZoneOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsZoneOverviewResponseBodyData setRefusedDomainCount(Long refusedDomainCount) {
            this.refusedDomainCount = refusedDomainCount;
            return this;
        }
        public Long getRefusedDomainCount() {
            return this.refusedDomainCount;
        }

        public DescribePvtzStatisticsZoneOverviewResponseBodyData setSuddenDropDomainCount(Long suddenDropDomainCount) {
            this.suddenDropDomainCount = suddenDropDomainCount;
            return this;
        }
        public Long getSuddenDropDomainCount() {
            return this.suddenDropDomainCount;
        }

        public DescribePvtzStatisticsZoneOverviewResponseBodyData setSuddenIncreaseDomainCount(Long suddenIncreaseDomainCount) {
            this.suddenIncreaseDomainCount = suddenIncreaseDomainCount;
            return this;
        }
        public Long getSuddenIncreaseDomainCount() {
            return this.suddenIncreaseDomainCount;
        }

    }

}
