// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageListRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("CallerProtocol")
    public String callerProtocol;

    @NameInMap("ClassId")
    public Long classId;

    @NameInMap("ClientSource")
    public String clientSource;

    @NameInMap("Content")
    public String content;

    @NameInMap("Cookies")
    public String cookies;

    @NameInMap("Loc")
    public String loc;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SrcUrl")
    public String srcUrl;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TenantCode")
    public String tenantCode;

    @NameInMap("Title")
    public String title;

    @NameInMap("UidType")
    public String uidType;

    public static ReadMessageListRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageListRequest self = new ReadMessageListRequest();
        return TeaModel.build(map, self);
    }

    public ReadMessageListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadMessageListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadMessageListRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadMessageListRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadMessageListRequest setClassId(Long classId) {
        this.classId = classId;
        return this;
    }
    public Long getClassId() {
        return this.classId;
    }

    public ReadMessageListRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadMessageListRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReadMessageListRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadMessageListRequest setLoc(String loc) {
        this.loc = loc;
        return this;
    }
    public String getLoc() {
        return this.loc;
    }

    public ReadMessageListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ReadMessageListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ReadMessageListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ReadMessageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ReadMessageListRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadMessageListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ReadMessageListRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadMessageListRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ReadMessageListRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
