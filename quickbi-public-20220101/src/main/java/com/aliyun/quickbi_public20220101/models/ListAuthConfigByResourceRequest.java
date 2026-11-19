// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAuthConfigByResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only the records that have permissions.</p>
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
     * <p>The ID of the resource to be authorized.</p>
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
     * <li>0: User.</li>
     * <li>1: User group.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Authorization records for organizations and workspaces are returned at the user granularity. Datasets and data sources can only be authorized to users.</notice></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ShareToType")
    public Integer shareToType;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>dashboard: Dashboard.</li>
     * <li>screen: Data screen.</li>
     * <li>report: Workbook.</li>
     * <li>ANALYSIS: Ad hoc analysis.</li>
     * <li>dashboardOfflineQuery: Self-service data retrieval.</li>
     * <li>dataForm: Data entry.</li>
     * <li>cube: Dataset.</li>
     * <li>datasource: Data source.</li>
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
