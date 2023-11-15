// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceHasRunningTaskBatchQueryShrinkRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ReferenceNos")
    public String referenceNosShrink;

    @NameInMap("ReferenceType")
    public String referenceType;

    @NameInMap("Source")
    public String source;

    @NameInMap("TaskType")
    public String taskType;

    public static SbrainServiceHasRunningTaskBatchQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceHasRunningTaskBatchQueryShrinkRequest self = new SbrainServiceHasRunningTaskBatchQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SbrainServiceHasRunningTaskBatchQueryShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SbrainServiceHasRunningTaskBatchQueryShrinkRequest setReferenceNosShrink(String referenceNosShrink) {
        this.referenceNosShrink = referenceNosShrink;
        return this;
    }
    public String getReferenceNosShrink() {
        return this.referenceNosShrink;
    }

    public SbrainServiceHasRunningTaskBatchQueryShrinkRequest setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }
    public String getReferenceType() {
        return this.referenceType;
    }

    public SbrainServiceHasRunningTaskBatchQueryShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SbrainServiceHasRunningTaskBatchQueryShrinkRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
