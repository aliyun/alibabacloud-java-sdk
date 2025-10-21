// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Function extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("className")
    public String className;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("functionLanguage")
    public String functionLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("functionType")
    public String functionType;

    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static Function build(java.util.Map<String, ?> map) throws Exception {
        Function self = new Function();
        return TeaModel.build(map, self);
    }

    public Function setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public Function setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Function setFunctionLanguage(String functionLanguage) {
        this.functionLanguage = functionLanguage;
        return this;
    }
    public String getFunctionLanguage() {
        return this.functionLanguage;
    }

    public Function setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public Function setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public Function setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
