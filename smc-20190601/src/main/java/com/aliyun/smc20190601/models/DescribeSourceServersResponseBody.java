// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeSourceServersResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>410E6073-66D0-45D3-AB3E-4DC3F5E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the migration source.</p>
     */
    @NameInMap("SourceServers")
    public DescribeSourceServersResponseBodySourceServers sourceServers;

    /**
     * <p>The total number of migration sources returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSourceServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceServersResponseBody self = new DescribeSourceServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSourceServersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSourceServersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSourceServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSourceServersResponseBody setSourceServers(DescribeSourceServersResponseBodySourceServers sourceServers) {
        this.sourceServers = sourceServers;
        return this;
    }
    public DescribeSourceServersResponseBodySourceServers getSourceServers() {
        return this.sourceServers;
    }

    public DescribeSourceServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart extends TeaModel {
        /**
         * <p>Indicates whether block replication is enabled for the data disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanBlock")
        public Boolean canBlock;

        /**
         * <p>The device ID of the data disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>1_0</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>Indicates whether the data disk partition must be selected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Need")
        public Boolean need;

        /**
         * <p>The path of the data disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/data</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The size of the data disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setCanBlock(Boolean canBlock) {
            this.canBlock = canBlock;
            return this;
        }
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setNeed(Boolean need) {
            this.need = need;
            return this;
        }
        public Boolean getNeed() {
            return this.need;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart> part;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts setPart(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk extends TeaModel {
        /**
         * <p>The index number of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The information about the data disk partition.</p>
         */
        @NameInMap("Parts")
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts parts;

        /**
         * <p>The path of data disk N.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/data</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The size of data disk N. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setParts(DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDiskParts getParts() {
            return this.parts;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk> dataDisk;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDataDisks self = new DescribeSourceServersResponseBodySourceServersSourceServerDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisks setDataDisk(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart extends TeaModel {
        /**
         * <p>Whether block replication is enabled for the data disk partition. Valid values:</p>
         * <ul>
         * <li>true: Block replication is enabled for the data disk partition.</li>
         * <li>false: Block replication is disabled for the data disk partition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanBlock")
        public Boolean canBlock;

        /**
         * <p>The path of the data disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/data</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The size of the data disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        /**
         * <p>The type of the data disk partition. Valid values:</p>
         * <ul>
         * <li>Normal: normal partition.</li>
         * <li>System: system partition.</li>
         * <li>Boot: boot partition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart self = new DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart setCanBlock(Boolean canBlock) {
            this.canBlock = canBlock;
            return this;
        }
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart> part;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts self = new DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts setPart(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData extends TeaModel {
        /**
         * <p>The start offset of the first partition of the data disk. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <p>The information about the data disk partition.</p>
         */
        @NameInMap("Parts")
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts parts;

        /**
         * <p>The data disk size of the migration source. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData self = new DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData setParts(DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataDataParts getParts() {
            return this.parts;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisksData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData> data;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisksData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisksData self = new DescribeSourceServersResponseBodySourceServersSourceServerDisksData();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksData setData(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksDataData> getData() {
            return this.data;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart extends TeaModel {
        /**
         * <p>Indicates whether block replication is enabled for the system disk partition. Valid values:</p>
         * <ul>
         * <li>true: Block replication is enabled for the system disk partition.</li>
         * <li>false: Block replication is disabled for the system disk partition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanBlock")
        public Boolean canBlock;

        /**
         * <p>The path of the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/data</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The size of the system disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        /**
         * <p>The type of the system disk partition. Valid values:</p>
         * <ul>
         * <li>Normal: normal partition.</li>
         * <li>System: system partition.</li>
         * <li>Boot: boot partition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart self = new DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart setCanBlock(Boolean canBlock) {
            this.canBlock = canBlock;
            return this;
        }
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts extends TeaModel {
        @NameInMap("Part")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart> part;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts self = new DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts setPart(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart> part) {
            this.part = part;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemPartsPart> getPart() {
            return this.part;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem extends TeaModel {
        /**
         * <p>The start offset of the first partition of the system disk. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <p>The information about the system disk partition.</p>
         */
        @NameInMap("Parts")
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts parts;

        /**
         * <p>The size of the source system disk. Unit: GiB. Valid values: 20 to 32768.</p>
         * <blockquote>
         * <p> The parameter value must be greater than the actual used space of the data disk on the source server. For example, if the size of the source disk is 500 GiB but the actual used space is 100 GiB, you must set this parameter to a value greater than 100 GiB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem self = new DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem setParts(DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts parts) {
            this.parts = parts;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystemParts getParts() {
            return this.parts;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerDisks extends TeaModel {
        /**
         * <p>The list of data disk information.</p>
         */
        @NameInMap("Data")
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksData data;

        /**
         * <p>The information about the system disk.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("System")
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem system;

        public static DescribeSourceServersResponseBodySourceServersSourceServerDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerDisks self = new DescribeSourceServersResponseBodySourceServersSourceServerDisks();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisks setData(DescribeSourceServersResponseBodySourceServersSourceServerDisksData data) {
            this.data = data;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksData getData() {
            return this.data;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerDisks setSystem(DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem system) {
            this.system = system;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDisksSystem getSystem() {
            return this.system;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart extends TeaModel {
        /**
         * <p>Indicates whether block replication is enabled for the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanBlock")
        public Boolean canBlock;

        /**
         * <p>The device ID of the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>0_0</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>Indicates whether the system disk partition must be selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Need")
        public Boolean need;

        /**
         * <p>The path of the system disk partition.</p>
         * 
         * <strong>example:</strong>
         * <p>/boot</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The size of the system disk partition. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>254803968</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        public static DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart self = new DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setCanBlock(Boolean canBlock) {
            this.canBlock = canBlock;
            return this;
        }
        public Boolean getCanBlock() {
            return this.canBlock;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setNeed(Boolean need) {
            this.need = need;
            return this;
        }
        public Boolean getNeed() {
            return this.need;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts extends TeaModel {
        @NameInMap("SystemDiskPart")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart> systemDiskPart;

        public static DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts self = new DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts setSystemDiskPart(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart> systemDiskPart) {
            this.systemDiskPart = systemDiskPart;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskPartsSystemDiskPart> getSystemDiskPart() {
            return this.systemDiskPart;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerTagsTag extends TeaModel {
        /**
         * <p>The key of tag N that is attached to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>You cannot specify an empty string as a tag key. The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is attached to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>The tag key can be an empty string. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSourceServersResponseBodySourceServersSourceServerTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerTagsTag self = new DescribeSourceServersResponseBodySourceServersSourceServerTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServerTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerTagsTag> tag;

        public static DescribeSourceServersResponseBodySourceServersSourceServerTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServerTags self = new DescribeSourceServersResponseBodySourceServersSourceServerTags();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServerTags setTag(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServerTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServersSourceServer extends TeaModel {
        /**
         * <p>The version number of the SMC client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5.2.3</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The system architecture of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The time when the migration source was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-27T02:58:09Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The data disks on the migration source.</p>
         */
        @NameInMap("DataDisks")
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisks dataDisks;

        /**
         * <p>The description of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>Server Source Imported By GotoAliyun.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The information about the disk.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Disks")
        public DescribeSourceServersResponseBodySourceServersSourceServerDisks disks;

        /**
         * <p>The error code of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceServer.Offline</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The interval at which heartbeats are sent from the SMC client. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("HeartbeatRate")
        public Integer heartbeatRate;

        /**
         * <p>The ID of the last migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>j-bp19vlwm0tyigbmj****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The kernel level of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KernelLevel")
        public Integer kernelLevel;

        /**
         * <p>The name of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceServerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operating system of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenSUSE</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The replication driver used for migration. Default value: SMT.</p>
         * 
         * <strong>example:</strong>
         * <p>SMT</p>
         */
        @NameInMap("ReplicationDriver")
        public String replicationDriver;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw3ty5y7****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1e2fsl57knvuug****</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The state of the migration source.</p>
         * 
         * <strong>example:</strong>
         * <p>InUse</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status information of the migration source. This parameter is returned if the migration source is in the Unavailable state. The value of this parameter consists of key-value pairs in the JSON format. Sample keys:</p>
         * <pre><code>error_code: The error code.
         * error_msg: the error message.
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;error_code&quot;: &quot;S1&quot;, &quot;error_msg&quot;: &quot;Rsync not found. Please install rsync.&quot;}</p>
         */
        @NameInMap("StatusInfo")
        public String statusInfo;

        /**
         * <p>The information about the system disk partition.</p>
         */
        @NameInMap("SystemDiskParts")
        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts systemDiskParts;

        /**
         * <p>The system disk size of the migration source. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The system information of the migration source. The parameter must be specified as key-value pairs in the JSON format. The key-value pairs are extensible and have fixed keys. Maximum value: 1 KB. Example:</p>
         * <pre><code>agent_mode: the running mode.
         * agent_type: the type of the run.
         * client_type: the type of the client.
         * hostname : the hostname.
         * ipv4:IPv4 address
         * ipv6: IPv6 address
         * cores: the number of CPU cores.
         * cpu_usage: the CPU utilization.
         * memory: the memory size.
         * memory_usage: the memory usage.
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;agent_mode\&quot;:\&quot;daemon\&quot;,\&quot;agent_type\&quot;:\&quot;aliyun\&quot;,\&quot;client_type\&quot;:\&quot;\&quot;,\&quot;cores\&quot;:\&quot;2\&quot;,\&quot;cpu_usage\&quot;:\&quot;0.00\&quot;,\&quot;hostname\&quot;:\&quot;ixxxxxxxxxx\&quot;,\&quot;ipv4\&quot;:\&quot;10.0.0.1\&quot;,\&quot;memory\&quot;:\&quot;8.00\&quot;,\&quot;memory_usage\&quot;:\&quot;3.61\&quot;}</p>
         */
        @NameInMap("SystemInfo")
        public String systemInfo;

        /**
         * <p>The tag details.</p>
         */
        @NameInMap("Tags")
        public DescribeSourceServersResponseBodySourceServersSourceServerTags tags;

        /**
         * <p>The workgroup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-bp1ja22kdqphehlj****</p>
         */
        @NameInMap("WorkgroupId")
        public String workgroupId;

        public static DescribeSourceServersResponseBodySourceServersSourceServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServersSourceServer self = new DescribeSourceServersResponseBodySourceServersSourceServer();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setDataDisks(DescribeSourceServersResponseBodySourceServersSourceServerDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setDisks(DescribeSourceServersResponseBodySourceServersSourceServerDisks disks) {
            this.disks = disks;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerDisks getDisks() {
            return this.disks;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setHeartbeatRate(Integer heartbeatRate) {
            this.heartbeatRate = heartbeatRate;
            return this;
        }
        public Integer getHeartbeatRate() {
            return this.heartbeatRate;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setKernelLevel(Integer kernelLevel) {
            this.kernelLevel = kernelLevel;
            return this;
        }
        public Integer getKernelLevel() {
            return this.kernelLevel;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setReplicationDriver(String replicationDriver) {
            this.replicationDriver = replicationDriver;
            return this;
        }
        public String getReplicationDriver() {
            return this.replicationDriver;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setStatusInfo(String statusInfo) {
            this.statusInfo = statusInfo;
            return this;
        }
        public String getStatusInfo() {
            return this.statusInfo;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSystemDiskParts(DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts systemDiskParts) {
            this.systemDiskParts = systemDiskParts;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerSystemDiskParts getSystemDiskParts() {
            return this.systemDiskParts;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setSystemInfo(String systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }
        public String getSystemInfo() {
            return this.systemInfo;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setTags(DescribeSourceServersResponseBodySourceServersSourceServerTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSourceServersResponseBodySourceServersSourceServerTags getTags() {
            return this.tags;
        }

        public DescribeSourceServersResponseBodySourceServersSourceServer setWorkgroupId(String workgroupId) {
            this.workgroupId = workgroupId;
            return this;
        }
        public String getWorkgroupId() {
            return this.workgroupId;
        }

    }

    public static class DescribeSourceServersResponseBodySourceServers extends TeaModel {
        @NameInMap("SourceServer")
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServer> sourceServer;

        public static DescribeSourceServersResponseBodySourceServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersResponseBodySourceServers self = new DescribeSourceServersResponseBodySourceServers();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersResponseBodySourceServers setSourceServer(java.util.List<DescribeSourceServersResponseBodySourceServersSourceServer> sourceServer) {
            this.sourceServer = sourceServer;
            return this;
        }
        public java.util.List<DescribeSourceServersResponseBodySourceServersSourceServer> getSourceServer() {
            return this.sourceServer;
        }

    }

}
