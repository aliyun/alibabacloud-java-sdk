// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationadvancedsearchRequest extends TeaModel {
    @NameInMap("Creator")
    public String creator;

    @NameInMap("Current")
    public Long current;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("Field")
    public String field;

    @NameInMap("Finished")
    public Boolean finished;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Member")
    public String member;

    @NameInMap("MostPreUnitFabricStageName")
    public String mostPreUnitFabricStageName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Project")
    public String project;

    @NameInMap("Release")
    public String release;

    @NameInMap("ReleaseEndDate")
    public Long releaseEndDate;

    @NameInMap("ReleaseStartDate")
    public Long releaseStartDate;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TenantPath")
    public String tenantPath;

    @NameInMap("WithDeleted")
    public Boolean withDeleted;

    public static QueryLinkeBahamutIterationadvancedsearchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationadvancedsearchRequest self = new QueryLinkeBahamutIterationadvancedsearchRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setMember(String member) {
        this.member = member;
        return this;
    }
    public String getMember() {
        return this.member;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setMostPreUnitFabricStageName(String mostPreUnitFabricStageName) {
        this.mostPreUnitFabricStageName = mostPreUnitFabricStageName;
        return this;
    }
    public String getMostPreUnitFabricStageName() {
        return this.mostPreUnitFabricStageName;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setReleaseEndDate(Long releaseEndDate) {
        this.releaseEndDate = releaseEndDate;
        return this;
    }
    public Long getReleaseEndDate() {
        return this.releaseEndDate;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setReleaseStartDate(Long releaseStartDate) {
        this.releaseStartDate = releaseStartDate;
        return this;
    }
    public Long getReleaseStartDate() {
        return this.releaseStartDate;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

    public QueryLinkeBahamutIterationadvancedsearchRequest setWithDeleted(Boolean withDeleted) {
        this.withDeleted = withDeleted;
        return this;
    }
    public Boolean getWithDeleted() {
        return this.withDeleted;
    }

}
