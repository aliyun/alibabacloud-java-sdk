// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class TemplateConfiguration extends TeaModel {
    @NameInMap("aonotations")
    public java.util.Map<String, ?> aonotations;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("id")
    public String id;

    @NameInMap("lang")
    public String lang;

    @NameInMap("tokens")
    public java.util.Map<String, ?> tokens;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static TemplateConfiguration build(java.util.Map<String, ?> map) throws Exception {
        TemplateConfiguration self = new TemplateConfiguration();
        return TeaModel.build(map, self);
    }

    public TemplateConfiguration setAonotations(java.util.Map<String, ?> aonotations) {
        this.aonotations = aonotations;
        return this;
    }
    public java.util.Map<String, ?> getAonotations() {
        return this.aonotations;
    }

    public TemplateConfiguration setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TemplateConfiguration setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TemplateConfiguration setTokens(java.util.Map<String, ?> tokens) {
        this.tokens = tokens;
        return this;
    }
    public java.util.Map<String, ?> getTokens() {
        return this.tokens;
    }

    public TemplateConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TemplateConfiguration setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
