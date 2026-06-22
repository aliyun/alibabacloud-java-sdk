// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckConfigResponseBody extends TeaModel {
    /**
     * <p>The periodic check schedule.</p>
     */
    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

    /**
     * <p>Indicates whether new check items added to the selected standards are checked by default. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> Enabled.</li>
     * <li><strong>false:</strong> Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAddCheck")
    public Boolean enableAddCheck;

    /**
     * <p>Indicates whether automatic periodic checks are enabled. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> Enabled.</li>
     * <li><strong>false:</strong> Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoCheck")
    public Boolean enableAutoCheck;

    /**
     * <p>The end time of the check period, indicating the hour of the day. The start time and end time must fall within one of the following time ranges:</p>
     * <ul>
     * <li><strong>0~6</strong>: If the start time is 0, the end time must be set to 6.</li>
     * <li><strong>6~12</strong>: If the start time is 6, the end time must be set to 12.</li>
     * <li><strong>12~18</strong>: If the start time is 12, the end time must be set to 18.</li>
     * <li><strong>18~24</strong>: If the start time is 18, the end time must be set to 24.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5A3D5C8F-2A42-5477-BDD8-27E64B5F1739</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The check items selected in the policy.</p>
     */
    @NameInMap("SelectedChecks")
    public java.util.List<GetCheckConfigResponseBodySelectedChecks> selectedChecks;

    /**
     * <p>The list of check item information.</p>
     */
    @NameInMap("Standards")
    public java.util.List<GetCheckConfigResponseBodyStandards> standards;

    /**
     * <p>The start time of the check period, indicating the hour of the day.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The section ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>云产品配置管理</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The enabling status of the check item. Valid values:</p>
         * <ul>
         * <li><strong>ON:</strong> Enabled.</li>
         * <li><strong>OFF:</strong> Shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the check item. Valid values:</p>
         * <ul>
         * <li><strong>RISK:</strong> cloud service configuration management</li>
         * <li><strong>IDENTITY_PERMISSION:</strong> permission management</li>
         * <li><strong>COMPLIANCE:</strong> compliance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RISK</p>
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
