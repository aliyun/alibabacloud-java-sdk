// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAdvanceConfigFileRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    @NameInMap("fileName")
    public String fileName;

    public static ModifyAdvanceConfigFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvanceConfigFileRequest self = new ModifyAdvanceConfigFileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAdvanceConfigFileRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public ModifyAdvanceConfigFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
