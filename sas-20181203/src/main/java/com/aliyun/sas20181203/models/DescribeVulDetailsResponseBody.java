// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponseBody extends TeaModel {
    @NameInMap("Cves")
    public java.util.List<DescribeVulDetailsResponseBodyCves> cves;

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
        @NameInMap("Classify")
        public String classify;

        @NameInMap("DemoVideoUrl")
        public String demoVideoUrl;

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
        @NameInMap("Classify")
        public String classify;

        @NameInMap("Classifys")
        public java.util.List<DescribeVulDetailsResponseBodyCvesClassifys> classifys;

        @NameInMap("CnvdId")
        public String cnvdId;

        @NameInMap("Complexity")
        public String complexity;

        @NameInMap("Content")
        public String content;

        @NameInMap("CveId")
        public String cveId;

        @NameInMap("CvssScore")
        public String cvssScore;

        @NameInMap("CvssVector")
        public String cvssVector;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Poc")
        public String poc;

        @NameInMap("PocCreateTime")
        public Long pocCreateTime;

        @NameInMap("PocDisclosureTime")
        public Long pocDisclosureTime;

        @NameInMap("Product")
        public String product;

        @NameInMap("Reference")
        public String reference;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("Title")
        public String title;

        @NameInMap("Vendor")
        public String vendor;

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
