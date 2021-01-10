// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdatecommonuseRequest extends TeaModel {
    @NameInMap("Cat")
    public String cat;

    @NameInMap("Created")
    public Long created;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("Id")
    public String id;

    @NameInMap("LastModified")
    public Long lastModified;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("Sort")
    public Long sort;

    @NameInMap("Url")
    public String url;

    public static UpdateLinkeBahamutAdminupdatecommonuseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdatecommonuseRequest self = new UpdateLinkeBahamutAdminupdatecommonuseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setCat(String cat) {
        this.cat = cat;
        return this;
    }
    public String getCat() {
        return this.cat;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
