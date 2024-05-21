// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateEmbeddedStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ThirdPartAuthFlag")
    public Boolean thirdPartAuthFlag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static UpdateEmbeddedStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmbeddedStatusRequest self = new UpdateEmbeddedStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEmbeddedStatusRequest setThirdPartAuthFlag(Boolean thirdPartAuthFlag) {
        this.thirdPartAuthFlag = thirdPartAuthFlag;
        return this;
    }
    public Boolean getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    public UpdateEmbeddedStatusRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
