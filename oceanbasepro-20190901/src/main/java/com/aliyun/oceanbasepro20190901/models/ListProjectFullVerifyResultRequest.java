// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectFullVerifyResultRequest extends TeaModel {
    @NameInMap("DestSchemas")
    public java.util.List<String> destSchemas;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SourceSchemas")
    public java.util.List<String> sourceSchemas;

    @NameInMap("Status")
    public String status;

    public static ListProjectFullVerifyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFullVerifyResultRequest self = new ListProjectFullVerifyResultRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectFullVerifyResultRequest setDestSchemas(java.util.List<String> destSchemas) {
        this.destSchemas = destSchemas;
        return this;
    }
    public java.util.List<String> getDestSchemas() {
        return this.destSchemas;
    }

    public ListProjectFullVerifyResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectFullVerifyResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectFullVerifyResultRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListProjectFullVerifyResultRequest setSourceSchemas(java.util.List<String> sourceSchemas) {
        this.sourceSchemas = sourceSchemas;
        return this;
    }
    public java.util.List<String> getSourceSchemas() {
        return this.sourceSchemas;
    }

    public ListProjectFullVerifyResultRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
