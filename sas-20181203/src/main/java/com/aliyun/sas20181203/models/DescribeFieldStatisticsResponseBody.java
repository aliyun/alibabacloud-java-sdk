// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupedFields")
    public DescribeFieldStatisticsResponseBodyGroupedFields groupedFields;

    public static DescribeFieldStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldStatisticsResponseBody self = new DescribeFieldStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFieldStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFieldStatisticsResponseBody setGroupedFields(DescribeFieldStatisticsResponseBodyGroupedFields groupedFields) {
        this.groupedFields = groupedFields;
        return this;
    }
    public DescribeFieldStatisticsResponseBodyGroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    public static class DescribeFieldStatisticsResponseBodyGroupedFields extends TeaModel {
        @NameInMap("OfflineInstanceCount")
        public Integer offlineInstanceCount;

        @NameInMap("RegionCount")
        public Integer regionCount;

        @NameInMap("NewInstanceCount")
        public Integer newInstanceCount;

        @NameInMap("ExposedInstanceCount")
        public Integer exposedInstanceCount;

        @NameInMap("GroupCount")
        public Integer groupCount;

        @NameInMap("TencentInstanceCount")
        public Integer tencentInstanceCount;

        @NameInMap("GeneralAssetCount")
        public Integer generalAssetCount;

        @NameInMap("InstanceSyncTaskCount")
        public Integer instanceSyncTaskCount;

        @NameInMap("UnprotectedInstanceCount")
        public Integer unprotectedInstanceCount;

        @NameInMap("ImportantAssetCount")
        public Integer importantAssetCount;

        @NameInMap("TestAssetCount")
        public Integer testAssetCount;

        @NameInMap("VpcCount")
        public Integer vpcCount;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("PauseInstanceCount")
        public Integer pauseInstanceCount;

        @NameInMap("IdcInstanceCount")
        public Integer idcInstanceCount;

        @NameInMap("NotRunningStatusCount")
        public Integer notRunningStatusCount;

        @NameInMap("AliYunInstanceCount")
        public Integer aliYunInstanceCount;

        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        public static DescribeFieldStatisticsResponseBodyGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeFieldStatisticsResponseBodyGroupedFields self = new DescribeFieldStatisticsResponseBodyGroupedFields();
            return TeaModel.build(map, self);
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setOfflineInstanceCount(Integer offlineInstanceCount) {
            this.offlineInstanceCount = offlineInstanceCount;
            return this;
        }
        public Integer getOfflineInstanceCount() {
            return this.offlineInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setRegionCount(Integer regionCount) {
            this.regionCount = regionCount;
            return this;
        }
        public Integer getRegionCount() {
            return this.regionCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setNewInstanceCount(Integer newInstanceCount) {
            this.newInstanceCount = newInstanceCount;
            return this;
        }
        public Integer getNewInstanceCount() {
            return this.newInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setExposedInstanceCount(Integer exposedInstanceCount) {
            this.exposedInstanceCount = exposedInstanceCount;
            return this;
        }
        public Integer getExposedInstanceCount() {
            return this.exposedInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setTencentInstanceCount(Integer tencentInstanceCount) {
            this.tencentInstanceCount = tencentInstanceCount;
            return this;
        }
        public Integer getTencentInstanceCount() {
            return this.tencentInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setGeneralAssetCount(Integer generalAssetCount) {
            this.generalAssetCount = generalAssetCount;
            return this;
        }
        public Integer getGeneralAssetCount() {
            return this.generalAssetCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setInstanceSyncTaskCount(Integer instanceSyncTaskCount) {
            this.instanceSyncTaskCount = instanceSyncTaskCount;
            return this;
        }
        public Integer getInstanceSyncTaskCount() {
            return this.instanceSyncTaskCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setUnprotectedInstanceCount(Integer unprotectedInstanceCount) {
            this.unprotectedInstanceCount = unprotectedInstanceCount;
            return this;
        }
        public Integer getUnprotectedInstanceCount() {
            return this.unprotectedInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setImportantAssetCount(Integer importantAssetCount) {
            this.importantAssetCount = importantAssetCount;
            return this;
        }
        public Integer getImportantAssetCount() {
            return this.importantAssetCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setTestAssetCount(Integer testAssetCount) {
            this.testAssetCount = testAssetCount;
            return this;
        }
        public Integer getTestAssetCount() {
            return this.testAssetCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setVpcCount(Integer vpcCount) {
            this.vpcCount = vpcCount;
            return this;
        }
        public Integer getVpcCount() {
            return this.vpcCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setPauseInstanceCount(Integer pauseInstanceCount) {
            this.pauseInstanceCount = pauseInstanceCount;
            return this;
        }
        public Integer getPauseInstanceCount() {
            return this.pauseInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setIdcInstanceCount(Integer idcInstanceCount) {
            this.idcInstanceCount = idcInstanceCount;
            return this;
        }
        public Integer getIdcInstanceCount() {
            return this.idcInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setNotRunningStatusCount(Integer notRunningStatusCount) {
            this.notRunningStatusCount = notRunningStatusCount;
            return this;
        }
        public Integer getNotRunningStatusCount() {
            return this.notRunningStatusCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setAliYunInstanceCount(Integer aliYunInstanceCount) {
            this.aliYunInstanceCount = aliYunInstanceCount;
            return this;
        }
        public Integer getAliYunInstanceCount() {
            return this.aliYunInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setRiskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

    }

}
