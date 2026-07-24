// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataV4Request extends TeaModel {
    /**
     * <p>The business space ID. Used to specify a business space in multi-business space scenarios. Default value: the default business space.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>JsonStr is a JSON string that contains all custom parameters for this operation. For details, see the jsonStr property description below.</p>
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
