// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class ChangeCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ChangeCheckResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckResponseBody self = new ChangeCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeCheckResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ChangeCheckResponseBody setData(ChangeCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeCheckResponseBodyData getData() {
        return this.data;
    }

    public ChangeCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeCheckResponseBodyDataRuleDetailUrlList extends TeaModel {
        @NameInMap("SceneEnum")
        public String sceneEnum;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static ChangeCheckResponseBodyDataRuleDetailUrlList build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckResponseBodyDataRuleDetailUrlList self = new ChangeCheckResponseBodyDataRuleDetailUrlList();
            return TeaModel.build(map, self);
        }

        public ChangeCheckResponseBodyDataRuleDetailUrlList setSceneEnum(String sceneEnum) {
            this.sceneEnum = sceneEnum;
            return this;
        }
        public String getSceneEnum() {
            return this.sceneEnum;
        }

        public ChangeCheckResponseBodyDataRuleDetailUrlList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ChangeCheckResponseBodyDataRuleDetailUrlList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ChangeCheckResponseBodyData extends TeaModel {
        @NameInMap("ApproveResultUrl")
        public String approveResultUrl;

        @NameInMap("BgCheckStatus")
        public String bgCheckStatus;

        @NameInMap("BgVid")
        public String bgVid;

        @NameInMap("ChangeStatus")
        public String changeStatus;

        @NameInMap("CheckResultUrl")
        public String checkResultUrl;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckholdReason")
        public java.util.List<String> checkholdReason;

        @NameInMap("RuleDetailUrlList")
        public java.util.List<ChangeCheckResponseBodyDataRuleDetailUrlList> ruleDetailUrlList;

        @NameInMap("SourceOrderId")
        public String sourceOrderId;

        public static ChangeCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckResponseBodyData self = new ChangeCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeCheckResponseBodyData setApproveResultUrl(String approveResultUrl) {
            this.approveResultUrl = approveResultUrl;
            return this;
        }
        public String getApproveResultUrl() {
            return this.approveResultUrl;
        }

        public ChangeCheckResponseBodyData setBgCheckStatus(String bgCheckStatus) {
            this.bgCheckStatus = bgCheckStatus;
            return this;
        }
        public String getBgCheckStatus() {
            return this.bgCheckStatus;
        }

        public ChangeCheckResponseBodyData setBgVid(String bgVid) {
            this.bgVid = bgVid;
            return this;
        }
        public String getBgVid() {
            return this.bgVid;
        }

        public ChangeCheckResponseBodyData setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
            return this;
        }
        public String getChangeStatus() {
            return this.changeStatus;
        }

        public ChangeCheckResponseBodyData setCheckResultUrl(String checkResultUrl) {
            this.checkResultUrl = checkResultUrl;
            return this;
        }
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        public ChangeCheckResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public ChangeCheckResponseBodyData setCheckholdReason(java.util.List<String> checkholdReason) {
            this.checkholdReason = checkholdReason;
            return this;
        }
        public java.util.List<String> getCheckholdReason() {
            return this.checkholdReason;
        }

        public ChangeCheckResponseBodyData setRuleDetailUrlList(java.util.List<ChangeCheckResponseBodyDataRuleDetailUrlList> ruleDetailUrlList) {
            this.ruleDetailUrlList = ruleDetailUrlList;
            return this;
        }
        public java.util.List<ChangeCheckResponseBodyDataRuleDetailUrlList> getRuleDetailUrlList() {
            return this.ruleDetailUrlList;
        }

        public ChangeCheckResponseBodyData setSourceOrderId(String sourceOrderId) {
            this.sourceOrderId = sourceOrderId;
            return this;
        }
        public String getSourceOrderId() {
            return this.sourceOrderId;
        }

    }

}
