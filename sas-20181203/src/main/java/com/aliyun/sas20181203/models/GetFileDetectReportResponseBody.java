// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectReportResponseBody extends TeaModel {
    /**
     * <p>The status code that is returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetFileDetectReportResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
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
         * <p>The basic information about the detected file.</p>
         * 
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
         * <p>The hash value of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>c42b5f6bde0b730ece2923266333****</p>
         */
        @NameInMap("FileHash")
        public String fileHash;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.zip</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <p>Indicates whether the file data exists in the cloud sandbox. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasData")
        public Boolean hasData;

        /**
         * <p>The threat intelligence event, which is a JSON array.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>The threat type. The value is an array. The elements in the array can be DDoS trojans, mining programs, network layer intrusions, network service scans, network sharing and discovery, mining pools, exploits, dark webs, malicious logons, malicious download sources, C\&amp;C servers, webshells, and web attacks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;The threat type&quot;]</p>
         */
        @NameInMap("Intelligences")
        public String intelligences;

        /**
         * <p>The details of the cloud sandbox check results.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;BehaviorData\&quot;: {}, \&quot;ProcessData\&quot;: {}, \&quot;SandboxData\&quot;: {}, \&quot;AttackData\&quot;: [], \&quot;NetworkData\&quot;: {}, \&quot;SolutionData\&quot;: {}, \&quot;FileData\&quot;: {}}</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        /**
         * <p>Indicates whether the check report is displayed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowTab")
        public Boolean showTab;

        /**
         * <p>The threat level. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: normal</li>
         * <li><strong>1</strong>: suspicious</li>
         * <li><strong>2</strong>: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreatLevel")
        public Long threatLevel;

        /**
         * <p>The risk tags and server tags that are generated by analyzing threat intelligence and security events. The value is a string array. The array includes the following elements:</p>
         * <ul>
         * <li><strong>threat_type_desc</strong>: the threat type.</li>
         * <li><strong>last_find_time</strong>: the last time the threat was detected.</li>
         * <li><strong>risk_type</strong>: indicates whether the tag is malicious. The value 0 indicates that the tag is not malicious. The value 1 indicates that the tag is malicious. The value -1 indicates that whether the tag type is malicious is unknown.</li>
         * <li><strong>threat_type</strong>: the threat type. The value is an array. The elements in the array can be network layer intrusion, network service scanning, network sharing and discovery, mining pool, exploits, darknet, malicious logon, malicious download source, central control, web shell, and web attack.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;threat_type_desc&quot;: &quot;test&quot;,&quot;risk_type&quot;: 1,&quot;threat_type&quot;: &quot;&quot;}]</p>
         */
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
