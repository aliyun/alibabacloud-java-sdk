// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CssInstanceComponent extends TeaModel {
    @NameInMap("componentCode")
    public String componentCode;

    @NameInMap("componentName")
    public String componentName;

    @NameInMap("globalKey")
    public String globalKey;

    @NameInMap("instanceProperty")
    public java.util.List<CssInstanceProperty> instanceProperty;

    @NameInMap("moduleAttrStatus")
    public Long moduleAttrStatus;

    @NameInMap("tag")
    public String tag;

    public static CssInstanceComponent build(java.util.Map<String, ?> map) throws Exception {
        CssInstanceComponent self = new CssInstanceComponent();
        return TeaModel.build(map, self);
    }

    public CssInstanceComponent setComponentCode(String componentCode) {
        this.componentCode = componentCode;
        return this;
    }
    public String getComponentCode() {
        return this.componentCode;
    }

    public CssInstanceComponent setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public CssInstanceComponent setGlobalKey(String globalKey) {
        this.globalKey = globalKey;
        return this;
    }
    public String getGlobalKey() {
        return this.globalKey;
    }

    public CssInstanceComponent setInstanceProperty(java.util.List<CssInstanceProperty> instanceProperty) {
        this.instanceProperty = instanceProperty;
        return this;
    }
    public java.util.List<CssInstanceProperty> getInstanceProperty() {
        return this.instanceProperty;
    }

    public CssInstanceComponent setModuleAttrStatus(Long moduleAttrStatus) {
        this.moduleAttrStatus = moduleAttrStatus;
        return this;
    }
    public Long getModuleAttrStatus() {
        return this.moduleAttrStatus;
    }

    public CssInstanceComponent setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
