// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadRevisionHistoryListRequest extends TeaModel {
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
    public ReadRevisionHistoryListRequestPageInfo pageInfo;

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

    public static ReadRevisionHistoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadRevisionHistoryListRequest self = new ReadRevisionHistoryListRequest();
        return TeaModel.build(map, self);
    }

    public ReadRevisionHistoryListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadRevisionHistoryListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadRevisionHistoryListRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadRevisionHistoryListRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadRevisionHistoryListRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public ReadRevisionHistoryListRequest setChannelGroupCode(String channelGroupCode) {
        this.channelGroupCode = channelGroupCode;
        return this;
    }
    public String getChannelGroupCode() {
        return this.channelGroupCode;
    }

    public ReadRevisionHistoryListRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadRevisionHistoryListRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadRevisionHistoryListRequest setPageInfo(ReadRevisionHistoryListRequestPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ReadRevisionHistoryListRequestPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ReadRevisionHistoryListRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadRevisionHistoryListRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadRevisionHistoryListRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

    public static class ReadRevisionHistoryListRequestPageInfo extends TeaModel {
        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of data.</p>
         * 
         * <strong>example:</strong>
         * <p>e2b5170336162251e0b5e8707e68181f</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Specifies whether to return the total count.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReturnTotalCount")
        public Boolean returnTotalCount;

        public static ReadRevisionHistoryListRequestPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ReadRevisionHistoryListRequestPageInfo self = new ReadRevisionHistoryListRequestPageInfo();
            return TeaModel.build(map, self);
        }

        public ReadRevisionHistoryListRequestPageInfo setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ReadRevisionHistoryListRequestPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ReadRevisionHistoryListRequestPageInfo setReturnTotalCount(Boolean returnTotalCount) {
            this.returnTotalCount = returnTotalCount;
            return this;
        }
        public Boolean getReturnTotalCount() {
            return this.returnTotalCount;
        }

    }

}
