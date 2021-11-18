// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserResourceAuthorizationStatusResponseBody extends TeaModel {
    // 现金账户余额
    @NameInMap("AccountBalance")
    public Float accountBalance;

    // 金额是否充足
    @NameInMap("AccountSufficient")
    public Boolean accountSufficient;

    // 充值页面
    @NameInMap("AccountTopUpPage")
    public String accountTopUpPage;

    // 授权开通页面
    @NameInMap("AllAuthorizationPage")
    public String allAuthorizationPage;

    // 购买页
    @NameInMap("BuyPage")
    public String buyPage;

    // 代金券金额
    @NameInMap("CouponBalance")
    public Float couponBalance;

    // 当前版本
    @NameInMap("CurrentFeatureVersion")
    public String currentFeatureVersion;

    // 是否禁止金额验证
    @NameInMap("DisableBalanceCheck")
    public Boolean disableBalanceCheck;

    // dsw默认角色授权页面
    @NameInMap("DswDefaultAuthorizationPage")
    public String dswDefaultAuthorizationPage;

    // 环境
    @NameInMap("Env")
    public String env;

    // ess开通页面
    @NameInMap("EssConsolePage")
    public String essConsolePage;

    // ess是否开通
    @NameInMap("EssServiceAvailable")
    public Boolean essServiceAvailable;

    // 是否通过购买验证
    @NameInMap("HasAllAuthorization")
    public Boolean hasAllAuthorization;

    // 是否通过授权验证
    @NameInMap("HasDswDefaultAuthorization")
    public Boolean hasDswDefaultAuthorization;

    // 是否国际站账号
    @NameInMap("International")
    public Boolean international;

    // 是否子账号登录
    @NameInMap("IsSubUser")
    public Boolean isSubUser;

    // nas控制台
    @NameInMap("NasConsolePage")
    public String nasConsolePage;

    // 是否实名认证
    @NameInMap("RealNameVerified")
    public Boolean realNameVerified;

    // 实名认证页面
    @NameInMap("RealNameVerifiedPage")
    public String realNameVerifiedPage;

    // 地区
    @NameInMap("Region")
    public String region;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 子账号授权开通页面
    @NameInMap("SubUserAuthorizationPage")
    public String subUserAuthorizationPage;

    // 子账号是否授权通过
    @NameInMap("SubUserAuthorized")
    public Boolean subUserAuthorized;

    // 总金额
    @NameInMap("TotalBalance")
    public Float totalBalance;

    public static GetUserResourceAuthorizationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResourceAuthorizationStatusResponseBody self = new GetUserResourceAuthorizationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResourceAuthorizationStatusResponseBody setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }
    public Float getAccountBalance() {
        return this.accountBalance;
    }

    public GetUserResourceAuthorizationStatusResponseBody setAccountSufficient(Boolean accountSufficient) {
        this.accountSufficient = accountSufficient;
        return this;
    }
    public Boolean getAccountSufficient() {
        return this.accountSufficient;
    }

    public GetUserResourceAuthorizationStatusResponseBody setAccountTopUpPage(String accountTopUpPage) {
        this.accountTopUpPage = accountTopUpPage;
        return this;
    }
    public String getAccountTopUpPage() {
        return this.accountTopUpPage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setAllAuthorizationPage(String allAuthorizationPage) {
        this.allAuthorizationPage = allAuthorizationPage;
        return this;
    }
    public String getAllAuthorizationPage() {
        return this.allAuthorizationPage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setBuyPage(String buyPage) {
        this.buyPage = buyPage;
        return this;
    }
    public String getBuyPage() {
        return this.buyPage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setCouponBalance(Float couponBalance) {
        this.couponBalance = couponBalance;
        return this;
    }
    public Float getCouponBalance() {
        return this.couponBalance;
    }

    public GetUserResourceAuthorizationStatusResponseBody setCurrentFeatureVersion(String currentFeatureVersion) {
        this.currentFeatureVersion = currentFeatureVersion;
        return this;
    }
    public String getCurrentFeatureVersion() {
        return this.currentFeatureVersion;
    }

    public GetUserResourceAuthorizationStatusResponseBody setDisableBalanceCheck(Boolean disableBalanceCheck) {
        this.disableBalanceCheck = disableBalanceCheck;
        return this;
    }
    public Boolean getDisableBalanceCheck() {
        return this.disableBalanceCheck;
    }

    public GetUserResourceAuthorizationStatusResponseBody setDswDefaultAuthorizationPage(String dswDefaultAuthorizationPage) {
        this.dswDefaultAuthorizationPage = dswDefaultAuthorizationPage;
        return this;
    }
    public String getDswDefaultAuthorizationPage() {
        return this.dswDefaultAuthorizationPage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetUserResourceAuthorizationStatusResponseBody setEssConsolePage(String essConsolePage) {
        this.essConsolePage = essConsolePage;
        return this;
    }
    public String getEssConsolePage() {
        return this.essConsolePage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setEssServiceAvailable(Boolean essServiceAvailable) {
        this.essServiceAvailable = essServiceAvailable;
        return this;
    }
    public Boolean getEssServiceAvailable() {
        return this.essServiceAvailable;
    }

    public GetUserResourceAuthorizationStatusResponseBody setHasAllAuthorization(Boolean hasAllAuthorization) {
        this.hasAllAuthorization = hasAllAuthorization;
        return this;
    }
    public Boolean getHasAllAuthorization() {
        return this.hasAllAuthorization;
    }

    public GetUserResourceAuthorizationStatusResponseBody setHasDswDefaultAuthorization(Boolean hasDswDefaultAuthorization) {
        this.hasDswDefaultAuthorization = hasDswDefaultAuthorization;
        return this;
    }
    public Boolean getHasDswDefaultAuthorization() {
        return this.hasDswDefaultAuthorization;
    }

    public GetUserResourceAuthorizationStatusResponseBody setInternational(Boolean international) {
        this.international = international;
        return this;
    }
    public Boolean getInternational() {
        return this.international;
    }

    public GetUserResourceAuthorizationStatusResponseBody setIsSubUser(Boolean isSubUser) {
        this.isSubUser = isSubUser;
        return this;
    }
    public Boolean getIsSubUser() {
        return this.isSubUser;
    }

    public GetUserResourceAuthorizationStatusResponseBody setNasConsolePage(String nasConsolePage) {
        this.nasConsolePage = nasConsolePage;
        return this;
    }
    public String getNasConsolePage() {
        return this.nasConsolePage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setRealNameVerified(Boolean realNameVerified) {
        this.realNameVerified = realNameVerified;
        return this;
    }
    public Boolean getRealNameVerified() {
        return this.realNameVerified;
    }

    public GetUserResourceAuthorizationStatusResponseBody setRealNameVerifiedPage(String realNameVerifiedPage) {
        this.realNameVerifiedPage = realNameVerifiedPage;
        return this;
    }
    public String getRealNameVerifiedPage() {
        return this.realNameVerifiedPage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetUserResourceAuthorizationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResourceAuthorizationStatusResponseBody setSubUserAuthorizationPage(String subUserAuthorizationPage) {
        this.subUserAuthorizationPage = subUserAuthorizationPage;
        return this;
    }
    public String getSubUserAuthorizationPage() {
        return this.subUserAuthorizationPage;
    }

    public GetUserResourceAuthorizationStatusResponseBody setSubUserAuthorized(Boolean subUserAuthorized) {
        this.subUserAuthorized = subUserAuthorized;
        return this;
    }
    public Boolean getSubUserAuthorized() {
        return this.subUserAuthorized;
    }

    public GetUserResourceAuthorizationStatusResponseBody setTotalBalance(Float totalBalance) {
        this.totalBalance = totalBalance;
        return this;
    }
    public Float getTotalBalance() {
        return this.totalBalance;
    }

}
