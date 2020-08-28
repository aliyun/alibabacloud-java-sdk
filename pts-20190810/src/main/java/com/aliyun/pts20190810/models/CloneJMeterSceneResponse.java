// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class CloneJMeterSceneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    public static CloneJMeterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneJMeterSceneResponse self = new CloneJMeterSceneResponse();
        return TeaModel.build(map, self);
    }

}
