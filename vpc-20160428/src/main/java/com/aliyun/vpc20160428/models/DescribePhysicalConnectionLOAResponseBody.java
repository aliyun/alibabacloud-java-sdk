// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionLOAResponseBody extends TeaModel {
    /**
     * <p>Information about the physical connection\&quot;s LOA.</p>
     */
    @NameInMap("PhysicalConnectionLOAType")
    public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType physicalConnectionLOAType;

    /**
     * <p>The request ID.</p>
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
        @NameInMap("PMCertificateNo")
        public String PMCertificateNo;

        @NameInMap("PMCertificateType")
        public String PMCertificateType;

        @NameInMap("PMContactInfo")
        public String PMContactInfo;

        @NameInMap("PMGender")
        public String PMGender;

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
         * <p>The localized name of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("CompanyLocalizedName")
        public String companyLocalizedName;

        /**
         * <p>The name of the company that requires the physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <p>The time when construction personnel enter the site.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-26T08:00:00Z</p>
         */
        @NameInMap("ConstructionTime")
        public String constructionTime;

        /**
         * <p>The description of the LOA.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID of the physical connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ca4wca27****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The line code assigned by the line service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa111</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The line label for the in-building cable at the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb222</p>
         */
        @NameInMap("LineLabel")
        public String lineLabel;

        /**
         * <p>The contact information of the line O\&amp;M personnel.</p>
         * 
         * <strong>example:</strong>
         * <p>1388888****</p>
         */
        @NameInMap("LineSPContactInfo")
        public String lineSPContactInfo;

        /**
         * <p>The line service provider. Valid values:</p>
         * <ul>
         * <li><p><strong>China Telecom</strong></p>
         * </li>
         * <li><p><strong>China Unicom</strong></p>
         * </li>
         * <li><p><strong>China Mobile</strong></p>
         * </li>
         * <li><p><strong>Other</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>中国其他</p>
         */
        @NameInMap("LineServiceProvider")
        public String lineServiceProvider;

        /**
         * <p>The line type of the physical connection. Valid values:</p>
         * <ul>
         * <li><p><strong>MSTP</strong></p>
         * </li>
         * <li><p><strong>MPLSVPN</strong></p>
         * </li>
         * <li><p><strong>FIBRE</strong></p>
         * </li>
         * <li><p><strong>Other</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIBRE</p>
         */
        @NameInMap("LineType")
        public String lineType;

        /**
         * <p>The URL to download the LOA file.</p>
         * 
         * <strong>example:</strong>
         * <p>http://******</p>
         */
        @NameInMap("LoaUrl")
        public String loaUrl;

        /**
         * <p>Information about the construction personnel.</p>
         */
        @NameInMap("PMInfo")
        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOATypePMInfo PMInfo;

        /**
         * <p>The system integrator (SI).</p>
         * 
         * <strong>example:</strong>
         * <p>ctcu</p>
         */
        @NameInMap("SI")
        public String SI;

        /**
         * <p>The status of the LOA. Valid values:</p>
         * <ul>
         * <li><p><strong>Applying</strong>: The LOA application is in progress.</p>
         * </li>
         * <li><p><strong>Accept</strong>: The LOA application is approved.</p>
         * </li>
         * <li><p><strong>Available</strong>: The LOA is available.</p>
         * </li>
         * <li><p><strong>Rejected</strong>: The LOA application is rejected.</p>
         * </li>
         * <li><p><strong>Completing</strong>: The construction of the physical connection is in progress.</p>
         * </li>
         * <li><p><strong>Complete</strong>: The construction of the physical connection is complete.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The LOA is deleted.</p>
         * </li>
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

        public DescribePhysicalConnectionLOAResponseBodyPhysicalConnectionLOAType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
