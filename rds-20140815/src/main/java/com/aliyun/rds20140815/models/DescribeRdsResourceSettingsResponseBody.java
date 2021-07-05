// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRdsResourceSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RdsInstanceResourceSettings")
    public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings rdsInstanceResourceSettings;

    public static DescribeRdsResourceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsResourceSettingsResponseBody self = new DescribeRdsResourceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsResourceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsResourceSettingsResponseBody setRdsInstanceResourceSettings(DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings rdsInstanceResourceSettings) {
        this.rdsInstanceResourceSettings = rdsInstanceResourceSettings;
        return this;
    }
    public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettings getRdsInstanceResourceSettings() {
        return this.rdsInstanceResourceSettings;
    }

    public static class DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting extends TeaModel {
        @NameInMap("PoppedUpButtonType")
        public String poppedUpButtonType;

        @NameInMap("NoticeBarContent")
        public String noticeBarContent;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("PoppedUpContent")
        public String poppedUpContent;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("PoppedUpButtonText")
        public String poppedUpButtonText;

        @NameInMap("IsTop")
        public String isTop;

        @NameInMap("ResourceNiche")
        public String resourceNiche;

        @NameInMap("PoppedUpButtonUrl")
        public String poppedUpButtonUrl;

        public static DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting self = new DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting();
            return TeaModel.build(map, self);
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonType(String poppedUpButtonType) {
            this.poppedUpButtonType = poppedUpButtonType;
            return this;
        }
        public String getPoppedUpButtonType() {
            return this.poppedUpButtonType;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setNoticeBarContent(String noticeBarContent) {
            this.noticeBarContent = noticeBarContent;
            return this;
        }
        public String getNoticeBarContent() {
            return this.noticeBarContent;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpContent(String poppedUpContent) {
            this.poppedUpContent = poppedUpContent;
            return this;
        }
        public String getPoppedUpContent() {
            return this.poppedUpContent;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonText(String poppedUpButtonText) {
            this.poppedUpButtonText = poppedUpButtonText;
            return this;
        }
        public String getPoppedUpButtonText() {
            return this.poppedUpButtonText;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setIsTop(String isTop) {
            this.isTop = isTop;
            return this;
        }
        public String getIsTop() {
            return this.isTop;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setResourceNiche(String resourceNiche) {
            this.resourceNiche = resourceNiche;
            return this;
        }
        public String getResourceNiche() {
            return this.resourceNiche;
        }

        public DescribeRdsResourceSettingsResponseBodyRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonUrl(String poppedUpButtonUrl) {
            this.poppedUpButtonUrl = poppedUpButtonUrl;
            return this;
        }
        public String getPoppedUpButtonUrl() {
            return this.poppedUpButtonUrl;
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
