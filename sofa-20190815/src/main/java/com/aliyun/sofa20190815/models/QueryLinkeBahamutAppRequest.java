// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppRequest extends TeaModel {
    @NameInMap("ArchDomainExternalId")
    public String archDomainExternalId;

    @NameInMap("ArchDomainID")
    public String archDomainID;

    @NameInMap("ArchDomainName")
    public String archDomainName;

    @NameInMap("Field")
    public String field;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ParentArchDomainName")
    public String parentArchDomainName;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserAccount")
    public String userAccount;

    public static QueryLinkeBahamutAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppRequest self = new QueryLinkeBahamutAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppRequest setArchDomainExternalId(String archDomainExternalId) {
        this.archDomainExternalId = archDomainExternalId;
        return this;
    }
    public String getArchDomainExternalId() {
        return this.archDomainExternalId;
    }

    public QueryLinkeBahamutAppRequest setArchDomainID(String archDomainID) {
        this.archDomainID = archDomainID;
        return this;
    }
    public String getArchDomainID() {
        return this.archDomainID;
    }

    public QueryLinkeBahamutAppRequest setArchDomainName(String archDomainName) {
        this.archDomainName = archDomainName;
        return this;
    }
    public String getArchDomainName() {
        return this.archDomainName;
    }

    public QueryLinkeBahamutAppRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public QueryLinkeBahamutAppRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutAppRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLinkeBahamutAppRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutAppRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutAppRequest setParentArchDomainName(String parentArchDomainName) {
        this.parentArchDomainName = parentArchDomainName;
        return this;
    }
    public String getParentArchDomainName() {
        return this.parentArchDomainName;
    }

    public QueryLinkeBahamutAppRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public QueryLinkeBahamutAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryLinkeBahamutAppRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
