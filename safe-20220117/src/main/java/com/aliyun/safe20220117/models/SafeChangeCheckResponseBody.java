// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SafeChangeCheckResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeChangeCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeCheckResponseBody self = new SafeChangeCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeChangeCheckResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeChangeCheckResponseBody setData(SafeChangeCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SafeChangeCheckResponseBodyData getData() {
        return this.data;
    }

    public SafeChangeCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeChangeCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeChangeCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeChangeCheckResponseBodyDataRuleDetailUrlList extends TeaModel {
        @NameInMap("SceneEnum")
        public String sceneEnum;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static SafeChangeCheckResponseBodyDataRuleDetailUrlList build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckResponseBodyDataRuleDetailUrlList self = new SafeChangeCheckResponseBodyDataRuleDetailUrlList();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckResponseBodyDataRuleDetailUrlList setSceneEnum(String sceneEnum) {
            this.sceneEnum = sceneEnum;
            return this;
        }
        public String getSceneEnum() {
            return this.sceneEnum;
        }

        public SafeChangeCheckResponseBodyDataRuleDetailUrlList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SafeChangeCheckResponseBodyDataRuleDetailUrlList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SafeChangeCheckResponseBodyData extends TeaModel {
        @NameInMap("ApproveResultUrl")
        public String approveResultUrl;

        @NameInMap("BgCheckStatus")
        public String bgCheckStatus;

        @NameInMap("BgVid")
        public String bgVid;

        @NameInMap("CheckResultUrl")
        public String checkResultUrl;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckholdReason")
        public java.util.List<String> checkholdReason;

        @NameInMap("RuleDetailUrlList")
        public java.util.List<SafeChangeCheckResponseBodyDataRuleDetailUrlList> ruleDetailUrlList;

        @NameInMap("SourceOrderId")
        public String sourceOrderId;

        public static SafeChangeCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeCheckResponseBodyData self = new SafeChangeCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeChangeCheckResponseBodyData setApproveResultUrl(String approveResultUrl) {
            this.approveResultUrl = approveResultUrl;
            return this;
        }
        public String getApproveResultUrl() {
            return this.approveResultUrl;
        }

        public SafeChangeCheckResponseBodyData setBgCheckStatus(String bgCheckStatus) {
            this.bgCheckStatus = bgCheckStatus;
            return this;
        }
        public String getBgCheckStatus() {
            return this.bgCheckStatus;
        }

        public SafeChangeCheckResponseBodyData setBgVid(String bgVid) {
            this.bgVid = bgVid;
            return this;
        }
        public String getBgVid() {
            return this.bgVid;
        }

        public SafeChangeCheckResponseBodyData setCheckResultUrl(String checkResultUrl) {
            this.checkResultUrl = checkResultUrl;
            return this;
        }
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        public SafeChangeCheckResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public SafeChangeCheckResponseBodyData setCheckholdReason(java.util.List<String> checkholdReason) {
            this.checkholdReason = checkholdReason;
            return this;
        }
        public java.util.List<String> getCheckholdReason() {
            return this.checkholdReason;
        }

        public SafeChangeCheckResponseBodyData setRuleDetailUrlList(java.util.List<SafeChangeCheckResponseBodyDataRuleDetailUrlList> ruleDetailUrlList) {
            this.ruleDetailUrlList = ruleDetailUrlList;
            return this;
        }
        public java.util.List<SafeChangeCheckResponseBodyDataRuleDetailUrlList> getRuleDetailUrlList() {
            return this.ruleDetailUrlList;
        }

        public SafeChangeCheckResponseBodyData setSourceOrderId(String sourceOrderId) {
            this.sourceOrderId = sourceOrderId;
            return this;
        }
        public String getSourceOrderId() {
            return this.sourceOrderId;
        }

    }

}
