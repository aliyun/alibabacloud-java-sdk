// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportNameListRequest extends TeaModel {
    /**
     * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The creation type.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>The list of names to import.</p>
     * 
     * <strong>example:</strong>
     * <p>aa\nbb\ncc</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The document import type. Valid values:</p>
     * <p>INPUT: data entry.
     * CSV: CSV upload.
     * NONE: no upload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("importType")
    public String importType;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("memo")
    public String memo;

    /**
     * <p>The nameListType.</p>
     * 
     * <strong>example:</strong>
     * <p>accountId</p>
     */
    @NameInMap("nameListType")
    public String nameListType;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>变量title</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The variable ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393314</p>
     */
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

    public ImportNameListRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
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
