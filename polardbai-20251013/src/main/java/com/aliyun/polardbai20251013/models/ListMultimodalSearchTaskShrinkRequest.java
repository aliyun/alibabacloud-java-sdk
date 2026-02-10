// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalSearchTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DatasetIds")
    public String datasetIdsShrink;

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

    public static ListMultimodalSearchTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalSearchTaskShrinkRequest self = new ListMultimodalSearchTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMultimodalSearchTaskShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListMultimodalSearchTaskShrinkRequest setDatasetIdsShrink(String datasetIdsShrink) {
        this.datasetIdsShrink = datasetIdsShrink;
        return this;
    }
    public String getDatasetIdsShrink() {
        return this.datasetIdsShrink;
    }

    public ListMultimodalSearchTaskShrinkRequest setInputField(String inputField) {
        this.inputField = inputField;
        return this;
    }
    public String getInputField() {
        return this.inputField;
    }

    public ListMultimodalSearchTaskShrinkRequest setModelMode(String modelMode) {
        this.modelMode = modelMode;
        return this;
    }
    public String getModelMode() {
        return this.modelMode;
    }

    public ListMultimodalSearchTaskShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMultimodalSearchTaskShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
