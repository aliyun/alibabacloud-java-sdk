// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentResponseBody extends TeaModel {
    @NameInMap("DnsContent")
    public DescribeVerifyContentResponseBodyDnsContent dnsContent;

    @NameInMap("FileContent")
    public DescribeVerifyContentResponseBodyFileContent fileContent;

    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("VerifyResult")
    public Boolean verifyResult;

    public static DescribeVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyContentResponseBody self = new DescribeVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyContentResponseBody setDnsContent(DescribeVerifyContentResponseBodyDnsContent dnsContent) {
        this.dnsContent = dnsContent;
        return this;
    }
    public DescribeVerifyContentResponseBodyDnsContent getDnsContent() {
        return this.dnsContent;
    }

    public DescribeVerifyContentResponseBody setFileContent(DescribeVerifyContentResponseBodyFileContent fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    public DescribeVerifyContentResponseBodyFileContent getFileContent() {
        return this.fileContent;
    }

    public DescribeVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyContentResponseBody setVerifyResult(Boolean verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public Boolean getVerifyResult() {
        return this.verifyResult;
    }

    public static class DescribeVerifyContentResponseBodyDnsContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>verification</p>
         */
        @NameInMap("RR")
        public String RR;

        /**
         * <strong>example:</strong>
         * <p>TXT</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>verify_0a246ca99d504ba087472d***</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVerifyContentResponseBodyDnsContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyContentResponseBodyDnsContent self = new DescribeVerifyContentResponseBodyDnsContent();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyContentResponseBodyDnsContent setRR(String RR) {
            this.RR = RR;
            return this;
        }
        public String getRR() {
            return this.RR;
        }

        public DescribeVerifyContentResponseBodyDnsContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVerifyContentResponseBodyDnsContent setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVerifyContentResponseBodyFileContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://oss.xxx.com//xxx.html">http://oss.xxx.com//xxx.html</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>xxx.html</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>aliyundemo.com</p>
         */
        @NameInMap("TopDomain")
        public String topDomain;

        /**
         * <strong>example:</strong>
         * <p>verify_0a246ca99d504ba08***</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.xxx.com//xxx.html">http://xxx.xxx.com//xxx.html</a></p>
         */
        @NameInMap("VerifyPath")
        public String verifyPath;

        public static DescribeVerifyContentResponseBodyFileContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyContentResponseBodyFileContent self = new DescribeVerifyContentResponseBodyFileContent();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyContentResponseBodyFileContent setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeVerifyContentResponseBodyFileContent setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeVerifyContentResponseBodyFileContent setTopDomain(String topDomain) {
            this.topDomain = topDomain;
            return this;
        }
        public String getTopDomain() {
            return this.topDomain;
        }

        public DescribeVerifyContentResponseBodyFileContent setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeVerifyContentResponseBodyFileContent setVerifyPath(String verifyPath) {
            this.verifyPath = verifyPath;
            return this;
        }
        public String getVerifyPath() {
            return this.verifyPath;
        }

    }

}
