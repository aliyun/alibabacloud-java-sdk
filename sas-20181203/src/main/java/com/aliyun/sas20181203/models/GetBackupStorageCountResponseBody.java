// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupStorageCountResponseBody extends TeaModel {
    @NameInMap("BackupStorageCount")
    public GetBackupStorageCountResponseBodyBackupStorageCount backupStorageCount;

    /**
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
         * <strong>example:</strong>
         * <p>2276332666880</p>
         */
        @NameInMap("BuyStorageByte")
        public Long buyStorageByte;

        /**
         * <strong>example:</strong>
         * <p>817262417803</p>
         */
        @NameInMap("EcsUsageStorageByte")
        public Long ecsUsageStorageByte;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Overflow")
        public Integer overflow;

        /**
         * <strong>example:</strong>
         * <p>7453049350</p>
         */
        @NameInMap("UniUsageStorageByte")
        public Long uniUsageStorageByte;

        /**
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
