// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewFieldRelationshipsResponseBody extends TeaModel {
    @NameInMap("Relationships")
    public java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationships> relationships;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFeatureViewFieldRelationshipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewFieldRelationshipsResponseBody self = new ListFeatureViewFieldRelationshipsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewFieldRelationshipsResponseBody setRelationships(java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationships> relationships) {
        this.relationships = relationships;
        return this;
    }
    public java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationships> getRelationships() {
        return this.relationships;
    }

    public ListFeatureViewFieldRelationshipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels extends TeaModel {
        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("ModelName")
        public String modelName;

        public static ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels self = new ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels();
            return TeaModel.build(map, self);
        }

        public ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class ListFeatureViewFieldRelationshipsResponseBodyRelationships extends TeaModel {
        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("Models")
        public java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels> models;

        @NameInMap("OfflineTableName")
        public String offlineTableName;

        @NameInMap("OnlineTableName")
        public String onlineTableName;

        public static ListFeatureViewFieldRelationshipsResponseBodyRelationships build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureViewFieldRelationshipsResponseBodyRelationships self = new ListFeatureViewFieldRelationshipsResponseBodyRelationships();
            return TeaModel.build(map, self);
        }

        public ListFeatureViewFieldRelationshipsResponseBodyRelationships setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public ListFeatureViewFieldRelationshipsResponseBodyRelationships setModels(java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels> models) {
            this.models = models;
            return this;
        }
        public java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels> getModels() {
            return this.models;
        }

        public ListFeatureViewFieldRelationshipsResponseBodyRelationships setOfflineTableName(String offlineTableName) {
            this.offlineTableName = offlineTableName;
            return this;
        }
        public String getOfflineTableName() {
            return this.offlineTableName;
        }

        public ListFeatureViewFieldRelationshipsResponseBodyRelationships setOnlineTableName(String onlineTableName) {
            this.onlineTableName = onlineTableName;
            return this;
        }
        public String getOnlineTableName() {
            return this.onlineTableName;
        }

    }

}
