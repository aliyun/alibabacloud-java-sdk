// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public java.util.List<ListDTXAppsResponseBodyData> data;

    public static ListDTXAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDTXAppsResponseBody self = new ListDTXAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDTXAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDTXAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDTXAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDTXAppsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListDTXAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDTXAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDTXAppsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListDTXAppsResponseBody setData(java.util.List<ListDTXAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDTXAppsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListDTXAppsResponseBodyData extends TeaModel {
        @NameInMap("ActionMode")
        public Long actionMode;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ExceptionTotal")
        public Long exceptionTotal;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("TodayTotal")
        public Long todayTotal;

        @NameInMap("Initiator")
        public java.util.List<String> initiator;

        @NameInMap("Participator")
        public java.util.List<String> participator;

        public static ListDTXAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDTXAppsResponseBodyData self = new ListDTXAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDTXAppsResponseBodyData setActionMode(Long actionMode) {
            this.actionMode = actionMode;
            return this;
        }
        public Long getActionMode() {
            return this.actionMode;
        }

        public ListDTXAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDTXAppsResponseBodyData setExceptionTotal(Long exceptionTotal) {
            this.exceptionTotal = exceptionTotal;
            return this;
        }
        public Long getExceptionTotal() {
            return this.exceptionTotal;
        }

        public ListDTXAppsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDTXAppsResponseBodyData setTodayTotal(Long todayTotal) {
            this.todayTotal = todayTotal;
            return this;
        }
        public Long getTodayTotal() {
            return this.todayTotal;
        }

        public ListDTXAppsResponseBodyData setInitiator(java.util.List<String> initiator) {
            this.initiator = initiator;
            return this;
        }
        public java.util.List<String> getInitiator() {
            return this.initiator;
        }

        public ListDTXAppsResponseBodyData setParticipator(java.util.List<String> participator) {
            this.participator = participator;
            return this;
        }
        public java.util.List<String> getParticipator() {
            return this.participator;
        }

    }

}
