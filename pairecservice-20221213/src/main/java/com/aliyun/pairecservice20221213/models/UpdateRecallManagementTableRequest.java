// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementTableRequest extends TeaModel {
    @NameInMap("EnableDataSizeFluctuationThreshold")
    public Boolean enableDataSizeFluctuationThreshold;

    @NameInMap("EnableRowCountFluctuationThreshold")
    public Boolean enableRowCountFluctuationThreshold;

    @NameInMap("IndexVersionId")
    public String indexVersionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxDataSizeFluctuationThreshold")
    public Integer maxDataSizeFluctuationThreshold;

    @NameInMap("MaxRowCountFluctuationThreshold")
    public Integer maxRowCountFluctuationThreshold;

    @NameInMap("MinDataSizeFluctuationThreshold")
    public Integer minDataSizeFluctuationThreshold;

    @NameInMap("MinRowCountFluctuationThreshold")
    public Integer minRowCountFluctuationThreshold;

    public static UpdateRecallManagementTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementTableRequest self = new UpdateRecallManagementTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementTableRequest setEnableDataSizeFluctuationThreshold(Boolean enableDataSizeFluctuationThreshold) {
        this.enableDataSizeFluctuationThreshold = enableDataSizeFluctuationThreshold;
        return this;
    }
    public Boolean getEnableDataSizeFluctuationThreshold() {
        return this.enableDataSizeFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setEnableRowCountFluctuationThreshold(Boolean enableRowCountFluctuationThreshold) {
        this.enableRowCountFluctuationThreshold = enableRowCountFluctuationThreshold;
        return this;
    }
    public Boolean getEnableRowCountFluctuationThreshold() {
        return this.enableRowCountFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setIndexVersionId(String indexVersionId) {
        this.indexVersionId = indexVersionId;
        return this;
    }
    public String getIndexVersionId() {
        return this.indexVersionId;
    }

    public UpdateRecallManagementTableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRecallManagementTableRequest setMaxDataSizeFluctuationThreshold(Integer maxDataSizeFluctuationThreshold) {
        this.maxDataSizeFluctuationThreshold = maxDataSizeFluctuationThreshold;
        return this;
    }
    public Integer getMaxDataSizeFluctuationThreshold() {
        return this.maxDataSizeFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setMaxRowCountFluctuationThreshold(Integer maxRowCountFluctuationThreshold) {
        this.maxRowCountFluctuationThreshold = maxRowCountFluctuationThreshold;
        return this;
    }
    public Integer getMaxRowCountFluctuationThreshold() {
        return this.maxRowCountFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setMinDataSizeFluctuationThreshold(Integer minDataSizeFluctuationThreshold) {
        this.minDataSizeFluctuationThreshold = minDataSizeFluctuationThreshold;
        return this;
    }
    public Integer getMinDataSizeFluctuationThreshold() {
        return this.minDataSizeFluctuationThreshold;
    }

    public UpdateRecallManagementTableRequest setMinRowCountFluctuationThreshold(Integer minRowCountFluctuationThreshold) {
        this.minRowCountFluctuationThreshold = minRowCountFluctuationThreshold;
        return this;
    }
    public Integer getMinRowCountFluctuationThreshold() {
        return this.minRowCountFluctuationThreshold;
    }

}
