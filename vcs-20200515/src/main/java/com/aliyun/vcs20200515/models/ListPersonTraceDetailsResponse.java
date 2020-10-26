// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceDetailsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListPersonTraceDetailsResponseData> data;

    public static ListPersonTraceDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceDetailsResponse self = new ListPersonTraceDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceDetailsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonTraceDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonTraceDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonTraceDetailsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTraceDetailsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonTraceDetailsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPersonTraceDetailsResponse setData(java.util.List<ListPersonTraceDetailsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonTraceDetailsResponseData> getData() {
        return this.data;
    }

    public static class ListPersonTraceDetailsResponseData extends TeaModel {
        @NameInMap("TargetPicUrlPath")
        @Validation(required = true)
        public String targetPicUrlPath;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("PicUrlPath")
        @Validation(required = true)
        public String picUrlPath;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("SubId")
        @Validation(required = true)
        public String subId;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        public static ListPersonTraceDetailsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonTraceDetailsResponseData self = new ListPersonTraceDetailsResponseData();
            return TeaModel.build(map, self);
        }

        public ListPersonTraceDetailsResponseData setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public ListPersonTraceDetailsResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListPersonTraceDetailsResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonTraceDetailsResponseData setPicUrlPath(String picUrlPath) {
            this.picUrlPath = picUrlPath;
            return this;
        }
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        public ListPersonTraceDetailsResponseData setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        public ListPersonTraceDetailsResponseData setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public ListPersonTraceDetailsResponseData setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListPersonTraceDetailsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonTraceDetailsResponseData setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

        public ListPersonTraceDetailsResponseData setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public ListPersonTraceDetailsResponseData setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

    }

}
