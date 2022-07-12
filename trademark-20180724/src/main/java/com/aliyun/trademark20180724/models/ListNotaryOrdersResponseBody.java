// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListNotaryOrdersResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public ListNotaryOrdersResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListNotaryOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotaryOrdersResponseBody self = new ListNotaryOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotaryOrdersResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListNotaryOrdersResponseBody setData(ListNotaryOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNotaryOrdersResponseBodyData getData() {
        return this.data;
    }

    public ListNotaryOrdersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNotaryOrdersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListNotaryOrdersResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public ListNotaryOrdersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNotaryOrdersResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public ListNotaryOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNotaryOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNotaryOrdersResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListNotaryOrdersResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListNotaryOrdersResponseBodyDataNotaryOrder extends TeaModel {
        @NameInMap("AliyunOrderId")
        public String aliyunOrderId;

        @NameInMap("ApplyPostStatus")
        public String applyPostStatus;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("NotaryCertificate")
        public String notaryCertificate;

        @NameInMap("NotaryOrderId")
        public Long notaryOrderId;

        @NameInMap("NotaryPlatformName")
        public String notaryPlatformName;

        @NameInMap("NotaryStatus")
        public Integer notaryStatus;

        @NameInMap("NotaryType")
        public Integer notaryType;

        @NameInMap("OrderDate")
        public Long orderDate;

        @NameInMap("OrderPrice")
        public Float orderPrice;

        @NameInMap("TmClassification")
        public String tmClassification;

        @NameInMap("TmImage")
        public String tmImage;

        @NameInMap("TmName")
        public String tmName;

        @NameInMap("TmRegisterNo")
        public String tmRegisterNo;

        public static ListNotaryOrdersResponseBodyDataNotaryOrder build(java.util.Map<String, ?> map) throws Exception {
            ListNotaryOrdersResponseBodyDataNotaryOrder self = new ListNotaryOrdersResponseBodyDataNotaryOrder();
            return TeaModel.build(map, self);
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setAliyunOrderId(String aliyunOrderId) {
            this.aliyunOrderId = aliyunOrderId;
            return this;
        }
        public String getAliyunOrderId() {
            return this.aliyunOrderId;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setApplyPostStatus(String applyPostStatus) {
            this.applyPostStatus = applyPostStatus;
            return this;
        }
        public String getApplyPostStatus() {
            return this.applyPostStatus;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setNotaryCertificate(String notaryCertificate) {
            this.notaryCertificate = notaryCertificate;
            return this;
        }
        public String getNotaryCertificate() {
            return this.notaryCertificate;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setNotaryOrderId(Long notaryOrderId) {
            this.notaryOrderId = notaryOrderId;
            return this;
        }
        public Long getNotaryOrderId() {
            return this.notaryOrderId;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setNotaryPlatformName(String notaryPlatformName) {
            this.notaryPlatformName = notaryPlatformName;
            return this;
        }
        public String getNotaryPlatformName() {
            return this.notaryPlatformName;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setNotaryStatus(Integer notaryStatus) {
            this.notaryStatus = notaryStatus;
            return this;
        }
        public Integer getNotaryStatus() {
            return this.notaryStatus;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setNotaryType(Integer notaryType) {
            this.notaryType = notaryType;
            return this;
        }
        public Integer getNotaryType() {
            return this.notaryType;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setOrderDate(Long orderDate) {
            this.orderDate = orderDate;
            return this;
        }
        public Long getOrderDate() {
            return this.orderDate;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setOrderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Float getOrderPrice() {
            return this.orderPrice;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setTmClassification(String tmClassification) {
            this.tmClassification = tmClassification;
            return this;
        }
        public String getTmClassification() {
            return this.tmClassification;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setTmImage(String tmImage) {
            this.tmImage = tmImage;
            return this;
        }
        public String getTmImage() {
            return this.tmImage;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

        public ListNotaryOrdersResponseBodyDataNotaryOrder setTmRegisterNo(String tmRegisterNo) {
            this.tmRegisterNo = tmRegisterNo;
            return this;
        }
        public String getTmRegisterNo() {
            return this.tmRegisterNo;
        }

    }

    public static class ListNotaryOrdersResponseBodyData extends TeaModel {
        @NameInMap("NotaryOrder")
        public java.util.List<ListNotaryOrdersResponseBodyDataNotaryOrder> notaryOrder;

        public static ListNotaryOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNotaryOrdersResponseBodyData self = new ListNotaryOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNotaryOrdersResponseBodyData setNotaryOrder(java.util.List<ListNotaryOrdersResponseBodyDataNotaryOrder> notaryOrder) {
            this.notaryOrder = notaryOrder;
            return this;
        }
        public java.util.List<ListNotaryOrdersResponseBodyDataNotaryOrder> getNotaryOrder() {
            return this.notaryOrder;
        }

    }

}
