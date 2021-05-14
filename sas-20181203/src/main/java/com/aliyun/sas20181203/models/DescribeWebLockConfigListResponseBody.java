// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockConfigListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigList")
    public java.util.List<DescribeWebLockConfigListResponseBodyConfigList> configList;

    public static DescribeWebLockConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockConfigListResponseBody self = new DescribeWebLockConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockConfigListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebLockConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockConfigListResponseBody setConfigList(java.util.List<DescribeWebLockConfigListResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeWebLockConfigListResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public static class DescribeWebLockConfigListResponseBodyConfigList extends TeaModel {
        @NameInMap("ExclusiveDir")
        public String exclusiveDir;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("InclusiveFileType")
        public String inclusiveFileType;

        @NameInMap("DefenceMode")
        public String defenceMode;

        @NameInMap("ExclusiveFileType")
        public String exclusiveFileType;

        @NameInMap("InclusiveFile")
        public String inclusiveFile;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("ExclusiveFile")
        public String exclusiveFile;

        @NameInMap("Id")
        public String id;

        @NameInMap("LocalBackupDir")
        public String localBackupDir;

        public static DescribeWebLockConfigListResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockConfigListResponseBodyConfigList self = new DescribeWebLockConfigListResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveDir(String exclusiveDir) {
            this.exclusiveDir = exclusiveDir;
            return this;
        }
        public String getExclusiveDir() {
            return this.exclusiveDir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setInclusiveFileType(String inclusiveFileType) {
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }
        public String getInclusiveFileType() {
            return this.inclusiveFileType;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setDefenceMode(String defenceMode) {
            this.defenceMode = defenceMode;
            return this;
        }
        public String getDefenceMode() {
            return this.defenceMode;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveFileType(String exclusiveFileType) {
            this.exclusiveFileType = exclusiveFileType;
            return this;
        }
        public String getExclusiveFileType() {
            return this.exclusiveFileType;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setInclusiveFile(String inclusiveFile) {
            this.inclusiveFile = inclusiveFile;
            return this;
        }
        public String getInclusiveFile() {
            return this.inclusiveFile;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveFile(String exclusiveFile) {
            this.exclusiveFile = exclusiveFile;
            return this;
        }
        public String getExclusiveFile() {
            return this.exclusiveFile;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setLocalBackupDir(String localBackupDir) {
            this.localBackupDir = localBackupDir;
            return this;
        }
        public String getLocalBackupDir() {
            return this.localBackupDir;
        }

    }

}
