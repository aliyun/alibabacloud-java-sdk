// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectModelFeatureResponseBody extends TeaModel {
    @NameInMap("Features")
    public java.util.List<GetProjectModelFeatureResponseBodyFeatures> features;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("LabelDatasourceId")
    public String labelDatasourceId;

    @NameInMap("LabelDatasourceTable")
    public String labelDatasourceTable;

    @NameInMap("LabelEventTime")
    public String labelEventTime;

    @NameInMap("LabelTableId")
    public String labelTableId;

    @NameInMap("ModelFeatureId")
    public String modelFeatureId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrainingSetFGTable")
    public String trainingSetFGTable;

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
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("FeatureViewId")
        public String featureViewId;

        @NameInMap("FeatureViewName")
        public String featureViewName;

        @NameInMap("Name")
        public String name;

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
