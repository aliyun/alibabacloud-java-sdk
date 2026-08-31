// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogSetSpec extends TeaModel {
    /**
     * <p>The default sort direction. Valid values:</p>
     * <ul>
     * <li>asc: ascending order.</li>
     * <li>desc: descending order.</li>
     * </ul>
     * <p>Default value: asc.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("default_order")
    public String defaultOrder;

    /**
     * <p>The list of fields.</p>
     */
    @NameInMap("fields")
    public java.util.List<FieldSpec> fields;

    /**
     * <p>The list of hidden fields. These fields are not displayed in the interface by default.</p>
     */
    @NameInMap("hidden_fields")
    public java.util.List<String> hiddenFields;

    /**
     * <p>The list of Displayed Fields, in sorting order by display priority.</p>
     */
    @NameInMap("name_fields")
    public java.util.List<String> nameFields;

    /**
     * <p>The list of sort fields, used for default sorting.</p>
     */
    @NameInMap("ordered_fields")
    public java.util.List<String> orderedFields;

    /**
     * <p>The list of tag fields. Tag fields are aggregated together for display and analysis by default.</p>
     */
    @NameInMap("tag_fields")
    public java.util.List<String> tagFields;

    /**
     * <p>The name of the time field. The field must be of the timestamp type and supports seconds, milliseconds, microseconds, and nanoseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>time</p>
     */
    @NameInMap("time_field")
    public String timeField;

    public static LogSetSpec build(java.util.Map<String, ?> map) throws Exception {
        LogSetSpec self = new LogSetSpec();
        return TeaModel.build(map, self);
    }

    public LogSetSpec setDefaultOrder(String defaultOrder) {
        this.defaultOrder = defaultOrder;
        return this;
    }
    public String getDefaultOrder() {
        return this.defaultOrder;
    }

    public LogSetSpec setFields(java.util.List<FieldSpec> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<FieldSpec> getFields() {
        return this.fields;
    }

    public LogSetSpec setHiddenFields(java.util.List<String> hiddenFields) {
        this.hiddenFields = hiddenFields;
        return this;
    }
    public java.util.List<String> getHiddenFields() {
        return this.hiddenFields;
    }

    public LogSetSpec setNameFields(java.util.List<String> nameFields) {
        this.nameFields = nameFields;
        return this;
    }
    public java.util.List<String> getNameFields() {
        return this.nameFields;
    }

    public LogSetSpec setOrderedFields(java.util.List<String> orderedFields) {
        this.orderedFields = orderedFields;
        return this;
    }
    public java.util.List<String> getOrderedFields() {
        return this.orderedFields;
    }

    public LogSetSpec setTagFields(java.util.List<String> tagFields) {
        this.tagFields = tagFields;
        return this;
    }
    public java.util.List<String> getTagFields() {
        return this.tagFields;
    }

    public LogSetSpec setTimeField(String timeField) {
        this.timeField = timeField;
        return this;
    }
    public String getTimeField() {
        return this.timeField;
    }

}
