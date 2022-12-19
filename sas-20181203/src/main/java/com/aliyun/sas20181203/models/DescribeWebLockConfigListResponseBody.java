// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockConfigListResponseBody extends TeaModel {
    // An array that consists of the configurations of web tamper proofing.
    @NameInMap("ConfigList")
    public java.util.List<DescribeWebLockConfigListResponseBodyConfigList> configList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of directories that have web tamper proofing enabled on the specified server.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockConfigListResponseBody self = new DescribeWebLockConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockConfigListResponseBody setConfigList(java.util.List<DescribeWebLockConfigListResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeWebLockConfigListResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeWebLockConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockConfigListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockConfigListResponseBodyConfigList extends TeaModel {
        // The prevention mode. Valid values:
        // 
        // *   **block**: Interception Mode
        // *   **audit**: Alert Mode
        @NameInMap("DefenceMode")
        public String defenceMode;

        // The directory that has web tamper proofing enabled.
        @NameInMap("Dir")
        public String dir;

        // The directory that has web tamper proofing disabled.
        // 
        // >  If the value of **Mode** is **blacklist**, this parameter is returned.
        @NameInMap("ExclusiveDir")
        public String exclusiveDir;

        // The file that has web tamper proofing disabled.
        // 
        // >  If the value of **Mode** is **blacklist**, this parameter is returned.
        @NameInMap("ExclusiveFile")
        public String exclusiveFile;

        // The type of the file that has web tamper proofing disabled.
        // 
        // >  If the value of **Mode** is **blacklist**, this parameter is returned.
        @NameInMap("ExclusiveFileType")
        public String exclusiveFileType;

        // The ID of the directory that has web tamper proofing enabled.
        @NameInMap("Id")
        public String id;

        // The file that has web tamper proofing enabled.
        // 
        // >  If the value of **Mode** is **whitelist**, this parameter is returned.
        @NameInMap("InclusiveFile")
        public String inclusiveFile;

        // The type of the file that has web tamper proofing enabled.
        // 
        // >  If the value of **Mode** is **whitelist**, this parameter is returned.
        @NameInMap("InclusiveFileType")
        public String inclusiveFileType;

        // The local path to the backup files of the protected directory.
        @NameInMap("LocalBackupDir")
        public String localBackupDir;

        // The protection mode of web tamper proofing. Valid values:
        // 
        // *   **whitelist**: In this mode, web tamper proofing is enabled for the specified directories and file types.
        // *   **blacklist**: In this mode, web tamper proofing is enabled for the unspecified sub-directories, file types, and files in the protected directories.
        @NameInMap("Mode")
        public String mode;

        // The UUID of the server that has web tamper proofing enabled.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWebLockConfigListResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockConfigListResponseBodyConfigList self = new DescribeWebLockConfigListResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockConfigListResponseBodyConfigList setDefenceMode(String defenceMode) {
            this.defenceMode = defenceMode;
            return this;
        }
        public String getDefenceMode() {
            return this.defenceMode;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveDir(String exclusiveDir) {
            this.exclusiveDir = exclusiveDir;
            return this;
        }
        public String getExclusiveDir() {
            return this.exclusiveDir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveFile(String exclusiveFile) {
            this.exclusiveFile = exclusiveFile;
            return this;
        }
        public String getExclusiveFile() {
            return this.exclusiveFile;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveFileType(String exclusiveFileType) {
            this.exclusiveFileType = exclusiveFileType;
            return this;
        }
        public String getExclusiveFileType() {
            return this.exclusiveFileType;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setInclusiveFile(String inclusiveFile) {
            this.inclusiveFile = inclusiveFile;
            return this;
        }
        public String getInclusiveFile() {
            return this.inclusiveFile;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setInclusiveFileType(String inclusiveFileType) {
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }
        public String getInclusiveFileType() {
            return this.inclusiveFileType;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setLocalBackupDir(String localBackupDir) {
            this.localBackupDir = localBackupDir;
            return this;
        }
        public String getLocalBackupDir() {
            return this.localBackupDir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
