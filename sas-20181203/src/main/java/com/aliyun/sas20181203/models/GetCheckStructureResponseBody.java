// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckStructureResponseBody extends TeaModel {
    /**
     * <p>The structure information about check items provided by the configuration assessment feature.</p>
     */
    @NameInMap("CheckStructureResponse")
    public java.util.List<GetCheckStructureResponseBodyCheckStructureResponse> checkStructureResponse;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>379a9b8f-107b-4630-9e95-2299a1ea****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCheckStructureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckStructureResponseBody self = new GetCheckStructureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckStructureResponseBody setCheckStructureResponse(java.util.List<GetCheckStructureResponseBodyCheckStructureResponse> checkStructureResponse) {
        this.checkStructureResponse = checkStructureResponse;
        return this;
    }
    public java.util.List<GetCheckStructureResponseBodyCheckStructureResponse> getCheckStructureResponse() {
        return this.checkStructureResponse;
    }

    public GetCheckStructureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections extends TeaModel {
        /**
         * <p>The ID of the section for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>177</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The display name of the section for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Control</p>
         */
        @NameInMap("ShowName")
        public String showName;

        public static GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections build(java.util.Map<String, ?> map) throws Exception {
            GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections self = new GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections();
            return TeaModel.build(map, self);
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

    public static class GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements extends TeaModel {
        /**
         * <p>The ID of the requirement item for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The information about the sections of check items.</p>
         */
        @NameInMap("Sections")
        public java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections> sections;

        /**
         * <p>The display name of the requirement item for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Networking</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The total number of check items for the requirement.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("TotalCheckCount")
        public Integer totalCheckCount;

        public static GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements build(java.util.Map<String, ?> map) throws Exception {
            GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements self = new GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements();
            return TeaModel.build(map, self);
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements setSections(java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections> sections) {
            this.sections = sections;
            return this;
        }
        public java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirementsSections> getSections() {
            return this.sections;
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements setTotalCheckCount(Integer totalCheckCount) {
            this.totalCheckCount = totalCheckCount;
            return this;
        }
        public Integer getTotalCheckCount() {
            return this.totalCheckCount;
        }

    }

    public static class GetCheckStructureResponseBodyCheckStructureResponseStandards extends TeaModel {
        /**
         * <p>The standard ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The standards of the check items.</p>
         */
        @NameInMap("Requirements")
        public java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements> requirements;

        /**
         * <p>The display name of the standard for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud best security practices</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The standard type of the check item. Valid values:</p>
         * <ul>
         * <li>RISK: security risk.</li>
         * <li>IDENTITY_PERMISSION: CIEM.</li>
         * <li>COMPLIANCE: security compliance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IDENTITY_PERMISSION</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCheckStructureResponseBodyCheckStructureResponseStandards build(java.util.Map<String, ?> map) throws Exception {
            GetCheckStructureResponseBodyCheckStructureResponseStandards self = new GetCheckStructureResponseBodyCheckStructureResponseStandards();
            return TeaModel.build(map, self);
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandards setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandards setRequirements(java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements> requirements) {
            this.requirements = requirements;
            return this;
        }
        public java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandardsRequirements> getRequirements() {
            return this.requirements;
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandards setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckStructureResponseBodyCheckStructureResponseStandards setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCheckStructureResponseBodyCheckStructureResponse extends TeaModel {
        /**
         * <p>The type of the check item.</p>
         * <ul>
         * <li>RISK: security risk.</li>
         * <li>IDENTITY_PERMISSION: Cloud Infrastructure Entitlement Management (CIEM).</li>
         * <li>COMPLIANCE: security compliance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RISK</p>
         */
        @NameInMap("StandardType")
        public String standardType;

        /**
         * <p>The structure information about the check items of the business type.</p>
         */
        @NameInMap("Standards")
        public java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandards> standards;

        public static GetCheckStructureResponseBodyCheckStructureResponse build(java.util.Map<String, ?> map) throws Exception {
            GetCheckStructureResponseBodyCheckStructureResponse self = new GetCheckStructureResponseBodyCheckStructureResponse();
            return TeaModel.build(map, self);
        }

        public GetCheckStructureResponseBodyCheckStructureResponse setStandardType(String standardType) {
            this.standardType = standardType;
            return this;
        }
        public String getStandardType() {
            return this.standardType;
        }

        public GetCheckStructureResponseBodyCheckStructureResponse setStandards(java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandards> standards) {
            this.standards = standards;
            return this;
        }
        public java.util.List<GetCheckStructureResponseBodyCheckStructureResponseStandards> getStandards() {
            return this.standards;
        }

    }

}
