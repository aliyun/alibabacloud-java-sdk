// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionLOAResponseBody extends TeaModel {
    /**
     * <p>The LOA information about the Express Connect circuit.</p>
     */
    @NameInMap("PhysicalConnectionLOAType")
    public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType physicalConnectionLOAType;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>318BB676-0A2B-43A0-9AD8-F1D34E93750F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhysicalConnectionLOAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionLOAResponseBody self = new DescribePhysicalConnectionLOAResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionLOAResponseBody setPhysicalConnectionLOAType(DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType physicalConnectionLOAType) {
        this.physicalConnectionLOAType = physicalConnectionLOAType;
        return this;
    }
    public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType getPhysicalConnectionLOAType() {
        return this.physicalConnectionLOAType;
    }

    public DescribePhysicalConnectionLOAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo extends TeaModel {
        /**
         * <p>The identity document number of the construction worker.</p>
         * 
         * <strong>example:</strong>
         * <p>12345671****</p>
         */
        @NameInMap("PMCertificateNo")
        public String PMCertificateNo;

        /**
         * <p>The identity document type of the construction worker. Valid values:</p>
         * <ul>
         * <li><strong>IDCard</strong></li>
         * <li><strong>Passport</strong></li>
         * <li><strong>Other</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("PMCertificateType")
        public String PMCertificateType;

        /**
         * <p>The phone number of the construction worker.</p>
         * 
         * <strong>example:</strong>
         * <p>18910010****</p>
         */
        @NameInMap("PMContactInfo")
        public String PMContactInfo;

        /**
         * <p>The gender of the construction worker. Valid values:</p>
         * <ul>
         * <li><strong>Male</strong></li>
         * <li><strong>Female</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Male</p>
         */
        @NameInMap("PMGender")
        public String PMGender;

        /**
         * <p>The name of the construction worker.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("PMName")
        public String PMName;

        public static DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo self = new DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMCertificateNo(String PMCertificateNo) {
            this.PMCertificateNo = PMCertificateNo;
            return this;
        }
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMCertificateType(String PMCertificateType) {
            this.PMCertificateType = PMCertificateType;
            return this;
        }
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMContactInfo(String PMContactInfo) {
            this.PMContactInfo = PMContactInfo;
            return this;
        }
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMGender(String PMGender) {
            this.PMGender = PMGender;
            return this;
        }
        public String getPMGender() {
            return this.PMGender;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo setPMName(String PMName) {
            this.PMName = PMName;
            return this;
        }
        public String getPMName() {
            return this.PMName;
        }

    }

    public static class DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo extends TeaModel {
        @NameInMap("PMInfo")
        public java.util.List<DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo> PMInfo;

        public static DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo self = new DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo setPMInfo(java.util.List<DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo> PMInfo) {
            this.PMInfo = PMInfo;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfoPMInfo> getPMInfo() {
            return this.PMInfo;
        }

    }

    public static class DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType extends TeaModel {
        /**
         * <p>The name of the construction company.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("CompanyLocalizedName")
        public String companyLocalizedName;

        /**
         * <p>The name of the organization that requires the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <p>The time when construction starts.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-26T08:00:00Z</p>
         */
        @NameInMap("ConstructionTime")
        public String constructionTime;

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ca4wca27****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The circuit code provided by the connectivity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa111</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The label of the cable in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb222</p>
         */
        @NameInMap("LineLabel")
        public String lineLabel;

        /**
         * <p>The contact information about line O\&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>1388888****</p>
         */
        @NameInMap("LineSPContactInfo")
        public String lineSPContactInfo;

        /**
         * <p>The ISP. Valid values:</p>
         * <ul>
         * <li><strong>China Telecom</strong></li>
         * <li><strong>China Unicom</strong></li>
         * <li><strong>China Mobile</strong></li>
         * <li><strong>Other ISPs in China</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Other ISPs in China</p>
         */
        @NameInMap("LineServiceProvider")
        public String lineServiceProvider;

        /**
         * <p>The type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>MSTP</strong></li>
         * <li><strong>MPLSVPN</strong></li>
         * <li><strong>FIBRE</strong></li>
         * <li><strong>Other</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIBRE</p>
         */
        @NameInMap("LineType")
        public String lineType;

        /**
         * <p>The download URL of the LOA file.</p>
         * 
         * <strong>example:</strong>
         * <p>http://******</p>
         */
        @NameInMap("LoaUrl")
        public String loaUrl;

        /**
         * <p>The information about the construction workers.</p>
         */
        @NameInMap("PMInfo")
        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo PMInfo;

        /**
         * <p>The on-site construction company.</p>
         * 
         * <strong>example:</strong>
         * <p>ctcu</p>
         */
        @NameInMap("SI")
        public String SI;

        /**
         * <p>The status of the LOA. Valid values:</p>
         * <ul>
         * <li><strong>Applying</strong>: The LOA is pending for approval.</li>
         * <li><strong>Accept</strong>: The LOA is approved.</li>
         * <li><strong>Available</strong>: The LOA is available.</li>
         * <li><strong>Rejected</strong>: The LOA is rejected.</li>
         * <li><strong>Completing</strong>: The Express Connect circuit is under construction.</li>
         * <li><strong>Complete</strong>: The Express Connect circuit is installed.</li>
         * <li><strong>Deleted</strong>: The LOA is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType self = new DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setCompanyLocalizedName(String companyLocalizedName) {
            this.companyLocalizedName = companyLocalizedName;
            return this;
        }
        public String getCompanyLocalizedName() {
            return this.companyLocalizedName;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setConstructionTime(String constructionTime) {
            this.constructionTime = constructionTime;
            return this;
        }
        public String getConstructionTime() {
            return this.constructionTime;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineLabel(String lineLabel) {
            this.lineLabel = lineLabel;
            return this;
        }
        public String getLineLabel() {
            return this.lineLabel;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineSPContactInfo(String lineSPContactInfo) {
            this.lineSPContactInfo = lineSPContactInfo;
            return this;
        }
        public String getLineSPContactInfo() {
            return this.lineSPContactInfo;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineServiceProvider(String lineServiceProvider) {
            this.lineServiceProvider = lineServiceProvider;
            return this;
        }
        public String getLineServiceProvider() {
            return this.lineServiceProvider;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setLoaUrl(String loaUrl) {
            this.loaUrl = loaUrl;
            return this;
        }
        public String getLoaUrl() {
            return this.loaUrl;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setPMInfo(DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo PMInfo) {
            this.PMInfo = PMInfo;
            return this;
        }
        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo getPMInfo() {
            return this.PMInfo;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setSI(String SI) {
            this.SI = SI;
            return this;
        }
        public String getSI() {
            return this.SI;
        }

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
