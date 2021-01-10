// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportHasInspectPluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public ExportHasInspectPluginResponseBodyResultContent resultContent;

    public static ExportHasInspectPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportHasInspectPluginResponseBody self = new ExportHasInspectPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportHasInspectPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportHasInspectPluginResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportHasInspectPluginResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExportHasInspectPluginResponseBody setResultContent(ExportHasInspectPluginResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ExportHasInspectPluginResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class ExportHasInspectPluginResponseBodyResultContentSignContent extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Version")
        public String version;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ExportTime")
        public String exportTime;

        public static ExportHasInspectPluginResponseBodyResultContentSignContent build(java.util.Map<String, ?> map) throws Exception {
            ExportHasInspectPluginResponseBodyResultContentSignContent self = new ExportHasInspectPluginResponseBodyResultContentSignContent();
            return TeaModel.build(map, self);
        }

        public ExportHasInspectPluginResponseBodyResultContentSignContent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExportHasInspectPluginResponseBodyResultContentSignContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ExportHasInspectPluginResponseBodyResultContentSignContent setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportHasInspectPluginResponseBodyResultContentSignContent setExportTime(String exportTime) {
            this.exportTime = exportTime;
            return this;
        }
        public String getExportTime() {
            return this.exportTime;
        }

    }

    public static class ExportHasInspectPluginResponseBodyResultContent extends TeaModel {
        @NameInMap("Sign")
        public String sign;

        @NameInMap("Sha256Sign")
        public String sha256Sign;

        @NameInMap("SignContent")
        public ExportHasInspectPluginResponseBodyResultContentSignContent signContent;

        public static ExportHasInspectPluginResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ExportHasInspectPluginResponseBodyResultContent self = new ExportHasInspectPluginResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ExportHasInspectPluginResponseBodyResultContent setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ExportHasInspectPluginResponseBodyResultContent setSha256Sign(String sha256Sign) {
            this.sha256Sign = sha256Sign;
            return this;
        }
        public String getSha256Sign() {
            return this.sha256Sign;
        }

        public ExportHasInspectPluginResponseBodyResultContent setSignContent(ExportHasInspectPluginResponseBodyResultContentSignContent signContent) {
            this.signContent = signContent;
            return this;
        }
        public ExportHasInspectPluginResponseBodyResultContentSignContent getSignContent() {
            return this.signContent;
        }

    }

}
