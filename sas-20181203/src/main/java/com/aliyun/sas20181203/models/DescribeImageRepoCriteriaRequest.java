// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoCriteriaRequest extends TeaModel {
    @NameInMap("Value")
    public String value;

    public static DescribeImageRepoCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoCriteriaRequest self = new DescribeImageRepoCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
