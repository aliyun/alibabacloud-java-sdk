// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutCommonconfigRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    public static InitLinkeBahamutCommonconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutCommonconfigRequest self = new InitLinkeBahamutCommonconfigRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutCommonconfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InitLinkeBahamutCommonconfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
