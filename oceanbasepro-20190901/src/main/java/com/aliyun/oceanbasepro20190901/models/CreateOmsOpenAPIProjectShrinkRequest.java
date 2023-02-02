// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsOpenAPIProjectShrinkRequest extends TeaModel {
    /**
     * <p>The business system identifier, which is optional and is a specific field of the Post message.</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>The settings of the destination data source.</p>
     */
    @NameInMap("DestConfig")
    public String destConfigShrink;

    /**
     * <p>A collection of label IDs.</p>
     */
    @NameInMap("LabelIds")
    public String labelIdsShrink;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the project.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The settings of the source data source.</p>
     */
    @NameInMap("SourceConfig")
    public String sourceConfigShrink;

    /**
     * <p>The mappings for the synchronization objects.</p>
     */
    @NameInMap("TransferMapping")
    public String transferMappingShrink;

    /**
     * <p>The settings of synchronization steps.</p>
     */
    @NameInMap("TransferStepConfig")
    public String transferStepConfigShrink;

    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
     */
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
