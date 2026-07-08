// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CopyAppPluginConfigRequest extends TeaModel {
    /**
     * <p>The source business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31104757</p>
     */
    @NameInMap("SourceBizId")
    public String sourceBizId;

    /**
     * <p>The target business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31104758</p>
     */
    @NameInMap("TargetBizId")
    public String targetBizId;

    public static CopyAppPluginConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyAppPluginConfigRequest self = new CopyAppPluginConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyAppPluginConfigRequest setSourceBizId(String sourceBizId) {
        this.sourceBizId = sourceBizId;
        return this;
    }
    public String getSourceBizId() {
        return this.sourceBizId;
    }

    public CopyAppPluginConfigRequest setTargetBizId(String targetBizId) {
        this.targetBizId = targetBizId;
        return this;
    }
    public String getTargetBizId() {
        return this.targetBizId;
    }

}
