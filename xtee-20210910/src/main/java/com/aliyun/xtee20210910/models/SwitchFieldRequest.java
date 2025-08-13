// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchFieldRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Primary Key ID</p>
     * 
     * <strong>example:</strong>
     * <p>250002</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Parameter Name.</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Region Code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Field Source</p>
     * 
     * <strong>example:</strong>
     * <p>DEFINE</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>Status.</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("status")
    public String status;

    public static SwitchFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchFieldRequest self = new SwitchFieldRequest();
        return TeaModel.build(map, self);
    }

    public SwitchFieldRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SwitchFieldRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SwitchFieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SwitchFieldRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public SwitchFieldRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SwitchFieldRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
