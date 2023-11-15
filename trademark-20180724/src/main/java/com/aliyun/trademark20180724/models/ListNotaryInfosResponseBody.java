// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListNotaryInfosResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public ListNotaryInfosResponseBodyData data;

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

    public static ListNotaryInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotaryInfosResponseBody self = new ListNotaryInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotaryInfosResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListNotaryInfosResponseBody setData(ListNotaryInfosResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNotaryInfosResponseBodyData getData() {
        return this.data;
    }

    public ListNotaryInfosResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNotaryInfosResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListNotaryInfosResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public ListNotaryInfosResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNotaryInfosResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public ListNotaryInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNotaryInfosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNotaryInfosResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListNotaryInfosResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListNotaryInfosResponseBodyDataNotaryInfo extends TeaModel {
        @NameInMap("BizOrderNo")
        public String bizOrderNo;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("NotaryFailedReason")
        public String notaryFailedReason;

        @NameInMap("NotaryStatus")
        public Integer notaryStatus;

        @NameInMap("TmClassification")
        public String tmClassification;

        @NameInMap("TmRegisterNo")
        public String tmRegisterNo;

        /**
         * <p>token</p>
         */
        @NameInMap("Token")
        public String token;

        public static ListNotaryInfosResponseBodyDataNotaryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNotaryInfosResponseBodyDataNotaryInfo self = new ListNotaryInfosResponseBodyDataNotaryInfo();
            return TeaModel.build(map, self);
        }

        public ListNotaryInfosResponseBodyDataNotaryInfo setBizOrderNo(String bizOrderNo) {
            this.bizOrderNo = bizOrderNo;
            return this;
        }
        public String getBizOrderNo() {
            return this.bizOrderNo;
        }

        public ListNotaryInfosResponseBodyDataNotaryInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListNotaryInfosResponseBodyDataNotaryInfo setNotaryFailedReason(String notaryFailedReason) {
            this.notaryFailedReason = notaryFailedReason;
            return this;
        }
        public String getNotaryFailedReason() {
            return this.notaryFailedReason;
        }

        public ListNotaryInfosResponseBodyDataNotaryInfo setNotaryStatus(Integer notaryStatus) {
            this.notaryStatus = notaryStatus;
            return this;
        }
        public Integer getNotaryStatus() {
            return this.notaryStatus;
        }

        public ListNotaryInfosResponseBodyDataNotaryInfo setTmClassification(String tmClassification) {
            this.tmClassification = tmClassification;
            return this;
        }
        public String getTmClassification() {
            return this.tmClassification;
        }

        public ListNotaryInfosResponseBodyDataNotaryInfo setTmRegisterNo(String tmRegisterNo) {
            this.tmRegisterNo = tmRegisterNo;
            return this;
        }
        public String getTmRegisterNo() {
            return this.tmRegisterNo;
        }

        public ListNotaryInfosResponseBodyDataNotaryInfo setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class ListNotaryInfosResponseBodyData extends TeaModel {
        @NameInMap("NotaryInfo")
        public java.util.List<ListNotaryInfosResponseBodyDataNotaryInfo> notaryInfo;

        public static ListNotaryInfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNotaryInfosResponseBodyData self = new ListNotaryInfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNotaryInfosResponseBodyData setNotaryInfo(java.util.List<ListNotaryInfosResponseBodyDataNotaryInfo> notaryInfo) {
            this.notaryInfo = notaryInfo;
            return this;
        }
        public java.util.List<ListNotaryInfosResponseBodyDataNotaryInfo> getNotaryInfo() {
            return this.notaryInfo;
        }

    }

}
