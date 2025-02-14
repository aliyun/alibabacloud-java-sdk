// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckCountStatisticResponseBody extends TeaModel {
    @NameInMap("CheckCountStatisticDTO")
    public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO checkCountStatisticDTO;

    /**
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCheckCountStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckCountStatisticResponseBody self = new GetCheckCountStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckCountStatisticResponseBody setCheckCountStatisticDTO(GetCheckCountStatisticResponseBodyCheckCountStatisticDTO checkCountStatisticDTO) {
        this.checkCountStatisticDTO = checkCountStatisticDTO;
        return this;
    }
    public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO getCheckCountStatisticDTO() {
        return this.checkCountStatisticDTO;
    }

    public GetCheckCountStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-wz9bpxyu6t74qn9g****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>launch-advisor-2021****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceSubType")
        public Integer instanceSubType;

        /**
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("InstanceSubTypeName")
        public String instanceSubTypeName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InstanceTypeName")
        public String instanceTypeName;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("RiskCount")
        public Integer riskCount;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems build(java.util.Map<String, ?> map) throws Exception {
            GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems self = new GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems();
            return TeaModel.build(map, self);
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceSubType(Integer instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public Integer getInstanceSubType() {
            return this.instanceSubType;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceSubTypeName(String instanceSubTypeName) {
            this.instanceSubTypeName = instanceSubTypeName;
            return this;
        }
        public String getInstanceSubTypeName() {
            return this.instanceSubTypeName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
            return this;
        }
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class GetCheckCountStatisticResponseBodyCheckCountStatisticDTO extends TeaModel {
        @NameInMap("CheckCountStatisticItems")
        public java.util.List<GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems> checkCountStatisticItems;

        /**
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("StatisticType")
        public String statisticType;

        public static GetCheckCountStatisticResponseBodyCheckCountStatisticDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCheckCountStatisticResponseBodyCheckCountStatisticDTO self = new GetCheckCountStatisticResponseBodyCheckCountStatisticDTO();
            return TeaModel.build(map, self);
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO setCheckCountStatisticItems(java.util.List<GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems> checkCountStatisticItems) {
            this.checkCountStatisticItems = checkCountStatisticItems;
            return this;
        }
        public java.util.List<GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems> getCheckCountStatisticItems() {
            return this.checkCountStatisticItems;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO setStatisticType(String statisticType) {
            this.statisticType = statisticType;
            return this;
        }
        public String getStatisticType() {
            return this.statisticType;
        }

    }

}
