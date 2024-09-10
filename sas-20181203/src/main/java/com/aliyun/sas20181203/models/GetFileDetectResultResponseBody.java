// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of file detection results.</p>
     */
    @NameInMap("ResultList")
    public java.util.List<GetFileDetectResultResponseBodyResultList> resultList;

    public static GetFileDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectResultResponseBody self = new GetFileDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileDetectResultResponseBody setResultList(java.util.List<GetFileDetectResultResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<GetFileDetectResultResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class GetFileDetectResultResponseBodyResultList extends TeaModel {
        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Whether to identify as a compressed package. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Compress")
        public Boolean compress;

        /**
         * <p>The extended information about the file detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HighLight&quot;:[[23245,23212]]}</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The identifier of the file. Only MD5 hash values are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0a212417e65c26ff133cfff28f6c****</p>
         */
        @NameInMap("HashKey")
        public String hashKey;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The file detection result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The file is normal.</li>
         * <li><strong>1</strong>: The file is suspicious.</li>
         * <li><strong>3</strong>: The detection is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Integer result;

        /**
         * <p>The score of file detection result.</p>
         * <blockquote>
         * <p>A higher score indicates a more suspicious file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The type of the virus. Valid values:</p>
         * <ul>
         * <li><strong>Trojan</strong>: trojan horse</li>
         * <li><strong>WebShell</strong>: webshell</li>
         * <li><strong>Backdoor</strong>: backdoor program</li>
         * <li><strong>RansomWare</strong>: ransomware</li>
         * <li><strong>Scanner</strong>: scanner</li>
         * <li><strong>Stealer</strong>: tool that is used to steal information</li>
         * <li><strong>Malbaseware</strong>: tainted basic software</li>
         * <li><strong>Hacktool</strong>: attacker tool</li>
         * <li><strong>Engtest</strong>: engine test program</li>
         * <li><strong>Downloader</strong>: trojan downloader</li>
         * <li><strong>Virus</strong>: infectious virus</li>
         * <li><strong>Miner</strong>: mining program</li>
         * <li><strong>Worm</strong>: worm</li>
         * <li><strong>DDoS</strong>: DDoS trojan</li>
         * <li><strong>Malware</strong>: malicious program</li>
         * <li><strong>RiskWare</strong>: software that has risks</li>
         * <li><strong>Proxytool</strong>: proxy</li>
         * <li><strong>Suspicious</strong>: suspicious program</li>
         * <li><strong>MalScript</strong>: malicious script</li>
         * <li><strong>Rootkit</strong>: rootkit</li>
         * <li><strong>Exploit</strong>: exploit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        @NameInMap("VirusType")
        public String virusType;

        public static GetFileDetectResultResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            GetFileDetectResultResponseBodyResultList self = new GetFileDetectResultResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public GetFileDetectResultResponseBodyResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetFileDetectResultResponseBodyResultList setCompress(Boolean compress) {
            this.compress = compress;
            return this;
        }
        public Boolean getCompress() {
            return this.compress;
        }

        public GetFileDetectResultResponseBodyResultList setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public GetFileDetectResultResponseBodyResultList setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

        public GetFileDetectResultResponseBodyResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetFileDetectResultResponseBodyResultList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public GetFileDetectResultResponseBodyResultList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetFileDetectResultResponseBodyResultList setVirusType(String virusType) {
            this.virusType = virusType;
            return this;
        }
        public String getVirusType() {
            return this.virusType;
        }

    }

}
