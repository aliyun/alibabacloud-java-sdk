// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectRuletargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public java.util.List<ListHasInspectRuletargetResponseBodyResultContent> resultContent;

    public static ListHasInspectRuletargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectRuletargetResponseBody self = new ListHasInspectRuletargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHasInspectRuletargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHasInspectRuletargetResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListHasInspectRuletargetResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListHasInspectRuletargetResponseBody setResultContent(java.util.List<ListHasInspectRuletargetResponseBodyResultContent> resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public java.util.List<ListHasInspectRuletargetResponseBodyResultContent> getResultContent() {
        return this.resultContent;
    }

    public static class ListHasInspectRuletargetResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("Group")
        public String group;

        public static ListHasInspectRuletargetResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListHasInspectRuletargetResponseBodyResultContent self = new ListHasInspectRuletargetResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListHasInspectRuletargetResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHasInspectRuletargetResponseBodyResultContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHasInspectRuletargetResponseBodyResultContent setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

}
