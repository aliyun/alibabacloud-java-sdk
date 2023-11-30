// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DomainSeniorConfig extends TeaModel {
    @NameInMap("client_download_enable")
    public Boolean clientDownloadEnable;

    @NameInMap("csp_frame_ancestors")
    public String cspFrameAncestors;

    @NameInMap("custom_login_appid")
    public String customLoginAppid;

    @NameInMap("custom_login_url")
    public String customLoginUrl;

    @NameInMap("custom_logout_url")
    public String customLogoutUrl;

    @NameInMap("custom_side_link_list")
    public java.util.List<CustomSideLinkConfig> customSideLinkList;

    @NameInMap("home_page_bg_image_url")
    public String homePageBgImageUrl;

    @NameInMap("home_page_footer")
    public String homePageFooter;

    @NameInMap("home_page_footer2")
    public String homePageFooter2;

    @NameInMap("home_page_slogan")
    public String homePageSlogan;

    @NameInMap("referer_enable")
    public Boolean refererEnable;

    @NameInMap("wx_txt_list")
    public WxTrustedDomainConfig wxTxtList;

    public static DomainSeniorConfig build(java.util.Map<String, ?> map) throws Exception {
        DomainSeniorConfig self = new DomainSeniorConfig();
        return TeaModel.build(map, self);
    }

    public DomainSeniorConfig setClientDownloadEnable(Boolean clientDownloadEnable) {
        this.clientDownloadEnable = clientDownloadEnable;
        return this;
    }
    public Boolean getClientDownloadEnable() {
        return this.clientDownloadEnable;
    }

    public DomainSeniorConfig setCspFrameAncestors(String cspFrameAncestors) {
        this.cspFrameAncestors = cspFrameAncestors;
        return this;
    }
    public String getCspFrameAncestors() {
        return this.cspFrameAncestors;
    }

    public DomainSeniorConfig setCustomLoginAppid(String customLoginAppid) {
        this.customLoginAppid = customLoginAppid;
        return this;
    }
    public String getCustomLoginAppid() {
        return this.customLoginAppid;
    }

    public DomainSeniorConfig setCustomLoginUrl(String customLoginUrl) {
        this.customLoginUrl = customLoginUrl;
        return this;
    }
    public String getCustomLoginUrl() {
        return this.customLoginUrl;
    }

    public DomainSeniorConfig setCustomLogoutUrl(String customLogoutUrl) {
        this.customLogoutUrl = customLogoutUrl;
        return this;
    }
    public String getCustomLogoutUrl() {
        return this.customLogoutUrl;
    }

    public DomainSeniorConfig setCustomSideLinkList(java.util.List<CustomSideLinkConfig> customSideLinkList) {
        this.customSideLinkList = customSideLinkList;
        return this;
    }
    public java.util.List<CustomSideLinkConfig> getCustomSideLinkList() {
        return this.customSideLinkList;
    }

    public DomainSeniorConfig setHomePageBgImageUrl(String homePageBgImageUrl) {
        this.homePageBgImageUrl = homePageBgImageUrl;
        return this;
    }
    public String getHomePageBgImageUrl() {
        return this.homePageBgImageUrl;
    }

    public DomainSeniorConfig setHomePageFooter(String homePageFooter) {
        this.homePageFooter = homePageFooter;
        return this;
    }
    public String getHomePageFooter() {
        return this.homePageFooter;
    }

    public DomainSeniorConfig setHomePageFooter2(String homePageFooter2) {
        this.homePageFooter2 = homePageFooter2;
        return this;
    }
    public String getHomePageFooter2() {
        return this.homePageFooter2;
    }

    public DomainSeniorConfig setHomePageSlogan(String homePageSlogan) {
        this.homePageSlogan = homePageSlogan;
        return this;
    }
    public String getHomePageSlogan() {
        return this.homePageSlogan;
    }

    public DomainSeniorConfig setRefererEnable(Boolean refererEnable) {
        this.refererEnable = refererEnable;
        return this;
    }
    public Boolean getRefererEnable() {
        return this.refererEnable;
    }

    public DomainSeniorConfig setWxTxtList(WxTrustedDomainConfig wxTxtList) {
        this.wxTxtList = wxTxtList;
        return this;
    }
    public WxTrustedDomainConfig getWxTxtList() {
        return this.wxTxtList;
    }

}
