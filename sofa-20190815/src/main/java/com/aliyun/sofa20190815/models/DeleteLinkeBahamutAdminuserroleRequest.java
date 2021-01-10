// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminuserroleRequest extends TeaModel {
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

    public static DeleteLinkeBahamutAdminuserroleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminuserroleRequest self = new DeleteLinkeBahamutAdminuserroleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminuserroleRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DeleteLinkeBahamutAdminuserroleRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public DeleteLinkeBahamutAdminuserroleRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public DeleteLinkeBahamutAdminuserroleRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public DeleteLinkeBahamutAdminuserroleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeBahamutAdminuserroleRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public DeleteLinkeBahamutAdminuserroleRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
