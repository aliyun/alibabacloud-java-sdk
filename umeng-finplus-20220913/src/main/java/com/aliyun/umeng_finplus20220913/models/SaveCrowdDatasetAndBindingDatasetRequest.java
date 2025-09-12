// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SaveCrowdDatasetAndBindingDatasetRequest extends TeaModel {
    @NameInMap("body")
    public SaveCrowdDatasetAndBindingDatasetRequestBody body;

    public static SaveCrowdDatasetAndBindingDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCrowdDatasetAndBindingDatasetRequest self = new SaveCrowdDatasetAndBindingDatasetRequest();
        return TeaModel.build(map, self);
    }

    public SaveCrowdDatasetAndBindingDatasetRequest setBody(SaveCrowdDatasetAndBindingDatasetRequestBody body) {
        this.body = body;
        return this;
    }
    public SaveCrowdDatasetAndBindingDatasetRequestBody getBody() {
        return this.body;
    }

    public static class SaveCrowdDatasetAndBindingDatasetRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("datasetIds")
        public java.util.List<String> datasetIds;

        @NameInMap("description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        public static SaveCrowdDatasetAndBindingDatasetRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SaveCrowdDatasetAndBindingDatasetRequestBody self = new SaveCrowdDatasetAndBindingDatasetRequestBody();
            return TeaModel.build(map, self);
        }

        public SaveCrowdDatasetAndBindingDatasetRequestBody setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SaveCrowdDatasetAndBindingDatasetRequestBody setDatasetIds(java.util.List<String> datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public java.util.List<String> getDatasetIds() {
            return this.datasetIds;
        }

        public SaveCrowdDatasetAndBindingDatasetRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SaveCrowdDatasetAndBindingDatasetRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
