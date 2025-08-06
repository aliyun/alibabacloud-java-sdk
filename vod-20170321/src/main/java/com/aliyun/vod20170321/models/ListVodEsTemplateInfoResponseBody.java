// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListVodEsTemplateInfoResponseBody extends TeaModel {
    @NameInMap("DataItems")
    public java.util.List<ListVodEsTemplateInfoResponseBodyDataItems> dataItems;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListVodEsTemplateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodEsTemplateInfoResponseBody self = new ListVodEsTemplateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodEsTemplateInfoResponseBody setDataItems(java.util.List<ListVodEsTemplateInfoResponseBodyDataItems> dataItems) {
        this.dataItems = dataItems;
        return this;
    }
    public java.util.List<ListVodEsTemplateInfoResponseBodyDataItems> getDataItems() {
        return this.dataItems;
    }

    public ListVodEsTemplateInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVodEsTemplateInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVodEsTemplateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVodEsTemplateInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListVodEsTemplateInfoResponseBodyDataItems extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("TmplDef")
        public String tmplDef;

        @NameInMap("TmplDesc")
        public String tmplDesc;

        @NameInMap("TmplName")
        public String tmplName;

        public static ListVodEsTemplateInfoResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListVodEsTemplateInfoResponseBodyDataItems self = new ListVodEsTemplateInfoResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListVodEsTemplateInfoResponseBodyDataItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListVodEsTemplateInfoResponseBodyDataItems setTmplDef(String tmplDef) {
            this.tmplDef = tmplDef;
            return this;
        }
        public String getTmplDef() {
            return this.tmplDef;
        }

        public ListVodEsTemplateInfoResponseBodyDataItems setTmplDesc(String tmplDesc) {
            this.tmplDesc = tmplDesc;
            return this;
        }
        public String getTmplDesc() {
            return this.tmplDesc;
        }

        public ListVodEsTemplateInfoResponseBodyDataItems setTmplName(String tmplName) {
            this.tmplName = tmplName;
            return this;
        }
        public String getTmplName() {
            return this.tmplName;
        }

    }

}
