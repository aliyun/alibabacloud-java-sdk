// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("ParentId")
    public String parentId;

    public static DescribeDataLimitSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitSetRequest self = new DescribeDataLimitSetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitSetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataLimitSetRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public DescribeDataLimitSetRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
