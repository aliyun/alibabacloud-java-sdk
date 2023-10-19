// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CssInstanceProperty extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("globalKey")
    public String globalKey;

    @NameInMap("name")
    public String name;

    @NameInMap("unit")
    public String unit;

    @NameInMap("value")
    public String value;

    public static CssInstanceProperty build(java.util.Map<String, ?> map) throws Exception {
        CssInstanceProperty self = new CssInstanceProperty();
        return TeaModel.build(map, self);
    }

    public CssInstanceProperty setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CssInstanceProperty setGlobalKey(String globalKey) {
        this.globalKey = globalKey;
        return this;
    }
    public String getGlobalKey() {
        return this.globalKey;
    }

    public CssInstanceProperty setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CssInstanceProperty setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public CssInstanceProperty setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
