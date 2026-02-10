// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalSearchTaskResultFineTuneDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>多模态数据集</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <strong>example:</strong>
     * <p>dataset-1</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("ResultIndex")
    public java.util.List<Integer> resultIndex;

    /**
     * <strong>example:</strong>
     * <p>[&quot;raw&quot;, &quot;rerank&quot;]</p>
     */
    @NameInMap("ResultMode")
    public String resultMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>476751c5-*****-39f6aff1df96</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    public static CreateMultimodalSearchTaskResultFineTuneDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalSearchTaskResultFineTuneDatasetRequest self = new CreateMultimodalSearchTaskResultFineTuneDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetRequest setResultIndex(java.util.List<Integer> resultIndex) {
        this.resultIndex = resultIndex;
        return this;
    }
    public java.util.List<Integer> getResultIndex() {
        return this.resultIndex;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetRequest setResultMode(String resultMode) {
        this.resultMode = resultMode;
        return this;
    }
    public String getResultMode() {
        return this.resultMode;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

}
