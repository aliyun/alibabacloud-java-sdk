// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexVersionRequest extends TeaModel {
    /**
     * <p>The keyword used to search for a version. Fuzzy match is supported.</p>
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
         * <p>The ID of the index deployed in offline mode.</p>
         */
        @NameInMap("buildDeployId")
        public String buildDeployId;

        /**
         * <p>The name of the index.</p>
         */
        @NameInMap("indexName")
        public String indexName;

        /**
         * <p>The version of the index.</p>
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
