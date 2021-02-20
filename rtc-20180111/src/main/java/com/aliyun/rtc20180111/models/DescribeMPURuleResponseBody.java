// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPURuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeMPURuleResponseBodyRules> rules;

    public static DescribeMPURuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPURuleResponseBody self = new DescribeMPURuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPURuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMPURuleResponseBody setRules(java.util.List<DescribeMPURuleResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeMPURuleResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeMPURuleResponseBodyRules extends TeaModel {
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        @NameInMap("CropMode")
        public Integer cropMode;

        @NameInMap("CallBack")
        public String callBack;

        @NameInMap("PlayDomain")
        public String playDomain;

        @NameInMap("ChannelPrefix")
        public String channelPrefix;

        @NameInMap("BackgroudColor")
        public Integer backgroudColor;

        @NameInMap("IsEnable")
        public Integer isEnable;

        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        @NameInMap("TaskProfile")
        public String taskProfile;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeMPURuleResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPURuleResponseBodyRules self = new DescribeMPURuleResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeMPURuleResponseBodyRules setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public DescribeMPURuleResponseBodyRules setCropMode(Integer cropMode) {
            this.cropMode = cropMode;
            return this;
        }
        public Integer getCropMode() {
            return this.cropMode;
        }

        public DescribeMPURuleResponseBodyRules setCallBack(String callBack) {
            this.callBack = callBack;
            return this;
        }
        public String getCallBack() {
            return this.callBack;
        }

        public DescribeMPURuleResponseBodyRules setPlayDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }
        public String getPlayDomain() {
            return this.playDomain;
        }

        public DescribeMPURuleResponseBodyRules setChannelPrefix(String channelPrefix) {
            this.channelPrefix = channelPrefix;
            return this;
        }
        public String getChannelPrefix() {
            return this.channelPrefix;
        }

        public DescribeMPURuleResponseBodyRules setBackgroudColor(Integer backgroudColor) {
            this.backgroudColor = backgroudColor;
            return this;
        }
        public Integer getBackgroudColor() {
            return this.backgroudColor;
        }

        public DescribeMPURuleResponseBodyRules setIsEnable(Integer isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public Integer getIsEnable() {
            return this.isEnable;
        }

        public DescribeMPURuleResponseBodyRules setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public DescribeMPURuleResponseBodyRules setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeMPURuleResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
