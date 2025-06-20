// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeQueryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SafeChangeQueryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeChangeQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeQueryResponseBody self = new SafeChangeQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeChangeQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeChangeQueryResponseBody setData(SafeChangeQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SafeChangeQueryResponseBodyData getData() {
        return this.data;
    }

    public SafeChangeQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeChangeQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeChangeQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeChangeQueryResponseBodyDataChangeTimes extends TeaModel {
        @NameInMap("ChangeEndTime")
        public Long changeEndTime;

        @NameInMap("ChangeStartTime")
        public Long changeStartTime;

        public static SafeChangeQueryResponseBodyDataChangeTimes build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeQueryResponseBodyDataChangeTimes self = new SafeChangeQueryResponseBodyDataChangeTimes();
            return TeaModel.build(map, self);
        }

        public SafeChangeQueryResponseBodyDataChangeTimes setChangeEndTime(Long changeEndTime) {
            this.changeEndTime = changeEndTime;
            return this;
        }
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        public SafeChangeQueryResponseBodyDataChangeTimes setChangeStartTime(Long changeStartTime) {
            this.changeStartTime = changeStartTime;
            return this;
        }
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

    }

    public static class SafeChangeQueryResponseBodyData extends TeaModel {
        @NameInMap("ApproveResultUrl")
        public String approveResultUrl;

        @NameInMap("ApproveStatus")
        public String approveStatus;

        @NameInMap("ChangeCancel")
        public String changeCancel;

        @NameInMap("ChangeEndTime")
        public Long changeEndTime;

        @NameInMap("ChangeObject")
        public String changeObject;

        @NameInMap("ChangeOptType")
        public String changeOptType;

        @NameInMap("ChangeResult")
        public String changeResult;

        @NameInMap("ChangeStartTime")
        public Long changeStartTime;

        @NameInMap("ChangeStatus")
        public String changeStatus;

        @NameInMap("ChangeSystem")
        public String changeSystem;

        @NameInMap("ChangeTimes")
        public java.util.List<SafeChangeQueryResponseBodyDataChangeTimes> changeTimes;

        @NameInMap("ChangeTitle")
        public String changeTitle;

        @NameInMap("CheckResultUrl")
        public String checkResultUrl;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckholdReason")
        public java.util.List<String> checkholdReason;

        @NameInMap("ExecutorEmpId")
        public String executorEmpId;

        @NameInMap("ExecutorEmpName")
        public String executorEmpName;

        @NameInMap("SourceOrderId")
        public String sourceOrderId;

        public static SafeChangeQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeQueryResponseBodyData self = new SafeChangeQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeChangeQueryResponseBodyData setApproveResultUrl(String approveResultUrl) {
            this.approveResultUrl = approveResultUrl;
            return this;
        }
        public String getApproveResultUrl() {
            return this.approveResultUrl;
        }

        public SafeChangeQueryResponseBodyData setApproveStatus(String approveStatus) {
            this.approveStatus = approveStatus;
            return this;
        }
        public String getApproveStatus() {
            return this.approveStatus;
        }

        public SafeChangeQueryResponseBodyData setChangeCancel(String changeCancel) {
            this.changeCancel = changeCancel;
            return this;
        }
        public String getChangeCancel() {
            return this.changeCancel;
        }

        public SafeChangeQueryResponseBodyData setChangeEndTime(Long changeEndTime) {
            this.changeEndTime = changeEndTime;
            return this;
        }
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        public SafeChangeQueryResponseBodyData setChangeObject(String changeObject) {
            this.changeObject = changeObject;
            return this;
        }
        public String getChangeObject() {
            return this.changeObject;
        }

        public SafeChangeQueryResponseBodyData setChangeOptType(String changeOptType) {
            this.changeOptType = changeOptType;
            return this;
        }
        public String getChangeOptType() {
            return this.changeOptType;
        }

        public SafeChangeQueryResponseBodyData setChangeResult(String changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public String getChangeResult() {
            return this.changeResult;
        }

        public SafeChangeQueryResponseBodyData setChangeStartTime(Long changeStartTime) {
            this.changeStartTime = changeStartTime;
            return this;
        }
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

        public SafeChangeQueryResponseBodyData setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
            return this;
        }
        public String getChangeStatus() {
            return this.changeStatus;
        }

        public SafeChangeQueryResponseBodyData setChangeSystem(String changeSystem) {
            this.changeSystem = changeSystem;
            return this;
        }
        public String getChangeSystem() {
            return this.changeSystem;
        }

        public SafeChangeQueryResponseBodyData setChangeTimes(java.util.List<SafeChangeQueryResponseBodyDataChangeTimes> changeTimes) {
            this.changeTimes = changeTimes;
            return this;
        }
        public java.util.List<SafeChangeQueryResponseBodyDataChangeTimes> getChangeTimes() {
            return this.changeTimes;
        }

        public SafeChangeQueryResponseBodyData setChangeTitle(String changeTitle) {
            this.changeTitle = changeTitle;
            return this;
        }
        public String getChangeTitle() {
            return this.changeTitle;
        }

        public SafeChangeQueryResponseBodyData setCheckResultUrl(String checkResultUrl) {
            this.checkResultUrl = checkResultUrl;
            return this;
        }
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        public SafeChangeQueryResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public SafeChangeQueryResponseBodyData setCheckholdReason(java.util.List<String> checkholdReason) {
            this.checkholdReason = checkholdReason;
            return this;
        }
        public java.util.List<String> getCheckholdReason() {
            return this.checkholdReason;
        }

        public SafeChangeQueryResponseBodyData setExecutorEmpId(String executorEmpId) {
            this.executorEmpId = executorEmpId;
            return this;
        }
        public String getExecutorEmpId() {
            return this.executorEmpId;
        }

        public SafeChangeQueryResponseBodyData setExecutorEmpName(String executorEmpName) {
            this.executorEmpName = executorEmpName;
            return this;
        }
        public String getExecutorEmpName() {
            return this.executorEmpName;
        }

        public SafeChangeQueryResponseBodyData setSourceOrderId(String sourceOrderId) {
            this.sourceOrderId = sourceOrderId;
            return this;
        }
        public String getSourceOrderId() {
            return this.sourceOrderId;
        }

    }

}
