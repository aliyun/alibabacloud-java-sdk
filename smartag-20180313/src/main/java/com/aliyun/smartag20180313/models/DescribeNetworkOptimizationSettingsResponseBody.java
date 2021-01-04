// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeNetworkOptimizationSettingsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Settings")
    public DescribeNetworkOptimizationSettingsResponseBodySettings settings;

    public static DescribeNetworkOptimizationSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkOptimizationSettingsResponseBody self = new DescribeNetworkOptimizationSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkOptimizationSettingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkOptimizationSettingsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkOptimizationSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkOptimizationSettingsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkOptimizationSettingsResponseBody setSettings(DescribeNetworkOptimizationSettingsResponseBodySettings settings) {
        this.settings = settings;
        return this;
    }
    public DescribeNetworkOptimizationSettingsResponseBodySettings getSettings() {
        return this.settings;
    }

    public static class DescribeNetworkOptimizationSettingsResponseBodySettingsSetting extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Domain")
        public String domain;

        public static DescribeNetworkOptimizationSettingsResponseBodySettingsSetting build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkOptimizationSettingsResponseBodySettingsSetting self = new DescribeNetworkOptimizationSettingsResponseBodySettingsSetting();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkOptimizationSettingsResponseBodySettingsSetting setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNetworkOptimizationSettingsResponseBodySettingsSetting setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

    public static class DescribeNetworkOptimizationSettingsResponseBodySettings extends TeaModel {
        @NameInMap("Setting")
        public java.util.List<DescribeNetworkOptimizationSettingsResponseBodySettingsSetting> setting;

        public static DescribeNetworkOptimizationSettingsResponseBodySettings build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkOptimizationSettingsResponseBodySettings self = new DescribeNetworkOptimizationSettingsResponseBodySettings();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkOptimizationSettingsResponseBodySettings setSetting(java.util.List<DescribeNetworkOptimizationSettingsResponseBodySettingsSetting> setting) {
            this.setting = setting;
            return this;
        }
        public java.util.List<DescribeNetworkOptimizationSettingsResponseBodySettingsSetting> getSetting() {
            return this.setting;
        }

    }

}
