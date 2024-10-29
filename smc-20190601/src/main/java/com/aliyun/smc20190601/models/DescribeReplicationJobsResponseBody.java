// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeReplicationJobsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The details of migration jobs.</p>
     */
    @NameInMap("ReplicationJobs")
    public DescribeReplicationJobsResponseBodyReplicationJobs replicationJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6E1187E8-843A-4850-B97E-2F17F00D48F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of migration jobs returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeReplicationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationJobsResponseBody self = new DescribeReplicationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReplicationJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReplicationJobsResponseBody setReplicationJobs(DescribeReplicationJobsResponseBodyReplicationJobs replicationJobs) {
        this.replicationJobs = replicationJobs;
        return this;
    }
    public DescribeReplicationJobsResponseBodyReplicationJobs getReplicationJobs() {
        return this.replicationJobs;
    }

    public DescribeReplicationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicationJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart extends TeaModel {
        /**
         * <p>Indicates whether block replication is enabled for the data disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The device ID of the data disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>0_1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of the data disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart> part;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts setPart(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk extends TeaModel {
        /**
         * <p>The index number of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The data disk partitions.</p>
         */
        @NameInMap("Parts")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts parts;

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk setParts(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDiskParts getParts() {
            return this.parts;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk> dataDisk;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks setDataDisk(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <strong>example:</strong>
         * <p>/home/data</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart> part;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts setPart(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d-2zeh4twm100qskw7z41z</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LVM")
        public Boolean LVM;

        @NameInMap("Parts")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts parts;

        /**
         * <strong>example:</strong>
         * <p>22548578304</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData setLVM(Boolean LVM) {
            this.LVM = LVM;
            return this;
        }
        public Boolean getLVM() {
            return this.LVM;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData setParts(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataDataParts getParts() {
            return this.parts;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData> data;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData setData(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksDataData> getData() {
            return this.data;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <strong>example:</strong>
         * <p>/boot</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart> part;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts setPart(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d-2zeh4twm100qskw7z41z</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LVM")
        public Boolean LVM;

        @NameInMap("Parts")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts parts;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem setLVM(Boolean LVM) {
            this.LVM = LVM;
            return this;
        }
        public Boolean getLVM() {
            return this.LVM;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem setParts(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystemParts getParts() {
            return this.parts;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks extends TeaModel {
        @NameInMap("Data")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData data;

        @NameInMap("System")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem system;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks setData(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData data) {
            this.data = data;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksData getData() {
            return this.data;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks setSystem(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem system) {
            this.system = system;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisksSystem getSystem() {
            return this.system;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun extends TeaModel {
        /**
         * <p>The time when the migration job ended. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-10-04T13:35:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the destination image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-o6w3gy99qf89rkga****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The time when the migration job was started. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-10-01T13:35:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The method used to run the migration job. Valid values:</p>
         * <ul>
         * <li>Manual: The migration job was manually started.</li>
         * <li>Schedule: The migration job was started at a scheduled time or at a specific interval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Schedule</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns extends TeaModel {
        @NameInMap("ReplicationJobRun")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun> replicationJobRun;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns setReplicationJobRun(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun> replicationJobRun) {
            this.replicationJobRun = replicationJobRun;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRunsReplicationJobRun> getReplicationJobRun() {
            return this.replicationJobRun;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart extends TeaModel {
        /**
         * <p>Indicates whether block replication is enabled for the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Block")
        public Boolean block;

        /**
         * <p>The device ID of the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>0_1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The size of the system disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>254803968</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart setBlock(Boolean block) {
            this.block = block;
            return this;
        }
        public Boolean getBlock() {
            return this.block;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts extends TeaModel {
        @NameInMap("SystemDiskPart")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart> systemDiskPart;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts setSystemDiskPart(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart> systemDiskPart) {
            this.systemDiskPart = systemDiskPart;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskPartsSystemDiskPart> getSystemDiskPart() {
            return this.systemDiskPart;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag extends TeaModel {
        /**
         * <p>The key of the tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>The tag key can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.<a href="http://https://%E3%80%82"></a></p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>The tag value can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.<a href="http://https://%E3%80%82"></a></p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag> tag;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags setTag(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob extends TeaModel {
        /**
         * <p>The business status of the migration job. Valid values:</p>
         * <ul>
         * <li>Preparing: The migration is being prepared.</li>
         * <li>Syncing: Data is being synchronized.</li>
         * <li>Processing: The migration is in progress.</li>
         * <li>Cleaning: Intermediate resources are being released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Preparing</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The namespace of the destination Docker container image.</p>
         * 
         * <strong>example:</strong>
         * <p>testNamespace</p>
         */
        @NameInMap("ContainerNamespace")
        public String containerNamespace;

        /**
         * <p>The repository that stores the destination Docker container image.</p>
         * 
         * <strong>example:</strong>
         * <p>testRepository</p>
         */
        @NameInMap("ContainerRepository")
        public String containerRepository;

        /**
         * <p>The tag of the destination Docker container image.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS:v1</p>
         */
        @NameInMap("ContainerTag")
        public String containerTag;

        /**
         * <p>The time when the migration job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-07-24T13:00:52Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The data disks on the destination ECS instance.</p>
         */
        @NameInMap("DataDisks")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks dataDisks;

        /**
         * <p>The description of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my migration task.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Disks")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks disks;

        /**
         * <p>The time when the migration job was complete. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-06-04T16:00:52Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The error code returned if an error occurred in the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The interval at which the incremental migration job runs. Unit: hour. Valid values: 1 to 168.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Frequency")
        public Integer frequency;

        /**
         * <p>The ID of the destination image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-o6w3gy99qf89rkga****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the destination image.</p>
         * 
         * <strong>example:</strong>
         * <p>testAliCloudImageName</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The ID of the destination ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ff25rzvnul6kr****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Resource Access Management (RAM) role that is assigned to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>SMCAdmin</p>
         */
        @NameInMap("InstanceRamRole")
        public String instanceRamRole;

        /**
         * <p>The instance type of the intermediate instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.sn1ne.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>j-bp19vlwm0tyigbmj****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The type of the migration job. Valid values:</p>
         * <ul>
         * <li>0: server migration.</li>
         * <li>1: operating system migration.</li>
         * <li>2: cross-zone migration.</li>
         * <li>3: agentless migration for a VMware VM.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JobType")
        public Integer jobType;

        /**
         * <p>The ID of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-launchtemplateid</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The versions of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The type of license for the migration job. Valid values:</p>
         * <ul>
         * <li>An empty value indicates no license.</li>
         * <li>A value of BYOL indicates Bring Your Own License (BYOL).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BYOL</p>
         */
        @NameInMap("LicenseType")
        public String licenseType;

        /**
         * <p>The maximum number of images retained for the incremental migration job. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxNumberOfImageToKeep")
        public Integer maxNumberOfImageToKeep;

        /**
         * <p>The name of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>testMigrationTaskName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of network used for the migration.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetMode")
        public Integer netMode;

        /**
         * <p>The progress of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The ID of the Alibaba Cloud region to which the source server is migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The execution records of the migration job.</p>
         */
        @NameInMap("ReplicationJobRuns")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns replicationJobRuns;

        /**
         * <p>The string of key-value pairs configured for the replication driver.</p>
         * 
         * <strong>example:</strong>
         * <p>BandWidthLimit:0</p>
         */
        @NameInMap("ReplicationParameters")
        public String replicationParameters;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw3ty5y7****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether incremental migration is disabled for the source server. Valid values:</p>
         * <ul>
         * <li>true: Incremental migration is disabled. A migration job runs only once after the job is created.</li>
         * <li>false: Incremental migration is enabled. For an incremental migration job, SMC synchronizes incremental data to Alibaba Cloud at the interval specified by the <code>Frequency</code> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RunOnce")
        public Boolean runOnce;

        /**
         * <p>The time when the migration job is scheduled to run. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. The time must meet the following requirements:</p>
         * <ul>
         * <li>The value must be within 30 days after the current time.</li>
         * <li>If you do not specify this parameter, you must manually start the migration job after the migration job is created. You can call the <a href="https://help.aliyun.com/document_detail/121823.html">StartReplicationJob</a> operation to start the migration job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2019-06-04T13:35:00Z</p>
         */
        @NameInMap("ScheduledStartTime")
        public String scheduledStartTime;

        /**
         * <p>The ID of the source server.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1e2fsl57knvuug****</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The time when the migration job was started. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-06-04T14:40:52Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the migration job. Valid values:</p>
         * <ul>
         * <li>Ready: The migration job is not started.</li>
         * <li>Running: The migration job is running.</li>
         * <li>Stopped: The migration job is paused.</li>
         * <li>InError: An error occurs in the migration job.</li>
         * <li>Finished: The migration job is complete.</li>
         * <li>Waiting: The migration job is waiting to run.</li>
         * <li>Expired: The migration job has expired.</li>
         * <li>Deleting: The migration job is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status information about the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>statusinfo</p>
         */
        @NameInMap("StatusInfo")
        public String statusInfo;

        /**
         * <p>The system disk partitions.</p>
         */
        @NameInMap("SystemDiskParts")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts systemDiskParts;

        /**
         * <p>The size of the system disk of the destination ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The information about tags that are attached to the SMC resource.</p>
         */
        @NameInMap("Tags")
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags tags;

        /**
         * <p>The type of destination to which the source server is migrated. Valid values:</p>
         * <ul>
         * <li>Image: After the migration job is complete, SMC generates an ECS image for the source server.</li>
         * <li>ContainerImage: After the migration job is complete, SMC generates a Docker container image for the source server.</li>
         * <li>TargetInstance: After the migration job is complete, SMC migrates the source server to the destination instance. If you set this parameter to TargetInstance, you must set the InstanceId parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The ID of the intermediate instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ff25rzvnul6kr****</p>
         */
        @NameInMap("TransitionInstanceId")
        public String transitionInstanceId;

        /**
         * <p>The ID of the vSwitch in the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1ddbrxdlrcbim46****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The time when the migration job expired. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the SMC console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-06-08T14:40:52Z</p>
         */
        @NameInMap("ValidTime")
        public String validTime;

        /**
         * <p>The ID of a virtual private cloud (VPC) for which you have configured an Express Connect circuit or a VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob self = new DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setContainerNamespace(String containerNamespace) {
            this.containerNamespace = containerNamespace;
            return this;
        }
        public String getContainerNamespace() {
            return this.containerNamespace;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setContainerRepository(String containerRepository) {
            this.containerRepository = containerRepository;
            return this;
        }
        public String getContainerRepository() {
            return this.containerRepository;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setContainerTag(String containerTag) {
            this.containerTag = containerTag;
            return this;
        }
        public String getContainerTag() {
            return this.containerTag;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setDataDisks(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setDisks(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks disks) {
            this.disks = disks;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobDisks getDisks() {
            return this.disks;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setFrequency(Integer frequency) {
            this.frequency = frequency;
            return this;
        }
        public Integer getFrequency() {
            return this.frequency;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setInstanceRamRole(String instanceRamRole) {
            this.instanceRamRole = instanceRamRole;
            return this;
        }
        public String getInstanceRamRole() {
            return this.instanceRamRole;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
            this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
            return this;
        }
        public Integer getMaxNumberOfImageToKeep() {
            return this.maxNumberOfImageToKeep;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setNetMode(Integer netMode) {
            this.netMode = netMode;
            return this;
        }
        public Integer getNetMode() {
            return this.netMode;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setReplicationJobRuns(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns replicationJobRuns) {
            this.replicationJobRuns = replicationJobRuns;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobReplicationJobRuns getReplicationJobRuns() {
            return this.replicationJobRuns;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setReplicationParameters(String replicationParameters) {
            this.replicationParameters = replicationParameters;
            return this;
        }
        public String getReplicationParameters() {
            return this.replicationParameters;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setRunOnce(Boolean runOnce) {
            this.runOnce = runOnce;
            return this;
        }
        public Boolean getRunOnce() {
            return this.runOnce;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setScheduledStartTime(String scheduledStartTime) {
            this.scheduledStartTime = scheduledStartTime;
            return this;
        }
        public String getScheduledStartTime() {
            return this.scheduledStartTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setStatusInfo(String statusInfo) {
            this.statusInfo = statusInfo;
            return this;
        }
        public String getStatusInfo() {
            return this.statusInfo;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setSystemDiskParts(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts systemDiskParts) {
            this.systemDiskParts = systemDiskParts;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobSystemDiskParts getSystemDiskParts() {
            return this.systemDiskParts;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setTags(DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJobTags getTags() {
            return this.tags;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setTransitionInstanceId(String transitionInstanceId) {
            this.transitionInstanceId = transitionInstanceId;
            return this;
        }
        public String getTransitionInstanceId() {
            return this.transitionInstanceId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setValidTime(String validTime) {
            this.validTime = validTime;
            return this;
        }
        public String getValidTime() {
            return this.validTime;
        }

        public DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeReplicationJobsResponseBodyReplicationJobs extends TeaModel {
        @NameInMap("ReplicationJob")
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob> replicationJob;

        public static DescribeReplicationJobsResponseBodyReplicationJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsResponseBodyReplicationJobs self = new DescribeReplicationJobsResponseBodyReplicationJobs();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsResponseBodyReplicationJobs setReplicationJob(java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob> replicationJob) {
            this.replicationJob = replicationJob;
            return this;
        }
        public java.util.List<DescribeReplicationJobsResponseBodyReplicationJobsReplicationJob> getReplicationJob() {
            return this.replicationJob;
        }

    }

}
