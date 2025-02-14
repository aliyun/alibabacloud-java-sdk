// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMachineAppsRequest extends TeaModel {
    /**
     * <p>SAE application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5b41f4bf-349f-4263-89b1-9234c034****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>SAE application name.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-commprice-shop</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AppRegionId")
    public String appRegionId;

    /**
     * <p>The authorization version of the asset. Values:</p>
     * <ul>
     * <li><strong>6</strong>: Anti-virus edition</li>
     * <li><strong>5</strong>: Advanced edition</li>
     * <li><strong>3</strong>: Enterprise edition</li>
     * <li><strong>7</strong>: Ultimate edition</li>
     * <li><strong>10</strong>: Value-added Service Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("AuthVersion")
    public String authVersion;

    /**
     * <p>The page number to display in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for request and response, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of items to display per page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ResourceDirectoryUid")
    public Long resourceDirectoryUid;

    public static ListMachineAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMachineAppsRequest self = new ListMachineAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListMachineAppsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMachineAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMachineAppsRequest setAppRegionId(String appRegionId) {
        this.appRegionId = appRegionId;
        return this;
    }
    public String getAppRegionId() {
        return this.appRegionId;
    }

    public ListMachineAppsRequest setAuthVersion(String authVersion) {
        this.authVersion = authVersion;
        return this;
    }
    public String getAuthVersion() {
        return this.authVersion;
    }

    public ListMachineAppsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListMachineAppsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListMachineAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMachineAppsRequest setResourceDirectoryUid(Long resourceDirectoryUid) {
        this.resourceDirectoryUid = resourceDirectoryUid;
        return this;
    }
    public Long getResourceDirectoryUid() {
        return this.resourceDirectoryUid;
    }

}
