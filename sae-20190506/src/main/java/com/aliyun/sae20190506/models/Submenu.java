// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class Submenu extends TeaModel {
    @NameInMap("Items")
    public java.util.List<SubmenuItems> items;

    @NameInMap("SubmenuDesc")
    public String submenuDesc;

    @NameInMap("SubmenuType")
    public String submenuType;

    @NameInMap("Submenus")
    public java.util.List<Submenu> submenus;

    public static Submenu build(java.util.Map<String, ?> map) throws Exception {
        Submenu self = new Submenu();
        return TeaModel.build(map, self);
    }

    public Submenu setItems(java.util.List<SubmenuItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<SubmenuItems> getItems() {
        return this.items;
    }

    public Submenu setSubmenuDesc(String submenuDesc) {
        this.submenuDesc = submenuDesc;
        return this;
    }
    public String getSubmenuDesc() {
        return this.submenuDesc;
    }

    public Submenu setSubmenuType(String submenuType) {
        this.submenuType = submenuType;
        return this;
    }
    public String getSubmenuType() {
        return this.submenuType;
    }

    public Submenu setSubmenus(java.util.List<Submenu> submenus) {
        this.submenus = submenus;
        return this;
    }
    public java.util.List<Submenu> getSubmenus() {
        return this.submenus;
    }

    public static class SubmenuItems extends TeaModel {
        @NameInMap("DefaultSelected")
        public Boolean defaultSelected;

        @NameInMap("ItemDesc")
        public String itemDesc;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("RelatingItems")
        public java.util.List<String> relatingItems;

        public static SubmenuItems build(java.util.Map<String, ?> map) throws Exception {
            SubmenuItems self = new SubmenuItems();
            return TeaModel.build(map, self);
        }

        public SubmenuItems setDefaultSelected(Boolean defaultSelected) {
            this.defaultSelected = defaultSelected;
            return this;
        }
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        public SubmenuItems setItemDesc(String itemDesc) {
            this.itemDesc = itemDesc;
            return this;
        }
        public String getItemDesc() {
            return this.itemDesc;
        }

        public SubmenuItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public SubmenuItems setRelatingItems(java.util.List<String> relatingItems) {
            this.relatingItems = relatingItems;
            return this;
        }
        public java.util.List<String> getRelatingItems() {
            return this.relatingItems;
        }

    }

}
