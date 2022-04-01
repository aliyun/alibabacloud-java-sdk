// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ExtraParamSpec extends TeaModel {
    // defaultValue
    @NameInMap("defaultValue")
    public String defaultValue;

    // key
    @NameInMap("key")
    public String key;

    // readonly
    @NameInMap("readonly")
    public Boolean readonly;

    public static ExtraParamSpec build(java.util.Map<String, ?> map) throws Exception {
        ExtraParamSpec self = new ExtraParamSpec();
        return TeaModel.build(map, self);
    }

    public ExtraParamSpec setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public ExtraParamSpec setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ExtraParamSpec setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

}
