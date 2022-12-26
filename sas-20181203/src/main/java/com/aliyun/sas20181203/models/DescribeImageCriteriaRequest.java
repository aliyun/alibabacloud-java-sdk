// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageCriteriaRequest extends TeaModel {
    @NameInMap("Value")
    public String value;

    public static DescribeImageCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCriteriaRequest self = new DescribeImageCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
