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
         */
        @NameInMap("PMCertificateNo")
        public String PMCertificateNo;

        /**
         * <p>The identity document type of the construction worker. Valid values:</p>
         * <br>
         * <p>*   **IDCard**</p>
         * <p>*   **Passport**</p>
         * <p>*   **Other**</p>
         */
        @NameInMap("PMCertificateType")
        public String PMCertificateType;

        /**
         * <p>The phone number of the construction worker.</p>
         */
        @NameInMap("PMContactInfo")
        public String PMContactInfo;

        /**
         * <p>The gender of the construction worker. Valid values:</p>
         * <br>
         * <p>*   **Male**</p>
         * <p>*   **Female**</p>
         */
        @NameInMap("PMGender")
        public String PMGender;

        /**
         * <p>The name of the construction worker.</p>
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
         */
        @NameInMap("CompanyLocalizedName")
        public String companyLocalizedName;

        /**
         * <p>The name of the organization that requires the Express Connect circuit.</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <p>The time when construction starts.</p>
         */
        @NameInMap("ConstructionTime")
        public String constructionTime;

        /**
         * <p>The ID of the Express Connect circuit.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The circuit code provided by the connectivity provider.</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The label of the cable in the data center.</p>
         */
        @NameInMap("LineLabel")
        public String lineLabel;

        /**
         * <p>The contact information about line O\&M.</p>
         */
        @NameInMap("LineSPContactInfo")
        public String lineSPContactInfo;

        /**
         * <p>The ISP. Valid values:</p>
         * <br>
         * <p>*   **China Telecom**</p>
         * <p>*   **China Unicom**</p>
         * <p>*   **China Mobile**</p>
         * <p>*   **Other ISPs in China**</p>
         */
        @NameInMap("LineServiceProvider")
        public String lineServiceProvider;

        /**
         * <p>The type of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>*   **MSTP**</p>
         * <p>*   **MPLSVPN**</p>
         * <p>*   **FIBRE**</p>
         * <p>*   **Other**</p>
         */
        @NameInMap("LineType")
        public String lineType;

        /**
         * <p>The download URL of the LOA file.</p>
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
         */
        @NameInMap("SI")
        public String SI;

        /**
         * <p>The status of the LOA. Valid values:</p>
         * <br>
         * <p>*   **Applying**: The LOA is pending for approval.</p>
         * <p>*   **Accept**: The LOA is approved.</p>
         * <p>*   **Available**: The LOA is available.</p>
         * <p>*   **Rejected**: The LOA is rejected.</p>
         * <p>*   **Completing**: The Express Connect circuit is under construction.</p>
         * <p>*   **Complete**: The Express Connect circuit is installed.</p>
         * <p>*   **Deleted**: The LOA is deleted.</p>
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
