// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileLogDetail extends TeaModel {
    @NameInMap("decompress_file_list")
    public java.util.List<String> decompressFileList;

    @NameInMap("new_name")
    public String newName;

    @NameInMap("parent_path")
    public String parentPath;

    @NameInMap("rev_version")
    public Long revVersion;

    @NameInMap("revision_id")
    public String revisionId;

    @NameInMap("size")
    public Long size;

    @NameInMap("to_parent_path")
    public String toParentPath;

    @NameInMap("to_parent_path_type")
    public String toParentPathType;

    @NameInMap("type")
    public String type;

    public static FileLogDetail build(java.util.Map<String, ?> map) throws Exception {
        FileLogDetail self = new FileLogDetail();
        return TeaModel.build(map, self);
    }

    public FileLogDetail setDecompressFileList(java.util.List<String> decompressFileList) {
        this.decompressFileList = decompressFileList;
        return this;
    }
    public java.util.List<String> getDecompressFileList() {
        return this.decompressFileList;
    }

    public FileLogDetail setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public FileLogDetail setParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }
    public String getParentPath() {
        return this.parentPath;
    }

    public FileLogDetail setRevVersion(Long revVersion) {
        this.revVersion = revVersion;
        return this;
    }
    public Long getRevVersion() {
        return this.revVersion;
    }

    public FileLogDetail setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public FileLogDetail setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public FileLogDetail setToParentPath(String toParentPath) {
        this.toParentPath = toParentPath;
        return this;
    }
    public String getToParentPath() {
        return this.toParentPath;
    }

    public FileLogDetail setToParentPathType(String toParentPathType) {
        this.toParentPathType = toParentPathType;
        return this;
    }
    public String getToParentPathType() {
        return this.toParentPathType;
    }

    public FileLogDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
