// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewRelationshipsResponseBody extends TeaModel {
    @NameInMap("Relationships")
    public java.util.List<ListFeatureViewRelationshipsResponseBodyRelationships> relationships;

    /**
     * <strong>example:</strong>
     * <p>0FBBE454-9BD1-5D8F-9129-D14DB7FAFE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFeatureViewRelationshipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewRelationshipsResponseBody self = new ListFeatureViewRelationshipsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewRelationshipsResponseBody setRelationships(java.util.List<ListFeatureViewRelationshipsResponseBodyRelationships> relationships) {
        this.relationships = relationships;
        return this;
    }
    public java.util.List<ListFeatureViewRelationshipsResponseBodyRelationships> getRelationships() {
        return this.relationships;
    }

    public ListFeatureViewRelationshipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFeatureViewRelationshipsResponseBodyRelationshipsModels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>dbmtl</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        public static ListFeatureViewRelationshipsResponseBodyRelationshipsModels build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureViewRelationshipsResponseBodyRelationshipsModels self = new ListFeatureViewRelationshipsResponseBodyRelationshipsModels();
            return TeaModel.build(map, self);
        }

        public ListFeatureViewRelationshipsResponseBodyRelationshipsModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListFeatureViewRelationshipsResponseBodyRelationshipsModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class ListFeatureViewRelationshipsResponseBodyRelationships extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fv1</p>
         */
        @NameInMap("FeatureViewName")
        public String featureViewName;

        @NameInMap("Models")
        public java.util.List<ListFeatureViewRelationshipsResponseBodyRelationshipsModels> models;

        /**
         * <strong>example:</strong>
         * <p>project1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static ListFeatureViewRelationshipsResponseBodyRelationships build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureViewRelationshipsResponseBodyRelationships self = new ListFeatureViewRelationshipsResponseBodyRelationships();
            return TeaModel.build(map, self);
        }

        public ListFeatureViewRelationshipsResponseBodyRelationships setFeatureViewName(String featureViewName) {
            this.featureViewName = featureViewName;
            return this;
        }
        public String getFeatureViewName() {
            return this.featureViewName;
        }

        public ListFeatureViewRelationshipsResponseBodyRelationships setModels(java.util.List<ListFeatureViewRelationshipsResponseBodyRelationshipsModels> models) {
            this.models = models;
            return this;
        }
        public java.util.List<ListFeatureViewRelationshipsResponseBodyRelationshipsModels> getModels() {
            return this.models;
        }

        public ListFeatureViewRelationshipsResponseBodyRelationships setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
