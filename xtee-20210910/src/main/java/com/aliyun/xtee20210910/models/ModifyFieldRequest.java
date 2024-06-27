// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyFieldRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("classify")
    public String classify;

    @NameInMap("description")
    public String description;

    @NameInMap("enumData")
    public String enumData;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    @NameInMap("title")
    public String title;

    public static ModifyFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFieldRequest self = new ModifyFieldRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFieldRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyFieldRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public ModifyFieldRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFieldRequest setEnumData(String enumData) {
        this.enumData = enumData;
        return this;
    }
    public String getEnumData() {
        return this.enumData;
    }

    public ModifyFieldRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyFieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFieldRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyFieldRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
