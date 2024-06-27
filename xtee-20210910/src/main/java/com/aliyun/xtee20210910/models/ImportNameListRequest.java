// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportNameListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("data")
    public String data;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("importType")
    public String importType;

    @NameInMap("nameListType")
    public String nameListType;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("variableId")
    public Long variableId;

    public static ImportNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportNameListRequest self = new ImportNameListRequest();
        return TeaModel.build(map, self);
    }

    public ImportNameListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ImportNameListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public ImportNameListRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportNameListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportNameListRequest setImportType(String importType) {
        this.importType = importType;
        return this;
    }
    public String getImportType() {
        return this.importType;
    }

    public ImportNameListRequest setNameListType(String nameListType) {
        this.nameListType = nameListType;
        return this;
    }
    public String getNameListType() {
        return this.nameListType;
    }

    public ImportNameListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ImportNameListRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ImportNameListRequest setVariableId(Long variableId) {
        this.variableId = variableId;
        return this;
    }
    public Long getVariableId() {
        return this.variableId;
    }

}
