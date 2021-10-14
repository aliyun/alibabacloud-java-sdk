// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateConfigRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Description")
    public String description;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Value")
    public String value;

    public static CreateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRequest self = new CreateConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
