// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColdDataBasicInfoResponseBody extends TeaModel {
    /**
     * <p>The details.</p>
     */
    @NameInMap("Data")
    public DescribeColdDataBasicInfoResponseBodyData data;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeColdDataBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdDataBasicInfoResponseBody self = new DescribeColdDataBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColdDataBasicInfoResponseBody setData(DescribeColdDataBasicInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeColdDataBasicInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeColdDataBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeColdDataBasicInfoResponseBodyData extends TeaModel {
        /**
         * <p>The number of backup sets.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackupSetCount")
        public Integer backupSetCount;

        /**
         * <p>The data size of valid backup sets.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackupSetSpaceSize")
        public Double backupSetSpaceSize;

        /**
         * <p>The underlying cloud storage service.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunOSS</p>
         */
        @NameInMap("CloudProduct")
        public String cloudProduct;

        /**
         * <p>The data size of cold storage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentSpaceSize")
        public Double currentSpaceSize;

        /**
         * <p>The data redundancy type of cold storage. LRS indicates locally redundant storage.</p>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

        /**
         * <p>Indicates whether cold storage is enabled.</p>
         */
        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        /**
         * <p>The number of read accesses to cold data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadAccessNum")
        public Long readAccessNum;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the storage volume.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx-oss-columnar-bucket-cn-hangzhou-1</p>
         */
        @NameInMap("VolumeName")
        public String volumeName;

        /**
         * <p>The number of write accesses to cold data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WriteAccessNum")
        public Double writeAccessNum;

        public static DescribeColdDataBasicInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeColdDataBasicInfoResponseBodyData self = new DescribeColdDataBasicInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeColdDataBasicInfoResponseBodyData setBackupSetCount(Integer backupSetCount) {
            this.backupSetCount = backupSetCount;
            return this;
        }
        public Integer getBackupSetCount() {
            return this.backupSetCount;
        }

        public DescribeColdDataBasicInfoResponseBodyData setBackupSetSpaceSize(Double backupSetSpaceSize) {
            this.backupSetSpaceSize = backupSetSpaceSize;
            return this;
        }
        public Double getBackupSetSpaceSize() {
            return this.backupSetSpaceSize;
        }

        public DescribeColdDataBasicInfoResponseBodyData setCloudProduct(String cloudProduct) {
            this.cloudProduct = cloudProduct;
            return this;
        }
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        public DescribeColdDataBasicInfoResponseBodyData setCurrentSpaceSize(Double currentSpaceSize) {
            this.currentSpaceSize = currentSpaceSize;
            return this;
        }
        public Double getCurrentSpaceSize() {
            return this.currentSpaceSize;
        }

        public DescribeColdDataBasicInfoResponseBodyData setDataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        public DescribeColdDataBasicInfoResponseBodyData setEnableStatus(Boolean enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Boolean getEnableStatus() {
            return this.enableStatus;
        }

        public DescribeColdDataBasicInfoResponseBodyData setReadAccessNum(Long readAccessNum) {
            this.readAccessNum = readAccessNum;
            return this;
        }
        public Long getReadAccessNum() {
            return this.readAccessNum;
        }

        public DescribeColdDataBasicInfoResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeColdDataBasicInfoResponseBodyData setVolumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public String getVolumeName() {
            return this.volumeName;
        }

        public DescribeColdDataBasicInfoResponseBodyData setWriteAccessNum(Double writeAccessNum) {
            this.writeAccessNum = writeAccessNum;
            return this;
        }
        public Double getWriteAccessNum() {
            return this.writeAccessNum;
        }

    }

}
