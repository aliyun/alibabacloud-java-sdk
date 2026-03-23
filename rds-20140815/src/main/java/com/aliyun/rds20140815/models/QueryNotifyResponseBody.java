// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryNotifyResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryNotifyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryNotifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNotifyResponseBody self = new QueryNotifyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNotifyResponseBody setData(QueryNotifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryNotifyResponseBodyData getData() {
        return this.data;
    }

    public QueryNotifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryNotifyResponseBodyDataNotifyItemList extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("ConfirmFlag")
        public Boolean confirmFlag;

        @NameInMap("Confirmor")
        public Long confirmor;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdempotentCount")
        public String idempotentCount;

        @NameInMap("IdempotentId")
        public String idempotentId;

        @NameInMap("Level")
        public String level;

        @NameInMap("NotifyElement")
        public String notifyElement;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Type")
        public String type;

        public static QueryNotifyResponseBodyDataNotifyItemList build(java.util.Map<String, ?> map) throws Exception {
            QueryNotifyResponseBodyDataNotifyItemList self = new QueryNotifyResponseBodyDataNotifyItemList();
            return TeaModel.build(map, self);
        }

        public QueryNotifyResponseBodyDataNotifyItemList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setConfirmFlag(Boolean confirmFlag) {
            this.confirmFlag = confirmFlag;
            return this;
        }
        public Boolean getConfirmFlag() {
            return this.confirmFlag;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setConfirmor(Long confirmor) {
            this.confirmor = confirmor;
            return this;
        }
        public Long getConfirmor() {
            return this.confirmor;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setIdempotentCount(String idempotentCount) {
            this.idempotentCount = idempotentCount;
            return this;
        }
        public String getIdempotentCount() {
            return this.idempotentCount;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setNotifyElement(String notifyElement) {
            this.notifyElement = notifyElement;
            return this;
        }
        public String getNotifyElement() {
            return this.notifyElement;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryNotifyResponseBodyDataNotifyItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryNotifyResponseBodyData extends TeaModel {
        @NameInMap("NotifyItemList")
        public java.util.List<QueryNotifyResponseBodyDataNotifyItemList> notifyItemList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalRecordCount")
        public Integer totalRecordCount;

        public static QueryNotifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNotifyResponseBodyData self = new QueryNotifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNotifyResponseBodyData setNotifyItemList(java.util.List<QueryNotifyResponseBodyDataNotifyItemList> notifyItemList) {
            this.notifyItemList = notifyItemList;
            return this;
        }
        public java.util.List<QueryNotifyResponseBodyDataNotifyItemList> getNotifyItemList() {
            return this.notifyItemList;
        }

        public QueryNotifyResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryNotifyResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryNotifyResponseBodyData setTotalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

    }

}
