// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyFieldRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The field category.</p>
     * 
     * <strong>example:</strong>
     * <p>REQUEST_PARAM</p>
     */
    @NameInMap("classify")
    public String classify;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The enumeration type.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;ENABLE\&quot;,\&quot;value\&quot;:\&quot;禁用\&quot;}]</p>
     */
    @NameInMap("enumData")
    public String enumData;

    /**
     * <p>The variable ID.</p>
     * 
     * <strong>example:</strong>
     * <p>376773</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The variable name.</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The region code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>年龄</p>
     */
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
