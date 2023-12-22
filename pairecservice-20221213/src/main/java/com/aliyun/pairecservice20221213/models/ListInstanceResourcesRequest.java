// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourcesRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Group")
    public String group;

    @NameInMap("Type")
    public String type;

    public static ListInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourcesRequest self = new ListInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourcesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListInstanceResourcesRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListInstanceResourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
