// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerCriteriaRequest extends TeaModel {
    @NameInMap("GroupField")
    public String groupField;

    @NameInMap("Value")
    public String value;

    public static DescribeContainerCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerCriteriaRequest self = new DescribeContainerCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerCriteriaRequest setGroupField(String groupField) {
        this.groupField = groupField;
        return this;
    }
    public String getGroupField() {
        return this.groupField;
    }

    public DescribeContainerCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
