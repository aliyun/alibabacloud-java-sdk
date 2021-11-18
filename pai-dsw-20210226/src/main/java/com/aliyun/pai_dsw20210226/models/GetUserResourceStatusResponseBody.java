// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserResourceStatusResponseBody extends TeaModel {
    // 现金账户余额
    @NameInMap("AccountBalance")
    public Float accountBalance;

    // 金额是否充足
    @NameInMap("AccountSufficient")
    public Boolean accountSufficient;

    // 充值页面
    @NameInMap("AccountTopUpPage")
    public String accountTopUpPage;

    // 授权页面
    @NameInMap("AllAuthorizationPage")
    public String allAuthorizationPage;

    // 代金券余额
    @NameInMap("CouponBalance")
    public Float couponBalance;

    // 环境
    @NameInMap("Env")
    public String env;

    // 是否通过购买条件验证
    @NameInMap("HasAllAuthorization")
    public Boolean hasAllAuthorization;

    // 是否国际站账号
    @NameInMap("International")
    public Boolean international;

    // 是否实名验证
    @NameInMap("RealNameVerified")
    public Boolean realNameVerified;

    // 实名验证页面
    @NameInMap("RealNameVerifiedPage")
    public String realNameVerifiedPage;

    // 地区
    @NameInMap("Region")
    public String region;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总余额
    @NameInMap("TotalBalance")
    public Float totalBalance;

    public static GetUserResourceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResourceStatusResponseBody self = new GetUserResourceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResourceStatusResponseBody setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }
    public Float getAccountBalance() {
        return this.accountBalance;
    }

    public GetUserResourceStatusResponseBody setAccountSufficient(Boolean accountSufficient) {
        this.accountSufficient = accountSufficient;
        return this;
    }
    public Boolean getAccountSufficient() {
        return this.accountSufficient;
    }

    public GetUserResourceStatusResponseBody setAccountTopUpPage(String accountTopUpPage) {
        this.accountTopUpPage = accountTopUpPage;
        return this;
    }
    public String getAccountTopUpPage() {
        return this.accountTopUpPage;
    }

    public GetUserResourceStatusResponseBody setAllAuthorizationPage(String allAuthorizationPage) {
        this.allAuthorizationPage = allAuthorizationPage;
        return this;
    }
    public String getAllAuthorizationPage() {
        return this.allAuthorizationPage;
    }

    public GetUserResourceStatusResponseBody setCouponBalance(Float couponBalance) {
        this.couponBalance = couponBalance;
        return this;
    }
    public Float getCouponBalance() {
        return this.couponBalance;
    }

    public GetUserResourceStatusResponseBody setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetUserResourceStatusResponseBody setHasAllAuthorization(Boolean hasAllAuthorization) {
        this.hasAllAuthorization = hasAllAuthorization;
        return this;
    }
    public Boolean getHasAllAuthorization() {
        return this.hasAllAuthorization;
    }

    public GetUserResourceStatusResponseBody setInternational(Boolean international) {
        this.international = international;
        return this;
    }
    public Boolean getInternational() {
        return this.international;
    }

    public GetUserResourceStatusResponseBody setRealNameVerified(Boolean realNameVerified) {
        this.realNameVerified = realNameVerified;
        return this;
    }
    public Boolean getRealNameVerified() {
        return this.realNameVerified;
    }

    public GetUserResourceStatusResponseBody setRealNameVerifiedPage(String realNameVerifiedPage) {
        this.realNameVerifiedPage = realNameVerifiedPage;
        return this;
    }
    public String getRealNameVerifiedPage() {
        return this.realNameVerifiedPage;
    }

    public GetUserResourceStatusResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetUserResourceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResourceStatusResponseBody setTotalBalance(Float totalBalance) {
        this.totalBalance = totalBalance;
        return this;
    }
    public Float getTotalBalance() {
        return this.totalBalance;
    }

}
