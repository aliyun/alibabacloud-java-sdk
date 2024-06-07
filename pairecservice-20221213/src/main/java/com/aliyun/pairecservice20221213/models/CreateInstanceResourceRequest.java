// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateInstanceResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static CreateInstanceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResourceRequest self = new CreateInstanceResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResourceRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateInstanceResourceRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateInstanceResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateInstanceResourceRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
