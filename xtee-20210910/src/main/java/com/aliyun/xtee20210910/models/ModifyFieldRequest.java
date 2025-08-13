// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyFieldRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Field classification</p>
     * 
     * <strong>example:</strong>
     * <p>REQUEST_PARAM</p>
     */
    @NameInMap("classify")
    public String classify;

    /**
     * <p>Description information.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Enum type</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;ENABLE\&quot;,\&quot;value\&quot;:\&quot;禁用\&quot;}]</p>
     */
    @NameInMap("enumData")
    public String enumData;

    /**
     * <p>Variable ID</p>
     * 
     * <strong>example:</strong>
     * <p>376773</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Variable name</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Title.</p>
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
