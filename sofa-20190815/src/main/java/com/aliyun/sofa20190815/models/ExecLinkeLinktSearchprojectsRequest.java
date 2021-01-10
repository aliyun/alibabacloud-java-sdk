// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchprojectsRequest extends TeaModel {
    @NameInMap("IncludeArchived")
    public String includeArchived;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OnlyParticipated")
    public String onlyParticipated;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RoleControl")
    public String roleControl;

    public static ExecLinkeLinktSearchprojectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchprojectsRequest self = new ExecLinkeLinktSearchprojectsRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchprojectsRequest setIncludeArchived(String includeArchived) {
        this.includeArchived = includeArchived;
        return this;
    }
    public String getIncludeArchived() {
        return this.includeArchived;
    }

    public ExecLinkeLinktSearchprojectsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ExecLinkeLinktSearchprojectsRequest setOnlyParticipated(String onlyParticipated) {
        this.onlyParticipated = onlyParticipated;
        return this;
    }
    public String getOnlyParticipated() {
        return this.onlyParticipated;
    }

    public ExecLinkeLinktSearchprojectsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ExecLinkeLinktSearchprojectsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ExecLinkeLinktSearchprojectsRequest setRoleControl(String roleControl) {
        this.roleControl = roleControl;
        return this;
    }
    public String getRoleControl() {
        return this.roleControl;
    }

}
