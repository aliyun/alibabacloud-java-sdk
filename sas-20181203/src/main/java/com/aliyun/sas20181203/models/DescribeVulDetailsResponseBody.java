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
     * 
     * <strong>example:</strong>
     * <p>EDA40EA3-6265-5900-AD99-C83E4F109CA8</p>
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
         * 
         * <strong>example:</strong>
         * <p>remote_code_execution</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The URL of the demo video for the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("DemoVideoUrl")
        public String demoVideoUrl;

        /**
         * <p>The description of the vulnerability type.</p>
         * 
         * <strong>example:</strong>
         * <p>Remote code execution</p>
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
         * 
         * <strong>example:</strong>
         * <p>remote_code_execution</p>
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
         * 
         * <strong>example:</strong>
         * <p>CNVD-2019-9167</p>
         */
        @NameInMap("CnvdId")
        public String cnvdId;

        /**
         * <p>The difficulty level of exploiting the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>LOW</strong></li>
         * <li><strong>MEDIUM</strong></li>
         * <li><strong>HIGH</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("Complexity")
        public String complexity;

        /**
         * <p>The CVE content.</p>
         * 
         * <strong>example:</strong>
         * <p>Apache Shiro is a user authentication and authorization framework for a wide range of rights management applications.↵Recently, Apache Shiro released version 1.7.0, which fixes the Apache Shiro authentication bypass vulnerability (CVE-2020-17510).↵Attackers can bypass Shiro\&quot;s authentication using malicious requests containing payloads.↵↵Related bugs:↵CVE-2020-17510 Shiro &lt; 1.7.0 Validation Bypass Vulnerability↵CVE-2020-13933 Shiro &lt; 1.6.0 Validation Bypass Vulnerability↵CVE-2020-11989 Shiro &lt; 1.5.3 Validation Bypass Vulnerability↵CVE-2020-1957 Shiro &lt; 1.5.2 Validation Bypass Vulnerability↵CVE-2016-6802 Shiro &lt; 1.3.2 Validation Bypass Vulnerability
         * Check whether the fastjson version currently running on the system is in the affected version and whether safeMode is configured to disable autoType. If it is in the affected version and safeMode is not configured to disable autoType, the vulnerability is considered to exist.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2019-9167</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The link to the CVE details.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://avd.aliyun.com/detail/CVE-2022-1184">https://avd.aliyun.com/detail/CVE-2022-1184</a></p>
         */
        @NameInMap("CveLink")
        public String cveLink;

        /**
         * <p>The Common Vulnerability Scoring System (CVSS) score of the vulnerability in the Alibaba Cloud vulnerability library.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("CvssScore")
        public String cvssScore;

        /**
         * <p>The vector that is used to calculate the CVSS score.</p>
         * 
         * <strong>example:</strong>
         * <p>AV:N/AC:L/Au:N/C:C/I:C/A:C</p>
         */
        @NameInMap("CvssVector")
        public String cvssVector;

        /**
         * <p>The name of the instance.</p>
         * <blockquote>
         * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sql-test-001</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * <blockquote>
         * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.114.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * <blockquote>
         * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.19.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2020-8597</p>
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
         * 
         * <strong>example:</strong>
         * <p>1554189334000</p>
         */
        @NameInMap("PocCreateTime")
        public Long pocCreateTime;

        /**
         * <p>The UNIX timestamp when the POC was disclosed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554189334000</p>
         */
        @NameInMap("PocDisclosureTime")
        public Long pocDisclosureTime;

        /**
         * <p>The service that is affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Log4j2</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The reference of the vulnerability in the Alibaba Cloud vulnerability library. The value is a URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("Reference")
        public String reference;

        /**
         * <p>The disclosure time that is displayed for the vulnerability in the Alibaba Cloud vulnerability library. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554189334000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The fixing suggestions of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>At present, Chanjet has urgently released a vulnerability patch to fix the vulnerability. CNVD recommends affected units and users to upgrade to the latest version immediately:</p>↵<p>https://www.chanjetvip.com/product/goods/goods-detail?id=53aaa40295d458e44f5d3ce5</p>↵<p>At the same time, organizations and users affected by the vulnerability are requested to immediately follow the steps below to conduct self-inspection and repair work:</p>↵<ol>↵<li><p>User self-check steps:↵<br  />Check whether website/bin/load.aspx.cdcab7d2.compiled, website/bin/App_Web_load.aspx.cdcab7d2.dll, and tplus/Load.aspx files exist locally. If they exist, it means that they have been poisoned, and you must reinstall the system and install the product. patch.</p>↵</li>↵<li><p>Non-poisoned users please:↵<br  />1) Update the latest product patch.↵<br  />2) Install anti-virus software and update the virus database in time.↵<br  />3) Upgrade the lower version of IIS and Nginx to IIS10.0 and Windows 2016.↵<br  />4) Local installation customers need to confirm whether the backup file is complete as soon as possible, and do off-site backup. Customers on the cloud should enable the mirroring function in time.↵<br  />5) Users who fail to update the patch in time can contact Chanjet technical support and take temporary preventive measures such as deleting files.</p>↵</li>↵<li><p>Poisoned users please:↵<br  />1) Check whether the server has taken regular snapshots or backups. If so, you can restore data through snapshots or backups.↵<br  />2) Contact Chanjet technical support to confirm whether it has the conditions and operation methods to restore data from backup files.</p>↵</li>↵</ol>↵<p>If you have any technical problems, please contact Chanjet technical support: 4006600566-9</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The introduction to the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Chanjet T-Plus is an Internet business management software. There is an unauthorized access vulnerability in one of its interfaces disclosed on the Internet. Attackers can construct malicious requests to upload malicious files to execute arbitrary code and control the server.</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The ID of the asset that is scanned.</p>
         * <blockquote>
         * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>m-bp17m0pc0xprzbwo****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset that is scanned.</p>
         * <blockquote>
         * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>frontend</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The title of the vulnerability announcement.</p>
         * 
         * <strong>example:</strong>
         * <p>Chanjet T-Plus SetupAccount/Upload. Aspx file upload vulnerability(CNVD-2022-60632)</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The vendor that disclosed the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Apache</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The severity of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
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
