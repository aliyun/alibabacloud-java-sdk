// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageCriteriaRequest extends TeaModel {
    /**
     * <p>The fuzzy match value that you enter when querying images.</p>
     * <blockquote>
     * <p>This parameter supports fuzzy matching by image ID, image tag, image instance ID, image repository name, image repository ID, image repository namespace, image region, image digest, or image repository type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>525</p>
     */
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
