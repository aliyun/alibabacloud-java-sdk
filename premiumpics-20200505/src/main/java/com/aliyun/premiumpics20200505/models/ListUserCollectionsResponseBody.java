// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListUserCollectionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUserCollectionsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUserCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserCollectionsResponseBody self = new ListUserCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserCollectionsResponseBody setData(java.util.List<ListUserCollectionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserCollectionsResponseBodyData> getData() {
        return this.data;
    }

    public ListUserCollectionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserCollectionsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListUserCollectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserCollectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserCollectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserCollectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserCollectionsResponseBodyData extends TeaModel {
        @NameInMap("Image")
        public String image;

        /**
         * <p>id</p>
         */
        @NameInMap("UnitId")
        public String unitId;

        @NameInMap("UnitName")
        public String unitName;

        @NameInMap("extend")
        public String extend;

        public static ListUserCollectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserCollectionsResponseBodyData self = new ListUserCollectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserCollectionsResponseBodyData setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListUserCollectionsResponseBodyData setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }
        public String getUnitId() {
            return this.unitId;
        }

        public ListUserCollectionsResponseBodyData setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

        public ListUserCollectionsResponseBodyData setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

    }

}
