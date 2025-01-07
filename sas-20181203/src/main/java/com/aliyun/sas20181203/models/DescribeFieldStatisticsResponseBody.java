// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsResponseBody extends TeaModel {
    /**
     * <p>The information about servers that are returned.</p>
     */
    @NameInMap("GroupedFields")
    public DescribeFieldStatisticsResponseBodyGroupedFields groupedFields;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
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
        /**
         * <p>The number of assets that are deployed on Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AliYunInstanceCount")
        public Integer aliYunInstanceCount;

        /**
         * <p>The number of servers.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AwsInstanceCount")
        public Integer awsInstanceCount;

        /**
         * <p>The number of third-party cloud servers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AzureInstanceCount")
        public Integer azureInstanceCount;

        /**
         * <p>The number of cores of exposed assets.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ExposedInstanceCoreCount")
        public Long exposedInstanceCoreCount;

        /**
         * <p>The number of exposed servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExposedInstanceCount")
        public Integer exposedInstanceCount;

        /**
         * <p>The number of assets whose importance is common.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GeneralAssetCount")
        public Integer generalAssetCount;

        /**
         * <p>The number of server groups.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("GroupCount")
        public Integer groupCount;

        /**
         * <p>The number of instances that are provisioned by third-party providers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HuaweiInstanceCount")
        public Integer huaweiInstanceCount;

        /**
         * <p>The number of assets that can be protected by Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("IdcInstanceCount")
        public Integer idcInstanceCount;

        /**
         * <p>The number of assets whose importance is important.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ImportantAssetCount")
        public Integer importantAssetCount;

        /**
         * <p>The number of cores of assets in the specified asset type. If the asset type is not specified, the value of this parameter indicates the total number of cores of servers and Alibaba Cloud services within your account.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("InstanceCoreCount")
        public Long instanceCoreCount;

        /**
         * <p>The total number of assets of the specified type. If no asset types are specified, this parameter indicates the total number of all servers and Alibaba Cloud services within your account.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The total number of tasks for the specified type of assets. If no asset types are specified, this parameter indicates the total number of all servers and Alibaba Cloud services within your account.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstanceSyncTaskCount")
        public Integer instanceSyncTaskCount;

        /**
         * <p>The number of cores of new servers.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("NewInstanceCoreCount")
        public Long newInstanceCoreCount;

        /**
         * <p>The number of newly added servers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NewInstanceCount")
        public Integer newInstanceCount;

        /**
         * <p>The number of servers on which no risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NoRiskInstanceCount")
        public Integer noRiskInstanceCount;

        /**
         * <p>The number of assets that are not added to Security Center of the specified asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NotBindMachineInstanceCount")
        public Integer notBindMachineInstanceCount;

        /**
         * <p>The number of cores of servers that are not started.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("NotRunningStatusCoreCount")
        public Long notRunningStatusCoreCount;

        /**
         * <p>The number of servers that are shut down.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NotRunningStatusCount")
        public Integer notRunningStatusCount;

        /**
         * <p>The number of servers whose Security Center agent status is Offline.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("OfflineInstanceCount")
        public Integer offlineInstanceCount;

        /**
         * <p>The number of servers outside the cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OutMachineInstanceCount")
        public Integer outMachineInstanceCount;

        /**
         * <p>The number of servers for which the Security Center agent suspends protection.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PauseInstanceCount")
        public Integer pauseInstanceCount;

        /**
         * <p>The number of regions to which the servers belong.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("RegionCount")
        public Integer regionCount;

        /**
         * <p>The number of cores of vulnerable assets.</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        @NameInMap("RiskInstanceCoreCount")
        public Long riskInstanceCoreCount;

        /**
         * <p>The number of assets that are at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        /**
         * <p>The total number of cloud services that are protected by Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TencentInstanceCount")
        public Integer tencentInstanceCount;

        /**
         * <p>The number of assets whose importance is test.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TestAssetCount")
        public Integer testAssetCount;

        /**
         * <p>The number of simple application servers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TripartiteInstanceCount")
        public Integer tripartiteInstanceCount;

        /**
         * <p>The number of servers that are in the Unknown state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnKnowStatusInstanceCount")
        public Integer unKnowStatusInstanceCount;

        /**
         * <p>The number of cores of unprotected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UnprotectedInstanceCoreCount")
        public Long unprotectedInstanceCoreCount;

        /**
         * <p>The number of unprotected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnprotectedInstanceCount")
        public Integer unprotectedInstanceCount;

        /**
         * <p>The number of virtual private clouds (VPCs).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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

        public DescribeFieldStatisticsResponseBodyGroupedFields setExposedInstanceCoreCount(Long exposedInstanceCoreCount) {
            this.exposedInstanceCoreCount = exposedInstanceCoreCount;
            return this;
        }
        public Long getExposedInstanceCoreCount() {
            return this.exposedInstanceCoreCount;
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

        public DescribeFieldStatisticsResponseBodyGroupedFields setInstanceCoreCount(Long instanceCoreCount) {
            this.instanceCoreCount = instanceCoreCount;
            return this;
        }
        public Long getInstanceCoreCount() {
            return this.instanceCoreCount;
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

        public DescribeFieldStatisticsResponseBodyGroupedFields setNewInstanceCoreCount(Long newInstanceCoreCount) {
            this.newInstanceCoreCount = newInstanceCoreCount;
            return this;
        }
        public Long getNewInstanceCoreCount() {
            return this.newInstanceCoreCount;
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

        public DescribeFieldStatisticsResponseBodyGroupedFields setNotBindMachineInstanceCount(Integer notBindMachineInstanceCount) {
            this.notBindMachineInstanceCount = notBindMachineInstanceCount;
            return this;
        }
        public Integer getNotBindMachineInstanceCount() {
            return this.notBindMachineInstanceCount;
        }

        public DescribeFieldStatisticsResponseBodyGroupedFields setNotRunningStatusCoreCount(Long notRunningStatusCoreCount) {
            this.notRunningStatusCoreCount = notRunningStatusCoreCount;
            return this;
        }
        public Long getNotRunningStatusCoreCount() {
            return this.notRunningStatusCoreCount;
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

        public DescribeFieldStatisticsResponseBodyGroupedFields setRiskInstanceCoreCount(Long riskInstanceCoreCount) {
            this.riskInstanceCoreCount = riskInstanceCoreCount;
            return this;
        }
        public Long getRiskInstanceCoreCount() {
            return this.riskInstanceCoreCount;
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

        public DescribeFieldStatisticsResponseBodyGroupedFields setUnprotectedInstanceCoreCount(Long unprotectedInstanceCoreCount) {
            this.unprotectedInstanceCoreCount = unprotectedInstanceCoreCount;
            return this;
        }
        public Long getUnprotectedInstanceCoreCount() {
            return this.unprotectedInstanceCoreCount;
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
