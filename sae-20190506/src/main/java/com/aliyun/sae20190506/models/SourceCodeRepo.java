// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SourceCodeRepo extends TeaModel {
    @NameInMap("FullName")
    public String fullName;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static SourceCodeRepo build(java.util.Map<String, ?> map) throws Exception {
        SourceCodeRepo self = new SourceCodeRepo();
        return TeaModel.build(map, self);
    }

    public SourceCodeRepo setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public SourceCodeRepo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SourceCodeRepo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
