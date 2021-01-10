// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainappsRequest extends TeaModel {
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

    public static GetLinkeBahamutArchdomainappsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainappsRequest self = new GetLinkeBahamutArchdomainappsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainappsRequest setArchDomainExternalId(String archDomainExternalId) {
        this.archDomainExternalId = archDomainExternalId;
        return this;
    }
    public String getArchDomainExternalId() {
        return this.archDomainExternalId;
    }

    public GetLinkeBahamutArchdomainappsRequest setArchDomainID(String archDomainID) {
        this.archDomainID = archDomainID;
        return this;
    }
    public String getArchDomainID() {
        return this.archDomainID;
    }

    public GetLinkeBahamutArchdomainappsRequest setArchDomainName(String archDomainName) {
        this.archDomainName = archDomainName;
        return this;
    }
    public String getArchDomainName() {
        return this.archDomainName;
    }

    public GetLinkeBahamutArchdomainappsRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public GetLinkeBahamutArchdomainappsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutArchdomainappsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLinkeBahamutArchdomainappsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutArchdomainappsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutArchdomainappsRequest setParentArchDomainName(String parentArchDomainName) {
        this.parentArchDomainName = parentArchDomainName;
        return this;
    }
    public String getParentArchDomainName() {
        return this.parentArchDomainName;
    }

    public GetLinkeBahamutArchdomainappsRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public GetLinkeBahamutArchdomainappsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutArchdomainappsRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
