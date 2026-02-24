// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalSearchTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DatasetIds")
    public java.util.List<String> datasetIds;

    /**
     * <strong>example:</strong>
     * <p>红绿灯</p>
     */
    @NameInMap("InputField")
    public String inputField;

    /**
     * <strong>example:</strong>
     * <p>flash，plus</p>
     */
    @NameInMap("ModelMode")
    public String modelMode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    public static ListMultimodalSearchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalSearchTaskRequest self = new ListMultimodalSearchTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListMultimodalSearchTaskRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListMultimodalSearchTaskRequest setDatasetIds(java.util.List<String> datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public java.util.List<String> getDatasetIds() {
        return this.datasetIds;
    }

    public ListMultimodalSearchTaskRequest setInputField(String inputField) {
        this.inputField = inputField;
        return this;
    }
    public String getInputField() {
        return this.inputField;
    }

    public ListMultimodalSearchTaskRequest setModelMode(String modelMode) {
        this.modelMode = modelMode;
        return this;
    }
    public String getModelMode() {
        return this.modelMode;
    }

    public ListMultimodalSearchTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMultimodalSearchTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMultimodalSearchTaskRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

}
