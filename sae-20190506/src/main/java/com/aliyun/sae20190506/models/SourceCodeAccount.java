// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SourceCodeAccount extends TeaModel {
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static SourceCodeAccount build(java.util.Map<String, ?> map) throws Exception {
        SourceCodeAccount self = new SourceCodeAccount();
        return TeaModel.build(map, self);
    }

    public SourceCodeAccount setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public SourceCodeAccount setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SourceCodeAccount setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
