// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadRevisionHistoryListShrinkRequest extends TeaModel {
    /**
     * <p>The language. Automatically passed through by the browser. You can manually override this value.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Ignored. No need to pass this parameter. The application name of the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Ignored. No need to pass this parameter. The business line of the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>Ignored. No need to pass this parameter. The request protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("CallerProtocol")
    public String callerProtocol;

    /**
     * <p>The category code.</p>
     * 
     * <strong>example:</strong>
     * <p>prod_edu_content</p>
     */
    @NameInMap("CategoryCode")
    public String categoryCode;

    /**
     * <p>The channel group.</p>
     * 
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("ChannelGroupCode")
    public String channelGroupCode;

    /**
     * <p>Ignored. No need to pass this parameter. The source of the operation terminal.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ClientSource")
    public String clientSource;

    /**
     * <p>Ignored. No need to pass this parameter. The user cookies.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Cookies")
    public String cookies;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public String pageInfoShrink;

    /**
     * <p>Ignored. No need to pass this parameter. The source page URL.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("SrcUrl")
    public String srcUrl;

    /**
     * <p>Ignored. No need to pass this parameter. The tenant information.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    /**
     * <p>Ignored. No need to pass this parameter. The user type.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("UidType")
    public String uidType;

    public static ReadRevisionHistoryListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadRevisionHistoryListShrinkRequest self = new ReadRevisionHistoryListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReadRevisionHistoryListShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadRevisionHistoryListShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadRevisionHistoryListShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadRevisionHistoryListShrinkRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadRevisionHistoryListShrinkRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public ReadRevisionHistoryListShrinkRequest setChannelGroupCode(String channelGroupCode) {
        this.channelGroupCode = channelGroupCode;
        return this;
    }
    public String getChannelGroupCode() {
        return this.channelGroupCode;
    }

    public ReadRevisionHistoryListShrinkRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadRevisionHistoryListShrinkRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadRevisionHistoryListShrinkRequest setPageInfoShrink(String pageInfoShrink) {
        this.pageInfoShrink = pageInfoShrink;
        return this;
    }
    public String getPageInfoShrink() {
        return this.pageInfoShrink;
    }

    public ReadRevisionHistoryListShrinkRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadRevisionHistoryListShrinkRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadRevisionHistoryListShrinkRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
