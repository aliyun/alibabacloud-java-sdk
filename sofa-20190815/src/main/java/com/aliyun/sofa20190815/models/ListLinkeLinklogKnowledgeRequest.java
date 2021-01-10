// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinklogKnowledgeRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("KnowledgeName")
    public String knowledgeName;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StoreId")
    public String storeId;

    public static ListLinkeLinklogKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinklogKnowledgeRequest self = new ListLinkeLinklogKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinklogKnowledgeRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListLinkeLinklogKnowledgeRequest setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName;
        return this;
    }
    public String getKnowledgeName() {
        return this.knowledgeName;
    }

    public ListLinkeLinklogKnowledgeRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListLinkeLinklogKnowledgeRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
