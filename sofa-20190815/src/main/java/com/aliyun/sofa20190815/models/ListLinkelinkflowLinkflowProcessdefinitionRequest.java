// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkelinkflowLinkflowProcessdefinitionRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Name")
    public String name;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkelinkflowLinkflowProcessdefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkelinkflowLinkflowProcessdefinitionRequest self = new ListLinkelinkflowLinkflowProcessdefinitionRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkelinkflowLinkflowProcessdefinitionRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
