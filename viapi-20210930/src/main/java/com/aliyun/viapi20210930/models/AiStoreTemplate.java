// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class AiStoreTemplate extends TeaModel {
    @NameInMap("TemplateContext")
    public String templateContext;

    @NameInMap("TemplateVariable")
    public String templateVariable;

    public static AiStoreTemplate build(java.util.Map<String, ?> map) throws Exception {
        AiStoreTemplate self = new AiStoreTemplate();
        return TeaModel.build(map, self);
    }

    public AiStoreTemplate setTemplateContext(String templateContext) {
        this.templateContext = templateContext;
        return this;
    }
    public String getTemplateContext() {
        return this.templateContext;
    }

    public AiStoreTemplate setTemplateVariable(String templateVariable) {
        this.templateVariable = templateVariable;
        return this;
    }
    public String getTemplateVariable() {
        return this.templateVariable;
    }

}
