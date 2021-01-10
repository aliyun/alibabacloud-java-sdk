// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllLinkeantcodeAntcodeProjectsallRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Page")
    public String page;

    @NameInMap("PerPage")
    public String perPage;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Search")
    public String search;

    public static AllLinkeantcodeAntcodeProjectsallRequest build(java.util.Map<String, ?> map) throws Exception {
        AllLinkeantcodeAntcodeProjectsallRequest self = new AllLinkeantcodeAntcodeProjectsallRequest();
        return TeaModel.build(map, self);
    }

    public AllLinkeantcodeAntcodeProjectsallRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public AllLinkeantcodeAntcodeProjectsallRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public AllLinkeantcodeAntcodeProjectsallRequest setPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
    public String getPerPage() {
        return this.perPage;
    }

    public AllLinkeantcodeAntcodeProjectsallRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AllLinkeantcodeAntcodeProjectsallRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
