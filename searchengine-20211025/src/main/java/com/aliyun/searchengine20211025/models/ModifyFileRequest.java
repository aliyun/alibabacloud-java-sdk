// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyFileRequest extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("partition")
    public Integer partition;

    @NameInMap("fileName")
    public String fileName;

    public static ModifyFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileRequest self = new ModifyFileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ModifyFileRequest setPartition(Integer partition) {
        this.partition = partition;
        return this;
    }
    public Integer getPartition() {
        return this.partition;
    }

    public ModifyFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
