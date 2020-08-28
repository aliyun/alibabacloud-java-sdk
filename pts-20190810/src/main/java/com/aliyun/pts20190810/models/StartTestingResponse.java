// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StartTestingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    public static StartTestingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTestingResponse self = new StartTestingResponse();
        return TeaModel.build(map, self);
    }

}
