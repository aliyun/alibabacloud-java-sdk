// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchFieldRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    @NameInMap("source")
    public String source;

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
