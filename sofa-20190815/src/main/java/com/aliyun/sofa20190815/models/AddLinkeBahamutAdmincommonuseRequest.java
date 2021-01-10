// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmincommonuseRequest extends TeaModel {
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

    public static AddLinkeBahamutAdmincommonuseRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmincommonuseRequest self = new AddLinkeBahamutAdmincommonuseRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmincommonuseRequest setCat(String cat) {
        this.cat = cat;
        return this;
    }
    public String getCat() {
        return this.cat;
    }

    public AddLinkeBahamutAdmincommonuseRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public AddLinkeBahamutAdmincommonuseRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public AddLinkeBahamutAdmincommonuseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeBahamutAdmincommonuseRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public AddLinkeBahamutAdmincommonuseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddLinkeBahamutAdmincommonuseRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public AddLinkeBahamutAdmincommonuseRequest setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public AddLinkeBahamutAdmincommonuseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
