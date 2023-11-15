// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceHasRunningTaskBatchQueryRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ReferenceNos")
    public java.util.List<String> referenceNos;

    @NameInMap("ReferenceType")
    public String referenceType;

    @NameInMap("Source")
    public String source;

    @NameInMap("TaskType")
    public String taskType;

    public static SbrainServiceHasRunningTaskBatchQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceHasRunningTaskBatchQueryRequest self = new SbrainServiceHasRunningTaskBatchQueryRequest();
        return TeaModel.build(map, self);
    }

    public SbrainServiceHasRunningTaskBatchQueryRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SbrainServiceHasRunningTaskBatchQueryRequest setReferenceNos(java.util.List<String> referenceNos) {
        this.referenceNos = referenceNos;
        return this;
    }
    public java.util.List<String> getReferenceNos() {
        return this.referenceNos;
    }

    public SbrainServiceHasRunningTaskBatchQueryRequest setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }
    public String getReferenceType() {
        return this.referenceType;
    }

    public SbrainServiceHasRunningTaskBatchQueryRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SbrainServiceHasRunningTaskBatchQueryRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
