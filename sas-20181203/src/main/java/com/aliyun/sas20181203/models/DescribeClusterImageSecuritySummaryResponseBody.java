// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterImageSecuritySummaryResponseBody extends TeaModel {
    /**
     * <p>The information about the image-related security events.</p>
     */
    @NameInMap("ClusterImageEvent")
    public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent clusterImageEvent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterImageSecuritySummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterImageSecuritySummaryResponseBody self = new DescribeClusterImageSecuritySummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterImageSecuritySummaryResponseBody setClusterImageEvent(DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent clusterImageEvent) {
        this.clusterImageEvent = clusterImageEvent;
        return this;
    }
    public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent getClusterImageEvent() {
        return this.clusterImageEvent;
    }

    public DescribeClusterImageSecuritySummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline extends TeaModel {
        /**
         * <p>The number of baselines.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline self = new DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline();
            return TeaModel.build(map, self);
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul extends TeaModel {
        /**
         * <p>The number of vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
         * <li><strong>nntf</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
         * <li><strong>later</strong>: low. You can ignore the vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>later</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul self = new DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul();
            return TeaModel.build(map, self);
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile extends TeaModel {
        /**
         * <p>The number of malicious samples.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile self = new DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile();
            return TeaModel.build(map, self);
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul extends TeaModel {
        /**
         * <p>The number of image application vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
         * <li><strong>nntf</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
         * <li><strong>later</strong>: low. You can ignore the vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>later</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul self = new DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul();
            return TeaModel.build(map, self);
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent extends TeaModel {
        /**
         * <p>The information about image baseline risks.</p>
         */
        @NameInMap("ImageBaseline")
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline> imageBaseline;

        /**
         * <p>The information about image system vulnerabilities.</p>
         */
        @NameInMap("ImageCveVul")
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul> imageCveVul;

        /**
         * <p>The information about malicious image samples.</p>
         */
        @NameInMap("ImageMaliciousFile")
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile> imageMaliciousFile;

        /**
         * <p>The information about image application vulnerabilities.</p>
         */
        @NameInMap("ImageScaVul")
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul> imageScaVul;

        public static DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent self = new DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent();
            return TeaModel.build(map, self);
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent setImageBaseline(java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline> imageBaseline) {
            this.imageBaseline = imageBaseline;
            return this;
        }
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageBaseline> getImageBaseline() {
            return this.imageBaseline;
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent setImageCveVul(java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul> imageCveVul) {
            this.imageCveVul = imageCveVul;
            return this;
        }
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageCveVul> getImageCveVul() {
            return this.imageCveVul;
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent setImageMaliciousFile(java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile> imageMaliciousFile) {
            this.imageMaliciousFile = imageMaliciousFile;
            return this;
        }
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageMaliciousFile> getImageMaliciousFile() {
            return this.imageMaliciousFile;
        }

        public DescribeClusterImageSecuritySummaryResponseBodyClusterImageEvent setImageScaVul(java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul> imageScaVul) {
            this.imageScaVul = imageScaVul;
            return this;
        }
        public java.util.List<DescribeClusterImageSecuritySummaryResponseBodyClusterImageEventImageScaVul> getImageScaVul() {
            return this.imageScaVul;
        }

    }

}
