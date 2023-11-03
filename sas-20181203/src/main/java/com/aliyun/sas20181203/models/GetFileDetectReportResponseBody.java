// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFileDetectReportResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetFileDetectReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectReportResponseBody self = new GetFileDetectReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileDetectReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFileDetectReportResponseBody setData(GetFileDetectReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileDetectReportResponseBodyData getData() {
        return this.data;
    }

    public GetFileDetectReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFileDetectReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileDetectReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileDetectReportResponseBodyData extends TeaModel {
        @NameInMap("Basic")
        public String basic;

        @NameInMap("FileHash")
        public String fileHash;

        @NameInMap("Filename")
        public String filename;

        @NameInMap("HasData")
        public Boolean hasData;

        @NameInMap("Intelligences")
        public String intelligences;

        @NameInMap("Sandbox")
        public String sandbox;

        @NameInMap("ShowTab")
        public Boolean showTab;

        @NameInMap("ThreatLevel")
        public Long threatLevel;

        @NameInMap("ThreatTypes")
        public String threatTypes;

        public static GetFileDetectReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileDetectReportResponseBodyData self = new GetFileDetectReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileDetectReportResponseBodyData setBasic(String basic) {
            this.basic = basic;
            return this;
        }
        public String getBasic() {
            return this.basic;
        }

        public GetFileDetectReportResponseBodyData setFileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }
        public String getFileHash() {
            return this.fileHash;
        }

        public GetFileDetectReportResponseBodyData setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public GetFileDetectReportResponseBodyData setHasData(Boolean hasData) {
            this.hasData = hasData;
            return this;
        }
        public Boolean getHasData() {
            return this.hasData;
        }

        public GetFileDetectReportResponseBodyData setIntelligences(String intelligences) {
            this.intelligences = intelligences;
            return this;
        }
        public String getIntelligences() {
            return this.intelligences;
        }

        public GetFileDetectReportResponseBodyData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public GetFileDetectReportResponseBodyData setShowTab(Boolean showTab) {
            this.showTab = showTab;
            return this;
        }
        public Boolean getShowTab() {
            return this.showTab;
        }

        public GetFileDetectReportResponseBodyData setThreatLevel(Long threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public Long getThreatLevel() {
            return this.threatLevel;
        }

        public GetFileDetectReportResponseBodyData setThreatTypes(String threatTypes) {
            this.threatTypes = threatTypes;
            return this;
        }
        public String getThreatTypes() {
            return this.threatTypes;
        }

    }

}
