// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseFileListInheritPermissionResponse extends TeaModel {
    @NameInMap("file_id")
    public String fileId;

    @NameInMap("member")
    public FilePermissionMember member;

    public static BaseFileListInheritPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseFileListInheritPermissionResponse self = new BaseFileListInheritPermissionResponse();
        return TeaModel.build(map, self);
    }

    public BaseFileListInheritPermissionResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public BaseFileListInheritPermissionResponse setMember(FilePermissionMember member) {
        this.member = member;
        return this;
    }
    public FilePermissionMember getMember() {
        return this.member;
    }

}
