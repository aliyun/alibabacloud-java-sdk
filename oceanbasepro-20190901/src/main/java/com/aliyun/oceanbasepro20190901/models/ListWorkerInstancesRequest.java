// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListWorkerInstancesRequest extends TeaModel {
    @NameInMap("DestType")
    public String destType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OnlyBindable")
    public Boolean onlyBindable;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Specs")
    public java.util.List<String> specs;

    public static ListWorkerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerInstancesRequest self = new ListWorkerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkerInstancesRequest setDestType(String destType) {
        this.destType = destType;
        return this;
    }
    public String getDestType() {
        return this.destType;
    }

    public ListWorkerInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListWorkerInstancesRequest setOnlyBindable(Boolean onlyBindable) {
        this.onlyBindable = onlyBindable;
        return this;
    }
    public Boolean getOnlyBindable() {
        return this.onlyBindable;
    }

    public ListWorkerInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkerInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkerInstancesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListWorkerInstancesRequest setSpecs(java.util.List<String> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<String> getSpecs() {
        return this.specs;
    }

}
