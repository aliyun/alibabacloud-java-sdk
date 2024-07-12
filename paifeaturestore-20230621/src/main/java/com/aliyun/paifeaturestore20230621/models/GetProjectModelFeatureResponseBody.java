// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectModelFeatureResponseBody extends TeaModel {
    @NameInMap("Features")
    public java.util.List<GetProjectModelFeatureResponseBodyFeatures> features;

    /**
     * <strong>example:</strong>
     * <p>2023-07-04T14:46:22.227+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2023-07-04T14:46:22.227+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LabelDatasourceId")
    public String labelDatasourceId;

    /**
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("LabelDatasourceTable")
    public String labelDatasourceTable;

    /**
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("LabelEventTime")
    public String labelEventTime;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LabelTableId")
    public String labelTableId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ModelFeatureId")
    public String modelFeatureId;

    /**
     * <strong>example:</strong>
     * <p>model_feature_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>12324325324****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>6B662A64-E4BF-56F8-BF5F-4C63F34EC0A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>table2</p>
     */
    @NameInMap("TrainingSetFGTable")
    public String trainingSetFGTable;

    /**
     * <strong>example:</strong>
     * <p>model_feature_xxx_training_set</p>
     */
    @NameInMap("TrainingSetTable")
    public String trainingSetTable;

    public static GetProjectModelFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectModelFeatureResponseBody self = new GetProjectModelFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectModelFeatureResponseBody setFeatures(java.util.List<GetProjectModelFeatureResponseBodyFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<GetProjectModelFeatureResponseBodyFeatures> getFeatures() {
        return this.features;
    }

    public GetProjectModelFeatureResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetProjectModelFeatureResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetProjectModelFeatureResponseBody setLabelDatasourceId(String labelDatasourceId) {
        this.labelDatasourceId = labelDatasourceId;
        return this;
    }
    public String getLabelDatasourceId() {
        return this.labelDatasourceId;
    }

    public GetProjectModelFeatureResponseBody setLabelDatasourceTable(String labelDatasourceTable) {
        this.labelDatasourceTable = labelDatasourceTable;
        return this;
    }
    public String getLabelDatasourceTable() {
        return this.labelDatasourceTable;
    }

    public GetProjectModelFeatureResponseBody setLabelEventTime(String labelEventTime) {
        this.labelEventTime = labelEventTime;
        return this;
    }
    public String getLabelEventTime() {
        return this.labelEventTime;
    }

    public GetProjectModelFeatureResponseBody setLabelTableId(String labelTableId) {
        this.labelTableId = labelTableId;
        return this;
    }
    public String getLabelTableId() {
        return this.labelTableId;
    }

    public GetProjectModelFeatureResponseBody setModelFeatureId(String modelFeatureId) {
        this.modelFeatureId = modelFeatureId;
        return this;
    }
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    public GetProjectModelFeatureResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProjectModelFeatureResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetProjectModelFeatureResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetProjectModelFeatureResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetProjectModelFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectModelFeatureResponseBody setTrainingSetFGTable(String trainingSetFGTable) {
        this.trainingSetFGTable = trainingSetFGTable;
        return this;
    }
    public String getTrainingSetFGTable() {
        return this.trainingSetFGTable;
    }

    public GetProjectModelFeatureResponseBody setTrainingSetTable(String trainingSetTable) {
        this.trainingSetTable = trainingSetTable;
        return this;
    }
    public String getTrainingSetTable() {
        return this.trainingSetTable;
    }

    public static class GetProjectModelFeatureResponseBodyFeatures extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>feature2</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FeatureViewId")
        public String featureViewId;

        /**
         * <strong>example:</strong>
         * <p>feature_view1</p>
         */
        @NameInMap("FeatureViewName")
        public String featureViewName;

        /**
         * <strong>example:</strong>
         * <p>feature1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>INT32</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProjectModelFeatureResponseBodyFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetProjectModelFeatureResponseBodyFeatures self = new GetProjectModelFeatureResponseBodyFeatures();
            return TeaModel.build(map, self);
        }

        public GetProjectModelFeatureResponseBodyFeatures setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetProjectModelFeatureResponseBodyFeatures setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public GetProjectModelFeatureResponseBodyFeatures setFeatureViewName(String featureViewName) {
            this.featureViewName = featureViewName;
            return this;
        }
        public String getFeatureViewName() {
            return this.featureViewName;
        }

        public GetProjectModelFeatureResponseBodyFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectModelFeatureResponseBodyFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
