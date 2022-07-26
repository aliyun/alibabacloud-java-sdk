// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateFolderRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("parent")
    public Long parent;

    @NameInMap("type")
    public String type;

    public static CreateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderRequest self = new CreateFolderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFolderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFolderRequest setParent(Long parent) {
        this.parent = parent;
        return this;
    }
    public Long getParent() {
        return this.parent;
    }

    public CreateFolderRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
