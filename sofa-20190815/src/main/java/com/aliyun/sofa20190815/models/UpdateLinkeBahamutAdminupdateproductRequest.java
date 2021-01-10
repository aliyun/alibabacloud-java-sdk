// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdateproductRequest extends TeaModel {
    @NameInMap("Cat")
    public String cat;

    @NameInMap("Created")
    public Long created;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Fixed")
    public Boolean fixed;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("IconTheme")
    public String iconTheme;

    @NameInMap("Id")
    public String id;

    @NameInMap("LastModified")
    public Long lastModified;

    @NameInMap("MenusRepeatList")
    public java.util.List<String> menusRepeatList;

    @NameInMap("Name")
    public String name;

    @NameInMap("OpenBlank")
    public Boolean openBlank;

    @NameInMap("Show")
    public Boolean show;

    @NameInMap("Sort")
    public Long sort;

    @NameInMap("Url")
    public String url;

    public static UpdateLinkeBahamutAdminupdateproductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdateproductRequest self = new UpdateLinkeBahamutAdminupdateproductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setCat(String cat) {
        this.cat = cat;
        return this;
    }
    public String getCat() {
        return this.cat;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setFixed(Boolean fixed) {
        this.fixed = fixed;
        return this;
    }
    public Boolean getFixed() {
        return this.fixed;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setIconTheme(String iconTheme) {
        this.iconTheme = iconTheme;
        return this;
    }
    public String getIconTheme() {
        return this.iconTheme;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setMenusRepeatList(java.util.List<String> menusRepeatList) {
        this.menusRepeatList = menusRepeatList;
        return this;
    }
    public java.util.List<String> getMenusRepeatList() {
        return this.menusRepeatList;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setOpenBlank(Boolean openBlank) {
        this.openBlank = openBlank;
        return this;
    }
    public Boolean getOpenBlank() {
        return this.openBlank;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setShow(Boolean show) {
        this.show = show;
        return this;
    }
    public Boolean getShow() {
        return this.show;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public UpdateLinkeBahamutAdminupdateproductRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
