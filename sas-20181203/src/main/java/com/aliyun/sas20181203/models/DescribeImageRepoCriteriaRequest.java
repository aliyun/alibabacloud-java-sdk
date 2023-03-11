// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoCriteriaRequest extends TeaModel {
    /**
     * <p>The value of the filter condition.</p>
     * <br>
     * <p>> You can perform fuzzy search based on the image ID, image tag, image instance ID, image repository name, image repository namespace, image repository ID, image repository region, image digest, and image repository type.</p>
     */
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
