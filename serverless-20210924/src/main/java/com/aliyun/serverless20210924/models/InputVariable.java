// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class InputVariable extends TeaModel {
    @NameInMap("defaultJson")
    public String defaultJson;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("nullable")
    public Boolean nullable;

    @NameInMap("sensitive")
    public Boolean sensitive;

    @NameInMap("type")
    public String type;

    public static InputVariable build(java.util.Map<String, ?> map) throws Exception {
        InputVariable self = new InputVariable();
        return TeaModel.build(map, self);
    }

    public InputVariable setDefaultJson(String defaultJson) {
        this.defaultJson = defaultJson;
        return this;
    }
    public String getDefaultJson() {
        return this.defaultJson;
    }

    public InputVariable setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InputVariable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InputVariable setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public InputVariable setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

    public InputVariable setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
