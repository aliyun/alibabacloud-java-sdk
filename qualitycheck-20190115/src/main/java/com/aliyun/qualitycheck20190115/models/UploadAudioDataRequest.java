// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadAudioDataRequest extends TeaModel {
    /**
     * <p>The business space ID. In multi-business space scenarios, this parameter specifies the business space to use. Default value: the default business space.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For details about the content, see the following detailed information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{“callList”:“xxxxx”}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadAudioDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAudioDataRequest self = new UploadAudioDataRequest();
        return TeaModel.build(map, self);
    }

    public UploadAudioDataRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UploadAudioDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
