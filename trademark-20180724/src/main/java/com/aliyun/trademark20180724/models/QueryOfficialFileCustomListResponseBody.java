// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOfficialFileCustomListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("Data")
    public QueryOfficialFileCustomListResponseBodyData data;

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

    public QueryOfficialFileCustomListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryOfficialFileCustomListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOfficialFileCustomListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOfficialFileCustomListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryOfficialFileCustomListResponseBody setData(QueryOfficialFileCustomListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOfficialFileCustomListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryOfficialFileCustomListResponseBodyDataCustomList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EndAcceptTime")
        public Long endAcceptTime;

        @NameInMap("StartAcceptTime")
        public Long startAcceptTime;

        public static QueryOfficialFileCustomListResponseBodyDataCustomList build(java.util.Map<String, ?> map) throws Exception {
            QueryOfficialFileCustomListResponseBodyDataCustomList self = new QueryOfficialFileCustomListResponseBodyDataCustomList();
            return TeaModel.build(map, self);
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public QueryOfficialFileCustomListResponseBodyDataCustomList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setEndAcceptTime(Long endAcceptTime) {
            this.endAcceptTime = endAcceptTime;
            return this;
        }
        public Long getEndAcceptTime() {
            return this.endAcceptTime;
        }

        public QueryOfficialFileCustomListResponseBodyDataCustomList setStartAcceptTime(Long startAcceptTime) {
            this.startAcceptTime = startAcceptTime;
            return this;
        }
        public Long getStartAcceptTime() {
            return this.startAcceptTime;
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
