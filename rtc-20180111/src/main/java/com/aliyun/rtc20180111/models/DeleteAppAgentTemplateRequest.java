// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppAgentTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1213123142124124124214</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteAppAgentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppAgentTemplateRequest self = new DeleteAppAgentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppAgentTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppAgentTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
