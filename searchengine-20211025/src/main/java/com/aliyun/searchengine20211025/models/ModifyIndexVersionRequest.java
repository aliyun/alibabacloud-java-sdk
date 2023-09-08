// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexVersionRequest extends TeaModel {
    /**
     * <p>## Sample requests</p>
     * <br>
     * <p>﻿</p>
     * <br>
     * <p>    PUT /openapi/ha3/instances/ha3_instance_nameclusters/test_cluster/index-version</p>
     * <br>
     * <p>﻿</p>
     * <br>
     * <p>    [</p>
     * <p>    ﻿</p>
     * <p>      {</p>
     * <p>    ﻿</p>
     * <p>        "indexName": "index1",</p>
     * <p>    ﻿</p>
     * <p>        "version": "123456",</p>
     * <p>    ﻿</p>
     * <p>        "buildDeployId": "20201010"</p>
     * <p>    ﻿</p>
     * <p>      },</p>
     * <p>    ﻿</p>
     * <p>      {</p>
     * <p>    ﻿</p>
     * <p>        "indexName": "index1",</p>
     * <p>    ﻿</p>
     * <p>        "version": "123456",</p>
     * <p>    ﻿</p>
     * <p>        "buildDeployId": "20201010"</p>
     * <p>    ﻿</p>
     * <p>      }</p>
     * <p>    ﻿</p>
     * <p>    ]</p>
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
        @NameInMap("buildDeployId")
        public String buildDeployId;

        /**
         * <p>WB01240825</p>
         */
        @NameInMap("indexName")
        public String indexName;

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
