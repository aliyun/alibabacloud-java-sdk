// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Nas extends TeaModel {
    // Nas盘描述
    @NameInMap("Description")
    public String description;

    // Nas文件系统Id
    @NameInMap("FileSystemId")
    public String fileSystemId;

    // Nas盘状态
    @NameInMap("Status")
    public String status;

    public static Nas build(java.util.Map<String, ?> map) throws Exception {
        Nas self = new Nas();
        return TeaModel.build(map, self);
    }

    public Nas setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Nas setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public Nas setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
