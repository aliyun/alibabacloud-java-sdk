// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppTokenServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OPEN_SUBSCRIPTION</p>
     */
    @NameInMap("CreateAction")
    public String createAction;

    public static CreateAppTokenServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTokenServiceRequest self = new CreateAppTokenServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppTokenServiceRequest setCreateAction(String createAction) {
        this.createAction = createAction;
        return this;
    }
    public String getCreateAction() {
        return this.createAction;
    }

}
