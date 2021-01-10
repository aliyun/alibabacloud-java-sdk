// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportHasInspectRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ExportHasInspectRuleResponseBodyResultContent resultContent;

    public static ExportHasInspectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportHasInspectRuleResponseBody self = new ExportHasInspectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportHasInspectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportHasInspectRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportHasInspectRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExportHasInspectRuleResponseBody setResultContent(ExportHasInspectRuleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExportHasInspectRuleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExportHasInspectRuleResponseBodyResultContentSignContent extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Version")
        public String version;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ExportTime")
        public String exportTime;

        public static ExportHasInspectRuleResponseBodyResultContentSignContent build(java.util.Map<String, ?> map) throws Exception {
            ExportHasInspectRuleResponseBodyResultContentSignContent self = new ExportHasInspectRuleResponseBodyResultContentSignContent();
            return TeaModel.build(map, self);
        }

        public ExportHasInspectRuleResponseBodyResultContentSignContent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExportHasInspectRuleResponseBodyResultContentSignContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExportHasInspectRuleResponseBodyResultContentSignContent setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportHasInspectRuleResponseBodyResultContentSignContent setExportTime(String exportTime) {
            this.exportTime = exportTime;
            return this;
        }
        public String getExportTime() {
            return this.exportTime;
        }

    }

    public static class ExportHasInspectRuleResponseBodyResultContent extends TeaModel {
        @NameInMap("Sign")
        public String sign;

        @NameInMap("Sha256Sign")
        public String sha256Sign;

        @NameInMap("SignContent")
        public ExportHasInspectRuleResponseBodyResultContentSignContent signContent;

        public static ExportHasInspectRuleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExportHasInspectRuleResponseBodyResultContent self = new ExportHasInspectRuleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExportHasInspectRuleResponseBodyResultContent setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ExportHasInspectRuleResponseBodyResultContent setSha256Sign(String sha256Sign) {
            this.sha256Sign = sha256Sign;
            return this;
        }
        public String getSha256Sign() {
            return this.sha256Sign;
        }

        public ExportHasInspectRuleResponseBodyResultContent setSignContent(ExportHasInspectRuleResponseBodyResultContentSignContent signContent) {
            this.signContent = signContent;
            return this;
        }
        public ExportHasInspectRuleResponseBodyResultContentSignContent getSignContent() {
            return this.signContent;
        }

    }

}
