// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class LineageColumn extends TeaModel {
    /**
     * <p>The name of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("columnName")
    public String columnName;

    /**
     * <p>The original type of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("columnNativeType")
    public String columnNativeType;

    /**
     * <p>The column type.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("columnType")
    public String columnType;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1723537978</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The user that creates the column.</p>
     * 
     * <strong>example:</strong>
     * <p>userA</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The description.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The field ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123ss3</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1723537978</p>
     */
    @NameInMap("modifiedAt")
    public Long modifiedAt;

    /**
     * <p>The ID of the account that is used to modify the column.</p>
     * 
     * <strong>example:</strong>
     * <p>userA</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <p>Indicates whether the value is nullable.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("nullable")
    public Boolean nullable;

    public static LineageColumn build(java.util.Map<String, ?> map) throws Exception {
        LineageColumn self = new LineageColumn();
        return TeaModel.build(map, self);
    }

    public LineageColumn setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public LineageColumn setColumnNativeType(String columnNativeType) {
        this.columnNativeType = columnNativeType;
        return this;
    }
    public String getColumnNativeType() {
        return this.columnNativeType;
    }

    public LineageColumn setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }
    public String getColumnType() {
        return this.columnType;
    }

    public LineageColumn setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public LineageColumn setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public LineageColumn setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LineageColumn setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LineageColumn setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    public LineageColumn setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public LineageColumn setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

}
