// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageCriteriaRequest extends TeaModel {
    /**
     * <p>The fuzzy match value used to query images.</p>
     * <blockquote>
     * <p>This parameter supports fuzzy queries for image IDs, image tags, image instance IDs, image repository names, image repository IDs, image repository namespaces, image regions, image digests, and image repository types.</p>
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
