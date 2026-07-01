// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Variable extends TeaModel {
    /**
     * <p>The description of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The type of the variable. <code>Clear</code> indicates plaintext and <code>Encrypted</code> indicates ciphertext.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Encrypted</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The name of the variable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysqlPassword</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The value of the variable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myPassword</p>
     */
    @NameInMap("value")
    public String value;

    public static Variable build(java.util.Map<String, ?> map) throws Exception {
        Variable self = new Variable();
        return TeaModel.build(map, self);
    }

    public Variable setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Variable setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Variable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Variable setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
