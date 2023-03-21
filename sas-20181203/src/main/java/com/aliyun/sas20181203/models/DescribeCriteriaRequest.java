// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaRequest extends TeaModel {
    @NameInMap("MachineTypes")
    public String machineTypes;

    @NameInMap("SupportAutoTag")
    public Boolean supportAutoTag;

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
