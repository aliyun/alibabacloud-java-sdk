// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigSettingsResponseBody extends TeaModel {
    @NameInMap("ConfigSettings")
    public DescribeConfigSettingsResponseBodyConfigSettings configSettings;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DescribeConfigSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigSettingsResponseBody self = new DescribeConfigSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigSettingsResponseBody setConfigSettings(DescribeConfigSettingsResponseBodyConfigSettings configSettings) {
        this.configSettings = configSettings;
        return this;
    }
    public DescribeConfigSettingsResponseBodyConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public DescribeConfigSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting extends TeaModel {
        @NameInMap("OptionName")
        public String optionName;

        @NameInMap("PathName")
        public String pathName;

        @NameInMap("SettingValue")
        public String settingValue;

        public static DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting self = new DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting();
            return TeaModel.build(map, self);
        }

        public DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting setOptionName(String optionName) {
            this.optionName = optionName;
            return this;
        }
        public String getOptionName() {
            return this.optionName;
        }

        public DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting setSettingValue(String settingValue) {
            this.settingValue = settingValue;
            return this;
        }
        public String getSettingValue() {
            return this.settingValue;
        }

    }

    public static class DescribeConfigSettingsResponseBodyConfigSettings extends TeaModel {
        @NameInMap("ConfigSetting")
        public java.util.List<DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting> configSetting;

        public static DescribeConfigSettingsResponseBodyConfigSettings build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigSettingsResponseBodyConfigSettings self = new DescribeConfigSettingsResponseBodyConfigSettings();
            return TeaModel.build(map, self);
        }

        public DescribeConfigSettingsResponseBodyConfigSettings setConfigSetting(java.util.List<DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting> configSetting) {
            this.configSetting = configSetting;
            return this;
        }
        public java.util.List<DescribeConfigSettingsResponseBodyConfigSettingsConfigSetting> getConfigSetting() {
            return this.configSetting;
        }

    }

}
