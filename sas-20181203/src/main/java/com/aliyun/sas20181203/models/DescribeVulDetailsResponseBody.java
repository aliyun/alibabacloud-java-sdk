// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponseBody extends TeaModel {
    /**
     * <p>The details of the vulnerability.</p>
     */
    @NameInMap("Cves")
    public java.util.List<DescribeVulDetailsResponseBodyCves> cves;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The type of the vulnerability.</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The URL of the demo video for the vulnerability.</p>
         */
        @NameInMap("DemoVideoUrl")
        public String demoVideoUrl;

        /**
         * <p>The description of the vulnerability type.</p>
         */
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
        /**
         * <p>The type of the vulnerability.</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The vulnerability types.</p>
         */
        @NameInMap("Classifys")
        public java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> classifys;

        /**
         * <p>The China National Vulnerability Database (CNVD) ID.</p>
         */
        @NameInMap("CnvdId")
        public String cnvdId;

        /**
         * <p>The difficulty level of exploiting the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **LOW**</p>
         * <p>*   **MEDIUM**</p>
         * <p>*   **HIGH**</p>
         */
        @NameInMap("Complexity")
        public String complexity;

        /**
         * <p>The CVE content.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) ID.</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The link to the CVE details.</p>
         */
        @NameInMap("CveLink")
        public String cveLink;

        /**
         * <p>The Common Vulnerability Scoring System (CVSS) score of the vulnerability in the Alibaba Cloud vulnerability library.</p>
         */
        @NameInMap("CvssScore")
        public String cvssScore;

        /**
         * <p>The vector that is used to calculate the CVSS score.</p>
         */
        @NameInMap("CvssVector")
        public String cvssVector;

        /**
         * <p>The name of the instance.</p>
         * <br>
         * <p>>  This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instance that is affected by the vulnerability.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * <br>
         * <p>>  This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instance that is affected by the vulnerability.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * <br>
         * <p>>  This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instance that is affected by the vulnerability.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the vulnerability.</p>
         */
        @NameInMap("OtherId")
        public String otherId;

        /**
         * <p>The POC content.</p>
         */
        @NameInMap("Poc")
        public String poc;

        /**
         * <p>The UNIX timestamp when the proof of concept (POC) was created. Unit: milliseconds.</p>
         */
        @NameInMap("PocCreateTime")
        public Long pocCreateTime;

        /**
         * <p>The UNIX timestamp when the POC was disclosed. Unit: milliseconds.</p>
         */
        @NameInMap("PocDisclosureTime")
        public Long pocDisclosureTime;

        /**
         * <p>The service that is affected by the vulnerability.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The reference of the vulnerability in the Alibaba Cloud vulnerability library. The value is a URL.</p>
         */
        @NameInMap("Reference")
        public String reference;

        /**
         * <p>The disclosure time that is displayed for the vulnerability in the Alibaba Cloud vulnerability library. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The fixing suggestions of the vulnerability.</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The introduction to the vulnerability.</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The ID of the asset that is scanned.</p>
         * <br>
         * <p>>  This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instance that is affected by the vulnerability.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset that is scanned.</p>
         * <br>
         * <p>>  This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instance that is affected by the vulnerability.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The title of the vulnerability announcement.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The vendor that disclosed the vulnerability.</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The severity of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **serious**</p>
         * <p>*   **high**</p>
         * <p>*   **medium**</p>
         * <p>*   **low**</p>
         */
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

        public DescribeVulDetailsResponseBodyCves setCveLink(String cveLink) {
            this.cveLink = cveLink;
            return this;
        }
        public String getCveLink() {
            return this.cveLink;
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

        public DescribeVulDetailsResponseBodyCves setOtherId(String otherId) {
            this.otherId = otherId;
            return this;
        }
        public String getOtherId() {
            return this.otherId;
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
