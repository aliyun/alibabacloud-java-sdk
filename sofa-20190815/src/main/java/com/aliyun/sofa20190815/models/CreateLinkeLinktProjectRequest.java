// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktProjectRequest extends TeaModel {
    @NameInMap("AsPublic")
    public Boolean asPublic;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentSign")
    public String parentSign;

    public static CreateLinkeLinktProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktProjectRequest self = new CreateLinkeLinktProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktProjectRequest setAsPublic(Boolean asPublic) {
        this.asPublic = asPublic;
        return this;
    }
    public Boolean getAsPublic() {
        return this.asPublic;
    }

    public CreateLinkeLinktProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeLinktProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeLinktProjectRequest setParentSign(String parentSign) {
        this.parentSign = parentSign;
        return this;
    }
    public String getParentSign() {
        return this.parentSign;
    }

}
