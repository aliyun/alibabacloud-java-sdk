// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsResponseBody extends TeaModel {
    @NameInMap("GroupedFields")
    public DescribeFieldStatisticsResponseBodyGroupedFields groupedFields;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFieldStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldStatisticsResponseBody self = new DescribeFieldStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFieldStatisticsResponseBody setGroupedFields(DescribeFieldStatisticsResponseBodyGroupedFields groupedFields) {
        this.groupedFields = groupedFields;
        return this;
    }
    public DescribeFieldStatisticsResponseBodyGroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    public DescribeFieldStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFieldStatisticsResponseBodyGroupedFields extends TeaModel {
        @NameInMap("AliYunInstanceCount")
        public Integer aliYunInstanceCount;

        @NameInMap("AwsInstanceCount")
        public Integer awsInstanceCount;

        @NameInMap("ExposedInstanceCount")
        public Integer exposedInstanceCount;

        @NameInMap("GeneralAssetCount")
        public Integer generalAssetCount;

        @NameInMap("GroupCount")
        public Integer groupCount;

        @NameInMap("HuaweiInstanceCount")
        public Integer huaweiInstanceCount;

        @NameInMap("IdcInstanceCount")
        public Integer idcInstanceCount;

        @NameInMap("ImportantAssetCount")
        public Integer importantAssetCount;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("InstanceSyncTaskCount")
        public Integer instanceSyncTaskCount;

        @NameInMap("NewInstanceCount")
        public Integer newInstanceCount;

        @NameInMap("NoRiskInstanceCount")
        public Integer noRiskInstanceCount;

        @NameInMap("NotRunningStatusCount")
        public Integer notRunningStatusCount;

        @NameInMap("OfflineInstanceCount")
        public Integer offlineInstanceCount;

        @NameInMap("OutMachineInstanceCount")
        public Integer outMachineInstanceCount;

        @NameInMap("PauseInstanceCount")
        public Integer pauseInstanceCount;

        @NameInMap("RegionCount")
        public Integer regionCount;

        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        @NameInMap("TencentInstanceCount")
        public Integer tencentInstanceCount;

        @NameInMap("TestAssetCount")
        public Integer testAssetCount;

        @NameInMap("TripartiteInstanceCount")
        public Integer tripartiteInstanceCount;

        @NameInMap("UnKnowStatusInstanceCount")
        public Integer unKnowStatusInstanceCount;

        @NameInMap("UnprotectedInstanceCount")
        public Integer unprotectedInstanceCount;

        @NameInMap("VpcCount")
        public Integer vpcCount;

        public static DescribeFieldStatisticsResponseBodyGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeFieldStatisticsResponseBodyGroupedFields self = new DescribeFieldStatisticsResponseBodyGroupedFields();
            return TeaModel.build(map, self);
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setAliYunInstanceCount(Integer aliYunInstanceCount) {
            this.aliYunInstanceCount = aliYunInstanceCount;
            return this;
        }
        public Integer getAliYunInstanceCount() {
            return this.aliYunInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setAwsInstanceCount(Integer awsInstanceCount) {
            this.awsInstanceCount = awsInstanceCount;
            return this;
        }
        public Integer getAwsInstanceCount() {
            return this.awsInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setExposedInstanceCount(Integer exposedInstanceCount) {
            this.exposedInstanceCount = exposedInstanceCount;
            return this;
        }
        public Integer getExposedInstanceCount() {
            return this.exposedInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setGeneralAssetCount(Integer generalAssetCount) {
            this.generalAssetCount = generalAssetCount;
            return this;
        }
        public Integer getGeneralAssetCount() {
            return this.generalAssetCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setHuaweiInstanceCount(Integer huaweiInstanceCount) {
            this.huaweiInstanceCount = huaweiInstanceCount;
            return this;
        }
        public Integer getHuaweiInstanceCount() {
            return this.huaweiInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setIdcInstanceCount(Integer idcInstanceCount) {
            this.idcInstanceCount = idcInstanceCount;
            return this;
        }
        public Integer getIdcInstanceCount() {
            return this.idcInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setImportantAssetCount(Integer importantAssetCount) {
            this.importantAssetCount = importantAssetCount;
            return this;
        }
        public Integer getImportantAssetCount() {
            return this.importantAssetCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setInstanceSyncTaskCount(Integer instanceSyncTaskCount) {
            this.instanceSyncTaskCount = instanceSyncTaskCount;
            return this;
        }
        public Integer getInstanceSyncTaskCount() {
            return this.instanceSyncTaskCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setNewInstanceCount(Integer newInstanceCount) {
            this.newInstanceCount = newInstanceCount;
            return this;
        }
        public Integer getNewInstanceCount() {
            return this.newInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setNoRiskInstanceCount(Integer noRiskInstanceCount) {
            this.noRiskInstanceCount = noRiskInstanceCount;
            return this;
        }
        public Integer getNoRiskInstanceCount() {
            return this.noRiskInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setNotRunningStatusCount(Integer notRunningStatusCount) {
            this.notRunningStatusCount = notRunningStatusCount;
            return this;
        }
        public Integer getNotRunningStatusCount() {
            return this.notRunningStatusCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setOfflineInstanceCount(Integer offlineInstanceCount) {
            this.offlineInstanceCount = offlineInstanceCount;
            return this;
        }
        public Integer getOfflineInstanceCount() {
            return this.offlineInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setOutMachineInstanceCount(Integer outMachineInstanceCount) {
            this.outMachineInstanceCount = outMachineInstanceCount;
            return this;
        }
        public Integer getOutMachineInstanceCount() {
            return this.outMachineInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setPauseInstanceCount(Integer pauseInstanceCount) {
            this.pauseInstanceCount = pauseInstanceCount;
            return this;
        }
        public Integer getPauseInstanceCount() {
            return this.pauseInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setRegionCount(Integer regionCount) {
            this.regionCount = regionCount;
            return this;
        }
        public Integer getRegionCount() {
            return this.regionCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setRiskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setTencentInstanceCount(Integer tencentInstanceCount) {
            this.tencentInstanceCount = tencentInstanceCount;
            return this;
        }
        public Integer getTencentInstanceCount() {
            return this.tencentInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setTestAssetCount(Integer testAssetCount) {
            this.testAssetCount = testAssetCount;
            return this;
        }
        public Integer getTestAssetCount() {
            return this.testAssetCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setTripartiteInstanceCount(Integer tripartiteInstanceCount) {
            this.tripartiteInstanceCount = tripartiteInstanceCount;
            return this;
        }
        public Integer getTripartiteInstanceCount() {
            return this.tripartiteInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setUnKnowStatusInstanceCount(Integer unKnowStatusInstanceCount) {
            this.unKnowStatusInstanceCount = unKnowStatusInstanceCount;
            return this;
        }
        public Integer getUnKnowStatusInstanceCount() {
            return this.unKnowStatusInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setUnprotectedInstanceCount(Integer unprotectedInstanceCount) {
            this.unprotectedInstanceCount = unprotectedInstanceCount;
            return this;
        }
        public Integer getUnprotectedInstanceCount() {
            return this.unprotectedInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setVpcCount(Integer vpcCount) {
            this.vpcCount = vpcCount;
            return this;
        }
        public Integer getVpcCount() {
            return this.vpcCount;
        }

    }

}
