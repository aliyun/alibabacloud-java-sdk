// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class CreateEnterpriseRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Emails")
    public java.util.Map<String, ?> emails;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("CreatorStaffId")
    public String creatorStaffId;

    public static CreateEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseRequest self = new CreateEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnterpriseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnterpriseRequest setEmails(java.util.Map<String, ?> emails) {
        this.emails = emails;
        return this;
    }
    public java.util.Map<String, ?> getEmails() {
        return this.emails;
    }

    public CreateEnterpriseRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateEnterpriseRequest setCreatorStaffId(String creatorStaffId) {
        this.creatorStaffId = creatorStaffId;
        return this;
    }
    public String getCreatorStaffId() {
        return this.creatorStaffId;
    }

}
