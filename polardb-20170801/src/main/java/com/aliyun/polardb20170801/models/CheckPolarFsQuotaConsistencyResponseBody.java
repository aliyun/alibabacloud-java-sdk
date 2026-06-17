// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckPolarFsQuotaConsistencyResponseBody extends TeaModel {
    /**
     * <p>The ID of the PolarFS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>An object that contains details about the quota.</p>
     */
    @NameInMap("QuotaItem")
    public CheckPolarFsQuotaConsistencyResponseBodyQuotaItem quotaItem;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckPolarFsQuotaConsistencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckPolarFsQuotaConsistencyResponseBody self = new CheckPolarFsQuotaConsistencyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckPolarFsQuotaConsistencyResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public CheckPolarFsQuotaConsistencyResponseBody setQuotaItem(CheckPolarFsQuotaConsistencyResponseBodyQuotaItem quotaItem) {
        this.quotaItem = quotaItem;
        return this;
    }
    public CheckPolarFsQuotaConsistencyResponseBodyQuotaItem getQuotaItem() {
        return this.quotaItem;
    }

    public CheckPolarFsQuotaConsistencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckPolarFsQuotaConsistencyResponseBodyQuotaItem extends TeaModel {
        /**
         * <p>The storage capacity quota.</p>
         * 
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The inode quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("Inodes")
        public Long inodes;

        /**
         * <p>The directory path.</p>
         * 
         * <strong>example:</strong>
         * <p>/zookeepertest718</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The used capacity, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        /**
         * <p>The number of used inodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsedInodes")
        public Long usedInodes;

        public static CheckPolarFsQuotaConsistencyResponseBodyQuotaItem build(java.util.Map<String, ?> map) throws Exception {
            CheckPolarFsQuotaConsistencyResponseBodyQuotaItem self = new CheckPolarFsQuotaConsistencyResponseBodyQuotaItem();
            return TeaModel.build(map, self);
        }

        public CheckPolarFsQuotaConsistencyResponseBodyQuotaItem setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public CheckPolarFsQuotaConsistencyResponseBodyQuotaItem setInodes(Long inodes) {
            this.inodes = inodes;
            return this;
        }
        public Long getInodes() {
            return this.inodes;
        }

        public CheckPolarFsQuotaConsistencyResponseBodyQuotaItem setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CheckPolarFsQuotaConsistencyResponseBodyQuotaItem setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public CheckPolarFsQuotaConsistencyResponseBodyQuotaItem setUsedInodes(Long usedInodes) {
            this.usedInodes = usedInodes;
            return this;
        }
        public Long getUsedInodes() {
            return this.usedInodes;
        }

    }

}
