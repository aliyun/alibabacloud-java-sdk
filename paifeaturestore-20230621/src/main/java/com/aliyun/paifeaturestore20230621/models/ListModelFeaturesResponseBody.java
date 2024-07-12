// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeaturesResponseBody extends TeaModel {
    @NameInMap("ModelFeatures")
    public java.util.List<ListModelFeaturesResponseBodyModelFeatures> modelFeatures;

    /**
     * <strong>example:</strong>
     * <p>2CA11923-2A3D-5E5A-8314-E699D2DD15DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListModelFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeaturesResponseBody self = new ListModelFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelFeaturesResponseBody setModelFeatures(java.util.List<ListModelFeaturesResponseBodyModelFeatures> modelFeatures) {
        this.modelFeatures = modelFeatures;
        return this;
    }
    public java.util.List<ListModelFeaturesResponseBodyModelFeatures> getModelFeatures() {
        return this.modelFeatures;
    }

    public ListModelFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelFeaturesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelFeaturesResponseBodyModelFeatures extends TeaModel {
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
         * <p>label_table_1</p>
         */
        @NameInMap("LabelTableName")
        public String labelTableName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ModelFeatureId")
        public String modelFeatureId;

        /**
         * <strong>example:</strong>
         * <p>model_feature1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1231243253****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>project1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static ListModelFeaturesResponseBodyModelFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListModelFeaturesResponseBodyModelFeatures self = new ListModelFeaturesResponseBodyModelFeatures();
            return TeaModel.build(map, self);
        }

        public ListModelFeaturesResponseBodyModelFeatures setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListModelFeaturesResponseBodyModelFeatures setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListModelFeaturesResponseBodyModelFeatures setLabelTableName(String labelTableName) {
            this.labelTableName = labelTableName;
            return this;
        }
        public String getLabelTableName() {
            return this.labelTableName;
        }

        public ListModelFeaturesResponseBodyModelFeatures setModelFeatureId(String modelFeatureId) {
            this.modelFeatureId = modelFeatureId;
            return this;
        }
        public String getModelFeatureId() {
            return this.modelFeatureId;
        }

        public ListModelFeaturesResponseBodyModelFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelFeaturesResponseBodyModelFeatures setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListModelFeaturesResponseBodyModelFeatures setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListModelFeaturesResponseBodyModelFeatures setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
