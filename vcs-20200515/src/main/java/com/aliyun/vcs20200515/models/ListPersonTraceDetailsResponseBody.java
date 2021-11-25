// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPersonTraceDetailsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPersonTraceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceDetailsResponseBody self = new ListPersonTraceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonTraceDetailsResponseBody setData(java.util.List<ListPersonTraceDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonTraceDetailsResponseBodyData> getData() {
        return this.data;
    }

    public ListPersonTraceDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonTraceDetailsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTraceDetailsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonTraceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonTraceDetailsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPersonTraceDetailsResponseBodyData extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("LeftTopX")
        public String leftTopX;

        @NameInMap("LeftTopY")
        public String leftTopY;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PicUrlPath")
        public String picUrlPath;

        @NameInMap("RightBottomX")
        public String rightBottomX;

        @NameInMap("RightBottomY")
        public String rightBottomY;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("SubId")
        public String subId;

        @NameInMap("TargetPicUrlPath")
        public String targetPicUrlPath;

        public static ListPersonTraceDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonTraceDetailsResponseBodyData self = new ListPersonTraceDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersonTraceDetailsResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonTraceDetailsResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListPersonTraceDetailsResponseBodyData setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public ListPersonTraceDetailsResponseBodyData setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public ListPersonTraceDetailsResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonTraceDetailsResponseBodyData setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListPersonTraceDetailsResponseBodyData setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public ListPersonTraceDetailsResponseBodyData setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public ListPersonTraceDetailsResponseBodyData setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListPersonTraceDetailsResponseBodyData setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListPersonTraceDetailsResponseBodyData setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

    }

}
