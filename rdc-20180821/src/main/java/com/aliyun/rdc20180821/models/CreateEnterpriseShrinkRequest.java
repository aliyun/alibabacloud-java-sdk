// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class CreateEnterpriseShrinkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Emails")
    public String emailsShrink;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("CreatorStaffId")
    public String creatorStaffId;

    public static CreateEnterpriseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseShrinkRequest self = new CreateEnterpriseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnterpriseShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnterpriseShrinkRequest setEmailsShrink(String emailsShrink) {
        this.emailsShrink = emailsShrink;
        return this;
    }
    public String getEmailsShrink() {
        return this.emailsShrink;
    }

    public CreateEnterpriseShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateEnterpriseShrinkRequest setCreatorStaffId(String creatorStaffId) {
        this.creatorStaffId = creatorStaffId;
        return this;
    }
    public String getCreatorStaffId() {
        return this.creatorStaffId;
    }

}
