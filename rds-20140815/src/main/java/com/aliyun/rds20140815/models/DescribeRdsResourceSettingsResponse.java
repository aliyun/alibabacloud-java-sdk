// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRdsResourceSettingsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RdsInstanceResourceSettings")
    @Validation(required = true)
    public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings rdsInstanceResourceSettings;

    public static DescribeRdsResourceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsResourceSettingsResponse self = new DescribeRdsResourceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsResourceSettingsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsResourceSettingsResponse setRdsInstanceResourceSettings(DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings rdsInstanceResourceSettings) {
        this.rdsInstanceResourceSettings = rdsInstanceResourceSettings;
        return this;
    }
    public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings getRdsInstanceResourceSettings() {
        return this.rdsInstanceResourceSettings;
    }

    public static class DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting extends TeaModel {
        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("ResourceNiche")
        @Validation(required = true)
        public String resourceNiche;

        @NameInMap("NoticeBarContent")
        @Validation(required = true)
        public String noticeBarContent;

        @NameInMap("PoppedUpButtonText")
        @Validation(required = true)
        public String poppedUpButtonText;

        @NameInMap("PoppedUpButtonType")
        @Validation(required = true)
        public String poppedUpButtonType;

        @NameInMap("PoppedUpButtonUrl")
        @Validation(required = true)
        public String poppedUpButtonUrl;

        @NameInMap("PoppedUpContent")
        @Validation(required = true)
        public String poppedUpContent;

        @NameInMap("IsTop")
        @Validation(required = true)
        public String isTop;

        public static DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting self = new DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting();
            return TeaModel.build(map, self);
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setResourceNiche(String resourceNiche) {
            this.resourceNiche = resourceNiche;
            return this;
        }
        public String getResourceNiche() {
            return this.resourceNiche;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setNoticeBarContent(String noticeBarContent) {
            this.noticeBarContent = noticeBarContent;
            return this;
        }
        public String getNoticeBarContent() {
            return this.noticeBarContent;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonText(String poppedUpButtonText) {
            this.poppedUpButtonText = poppedUpButtonText;
            return this;
        }
        public String getPoppedUpButtonText() {
            return this.poppedUpButtonText;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonType(String poppedUpButtonType) {
            this.poppedUpButtonType = poppedUpButtonType;
            return this;
        }
        public String getPoppedUpButtonType() {
            return this.poppedUpButtonType;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpButtonUrl(String poppedUpButtonUrl) {
            this.poppedUpButtonUrl = poppedUpButtonUrl;
            return this;
        }
        public String getPoppedUpButtonUrl() {
            return this.poppedUpButtonUrl;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setPoppedUpContent(String poppedUpContent) {
            this.poppedUpContent = poppedUpContent;
            return this;
        }
        public String getPoppedUpContent() {
            return this.poppedUpContent;
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting setIsTop(String isTop) {
            this.isTop = isTop;
            return this;
        }
        public String getIsTop() {
            return this.isTop;
        }

    }

    public static class DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings extends TeaModel {
        @NameInMap("RdsInstanceResourceSetting")
        @Validation(required = true)
        public java.util.List<DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting> rdsInstanceResourceSetting;

        public static DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings self = new DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings();
            return TeaModel.build(map, self);
        }

        public DescribeRdsResourceSettingsResponseRdsInstanceResourceSettings setRdsInstanceResourceSetting(java.util.List<DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting> rdsInstanceResourceSetting) {
            this.rdsInstanceResourceSetting = rdsInstanceResourceSetting;
            return this;
        }
        public java.util.List<DescribeRdsResourceSettingsResponseRdsInstanceResourceSettingsRdsInstanceResourceSetting> getRdsInstanceResourceSetting() {
            return this.rdsInstanceResourceSetting;
        }

    }

}
