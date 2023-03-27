// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRdsResourceSettingsResponseBody extends TeaModel {
    /**
     * <p>The details about notification settings for an instance.</p>
     */
    @NameInMap("RdsInstanceResourceSettings")
    public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings rdsInstanceResourceSettings;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRdsResourceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsResourceSettingsResponseBody self = new DescribeRdsResourceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsResourceSettingsResponseBody setRdsInstanceResourceSettings(DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings rdsInstanceResourceSettings) {
        this.rdsInstanceResourceSettings = rdsInstanceResourceSettings;
        return this;
    }
    public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings getRdsInstanceResourceSettings() {
        return this.rdsInstanceResourceSettings;
    }

    public DescribeRdsResourceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting extends TeaModel {
        /**
         * <p>The end of the time range. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>IsTop.</p>
         */
        @NameInMap("IsTop")
        public String isTop;

        /**
         * <p>The content in the notification bar.</p>
         */
        @NameInMap("NoticeBarContent")
        public String noticeBarContent;

        /**
         * <p>The text of the button.</p>
         */
        @NameInMap("PoppedUpButtonText")
        public String poppedUpButtonText;

        /**
         * <p>The type of the button. Valid values:</p>
         */
        @NameInMap("PoppedUpButtonType")
        public String poppedUpButtonType;

        /**
         * <p>The link of the button.</p>
         */
        @NameInMap("PoppedUpButtonUrl")
        public String poppedUpButtonUrl;

        /**
         * <p>The content.</p>
         */
        @NameInMap("PoppedUpContent")
        public String poppedUpContent;

        /**
         * <p>The location of the notification.</p>
         */
        @NameInMap("ResourceNiche")
        public String resourceNiche;

        /**
         * <p>The beginning of the time range. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        public static DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting self = new DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting();
            return TeaModel.build(map, self);
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setIsTop(String isTop) {
            this.isTop = isTop;
            return this;
        }
        public String getIsTop() {
            return this.isTop;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setNoticeBarContent(String noticeBarContent) {
            this.noticeBarContent = noticeBarContent;
            return this;
        }
        public String getNoticeBarContent() {
            return this.noticeBarContent;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonText(String poppedUpButtonText) {
            this.poppedUpButtonText = poppedUpButtonText;
            return this;
        }
        public String getPoppedUpButtonText() {
            return this.poppedUpButtonText;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonType(String poppedUpButtonType) {
            this.poppedUpButtonType = poppedUpButtonType;
            return this;
        }
        public String getPoppedUpButtonType() {
            return this.poppedUpButtonType;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonUrl(String poppedUpButtonUrl) {
            this.poppedUpButtonUrl = poppedUpButtonUrl;
            return this;
        }
        public String getPoppedUpButtonUrl() {
            return this.poppedUpButtonUrl;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpContent(String poppedUpContent) {
            this.poppedUpContent = poppedUpContent;
            return this;
        }
        public String getPoppedUpContent() {
            return this.poppedUpContent;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setResourceNiche(String resourceNiche) {
            this.resourceNiche = resourceNiche;
            return this;
        }
        public String getResourceNiche() {
            return this.resourceNiche;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings extends TeaModel {
        @NameInMap("RdsInstanceResourceSetting")
        public java.util.List<DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting> rdsInstanceResourceSetting;

        public static DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings self = new DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings();
            return TeaModel.build(map, self);
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings setRdsInstanceResourceSetting(java.util.List<DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting> rdsInstanceResourceSetting) {
            this.rdsInstanceResourceSetting = rdsInstanceResourceSetting;
            return this;
        }
        public java.util.List<DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting> getRdsInstanceResourceSetting() {
            return this.rdsInstanceResourceSetting;
        }

    }

}
