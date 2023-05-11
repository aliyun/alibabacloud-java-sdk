// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColdDataBasicInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeColdDataBasicInfoResponseBodyData data;

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
        @NameInMap("BackupSetCount")
        public Integer backupSetCount;

        @NameInMap("BackupSetSpaceSize")
        public Double backupSetSpaceSize;

        @NameInMap("CloudProduct")
        public String cloudProduct;

        @NameInMap("CurrentSpaceSize")
        public Double currentSpaceSize;

        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

        @NameInMap("EnableStatus")
        public Boolean enableStatus;

        @NameInMap("ReadAccessNum")
        public Long readAccessNum;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VolumeName")
        public String volumeName;

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
