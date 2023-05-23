// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateSignatureRequest extends TeaModel {
    /**
     * <p>申请说明。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>签名名称。</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureRequest self = new CreateSignatureRequest();
        return TeaModel.build(map, self);
    }

    public CreateSignatureRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSignatureRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
