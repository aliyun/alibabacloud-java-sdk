// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminuserroleRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    @NameInMap("Created")
    public Long created;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("Id")
    public String id;

    @NameInMap("LastModified")
    public Long lastModified;

    @NameInMap("Role")
    public String role;

    public static AddLinkeBahamutAdminuserroleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminuserroleRequest self = new AddLinkeBahamutAdminuserroleRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminuserroleRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public AddLinkeBahamutAdminuserroleRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public AddLinkeBahamutAdminuserroleRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public AddLinkeBahamutAdminuserroleRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public AddLinkeBahamutAdminuserroleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeBahamutAdminuserroleRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public AddLinkeBahamutAdminuserroleRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
