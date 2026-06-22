// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoCriteriaRequest extends TeaModel {
    /**
     * <p>The search value for image repositories.</p>
     * <blockquote>
     * <p>This parameter supports fuzzy match for image IDs, tags, image instance IDs, repository names, repository namespaces, repository IDs, repository regions, digests, and repository types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2.0.2</p>
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
