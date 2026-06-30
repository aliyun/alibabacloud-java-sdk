// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataV4Request extends TeaModel {
    /**
     * <p>The workspace ID. Use this parameter to select a specific workspace when you have multiple workspaces. If you do not specify this parameter, the default workspace is used.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The JSON string that contains all the custom parameters for this API. For more information, see the description of jsonStr properties below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadDataV4Request build(java.util.Map<String, ?> map) throws Exception {
        UploadDataV4Request self = new UploadDataV4Request();
        return TeaModel.build(map, self);
    }

    public UploadDataV4Request setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UploadDataV4Request setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
