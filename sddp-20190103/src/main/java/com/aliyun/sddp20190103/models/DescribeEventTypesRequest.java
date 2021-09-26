// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ParentTypeId")
    public Long parentTypeId;

    @NameInMap("ResourceId")
    public Integer resourceId;

    @NameInMap("Status")
    public Integer status;

    public static DescribeEventTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTypesRequest self = new DescribeEventTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventTypesRequest setParentTypeId(Long parentTypeId) {
        this.parentTypeId = parentTypeId;
        return this;
    }
    public Long getParentTypeId() {
        return this.parentTypeId;
    }

    public DescribeEventTypesRequest setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Integer getResourceId() {
        return this.resourceId;
    }

    public DescribeEventTypesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
