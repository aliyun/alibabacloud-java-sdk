// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Compress")
        public Boolean compress;

        /**
         * <p>The extended information about the file detection result.</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The identifier of the file. Only MD5 hash values are supported.</p>
         */
        @NameInMap("HashKey")
        public String hashKey;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The file detection result. Valid values:</p>
         * <br>
         * <p>*   **0**: The file is normal.</p>
         * <p>*   **1**: The file is suspicious.</p>
         * <p>*   **3**: The detection is in progress.</p>
         */
        @NameInMap("Result")
        public Integer result;

        /**
         * <p>The score of file detection result.</p>
         * <br>
         * <p>> A higher score indicates a more suspicious file.</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The type of the virus. Valid values:</p>
         * <br>
         * <p>*   **Trojan**: self-mutating trojan</p>
         * <p>*   **WebShell**: webshell</p>
         * <p>*   **Backdoor**: backdoor program</p>
         * <p>*   **RansomWare**: ransomware</p>
         * <p>*   **Scanner**: scanner</p>
         * <p>*   **Stealer**: tool that is used to steal information</p>
         * <p>*   **Malbaseware**: tainted basic software</p>
         * <p>*   **Hacktool**: attacker tool</p>
         * <p>*   **Engtest**: engine test program</p>
         * <p>*   **Downloader**: trojan downloader</p>
         * <p>*   **Virus**: infectious virus</p>
         * <p>*   **Miner**: mining program</p>
         * <p>*   **Worm**: worm</p>
         * <p>*   **DDoS**: DDoS trojan</p>
         * <p>*   **Malware**: malicious program</p>
         * <p>*   **Backdoor**: reverse shell</p>
         * <p>*   **RiskWare**: software that has risks</p>
         * <p>*   **Proxytool**: proxy</p>
         * <p>*   **Suspicious**: suspicious program</p>
         * <p>*   **MalScript**: malicious script</p>
         * <p>*   **Rootkit**: rootkit</p>
         * <p>*   **Exploit**: exploit</p>
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
