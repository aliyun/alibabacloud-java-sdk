// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsOpenAPIProjectShrinkRequest extends TeaModel {
    @NameInMap("BusinessName")
    public String businessName;

    @NameInMap("DestConfig")
    public String destConfigShrink;

    @NameInMap("LabelIds")
    public String labelIdsShrink;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceConfig")
    public String sourceConfigShrink;

    @NameInMap("TransferMapping")
    public String transferMappingShrink;

    @NameInMap("TransferStepConfig")
    public String transferStepConfigShrink;

    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static CreateOmsOpenAPIProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsOpenAPIProjectShrinkRequest self = new CreateOmsOpenAPIProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsOpenAPIProjectShrinkRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setDestConfigShrink(String destConfigShrink) {
        this.destConfigShrink = destConfigShrink;
        return this;
    }
    public String getDestConfigShrink() {
        return this.destConfigShrink;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setLabelIdsShrink(String labelIdsShrink) {
        this.labelIdsShrink = labelIdsShrink;
        return this;
    }
    public String getLabelIdsShrink() {
        return this.labelIdsShrink;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setSourceConfigShrink(String sourceConfigShrink) {
        this.sourceConfigShrink = sourceConfigShrink;
        return this;
    }
    public String getSourceConfigShrink() {
        return this.sourceConfigShrink;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setTransferMappingShrink(String transferMappingShrink) {
        this.transferMappingShrink = transferMappingShrink;
        return this;
    }
    public String getTransferMappingShrink() {
        return this.transferMappingShrink;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setTransferStepConfigShrink(String transferStepConfigShrink) {
        this.transferStepConfigShrink = transferStepConfigShrink;
        return this;
    }
    public String getTransferStepConfigShrink() {
        return this.transferStepConfigShrink;
    }

    public CreateOmsOpenAPIProjectShrinkRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
