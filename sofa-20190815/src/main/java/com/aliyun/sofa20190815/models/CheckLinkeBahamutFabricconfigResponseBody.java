// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutFabricconfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public CheckLinkeBahamutFabricconfigResponseBodyResult result;

    public static CheckLinkeBahamutFabricconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutFabricconfigResponseBody self = new CheckLinkeBahamutFabricconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutFabricconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutFabricconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutFabricconfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutFabricconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutFabricconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutFabricconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutFabricconfigResponseBody setResult(CheckLinkeBahamutFabricconfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckLinkeBahamutFabricconfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutFabricconfigResponseBodyResultCheckList extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("ForceStop")
        public Boolean forceStop;

        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("DetailMessage")
        public String detailMessage;

        @NameInMap("CheckItem")
        public String checkItem;

        public static CheckLinkeBahamutFabricconfigResponseBodyResultCheckList build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutFabricconfigResponseBodyResultCheckList self = new CheckLinkeBahamutFabricconfigResponseBodyResultCheckList();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResultCheckList setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResultCheckList setForceStop(Boolean forceStop) {
            this.forceStop = forceStop;
            return this;
        }
        public Boolean getForceStop() {
            return this.forceStop;
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResultCheckList setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResultCheckList setDetailMessage(String detailMessage) {
            this.detailMessage = detailMessage;
            return this;
        }
        public String getDetailMessage() {
            return this.detailMessage;
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResultCheckList setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

    }

    public static class CheckLinkeBahamutFabricconfigResponseBodyResult extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("ForceStop")
        public Boolean forceStop;

        @NameInMap("CheckList")
        public java.util.List<CheckLinkeBahamutFabricconfigResponseBodyResultCheckList> checkList;

        @NameInMap("DetailMessage")
        public String detailMessage;

        public static CheckLinkeBahamutFabricconfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutFabricconfigResponseBodyResult self = new CheckLinkeBahamutFabricconfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResult setForceStop(Boolean forceStop) {
            this.forceStop = forceStop;
            return this;
        }
        public Boolean getForceStop() {
            return this.forceStop;
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResult setCheckList(java.util.List<CheckLinkeBahamutFabricconfigResponseBodyResultCheckList> checkList) {
            this.checkList = checkList;
            return this;
        }
        public java.util.List<CheckLinkeBahamutFabricconfigResponseBodyResultCheckList> getCheckList() {
            return this.checkList;
        }

        public CheckLinkeBahamutFabricconfigResponseBodyResult setDetailMessage(String detailMessage) {
            this.detailMessage = detailMessage;
            return this;
        }
        public String getDetailMessage() {
            return this.detailMessage;
        }

    }

}
