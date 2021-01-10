// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminaddproductRequest extends TeaModel {
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

    @NameInMap("MenusRepeatList")
    public java.util.List<String> menusRepeatList;

    public static AddLinkeBahamutAdminaddproductRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminaddproductRequest self = new AddLinkeBahamutAdminaddproductRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminaddproductRequest setCat(String cat) {
        this.cat = cat;
        return this;
    }
    public String getCat() {
        return this.cat;
    }

    public AddLinkeBahamutAdminaddproductRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public AddLinkeBahamutAdminaddproductRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public AddLinkeBahamutAdminaddproductRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AddLinkeBahamutAdminaddproductRequest setFixed(Boolean fixed) {
        this.fixed = fixed;
        return this;
    }
    public Boolean getFixed() {
        return this.fixed;
    }

    public AddLinkeBahamutAdminaddproductRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public AddLinkeBahamutAdminaddproductRequest setIconTheme(String iconTheme) {
        this.iconTheme = iconTheme;
        return this;
    }
    public String getIconTheme() {
        return this.iconTheme;
    }

    public AddLinkeBahamutAdminaddproductRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeBahamutAdminaddproductRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public AddLinkeBahamutAdminaddproductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddLinkeBahamutAdminaddproductRequest setOpenBlank(Boolean openBlank) {
        this.openBlank = openBlank;
        return this;
    }
    public Boolean getOpenBlank() {
        return this.openBlank;
    }

    public AddLinkeBahamutAdminaddproductRequest setShow(Boolean show) {
        this.show = show;
        return this;
    }
    public Boolean getShow() {
        return this.show;
    }

    public AddLinkeBahamutAdminaddproductRequest setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public AddLinkeBahamutAdminaddproductRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public AddLinkeBahamutAdminaddproductRequest setMenusRepeatList(java.util.List<String> menusRepeatList) {
        this.menusRepeatList = menusRepeatList;
        return this;
    }
    public java.util.List<String> getMenusRepeatList() {
        return this.menusRepeatList;
    }

}
