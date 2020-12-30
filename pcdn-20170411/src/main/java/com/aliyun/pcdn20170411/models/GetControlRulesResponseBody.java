// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetControlRulesResponseBody extends TeaModel {
    @NameInMap("SettingList")
    public GetControlRulesResponseBodySettingList settingList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pager")
    public GetControlRulesResponseBodyPager pager;

    @NameInMap("Code")
    public Integer code;

    public static GetControlRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetControlRulesResponseBody self = new GetControlRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetControlRulesResponseBody setSettingList(GetControlRulesResponseBodySettingList settingList) {
        this.settingList = settingList;
        return this;
    }
    public GetControlRulesResponseBodySettingList getSettingList() {
        return this.settingList;
    }

    public GetControlRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetControlRulesResponseBody setPager(GetControlRulesResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public GetControlRulesResponseBodyPager getPager() {
        return this.pager;
    }

    public GetControlRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetControlRulesResponseBodySettingListSetting extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("Usable")
        public Boolean usable;

        @NameInMap("Region")
        public String region;

        @NameInMap("PlatformType")
        public String platformType;

        @NameInMap("MarketType")
        public String marketType;

        @NameInMap("Onoff")
        public Boolean onoff;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceId")
        public String resourceId;

        public static GetControlRulesResponseBodySettingListSetting build(java.util.Map<String, ?> map) throws Exception {
            GetControlRulesResponseBodySettingListSetting self = new GetControlRulesResponseBodySettingListSetting();
            return TeaModel.build(map, self);
        }

        public GetControlRulesResponseBodySettingListSetting setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetControlRulesResponseBodySettingListSetting setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetControlRulesResponseBodySettingListSetting setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetControlRulesResponseBodySettingListSetting setUsable(Boolean usable) {
            this.usable = usable;
            return this;
        }
        public Boolean getUsable() {
            return this.usable;
        }

        public GetControlRulesResponseBodySettingListSetting setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetControlRulesResponseBodySettingListSetting setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public GetControlRulesResponseBodySettingListSetting setMarketType(String marketType) {
            this.marketType = marketType;
            return this;
        }
        public String getMarketType() {
            return this.marketType;
        }

        public GetControlRulesResponseBodySettingListSetting setOnoff(Boolean onoff) {
            this.onoff = onoff;
            return this;
        }
        public Boolean getOnoff() {
            return this.onoff;
        }

        public GetControlRulesResponseBodySettingListSetting setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public GetControlRulesResponseBodySettingListSetting setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetControlRulesResponseBodySettingListSetting setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetControlRulesResponseBodySettingListSetting setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetControlRulesResponseBodySettingListSetting setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class GetControlRulesResponseBodySettingList extends TeaModel {
        @NameInMap("Setting")
        public java.util.List<GetControlRulesResponseBodySettingListSetting> setting;

        public static GetControlRulesResponseBodySettingList build(java.util.Map<String, ?> map) throws Exception {
            GetControlRulesResponseBodySettingList self = new GetControlRulesResponseBodySettingList();
            return TeaModel.build(map, self);
        }

        public GetControlRulesResponseBodySettingList setSetting(java.util.List<GetControlRulesResponseBodySettingListSetting> setting) {
            this.setting = setting;
            return this;
        }
        public java.util.List<GetControlRulesResponseBodySettingListSetting> getSetting() {
            return this.setting;
        }

    }

    public static class GetControlRulesResponseBodyPager extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static GetControlRulesResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            GetControlRulesResponseBodyPager self = new GetControlRulesResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public GetControlRulesResponseBodyPager setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetControlRulesResponseBodyPager setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetControlRulesResponseBodyPager setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
