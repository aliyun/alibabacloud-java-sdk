// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsResponseBody extends TeaModel {
    /**
     * <p>The information about the servers.</p>
     */
    @NameInMap("GroupedFields")
    public DescribeFieldStatisticsResponseBodyGroupedFields groupedFields;

    /**
     * <p>The information about servers that are returned.</p>
     */
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

        /**
         * <p>The number of third-party cloud servers.</p>
         */
        @NameInMap("AwsInstanceCount")
        public Integer awsInstanceCount;

        /**
         * <p>The number of third-party cloud servers.</p>
         */
        @NameInMap("AzureInstanceCount")
        public Integer azureInstanceCount;

        /**
         * <p>The data returned.</p>
         */
        @NameInMap("ExposedInstanceCount")
        public Integer exposedInstanceCount;

        /**
         * <p>The number of server groups.</p>
         */
        @NameInMap("GeneralAssetCount")
        public Integer generalAssetCount;

        /**
         * <p>The type of the asset to query. If no asset types are specified, all types of assets are returned. Valid values:</p>
         * <br>
         * <p>*   **ecs**: server</p>
         * <p>*   **cloud_product**: Alibaba Cloud service</p>
         */
        @NameInMap("GroupCount")
        public Integer groupCount;

        /**
         * <p>The number of third-party cloud servers.</p>
         */
        @NameInMap("HuaweiInstanceCount")
        public Integer huaweiInstanceCount;

        /**
         * <p>DescribeFieldStatistics</p>
         */
        @NameInMap("IdcInstanceCount")
        public Integer idcInstanceCount;

        /**
         * <p>The number of assets that are at risk.</p>
         */
        @NameInMap("ImportantAssetCount")
        public Integer importantAssetCount;

        /**
         * <p>The number of assets that are deployed on Alibaba Cloud.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The number of assets whose importance is common.</p>
         */
        @NameInMap("InstanceSyncTaskCount")
        public Integer instanceSyncTaskCount;

        /**
         * <p>The number of assets whose statuses are unknown.</p>
         */
        @NameInMap("NewInstanceCount")
        public Integer newInstanceCount;

        /**
         * <p>The number of servers on which no risks are detected.</p>
         */
        @NameInMap("NoRiskInstanceCount")
        public Integer noRiskInstanceCount;

        /**
         * <p>WB01224678</p>
         */
        @NameInMap("NotRunningStatusCount")
        public Integer notRunningStatusCount;

        /**
         * <p>The number of unprotected assets.</p>
         */
        @NameInMap("OfflineInstanceCount")
        public Integer offlineInstanceCount;

        @NameInMap("OutMachineInstanceCount")
        public Integer outMachineInstanceCount;

        /**
         * <p>Queries the statistics of assets that belong to your account.</p>
         */
        @NameInMap("PauseInstanceCount")
        public Integer pauseInstanceCount;

        /**
         * <p>The number of virtual private clouds (VPCs).</p>
         */
        @NameInMap("RegionCount")
        public Integer regionCount;

        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        /**
         * <p>The number of third-party cloud servers.</p>
         */
        @NameInMap("TencentInstanceCount")
        public Integer tencentInstanceCount;

        /**
         * <p>The number of servers outside the cloud.</p>
         */
        @NameInMap("TestAssetCount")
        public Integer testAssetCount;

        /**
         * <p>The number of simple application servers.</p>
         */
        @NameInMap("TripartiteInstanceCount")
        public Integer tripartiteInstanceCount;

        /**
         * <p>The number of servers that are in the Unknown state.</p>
         */
        @NameInMap("UnKnowStatusInstanceCount")
        public Integer unKnowStatusInstanceCount;

        /**
         * <p>The number of servers whose Security Center agent status is Offline.</p>
         */
        @NameInMap("UnprotectedInstanceCount")
        public Integer unprotectedInstanceCount;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
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

        public DescribeFieldStatisticsResponseBodyGroupedFields setAzureInstanceCount(Integer azureInstanceCount) {
            this.azureInstanceCount = azureInstanceCount;
            return this;
        }
        public Integer getAzureInstanceCount() {
            return this.azureInstanceCount;
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
