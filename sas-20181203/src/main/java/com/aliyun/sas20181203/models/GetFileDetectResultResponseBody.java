// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of file detection results.
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
        // The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
        @NameInMap("Code")
        public String code;

        // The extended information about the file detection result.
        @NameInMap("Ext")
        public String ext;

        // The identifier of the file. Only MD5 hash values are supported.
        @NameInMap("HashKey")
        public String hashKey;

        // The error message returned.
        @NameInMap("Message")
        public String message;

        // The file detection result. Valid values:
        // 
        // *   **0**: normal file.
        // *   **1**: suspicious file.
        // *   **3**: The detection is in progress.
        @NameInMap("Result")
        public Integer result;

        // The score of file detection result.
        // 
        // >  A higher score indicates a more suspicious file.
        @NameInMap("Score")
        public Integer score;

        // The type of virus. Valid values:
        // 
        // *   **Trojan**: self-mutating trojan
        // *   **WebShell**: webshell
        // *   **Backdoor**: backdoor program
        // *   **RansomWare**: ransomware
        // *   **Scanner**: scanner
        // *   **Stealer**: tool that is used to steal information
        // *   **Malbaseware**: tainted basic software
        // *   **Hacktool**: attacker tool
        // *   **Engtest**: engine test program
        // *   **Downloader**: trojan downloader
        // *   **Virus**: infectious virus
        // *   **Miner**: mining program
        // *   **Worm**: worm
        // *   **DDoS**: DDoS trojan
        // *   **Malware**: malicious program
        // *   **Backdoor**: reverse shell
        // *   **RiskWare**: software that has risks
        // *   **Proxytool**: proxy
        // *   **Suspicious**: suspicious program
        // *   **MalScript**: malicious script
        // *   **Rootkit**: rootkit
        // *   **Exploit**: exploit
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
