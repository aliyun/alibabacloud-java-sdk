// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class GetFileDetectReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFileDetectReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAC546A5-5EDC-5939-86A3-56DFAF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{
         *         &quot;sha256&quot;: &quot;&quot;,
         *         &quot;sha512&quot;: &quot;&quot;,
         *         &quot;source&quot;: &quot;aegis&quot;,
         *         &quot;gmt_first_submit&quot;: &quot;&quot;,
         *         &quot;sha1&quot;: &quot;&quot;,
         *         &quot;virus_result&quot;: &quot;&quot;,
         *         &quot;webshell_result&quot;: &quot;&quot;,
         *         &quot;gmt_update&quot;: &quot;&quot;,
         *         &quot;sandbox_result&quot;: &quot;2&quot;,
         *         &quot;fileSize&quot;: &quot;363752&quot;,
         *         &quot;virus_name&quot;: &quot;&quot;,
         *     }</p>
         */
        @NameInMap("Basic")
        public String basic;

        /**
         * <strong>example:</strong>
         * <p>4206dbcf1c2bc80ea95ad64043******</p>
         */
        @NameInMap("FileHash")
        public String fileHash;

        /**
         * <strong>example:</strong>
         * <p>testFile******</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasData")
        public Boolean hasData;

        @NameInMap("Intelligences")
        public String intelligences;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;BehaviorData\&quot;: {}, \&quot;ProcessData\&quot;: {}, \&quot;SandboxData\&quot;: {}, \&quot;AttackData\&quot;: [], \&quot;NetworkData\&quot;: {}, \&quot;SolutionData\&quot;: {}, \&quot;FileData\&quot;: {}}</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowTab")
        public Boolean showTab;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
