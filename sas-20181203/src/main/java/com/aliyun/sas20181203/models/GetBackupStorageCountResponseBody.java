// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupStorageCountResponseBody extends TeaModel {
    // The details about the anti-ransomware capacity.
    @NameInMap("BackupStorageCount")
    public GetBackupStorageCountResponseBodyBackupStorageCount backupStorageCount;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The anti-ransomware capacity that you purchased. Unit: bytes.
        @NameInMap("BuyStorageByte")
        public Long buyStorageByte;

        // The storage capacity that is occupied by the backup data of your servers. Unit: bytes.
        @NameInMap("EcsUsageStorageByte")
        public Long ecsUsageStorageByte;

        // Indicates whether the anti-ransomware capacity that is used exceeds the anti-ransomware capacity that you purchased. Valid values:
        // 
        // *   **0**: no
        // *   **1**: yes
        @NameInMap("Overflow")
        public Integer overflow;

        // The storage capacity that is occupied by the backup data of your databases. Unit: bytes.
        @NameInMap("UniUsageStorageByte")
        public Long uniUsageStorageByte;

        // The total anti-ransomware capacity that is used. Unit: bytes.
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
