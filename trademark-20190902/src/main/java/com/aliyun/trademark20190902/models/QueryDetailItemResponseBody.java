// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryDetailItemResponseBody extends TeaModel {
    @NameInMap("Module")
    public QueryDetailItemResponseBodyModule module;

    public static QueryDetailItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailItemResponseBody self = new QueryDetailItemResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDetailItemResponseBody setModule(QueryDetailItemResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryDetailItemResponseBodyModule getModule() {
        return this.module;
    }

    public static class QueryDetailItemResponseBodyModuleAttributesAttribute extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Title")
        public String title;

        @NameInMap("Value")
        public String value;

        public static QueryDetailItemResponseBodyModuleAttributesAttribute build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailItemResponseBodyModuleAttributesAttribute self = new QueryDetailItemResponseBodyModuleAttributesAttribute();
            return TeaModel.build(map, self);
        }

        public QueryDetailItemResponseBodyModuleAttributesAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDetailItemResponseBodyModuleAttributesAttribute setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryDetailItemResponseBodyModuleAttributesAttribute setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDetailItemResponseBodyModuleAttributes extends TeaModel {
        @NameInMap("attribute")
        public java.util.List<QueryDetailItemResponseBodyModuleAttributesAttribute> attribute;

        public static QueryDetailItemResponseBodyModuleAttributes build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailItemResponseBodyModuleAttributes self = new QueryDetailItemResponseBodyModuleAttributes();
            return TeaModel.build(map, self);
        }

        public QueryDetailItemResponseBodyModuleAttributes setAttribute(java.util.List<QueryDetailItemResponseBodyModuleAttributesAttribute> attribute) {
            this.attribute = attribute;
            return this;
        }
        public java.util.List<QueryDetailItemResponseBodyModuleAttributesAttribute> getAttribute() {
            return this.attribute;
        }

    }

    public static class QueryDetailItemResponseBodyModuleDetailPicUrl extends TeaModel {
        @NameInMap("picUlr")
        public java.util.List<String> picUlr;

        public static QueryDetailItemResponseBodyModuleDetailPicUrl build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailItemResponseBodyModuleDetailPicUrl self = new QueryDetailItemResponseBodyModuleDetailPicUrl();
            return TeaModel.build(map, self);
        }

        public QueryDetailItemResponseBodyModuleDetailPicUrl setPicUlr(java.util.List<String> picUlr) {
            this.picUlr = picUlr;
            return this;
        }
        public java.util.List<String> getPicUlr() {
            return this.picUlr;
        }

    }

    public static class QueryDetailItemResponseBodyModule extends TeaModel {
        @NameInMap("Attributes")
        public QueryDetailItemResponseBodyModuleAttributes attributes;

        @NameInMap("DetailDescription")
        public String detailDescription;

        @NameInMap("DetailObjectJson")
        public String detailObjectJson;

        @NameInMap("DetailPagePicUrl")
        public String detailPagePicUrl;

        @NameInMap("DetailPicUrl")
        public QueryDetailItemResponseBodyModuleDetailPicUrl detailPicUrl;

        @NameInMap("Label")
        public String label;

        @NameInMap("MainPicUrl")
        public String mainPicUrl;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static QueryDetailItemResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryDetailItemResponseBodyModule self = new QueryDetailItemResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryDetailItemResponseBodyModule setAttributes(QueryDetailItemResponseBodyModuleAttributes attributes) {
            this.attributes = attributes;
            return this;
        }
        public QueryDetailItemResponseBodyModuleAttributes getAttributes() {
            return this.attributes;
        }

        public QueryDetailItemResponseBodyModule setDetailDescription(String detailDescription) {
            this.detailDescription = detailDescription;
            return this;
        }
        public String getDetailDescription() {
            return this.detailDescription;
        }

        public QueryDetailItemResponseBodyModule setDetailObjectJson(String detailObjectJson) {
            this.detailObjectJson = detailObjectJson;
            return this;
        }
        public String getDetailObjectJson() {
            return this.detailObjectJson;
        }

        public QueryDetailItemResponseBodyModule setDetailPagePicUrl(String detailPagePicUrl) {
            this.detailPagePicUrl = detailPagePicUrl;
            return this;
        }
        public String getDetailPagePicUrl() {
            return this.detailPagePicUrl;
        }

        public QueryDetailItemResponseBodyModule setDetailPicUrl(QueryDetailItemResponseBodyModuleDetailPicUrl detailPicUrl) {
            this.detailPicUrl = detailPicUrl;
            return this;
        }
        public QueryDetailItemResponseBodyModuleDetailPicUrl getDetailPicUrl() {
            return this.detailPicUrl;
        }

        public QueryDetailItemResponseBodyModule setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryDetailItemResponseBodyModule setMainPicUrl(String mainPicUrl) {
            this.mainPicUrl = mainPicUrl;
            return this;
        }
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        public QueryDetailItemResponseBodyModule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryDetailItemResponseBodyModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
