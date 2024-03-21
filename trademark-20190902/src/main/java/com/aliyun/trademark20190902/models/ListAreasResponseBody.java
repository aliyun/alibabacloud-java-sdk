// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAreasResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<ListAreasResponseBodyDatas> datas;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAreasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAreasResponseBody self = new ListAreasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAreasResponseBody setDatas(java.util.List<ListAreasResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<ListAreasResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public ListAreasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAreasResponseBodyDatasSubArea extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentCode")
        public String parentCode;

        @NameInMap("SortNum")
        public Integer sortNum;

        public static ListAreasResponseBodyDatasSubArea build(java.util.Map<String, ?> map) throws Exception {
            ListAreasResponseBodyDatasSubArea self = new ListAreasResponseBodyDatasSubArea();
            return TeaModel.build(map, self);
        }

        public ListAreasResponseBodyDatasSubArea setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAreasResponseBodyDatasSubArea setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAreasResponseBodyDatasSubArea setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public ListAreasResponseBodyDatasSubArea setSortNum(Integer sortNum) {
            this.sortNum = sortNum;
            return this;
        }
        public Integer getSortNum() {
            return this.sortNum;
        }

    }

    public static class ListAreasResponseBodyDatas extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentCode")
        public String parentCode;

        @NameInMap("SortNum")
        public Integer sortNum;

        @NameInMap("SubArea")
        public java.util.List<ListAreasResponseBodyDatasSubArea> subArea;

        public static ListAreasResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            ListAreasResponseBodyDatas self = new ListAreasResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public ListAreasResponseBodyDatas setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAreasResponseBodyDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAreasResponseBodyDatas setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public ListAreasResponseBodyDatas setSortNum(Integer sortNum) {
            this.sortNum = sortNum;
            return this;
        }
        public Integer getSortNum() {
            return this.sortNum;
        }

        public ListAreasResponseBodyDatas setSubArea(java.util.List<ListAreasResponseBodyDatasSubArea> subArea) {
            this.subArea = subArea;
            return this;
        }
        public java.util.List<ListAreasResponseBodyDatasSubArea> getSubArea() {
            return this.subArea;
        }

    }

}
