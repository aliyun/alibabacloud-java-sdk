// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetTemplateCategoriesRequest extends TeaModel {
    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("Recursive")
    public Boolean recursive;

    @NameInMap("Status")
    public String status;

    public static GetTemplateCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateCategoriesRequest self = new GetTemplateCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateCategoriesRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public GetTemplateCategoriesRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public GetTemplateCategoriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
