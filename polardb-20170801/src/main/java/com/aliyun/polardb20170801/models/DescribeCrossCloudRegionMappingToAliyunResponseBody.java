// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudRegionMappingToAliyunResponseBody extends TeaModel {
    @NameInMap("CrossCloudRegionMappingList")
    public java.util.List<DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList> crossCloudRegionMappingList;

    /**
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCrossCloudRegionMappingToAliyunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudRegionMappingToAliyunResponseBody self = new DescribeCrossCloudRegionMappingToAliyunResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudRegionMappingToAliyunResponseBody setCrossCloudRegionMappingList(java.util.List<DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList> crossCloudRegionMappingList) {
        this.crossCloudRegionMappingList = crossCloudRegionMappingList;
        return this;
    }
    public java.util.List<DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList> getCrossCloudRegionMappingList() {
        return this.crossCloudRegionMappingList;
    }

    public DescribeCrossCloudRegionMappingToAliyunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("AliyunRegionId")
        public String aliyunRegionId;

        /**
         * <strong>example:</strong>
         * <p>HuaweiCloud</p>
         */
        @NameInMap("CloudProvider")
        public String cloudProvider;

        /**
         * <strong>example:</strong>
         * <p>cn-east-3</p>
         */
        @NameInMap("CrossCloudRegionId")
        public String crossCloudRegionId;

        public static DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList self = new DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList();
            return TeaModel.build(map, self);
        }

        public DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList setAliyunRegionId(String aliyunRegionId) {
            this.aliyunRegionId = aliyunRegionId;
            return this;
        }
        public String getAliyunRegionId() {
            return this.aliyunRegionId;
        }

        public DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList setCloudProvider(String cloudProvider) {
            this.cloudProvider = cloudProvider;
            return this;
        }
        public String getCloudProvider() {
            return this.cloudProvider;
        }

        public DescribeCrossCloudRegionMappingToAliyunResponseBodyCrossCloudRegionMappingList setCrossCloudRegionId(String crossCloudRegionId) {
            this.crossCloudRegionId = crossCloudRegionId;
            return this;
        }
        public String getCrossCloudRegionId() {
            return this.crossCloudRegionId;
        }

    }

}
