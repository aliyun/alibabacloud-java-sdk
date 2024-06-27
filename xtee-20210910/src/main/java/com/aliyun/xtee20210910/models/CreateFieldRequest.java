// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateFieldRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("classify")
    public String classify;

    @NameInMap("description")
    public String description;

    @NameInMap("enumData")
    public String enumData;

    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    @NameInMap("source")
    public String source;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public String type;

    public static CreateFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFieldRequest self = new CreateFieldRequest();
        return TeaModel.build(map, self);
    }

    public CreateFieldRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateFieldRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public CreateFieldRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFieldRequest setEnumData(String enumData) {
        this.enumData = enumData;
        return this;
    }
    public String getEnumData() {
        return this.enumData;
    }

    public CreateFieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFieldRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateFieldRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateFieldRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateFieldRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
