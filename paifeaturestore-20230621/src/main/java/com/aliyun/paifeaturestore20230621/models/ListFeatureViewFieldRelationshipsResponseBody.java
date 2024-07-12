// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewFieldRelationshipsResponseBody extends TeaModel {
    @NameInMap("Relationships")
    public java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationships> relationships;

    /**
     * <strong>example:</strong>
     * <p>BF349686-C932-55B5-9B31-DAFA395C0E06</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>featureView1</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("Models")
        public java.util.List<ListFeatureViewFieldRelationshipsResponseBodyRelationshipsModels> models;

        /**
         * <strong>example:</strong>
         * <p>table2</p>
         */
        @NameInMap("OfflineTableName")
        public String offlineTableName;

        /**
         * <strong>example:</strong>
         * <p>table1</p>
         */
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
