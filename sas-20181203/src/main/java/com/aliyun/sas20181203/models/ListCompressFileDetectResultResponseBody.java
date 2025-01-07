// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCompressFileDetectResultResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCompressFileDetectResultResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detection results of files.</p>
     */
    @NameInMap("ResultList")
    public java.util.List<ListCompressFileDetectResultResponseBodyResultList> resultList;

    public static ListCompressFileDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCompressFileDetectResultResponseBody self = new ListCompressFileDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCompressFileDetectResultResponseBody setPageInfo(ListCompressFileDetectResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCompressFileDetectResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCompressFileDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCompressFileDetectResultResponseBody setResultList(java.util.List<ListCompressFileDetectResultResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<ListCompressFileDetectResultResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class ListCompressFileDetectResultResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCompressFileDetectResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCompressFileDetectResultResponseBodyPageInfo self = new ListCompressFileDetectResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCompressFileDetectResultResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCompressFileDetectResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCompressFileDetectResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListCompressFileDetectResultResponseBodyResultList extends TeaModel {
        /**
         * <p>The extended information about the file detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;HighLight&quot;:
         *     [
         *         [
         *             23245,
         *             23212
         *         ]
         *     ],
         *     &quot;FileLabel&quot;:
         *     [
         *         &quot;PE32&quot;,
         *         &quot;Zip&quot;,
         *         &quot;SFX&quot;,
         *         &quot;encrypted&quot;
         *     ]
         * }</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The identifier of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>0a212417e65c26ff133cfff28f6c****</p>
         */
        @NameInMap("HashKey")
        public String hashKey;

        /**
         * <p>The path to the file within the package.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/1.zip/test****</p>
         */
        @NameInMap("Path")
        public String path;

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
         * <p>The score of the file detection result. The following list describes mappings between the score ranges and risk levels:</p>
         * <ul>
         * <li>0 to 60: normal</li>
         * <li>61 to 70: risky</li>
         * <li>71 to 80: suspicious</li>
         * <li>81 to 100: malicious</li>
         * </ul>
         * <blockquote>
         * <p> A higher score indicates a more suspicious file.</p>
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
         * <li><strong>Trojan</strong>: self-mutating trojan</li>
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
         * <li><strong>Backdoor</strong>: reverse shell</li>
         * <li><strong>RiskWare</strong>: software that has risks</li>
         * <li><strong>Proxytool</strong>: proxy</li>
         * <li><strong>Suspicious</strong>: suspicious program</li>
         * <li><strong>MalScript</strong>: malicious script</li>
         * <li><strong>Rootkit</strong>: rootkit</li>
         * <li><strong>Exploit</strong>: exploit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        @NameInMap("VirusType")
        public String virusType;

        public static ListCompressFileDetectResultResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            ListCompressFileDetectResultResponseBodyResultList self = new ListCompressFileDetectResultResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public ListCompressFileDetectResultResponseBodyResultList setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListCompressFileDetectResultResponseBodyResultList setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

        public ListCompressFileDetectResultResponseBodyResultList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListCompressFileDetectResultResponseBodyResultList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public ListCompressFileDetectResultResponseBodyResultList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ListCompressFileDetectResultResponseBodyResultList setVirusType(String virusType) {
            this.virusType = virusType;
            return this;
        }
        public String getVirusType() {
            return this.virusType;
        }

    }

}
