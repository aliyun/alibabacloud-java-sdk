// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;metadata&quot;: {       &quot;name&quot;: &quot;实验名称&quot;,       &quot;id&quot;: &quot;pai_exp_xxxdfafafasfa&quot;,       &quot;desc&quot;: &quot;实验描述&quot;,     },     &quot;nodes&quot;: [     ],     &quot;edges&quot;: [     ],     &quot;globalParams&quot;: [     ],     &quot;globalSettings&quot;:[     ]  }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Version")
    public Long version;

    public static UpdateExperimentContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentContentRequest self = new UpdateExperimentContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateExperimentContentRequest setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
