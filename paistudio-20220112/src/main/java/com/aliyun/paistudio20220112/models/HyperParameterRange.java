// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class HyperParameterRange extends TeaModel {
    @NameInMap("Enum")
    public java.util.List<String> _enum;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExclusiveMaximum")
    public Boolean exclusiveMaximum;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExclusiveMinimum")
    public Boolean exclusiveMinimum;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxLength")
    public Long maxLength;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Maximum")
    public String maximum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinLength")
    public Long minLength;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Minimum")
    public String minimum;

    /**
     * <strong>example:</strong>
     * <p>^\+?[1-9][0-9]*$</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    public static HyperParameterRange build(java.util.Map<String, ?> map) throws Exception {
        HyperParameterRange self = new HyperParameterRange();
        return TeaModel.build(map, self);
    }

    public HyperParameterRange set_enum(java.util.List<String> _enum) {
        this._enum = _enum;
        return this;
    }
    public java.util.List<String> get_enum() {
        return this._enum;
    }

    public HyperParameterRange setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
        return this;
    }
    public Boolean getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    public HyperParameterRange setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
        return this;
    }
    public Boolean getExclusiveMinimum() {
        return this.exclusiveMinimum;
    }

    public HyperParameterRange setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Long getMaxLength() {
        return this.maxLength;
    }

    public HyperParameterRange setMaximum(String maximum) {
        this.maximum = maximum;
        return this;
    }
    public String getMaximum() {
        return this.maximum;
    }

    public HyperParameterRange setMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }
    public Long getMinLength() {
        return this.minLength;
    }

    public HyperParameterRange setMinimum(String minimum) {
        this.minimum = minimum;
        return this;
    }
    public String getMinimum() {
        return this.minimum;
    }

    public HyperParameterRange setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

}
