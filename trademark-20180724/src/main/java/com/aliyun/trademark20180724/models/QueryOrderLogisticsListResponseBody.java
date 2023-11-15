// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryOrderLogisticsListResponseBodyData> data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryOrderLogisticsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsListResponseBody self = new QueryOrderLogisticsListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryOrderLogisticsListResponseBody setData(java.util.List<QueryOrderLogisticsListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOrderLogisticsListResponseBodyData> getData() {
        return this.data;
    }

    public QueryOrderLogisticsListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderLogisticsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderLogisticsListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryOrderLogisticsListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryOrderLogisticsListResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("FileIdentifier")
        public String fileIdentifier;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("LogisticsNo")
        public String logisticsNo;

        @NameInMap("ProduceOrderId")
        public String produceOrderId;

        @NameInMap("TmIcon")
        public String tmIcon;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("TmNumber")
        public String tmNumber;

        public static QueryOrderLogisticsListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsListResponseBodyData self = new QueryOrderLogisticsListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsListResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryOrderLogisticsListResponseBodyData setFileIdentifier(String fileIdentifier) {
            this.fileIdentifier = fileIdentifier;
            return this;
        }
        public String getFileIdentifier() {
            return this.fileIdentifier;
        }

        public QueryOrderLogisticsListResponseBodyData setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public QueryOrderLogisticsListResponseBodyData setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
            return this;
        }
        public String getLogisticsNo() {
            return this.logisticsNo;
        }

        public QueryOrderLogisticsListResponseBodyData setProduceOrderId(String produceOrderId) {
            this.produceOrderId = produceOrderId;
            return this;
        }
        public String getProduceOrderId() {
            return this.produceOrderId;
        }

        public QueryOrderLogisticsListResponseBodyData setTmIcon(String tmIcon) {
            this.tmIcon = tmIcon;
            return this;
        }
        public String getTmIcon() {
            return this.tmIcon;
        }

        public QueryOrderLogisticsListResponseBodyData setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public QueryOrderLogisticsListResponseBodyData setTmNumber(String tmNumber) {
            this.tmNumber = tmNumber;
            return this;
        }
        public String getTmNumber() {
            return this.tmNumber;
        }

    }

}
