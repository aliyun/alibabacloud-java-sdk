// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOfficialFileCustomListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryOfficialFileCustomListResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryOfficialFileCustomListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOfficialFileCustomListResponseBody self = new QueryOfficialFileCustomListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOfficialFileCustomListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryOfficialFileCustomListResponseBody setData(QueryOfficialFileCustomListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOfficialFileCustomListResponseBodyData getData() {
        return this.data;
    }

    public QueryOfficialFileCustomListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOfficialFileCustomListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOfficialFileCustomListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryOfficialFileCustomListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryOfficialFileCustomListResponseBodyDataCustomList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("EndAcceptTime")
        public Long endAcceptTime;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("StartAcceptTime")
        public Long startAcceptTime;

        @NameInMap("Status")
        public String status;

        public static QueryOfficialFileCustomListResponseBodyDataCustomList build(java.util.Map<String, ?> map) throws Exception {
            QueryOfficialFileCustomListResponseBodyDataCustomList self = new QueryOfficialFileCustomListResponseBodyDataCustomList();
            return TeaModel.build(map, self);
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setEndAcceptTime(Long endAcceptTime) {
            this.endAcceptTime = endAcceptTime;
            return this;
        }
        public Long getEndAcceptTime() {
            return this.endAcceptTime;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setStartAcceptTime(Long startAcceptTime) {
            this.startAcceptTime = startAcceptTime;
            return this;
        }
        public Long getStartAcceptTime() {
            return this.startAcceptTime;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryOfficialFileCustomListResponseBodyData extends TeaModel {
        @NameInMap("CustomList")
        public java.util.List<QueryOfficialFileCustomListResponseBodyDataCustomList> customList;

        public static QueryOfficialFileCustomListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOfficialFileCustomListResponseBodyData self = new QueryOfficialFileCustomListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOfficialFileCustomListResponseBodyData setCustomList(java.util.List<QueryOfficialFileCustomListResponseBodyDataCustomList> customList) {
            this.customList = customList;
            return this;
        }
        public java.util.List<QueryOfficialFileCustomListResponseBodyDataCustomList> getCustomList() {
            return this.customList;
        }

    }

}
