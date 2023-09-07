// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckConfigResponseBody extends TeaModel {
    /**
     * <p>The days in a week on which an automatic check is performed.</p>
     */
    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

    /**
     * <p>Indicates whether the check for new check items in the selected requirement item is enabled by default. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableAddCheck")
    public Boolean enableAddCheck;

    /**
     * <p>Indicates whether the automatic check is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableAutoCheck")
    public Boolean enableAutoCheck;

    /**
     * <p>The end time of the check. The value indicates a point in time. The time period that is specified by the start time and end time must be one of the following time periods:</p>
     * <br>
     * <p>*   **00:00 to 06:00**: If StartTime is set to 00:00, EndTime must be set to 06:00.</p>
     * <p>*   **06:00 to 12:00**: If StartTime is set to 06:00, EndTime must be set to 12:00.</p>
     * <p>*   **12:00 to 18:00**: If StartTime is set to 12:00, EndTime must be set to 18:00.</p>
     * <p>*   **18:00 to 24:00**: If StartTime is set to 18:00, EndTime must be set to 24:00.</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The check items selected in the policy.</p>
     */
    @NameInMap("SelectedChecks")
    public java.util.List<GetCheckConfigResponseBodySelectedChecks> selectedChecks;

    /**
     * <p>The information about the check items.</p>
     */
    @NameInMap("Standards")
    public java.util.List<GetCheckConfigResponseBodyStandards> standards;

    /**
     * <p>The start time of the check. The value indicates a point in time.</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    public static GetCheckConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConfigResponseBody self = new GetCheckConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckConfigResponseBody setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public GetCheckConfigResponseBody setEnableAddCheck(Boolean enableAddCheck) {
        this.enableAddCheck = enableAddCheck;
        return this;
    }
    public Boolean getEnableAddCheck() {
        return this.enableAddCheck;
    }

    public GetCheckConfigResponseBody setEnableAutoCheck(Boolean enableAutoCheck) {
        this.enableAutoCheck = enableAutoCheck;
        return this;
    }
    public Boolean getEnableAutoCheck() {
        return this.enableAutoCheck;
    }

    public GetCheckConfigResponseBody setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetCheckConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckConfigResponseBody setSelectedChecks(java.util.List<GetCheckConfigResponseBodySelectedChecks> selectedChecks) {
        this.selectedChecks = selectedChecks;
        return this;
    }
    public java.util.List<GetCheckConfigResponseBodySelectedChecks> getSelectedChecks() {
        return this.selectedChecks;
    }

    public GetCheckConfigResponseBody setStandards(java.util.List<GetCheckConfigResponseBodyStandards> standards) {
        this.standards = standards;
        return this;
    }
    public java.util.List<GetCheckConfigResponseBodyStandards> getStandards() {
        return this.standards;
    }

    public GetCheckConfigResponseBody setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public static class GetCheckConfigResponseBodySelectedChecks extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The section ID of the check item.</p>
         */
        @NameInMap("SectionId")
        public Long sectionId;

        public static GetCheckConfigResponseBodySelectedChecks build(java.util.Map<String, ?> map) throws Exception {
            GetCheckConfigResponseBodySelectedChecks self = new GetCheckConfigResponseBodySelectedChecks();
            return TeaModel.build(map, self);
        }

        public GetCheckConfigResponseBodySelectedChecks setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public GetCheckConfigResponseBodySelectedChecks setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

    public static class GetCheckConfigResponseBodyStandards extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The status of the check item. Valid values:</p>
         * <br>
         * <p>*   **ON**: The check item is enabled.</p>
         * <p>*   **OFF**: The check item is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the check item. Valid values:</p>
         * <br>
         * <p>*   **RISK**: cloud service configuration management</p>
         * <p>*   **IDENTITY_PERMISSION**: identity and permission management</p>
         * <p>*   **COMPLIANCE**: compliance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCheckConfigResponseBodyStandards build(java.util.Map<String, ?> map) throws Exception {
            GetCheckConfigResponseBodyStandards self = new GetCheckConfigResponseBodyStandards();
            return TeaModel.build(map, self);
        }

        public GetCheckConfigResponseBodyStandards setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckConfigResponseBodyStandards setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckConfigResponseBodyStandards setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCheckConfigResponseBodyStandards setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
