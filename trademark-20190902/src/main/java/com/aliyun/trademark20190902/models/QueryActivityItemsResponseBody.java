// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryActivityItemsResponseBody extends TeaModel {
    @NameInMap("Module")
    public QueryActivityItemsResponseBodyModule module;

    public static QueryActivityItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityItemsResponseBody self = new QueryActivityItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryActivityItemsResponseBody setModule(QueryActivityItemsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryActivityItemsResponseBodyModule getModule() {
        return this.module;
    }

    public static class QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        @NameInMap("Title")
        public String title;

        @NameInMap("Value")
        public String value;

        public static QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor self = new QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles extends TeaModel {
        @NameInMap("subFloor")
        public java.util.List<QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor> subFloor;

        public static QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles self = new QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles setSubFloor(java.util.List<QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor> subFloor) {
            this.subFloor = subFloor;
            return this;
        }
        public java.util.List<QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitlesSubFloor> getSubFloor() {
            return this.subFloor;
        }

    }

    public static class QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubTitles")
        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles subTitles;

        @NameInMap("Title")
        public String title;

        public static QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor self = new QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor setSubTitles(QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles subTitles) {
            this.subTitles = subTitles;
            return this;
        }
        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloorSubTitles getSubTitles() {
            return this.subTitles;
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryActivityItemsResponseBodyModuleFloorDisplayInfos extends TeaModel {
        @NameInMap("floor")
        public java.util.List<QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor> floor;

        public static QueryActivityItemsResponseBodyModuleFloorDisplayInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyModuleFloorDisplayInfos self = new QueryActivityItemsResponseBodyModuleFloorDisplayInfos();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyModuleFloorDisplayInfos setFloor(java.util.List<QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor> floor) {
            this.floor = floor;
            return this;
        }
        public java.util.List<QueryActivityItemsResponseBodyModuleFloorDisplayInfosFloor> getFloor() {
            return this.floor;
        }

    }

    public static class QueryActivityItemsResponseBodyModule extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("FloorDisplayInfos")
        public QueryActivityItemsResponseBodyModuleFloorDisplayInfos floorDisplayInfos;

        @NameInMap("FloorItems")
        public String floorItems;

        public static QueryActivityItemsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityItemsResponseBodyModule self = new QueryActivityItemsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryActivityItemsResponseBodyModule setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryActivityItemsResponseBodyModule setFloorDisplayInfos(QueryActivityItemsResponseBodyModuleFloorDisplayInfos floorDisplayInfos) {
            this.floorDisplayInfos = floorDisplayInfos;
            return this;
        }
        public QueryActivityItemsResponseBodyModuleFloorDisplayInfos getFloorDisplayInfos() {
            return this.floorDisplayInfos;
        }

        public QueryActivityItemsResponseBodyModule setFloorItems(String floorItems) {
            this.floorItems = floorItems;
            return this;
        }
        public String getFloorItems() {
            return this.floorItems;
        }

    }

}
