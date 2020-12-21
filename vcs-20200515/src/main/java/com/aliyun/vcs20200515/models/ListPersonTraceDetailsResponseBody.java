// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceDetailsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("Data")
    public java.util.List<ListPersonTraceDetailsResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    public static ListPersonTraceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceDetailsResponseBody self = new ListPersonTraceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceDetailsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPersonTraceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonTraceDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonTraceDetailsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonTraceDetailsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTraceDetailsResponseBody setData(java.util.List<ListPersonTraceDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonTraceDetailsResponseBodyData> getData() {
        return this.data;
    }

    public ListPersonTraceDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListPersonTraceDetailsResponseBodyData extends TeaModel {
        @NameInMap("TargetPicUrlPath")
        public String targetPicUrlPath;

        @NameInMap("SubId")
        public String subId;

        @NameInMap("RightBottomY")
        public String rightBottomY;

        @NameInMap("LeftTopY")
        public String leftTopY;

        @NameInMap("PicUrlPath")
        public String picUrlPath;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("LeftTopX")
        public String leftTopX;

        @NameInMap("RightBottomX")
        public String rightBottomX;

        @NameInMap("PersonId")
        public String personId;

        public static ListPersonTraceDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonTraceDetailsResponseBodyData self = new ListPersonTraceDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersonTraceDetailsResponseBodyData setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListPersonTraceDetailsResponseBodyData setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListPersonTraceDetailsResponseBodyData setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public ListPersonTraceDetailsResponseBodyData setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public ListPersonTraceDetailsResponseBodyData setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListPersonTraceDetailsResponseBodyData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListPersonTraceDetailsResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonTraceDetailsResponseBodyData setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListPersonTraceDetailsResponseBodyData setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public ListPersonTraceDetailsResponseBodyData setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public ListPersonTraceDetailsResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

}
