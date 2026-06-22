// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupStorageCountResponseBody extends TeaModel {
    /**
     * <p>The details of the anti-ransomware storage capacity.</p>
     */
    @NameInMap("BackupStorageCount")
    public GetBackupStorageCountResponseBodyBackupStorageCount backupStorageCount;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>33C2CCFF-4BF8-5F88-9B5C-22F932F80E5A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBackupStorageCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBackupStorageCountResponseBody self = new GetBackupStorageCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBackupStorageCountResponseBody setBackupStorageCount(GetBackupStorageCountResponseBodyBackupStorageCount backupStorageCount) {
        this.backupStorageCount = backupStorageCount;
        return this;
    }
    public GetBackupStorageCountResponseBodyBackupStorageCount getBackupStorageCount() {
        return this.backupStorageCount;
    }

    public GetBackupStorageCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBackupStorageCountResponseBodyBackupStorageCount extends TeaModel {
        /**
         * <p>The purchased anti-ransomware capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2276332666880</p>
         */
        @NameInMap("BuyStorageByte")
        public Long buyStorageByte;

        /**
         * <p>The storage capacity occupied by server backups in the backup data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>817262417803</p>
         */
        @NameInMap("EcsUsageStorageByte")
        public Long ecsUsageStorageByte;

        /**
         * <p>Indicates whether the anti-ransomware usage exceeds the purchased capacity. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not exceeded</li>
         * <li><strong>1</strong>: exceeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Overflow")
        public Integer overflow;

        /**
         * <p>The storage capacity occupied by database backups in the backup data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>7453049350</p>
         */
        @NameInMap("UniUsageStorageByte")
        public Long uniUsageStorageByte;

        /**
         * <p>The total used anti-ransomware storage capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>839621565853</p>
         */
        @NameInMap("UsageStorageByte")
        public Long usageStorageByte;

        public static GetBackupStorageCountResponseBodyBackupStorageCount build(java.util.Map<String, ?> map) throws Exception {
            GetBackupStorageCountResponseBodyBackupStorageCount self = new GetBackupStorageCountResponseBodyBackupStorageCount();
            return TeaModel.build(map, self);
        }

        public GetBackupStorageCountResponseBodyBackupStorageCount setBuyStorageByte(Long buyStorageByte) {
            this.buyStorageByte = buyStorageByte;
            return this;
        }
        public Long getBuyStorageByte() {
            return this.buyStorageByte;
        }

        public GetBackupStorageCountResponseBodyBackupStorageCount setEcsUsageStorageByte(Long ecsUsageStorageByte) {
            this.ecsUsageStorageByte = ecsUsageStorageByte;
            return this;
        }
        public Long getEcsUsageStorageByte() {
            return this.ecsUsageStorageByte;
        }

        public GetBackupStorageCountResponseBodyBackupStorageCount setOverflow(Integer overflow) {
            this.overflow = overflow;
            return this;
        }
        public Integer getOverflow() {
            return this.overflow;
        }

        public GetBackupStorageCountResponseBodyBackupStorageCount setUniUsageStorageByte(Long uniUsageStorageByte) {
            this.uniUsageStorageByte = uniUsageStorageByte;
            return this;
        }
        public Long getUniUsageStorageByte() {
            return this.uniUsageStorageByte;
        }

        public GetBackupStorageCountResponseBodyBackupStorageCount setUsageStorageByte(Long usageStorageByte) {
            this.usageStorageByte = usageStorageByte;
            return this;
        }
        public Long getUsageStorageByte() {
            return this.usageStorageByte;
        }

    }

}
