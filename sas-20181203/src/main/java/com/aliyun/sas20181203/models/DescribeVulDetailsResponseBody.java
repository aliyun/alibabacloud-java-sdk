// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Cves")
    public java.util.List<DescribeVulDetailsResponseBodyCves> cves;

    public static DescribeVulDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsResponseBody self = new DescribeVulDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulDetailsResponseBody setCves(java.util.List<DescribeVulDetailsResponseBodyCves> cves) {
        this.cves = cves;
        return this;
    }
    public java.util.List<DescribeVulDetailsResponseBodyCves> getCves() {
        return this.cves;
    }

    public static class DescribeVulDetailsResponseBodyCvesClassifys extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Classify")
        public String classify;

        @NameInMap("DemoVideoUrl")
        public String demoVideoUrl;

        public static DescribeVulDetailsResponseBodyCvesClassifys build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDetailsResponseBodyCvesClassifys self = new DescribeVulDetailsResponseBodyCvesClassifys();
            return TeaModel.build(map, self);
        }

        public DescribeVulDetailsResponseBodyCvesClassifys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    }

    public static class DescribeVulDetailsResponseBodyCves extends TeaModel {
        @NameInMap("Summary")
        public String summary;

        @NameInMap("Complexity")
        public String complexity;

        @NameInMap("Product")
        public String product;

        @NameInMap("PocCreateTime")
        public Long pocCreateTime;

        @NameInMap("CveId")
        public String cveId;

        @NameInMap("CnvdId")
        public String cnvdId;

        @NameInMap("Reference")
        public String reference;

        @NameInMap("CvssScore")
        public String cvssScore;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("PocDisclosureTime")
        public Long pocDisclosureTime;

        @NameInMap("Classify")
        public String classify;

        @NameInMap("CvssVector")
        public String cvssVector;

        @NameInMap("VulLevel")
        public String vulLevel;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("Title")
        public String title;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("Content")
        public String content;

        @NameInMap("Poc")
        public String poc;

        @NameInMap("Classifys")
        public java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> classifys;

        public static DescribeVulDetailsResponseBodyCves build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDetailsResponseBodyCves self = new DescribeVulDetailsResponseBodyCves();
            return TeaModel.build(map, self);
        }

        public DescribeVulDetailsResponseBodyCves setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeVulDetailsResponseBodyCves setComplexity(String complexity) {
            this.complexity = complexity;
            return this;
        }
        public String getComplexity() {
            return this.complexity;
        }

        public DescribeVulDetailsResponseBodyCves setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeVulDetailsResponseBodyCves setPocCreateTime(Long pocCreateTime) {
            this.pocCreateTime = pocCreateTime;
            return this;
        }
        public Long getPocCreateTime() {
            return this.pocCreateTime;
        }

        public DescribeVulDetailsResponseBodyCves setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulDetailsResponseBodyCves setCnvdId(String cnvdId) {
            this.cnvdId = cnvdId;
            return this;
        }
        public String getCnvdId() {
            return this.cnvdId;
        }

        public DescribeVulDetailsResponseBodyCves setReference(String reference) {
            this.reference = reference;
            return this;
        }
        public String getReference() {
            return this.reference;
        }

        public DescribeVulDetailsResponseBodyCves setCvssScore(String cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }
        public String getCvssScore() {
            return this.cvssScore;
        }

        public DescribeVulDetailsResponseBodyCves setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeVulDetailsResponseBodyCves setPocDisclosureTime(Long pocDisclosureTime) {
            this.pocDisclosureTime = pocDisclosureTime;
            return this;
        }
        public Long getPocDisclosureTime() {
            return this.pocDisclosureTime;
        }

        public DescribeVulDetailsResponseBodyCves setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public DescribeVulDetailsResponseBodyCves setCvssVector(String cvssVector) {
            this.cvssVector = cvssVector;
            return this;
        }
        public String getCvssVector() {
            return this.cvssVector;
        }

        public DescribeVulDetailsResponseBodyCves setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

        public DescribeVulDetailsResponseBodyCves setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeVulDetailsResponseBodyCves setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeVulDetailsResponseBodyCves setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeVulDetailsResponseBodyCves setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeVulDetailsResponseBodyCves setPoc(String poc) {
            this.poc = poc;
            return this;
        }
        public String getPoc() {
            return this.poc;
        }

        public DescribeVulDetailsResponseBodyCves setClassifys(java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> classifys) {
            this.classifys = classifys;
            return this;
        }
        public java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> getClassifys() {
            return this.classifys;
        }

    }

}
