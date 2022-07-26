// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyFileRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    @NameInMap("fileName")
    public String fileName;

    public static ModifyFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileRequest self = new ModifyFileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFileRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public ModifyFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
