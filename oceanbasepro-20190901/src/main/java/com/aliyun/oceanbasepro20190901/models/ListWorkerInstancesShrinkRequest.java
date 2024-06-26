// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListWorkerInstancesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>KAFKA</p>
     */
    @NameInMap("DestType")
    public String destType;

    /**
     * <strong>example:</strong>
     * <p>i4katz****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyBindable")
    public Boolean onlyBindable;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>OCEANBASE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Specs")
    public String specsShrink;

    public static ListWorkerInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerInstancesShrinkRequest self = new ListWorkerInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkerInstancesShrinkRequest setDestType(String destType) {
        this.destType = destType;
        return this;
    }
    public String getDestType() {
        return this.destType;
    }

    public ListWorkerInstancesShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListWorkerInstancesShrinkRequest setOnlyBindable(Boolean onlyBindable) {
        this.onlyBindable = onlyBindable;
        return this;
    }
    public Boolean getOnlyBindable() {
        return this.onlyBindable;
    }

    public ListWorkerInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkerInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkerInstancesShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListWorkerInstancesShrinkRequest setSpecsShrink(String specsShrink) {
        this.specsShrink = specsShrink;
        return this;
    }
    public String getSpecsShrink() {
        return this.specsShrink;
    }

}
