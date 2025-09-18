// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageListRequest extends TeaModel {
    /**
     * <p>语言，默认为简体中文</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("CallerProtocol")
    public String callerProtocol;

    /**
     * <p>消息类目ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClassId")
    public Long classId;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ClientSource")
    public String clientSource;

    /**
     * <p>消息内容，用于模糊搜索</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;消息内容示例“</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Cookies")
    public String cookies;

    @NameInMap("GroupCode")
    public String groupCode;

    @NameInMap("History")
    public String history;

    /**
     * <p>栏位 nav代表控制台topbar</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Loc")
    public String loc;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>分页查询页码</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>分页查询大小</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("SrcUrl")
    public String srcUrl;

    /**
     * <p>消息状态，已读为1，未读为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    /**
     * <p>消息标题，用于模糊搜索</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;标题示例“</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>系统参数，无需填写</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
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

    public ReadMessageListRequest setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public ReadMessageListRequest setHistory(String history) {
        this.history = history;
        return this;
    }
    public String getHistory() {
        return this.history;
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
