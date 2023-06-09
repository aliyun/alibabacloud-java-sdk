// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SaveSortScriptFileRequest extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("version")
    public Integer version;

    public static SaveSortScriptFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSortScriptFileRequest self = new SaveSortScriptFileRequest();
        return TeaModel.build(map, self);
    }

    public SaveSortScriptFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveSortScriptFileRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
