// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class OutputValue extends TeaModel {
    // The description should concisely explain the purpose of the output and what kind of value is expected.
    @NameInMap("description")
    public String description;

    // The identifier of an output value. Identifiers can contain letters, digits, underscores (_), and hyphens (-). The first character of an identifier must not be a digit, to avoid ambiguity with literal numbers.
    @NameInMap("name")
    public String name;

    // Specify if the output value contains sensitive material. False by default.
    @NameInMap("sensitive")
    public Boolean sensitive;

    public static OutputValue build(java.util.Map<String, ?> map) throws Exception {
        OutputValue self = new OutputValue();
        return TeaModel.build(map, self);
    }

    public OutputValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OutputValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OutputValue setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

}
