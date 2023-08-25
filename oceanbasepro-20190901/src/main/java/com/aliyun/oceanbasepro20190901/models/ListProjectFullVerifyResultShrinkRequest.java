// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectFullVerifyResultShrinkRequest extends TeaModel {
    @NameInMap("DestSchemas")
    public String destSchemasShrink;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SourceSchemas")
    public String sourceSchemasShrink;

    @NameInMap("Status")
    public String status;

    public static ListProjectFullVerifyResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFullVerifyResultShrinkRequest self = new ListProjectFullVerifyResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectFullVerifyResultShrinkRequest setDestSchemasShrink(String destSchemasShrink) {
        this.destSchemasShrink = destSchemasShrink;
        return this;
    }
    public String getDestSchemasShrink() {
        return this.destSchemasShrink;
    }

    public ListProjectFullVerifyResultShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectFullVerifyResultShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectFullVerifyResultShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListProjectFullVerifyResultShrinkRequest setSourceSchemasShrink(String sourceSchemasShrink) {
        this.sourceSchemasShrink = sourceSchemasShrink;
        return this;
    }
    public String getSourceSchemasShrink() {
        return this.sourceSchemasShrink;
    }

    public ListProjectFullVerifyResultShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
