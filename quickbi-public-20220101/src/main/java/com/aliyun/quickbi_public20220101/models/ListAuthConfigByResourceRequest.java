// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAuthConfigByResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only records that have permissions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAuth")
    public Boolean hasAuth;

    /**
     * <p>The search keyword for the authorized object.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The ID of the resource to authorize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>al*************7ufv</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The query granularity. Valid values:</p>
     * <ul>
     * <li>0: user</li>
     * <li>1: user group</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Authorization records for organizations and workspaces are returned at the user granularity. Datasets and data sources can only be authorized to users.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ShareToType")
    public Integer shareToType;

    /**
     * <p>The type of the authorization resource. Valid values:</p>
     * <ul>
     * <li>dashboard: dashboard</li>
     * <li>screen: data screen</li>
     * <li>report: electron</li>
     * <li>ANALYSIS: ad hoc analysis</li>
     * <li>dashboardOfflineQuery: self-service data retrieval</li>
     * <li>dataForm: data form</li>
     * <li>cube: dataset</li>
     * <li>datasource: data source</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPORT</p>
     */
    @NameInMap("WorksType")
    public String worksType;

    public static ListAuthConfigByResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthConfigByResourceRequest self = new ListAuthConfigByResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthConfigByResourceRequest setHasAuth(Boolean hasAuth) {
        this.hasAuth = hasAuth;
        return this;
    }
    public Boolean getHasAuth() {
        return this.hasAuth;
    }

    public ListAuthConfigByResourceRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAuthConfigByResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListAuthConfigByResourceRequest setShareToType(Integer shareToType) {
        this.shareToType = shareToType;
        return this;
    }
    public Integer getShareToType() {
        return this.shareToType;
    }

    public ListAuthConfigByResourceRequest setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

}
