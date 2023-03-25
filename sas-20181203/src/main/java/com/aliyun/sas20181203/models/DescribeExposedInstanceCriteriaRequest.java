// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceCriteriaRequest extends TeaModel {
    /**
     * <p>The value of the search condition. Fuzzy match is supported.</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeExposedInstanceCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceCriteriaRequest self = new DescribeExposedInstanceCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
