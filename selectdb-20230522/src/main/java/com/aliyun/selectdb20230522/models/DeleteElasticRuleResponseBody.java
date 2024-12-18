// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteElasticRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteElasticRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticRuleResponseBody self = new DeleteElasticRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteElasticRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteElasticRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
