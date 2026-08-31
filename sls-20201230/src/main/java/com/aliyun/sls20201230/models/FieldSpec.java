// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class FieldSpec extends TeaModel {
    /**
     * <p>Specifies whether the field can be analyzed, that is, whether it can be used as a dimension column in a GROUP BY clause.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("analysable")
    public Boolean analysable;

    /**
     * <p>The formatting method for numeric or display values, such as KMB (thousand/million/billion), percent, ms, or dthms (hours:minutes:seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>KMB</p>
     */
    @NameInMap("data_format")
    public String dataFormat;

    /**
     * <p>The business description of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>The unique ID of the transaction order</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name used in the console. The value can contain Chinese characters.</p>
     * 
     * <strong>example:</strong>
     * <p>OrderNumber</p>
     */
    @NameInMap("display_name")
    public String displayName;

    /**
     * <p>Specifies whether the field can be filtered, that is, whether index-based filter queries are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("filterable")
    public Boolean filterable;

    /**
     * <p>The launch stage of the field. Valid values: preview, beta, ga, and deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>ga</p>
     */
    @NameInMap("launch_stage")
    public String launchStage;

    /**
     * <p>The field name. The value must consist of lowercase letters, digits, hyphens (-), underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>order_id</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether the field can be sorted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("orderable")
    public Boolean orderable;

    /**
     * <p>The short description (one sentence) used in compact display scenarios such as lists.</p>
     * 
     * <strong>example:</strong>
     * <p>Order ID</p>
     */
    @NameInMap("short_description")
    public String shortDescription;

    /**
     * <p>The field type. Valid values: string, integer, float, boolean, time, json_object, and json_array.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The unit of the field. The unit is used only for display purposes and is not automatically converted. For example, ms is not automatically converted to s.</p>
     * 
     * <strong>example:</strong>
     * <p>ms</p>
     */
    @NameInMap("unit")
    public String unit;

    /**
     * <p>The value mapping for enumerated values. The key is the raw value and the value is the mapped semantic name. This is used to display the business meaning of enumerated values. For example, the value 1 of the status field is mapped to running.</p>
     */
    @NameInMap("value_mapping")
    public java.util.Map<String, String> valueMapping;

    public static FieldSpec build(java.util.Map<String, ?> map) throws Exception {
        FieldSpec self = new FieldSpec();
        return TeaModel.build(map, self);
    }

    public FieldSpec setAnalysable(Boolean analysable) {
        this.analysable = analysable;
        return this;
    }
    public Boolean getAnalysable() {
        return this.analysable;
    }

    public FieldSpec setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public FieldSpec setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FieldSpec setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public FieldSpec setFilterable(Boolean filterable) {
        this.filterable = filterable;
        return this;
    }
    public Boolean getFilterable() {
        return this.filterable;
    }

    public FieldSpec setLaunchStage(String launchStage) {
        this.launchStage = launchStage;
        return this;
    }
    public String getLaunchStage() {
        return this.launchStage;
    }

    public FieldSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FieldSpec setOrderable(Boolean orderable) {
        this.orderable = orderable;
        return this;
    }
    public Boolean getOrderable() {
        return this.orderable;
    }

    public FieldSpec setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }
    public String getShortDescription() {
        return this.shortDescription;
    }

    public FieldSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FieldSpec setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public FieldSpec setValueMapping(java.util.Map<String, String> valueMapping) {
        this.valueMapping = valueMapping;
        return this;
    }
    public java.util.Map<String, String> getValueMapping() {
        return this.valueMapping;
    }

}
