// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaRequest extends TeaModel {
    /**
     * <p>The type of the asset. Valid values:</p>
     * <ul>
     * <li>Set the value to <strong>ecs</strong>, which specifies to query all Elastic Compute Service (ECS) instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>Specifies whether the keyword that you specify for fuzzy search can be automatically matched. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportAutoTag")
    public Boolean supportAutoTag;

    /**
     * <p>The keyword that you specify for fuzzy search when you query the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>47.96</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCriteriaRequest self = new DescribeCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCriteriaRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public DescribeCriteriaRequest setSupportAutoTag(Boolean supportAutoTag) {
        this.supportAutoTag = supportAutoTag;
        return this;
    }
    public Boolean getSupportAutoTag() {
        return this.supportAutoTag;
    }

    public DescribeCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
