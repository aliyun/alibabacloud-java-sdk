// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableTenantsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tenants")
    public java.util.List<DescribeRestorableTenantsResponseBodyTenants> tenants;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRestorableTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableTenantsResponseBody self = new DescribeRestorableTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestorableTenantsResponseBody setTenants(java.util.List<DescribeRestorableTenantsResponseBodyTenants> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<DescribeRestorableTenantsResponseBodyTenants> getTenants() {
        return this.tenants;
    }

    public DescribeRestorableTenantsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRestorableTenantsResponseBodyTenantsBackupSets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bak-4n****gacpa8</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01\&quot;T\&quot;12:10:10.000\&quot;Z\&quot;</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <strong>example:</strong>
         * <p>bak-xxxxx</p>
         */
        @NameInMap("SetId")
        public String setId;

        /**
         * <strong>example:</strong>
         * <p>t5********</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static DescribeRestorableTenantsResponseBodyTenantsBackupSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorableTenantsResponseBodyTenantsBackupSets self = new DescribeRestorableTenantsResponseBodyTenantsBackupSets();
            return TeaModel.build(map, self);
        }

        public DescribeRestorableTenantsResponseBodyTenantsBackupSets setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeRestorableTenantsResponseBodyTenantsBackupSets setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeRestorableTenantsResponseBodyTenantsBackupSets setSetId(String setId) {
            this.setId = setId;
            return this;
        }
        public String getSetId() {
            return this.setId;
        }

        public DescribeRestorableTenantsResponseBodyTenantsBackupSets setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-03-13T02:43:03Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FromArchive")
        public Boolean fromArchive;

        /**
         * <strong>example:</strong>
         * <p>2023-01-20T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList self = new DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList();
            return TeaModel.build(map, self);
        }

        public DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList setFromArchive(Boolean fromArchive) {
            this.fromArchive = fromArchive;
            return this;
        }
        public Boolean getFromArchive() {
            return this.fromArchive;
        }

        public DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeRestorableTenantsResponseBodyTenants extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("BackupBucketName")
        public String backupBucketName;

        @NameInMap("BackupSets")
        public java.util.List<DescribeRestorableTenantsResponseBodyTenantsBackupSets> backupSets;

        /**
         * <strong>example:</strong>
         * <p>objnf3b2****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>testCluster</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuNum")
        public Long cpuNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MemoryNum")
        public Long memoryNum;

        /**
         * <strong>example:</strong>
         * <p>logical</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>3.2.3.1-2022080510****</p>
         */
        @NameInMap("ObRpmVersion")
        public String obRpmVersion;

        /**
         * <strong>example:</strong>
         * <p>tvd43v****</p>
         */
        @NameInMap("ObTenantId")
        public String obTenantId;

        /**
         * <strong>example:</strong>
         * <p>3.2.3.1</p>
         */
        @NameInMap("ObVersion")
        public String obVersion;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("TenantAlias")
        public String tenantAlias;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TenantDataBackupRemainDays")
        public Integer tenantDataBackupRemainDays;

        /**
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>Oracle</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        /**
         * <strong>example:</strong>
         * <p>sbtest1</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("TimeIntervalList")
        public java.util.List<DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList> timeIntervalList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnitNum")
        public Long unitNum;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("UsedDisk")
        public Long usedDisk;

        public static DescribeRestorableTenantsResponseBodyTenants build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorableTenantsResponseBodyTenants self = new DescribeRestorableTenantsResponseBodyTenants();
            return TeaModel.build(map, self);
        }

        public DescribeRestorableTenantsResponseBodyTenants setBackupBucketName(String backupBucketName) {
            this.backupBucketName = backupBucketName;
            return this;
        }
        public String getBackupBucketName() {
            return this.backupBucketName;
        }

        public DescribeRestorableTenantsResponseBodyTenants setBackupSets(java.util.List<DescribeRestorableTenantsResponseBodyTenantsBackupSets> backupSets) {
            this.backupSets = backupSets;
            return this;
        }
        public java.util.List<DescribeRestorableTenantsResponseBodyTenantsBackupSets> getBackupSets() {
            return this.backupSets;
        }

        public DescribeRestorableTenantsResponseBodyTenants setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeRestorableTenantsResponseBodyTenants setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeRestorableTenantsResponseBodyTenants setCpuNum(Long cpuNum) {
            this.cpuNum = cpuNum;
            return this;
        }
        public Long getCpuNum() {
            return this.cpuNum;
        }

        public DescribeRestorableTenantsResponseBodyTenants setMemoryNum(Long memoryNum) {
            this.memoryNum = memoryNum;
            return this;
        }
        public Long getMemoryNum() {
            return this.memoryNum;
        }

        public DescribeRestorableTenantsResponseBodyTenants setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeRestorableTenantsResponseBodyTenants setObRpmVersion(String obRpmVersion) {
            this.obRpmVersion = obRpmVersion;
            return this;
        }
        public String getObRpmVersion() {
            return this.obRpmVersion;
        }

        public DescribeRestorableTenantsResponseBodyTenants setObTenantId(String obTenantId) {
            this.obTenantId = obTenantId;
            return this;
        }
        public String getObTenantId() {
            return this.obTenantId;
        }

        public DescribeRestorableTenantsResponseBodyTenants setObVersion(String obVersion) {
            this.obVersion = obVersion;
            return this;
        }
        public String getObVersion() {
            return this.obVersion;
        }

        public DescribeRestorableTenantsResponseBodyTenants setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTenantAlias(String tenantAlias) {
            this.tenantAlias = tenantAlias;
            return this;
        }
        public String getTenantAlias() {
            return this.tenantAlias;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTenantDataBackupRemainDays(Integer tenantDataBackupRemainDays) {
            this.tenantDataBackupRemainDays = tenantDataBackupRemainDays;
            return this;
        }
        public Integer getTenantDataBackupRemainDays() {
            return this.tenantDataBackupRemainDays;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTenantMode(String tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public String getTenantMode() {
            return this.tenantMode;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeRestorableTenantsResponseBodyTenants setTimeIntervalList(java.util.List<DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList> timeIntervalList) {
            this.timeIntervalList = timeIntervalList;
            return this;
        }
        public java.util.List<DescribeRestorableTenantsResponseBodyTenantsTimeIntervalList> getTimeIntervalList() {
            return this.timeIntervalList;
        }

        public DescribeRestorableTenantsResponseBodyTenants setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

        public DescribeRestorableTenantsResponseBodyTenants setUsedDisk(Long usedDisk) {
            this.usedDisk = usedDisk;
            return this;
        }
        public Long getUsedDisk() {
            return this.usedDisk;
        }

    }

}
