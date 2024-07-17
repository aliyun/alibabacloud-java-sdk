// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("body")
    public java.util.List<ModifyIndexVersionRequestBody> body;

    public static ModifyIndexVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexVersionRequest self = new ModifyIndexVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIndexVersionRequest setBody(java.util.List<ModifyIndexVersionRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ModifyIndexVersionRequestBody> getBody() {
        return this.body;
    }

    public static class ModifyIndexVersionRequestBody extends TeaModel {
        /**
         * <p>The deployment ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>277</p>
         */
        @NameInMap("buildDeployId")
        public String buildDeployId;

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>main_index</p>
         */
        @NameInMap("indexName")
        public String indexName;

        /**
         * <p>The index version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static ModifyIndexVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ModifyIndexVersionRequestBody self = new ModifyIndexVersionRequestBody();
            return TeaModel.build(map, self);
        }

        public ModifyIndexVersionRequestBody setBuildDeployId(String buildDeployId) {
            this.buildDeployId = buildDeployId;
            return this;
        }
        public String getBuildDeployId() {
            return this.buildDeployId;
        }

        public ModifyIndexVersionRequestBody setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public ModifyIndexVersionRequestBody setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
