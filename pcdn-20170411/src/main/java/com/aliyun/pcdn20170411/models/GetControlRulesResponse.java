// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetControlRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("SettingList")
    @Validation(required = true)
    public GetControlRulesResponseSettingList settingList;

    @NameInMap("Pager")
    @Validation(required = true)
    public GetControlRulesResponsePager pager;

    public static GetControlRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetControlRulesResponse self = new GetControlRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetControlRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetControlRulesResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetControlRulesResponse setSettingList(GetControlRulesResponseSettingList settingList) {
        this.settingList = settingList;
        return this;
    }
    public GetControlRulesResponseSettingList getSettingList() {
        return this.settingList;
    }

    public GetControlRulesResponse setPager(GetControlRulesResponsePager pager) {
        this.pager = pager;
        return this;
    }
    public GetControlRulesResponsePager getPager() {
        return this.pager;
    }

    public static class GetControlRulesResponseSettingListSetting extends TeaModel {
        @NameInMap("PlatformType")
        @Validation(required = true)
        public String platformType;

        @NameInMap("AppVersion")
        @Validation(required = true)
        public String appVersion;

        @NameInMap("IspName")
        @Validation(required = true)
        public String ispName;

        @NameInMap("BusinessType")
        @Validation(required = true)
        public String businessType;

        @NameInMap("ClientId")
        @Validation(required = true)
        public String clientId;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("MarketType")
        @Validation(required = true)
        public String marketType;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Onoff")
        @Validation(required = true)
        public Boolean onoff;

        @NameInMap("Usable")
        @Validation(required = true)
        public Boolean usable;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public String updatedAt;

        public static GetControlRulesResponseSettingListSetting build(java.util.Map<String, ?> map) throws Exception {
            GetControlRulesResponseSettingListSetting self = new GetControlRulesResponseSettingListSetting();
            return TeaModel.build(map, self);
        }

        public GetControlRulesResponseSettingListSetting setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public GetControlRulesResponseSettingListSetting setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetControlRulesResponseSettingListSetting setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public GetControlRulesResponseSettingListSetting setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetControlRulesResponseSettingListSetting setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetControlRulesResponseSettingListSetting setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetControlRulesResponseSettingListSetting setMarketType(String marketType) {
            this.marketType = marketType;
            return this;
        }
        public String getMarketType() {
            return this.marketType;
        }

        public GetControlRulesResponseSettingListSetting setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetControlRulesResponseSettingListSetting setOnoff(Boolean onoff) {
            this.onoff = onoff;
            return this;
        }
        public Boolean getOnoff() {
            return this.onoff;
        }

        public GetControlRulesResponseSettingListSetting setUsable(Boolean usable) {
            this.usable = usable;
            return this;
        }
        public Boolean getUsable() {
            return this.usable;
        }

        public GetControlRulesResponseSettingListSetting setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetControlRulesResponseSettingListSetting setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetControlRulesResponseSettingListSetting setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class GetControlRulesResponseSettingList extends TeaModel {
        @NameInMap("Setting")
        @Validation(required = true)
        public java.util.List<GetControlRulesResponseSettingListSetting> setting;

        public static GetControlRulesResponseSettingList build(java.util.Map<String, ?> map) throws Exception {
            GetControlRulesResponseSettingList self = new GetControlRulesResponseSettingList();
            return TeaModel.build(map, self);
        }

        public GetControlRulesResponseSettingList setSetting(java.util.List<GetControlRulesResponseSettingListSetting> setting) {
            this.setting = setting;
            return this;
        }
        public java.util.List<GetControlRulesResponseSettingListSetting> getSetting() {
            return this.setting;
        }

    }

    public static class GetControlRulesResponsePager extends TeaModel {
        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        public static GetControlRulesResponsePager build(java.util.Map<String, ?> map) throws Exception {
            GetControlRulesResponsePager self = new GetControlRulesResponsePager();
            return TeaModel.build(map, self);
        }

        public GetControlRulesResponsePager setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetControlRulesResponsePager setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetControlRulesResponsePager setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
