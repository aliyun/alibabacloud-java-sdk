// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponseBody extends TeaModel {
    // An array that consists of the details about the vulnerability.
    @NameInMap("Cves")
    public java.util.List<DescribeVulDetailsResponseBodyCves> cves;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVulDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsResponseBody self = new DescribeVulDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsResponseBody setCves(java.util.List<DescribeVulDetailsResponseBodyCves> cves) {
        this.cves = cves;
        return this;
    }
    public java.util.List<DescribeVulDetailsResponseBodyCves> getCves() {
        return this.cves;
    }

    public DescribeVulDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVulDetailsResponseBodyCvesClassifys extends TeaModel {
        // The type of the vulnerability.
        @NameInMap("Classify")
        public String classify;

        // The URL of the demo video for the vulnerability.
        @NameInMap("DemoVideoUrl")
        public String demoVideoUrl;

        // The description of the vulnerability type.
        @NameInMap("Description")
        public String description;

        public static DescribeVulDetailsResponseBodyCvesClassifys build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDetailsResponseBodyCvesClassifys self = new DescribeVulDetailsResponseBodyCvesClassifys();
            return TeaModel.build(map, self);
        }

        public DescribeVulDetailsResponseBodyCvesClassifys setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public DescribeVulDetailsResponseBodyCvesClassifys setDemoVideoUrl(String demoVideoUrl) {
            this.demoVideoUrl = demoVideoUrl;
            return this;
        }
        public String getDemoVideoUrl() {
            return this.demoVideoUrl;
        }

        public DescribeVulDetailsResponseBodyCvesClassifys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeVulDetailsResponseBodyCves extends TeaModel {
        // The type of the vulnerability.
        @NameInMap("Classify")
        public String classify;

        // An array that consists of vulnerability types.
        @NameInMap("Classifys")
        public java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> classifys;

        // The China National Vulnerability Database (CNVD) ID.
        @NameInMap("CnvdId")
        public String cnvdId;

        // The difficulty level of exploiting the vulnerability. Valid values:
        // 
        // *   **LOW**
        // *   **MEDIUM**
        // *   **HIGH**
        @NameInMap("Complexity")
        public String complexity;

        // The CVE content.
        @NameInMap("Content")
        public String content;

        // The Common Vulnerabilities and Exposures (CVE) ID.
        @NameInMap("CveId")
        public String cveId;

        // The Common Vulnerability Scoring System (CVSS) score of the vulnerability in the Alibaba Cloud vulnerability library.
        @NameInMap("CvssScore")
        public String cvssScore;

        // The vector that is used to calculate the CVSS score.
        @NameInMap("CvssVector")
        public String cvssVector;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        // The POC content.
        @NameInMap("Poc")
        public String poc;

        // The timestamp when the proof of concept (POC) was created. Unit: milliseconds.
        @NameInMap("PocCreateTime")
        public Long pocCreateTime;

        // The timestamp when the POC was disclosed. Unit: milliseconds.
        @NameInMap("PocDisclosureTime")
        public Long pocDisclosureTime;

        // The service that is affected by the vulnerability.
        @NameInMap("Product")
        public String product;

        // The reference of the vulnerability in the Alibaba Cloud vulnerability library. The value is a URL.
        @NameInMap("Reference")
        public String reference;

        // The disclosure time that is displayed for the vulnerability in the Alibaba Cloud vulnerability library. The value is a UNIX timestamp. Unit: milliseconds.
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        // The fixing suggestions of the vulnerability.
        @NameInMap("Solution")
        public String solution;

        // The introduction to the vulnerability.
        @NameInMap("Summary")
        public String summary;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        // The title of the vulnerability announcement.
        @NameInMap("Title")
        public String title;

        // The vendor that disclosed the vulnerability.
        @NameInMap("Vendor")
        public String vendor;

        // The severity of the vulnerability. Valid values:
        // 
        // *   **serious**
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("VulLevel")
        public String vulLevel;

        public static DescribeVulDetailsResponseBodyCves build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDetailsResponseBodyCves self = new DescribeVulDetailsResponseBodyCves();
            return TeaModel.build(map, self);
        }

        public DescribeVulDetailsResponseBodyCves setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public DescribeVulDetailsResponseBodyCves setClassifys(java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> classifys) {
            this.classifys = classifys;
            return this;
        }
        public java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> getClassifys() {
            return this.classifys;
        }

        public DescribeVulDetailsResponseBodyCves setCnvdId(String cnvdId) {
            this.cnvdId = cnvdId;
            return this;
        }
        public String getCnvdId() {
            return this.cnvdId;
        }

        public DescribeVulDetailsResponseBodyCves setComplexity(String complexity) {
            this.complexity = complexity;
            return this;
        }
        public String getComplexity() {
            return this.complexity;
        }

        public DescribeVulDetailsResponseBodyCves setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeVulDetailsResponseBodyCves setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulDetailsResponseBodyCves setCvssScore(String cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }
        public String getCvssScore() {
            return this.cvssScore;
        }

        public DescribeVulDetailsResponseBodyCves setCvssVector(String cvssVector) {
            this.cvssVector = cvssVector;
            return this;
        }
        public String getCvssVector() {
            return this.cvssVector;
        }

        public DescribeVulDetailsResponseBodyCves setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeVulDetailsResponseBodyCves setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVulDetailsResponseBodyCves setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeVulDetailsResponseBodyCves setPoc(String poc) {
            this.poc = poc;
            return this;
        }
        public String getPoc() {
            return this.poc;
        }

        public DescribeVulDetailsResponseBodyCves setPocCreateTime(Long pocCreateTime) {
            this.pocCreateTime = pocCreateTime;
            return this;
        }
        public Long getPocCreateTime() {
            return this.pocCreateTime;
        }

        public DescribeVulDetailsResponseBodyCves setPocDisclosureTime(Long pocDisclosureTime) {
            this.pocDisclosureTime = pocDisclosureTime;
            return this;
        }
        public Long getPocDisclosureTime() {
            return this.pocDisclosureTime;
        }

        public DescribeVulDetailsResponseBodyCves setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeVulDetailsResponseBodyCves setReference(String reference) {
            this.reference = reference;
            return this;
        }
        public String getReference() {
            return this.reference;
        }

        public DescribeVulDetailsResponseBodyCves setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeVulDetailsResponseBodyCves setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeVulDetailsResponseBodyCves setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeVulDetailsResponseBodyCves setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public DescribeVulDetailsResponseBodyCves setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeVulDetailsResponseBodyCves setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeVulDetailsResponseBodyCves setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeVulDetailsResponseBodyCves setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

}
