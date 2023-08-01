// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class HyperParameterRange extends TeaModel {
    @NameInMap("Enum")
    public java.util.List<String> _enum;

    @NameInMap("ExclusiveMaximum")
    public Boolean exclusiveMaximum;

    @NameInMap("ExclusiveMinimum")
    public Boolean exclusiveMinimum;

    @NameInMap("MaxLength")
    public Long maxLength;

    @NameInMap("Maximum")
    public String maximum;

    @NameInMap("MinLength")
    public Long minLength;

    @NameInMap("Minimum")
    public String minimum;

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
