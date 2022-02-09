// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportcompatlistRequest extends TeaModel {
    @NameInMap("CompatType")
    public String compatType;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("objectName")
    public String objectName;

    public static ReportcompatlistRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportcompatlistRequest self = new ReportcompatlistRequest();
        return TeaModel.build(map, self);
    }

    public ReportcompatlistRequest setCompatType(String compatType) {
        this.compatType = compatType;
        return this;
    }
    public String getCompatType() {
        return this.compatType;
    }

    public ReportcompatlistRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ReportcompatlistRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ReportcompatlistRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ReportcompatlistRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ReportcompatlistRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

}
